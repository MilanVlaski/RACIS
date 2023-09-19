package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;

import db.manipulation.DbManipulation;
import model.tree.TreeElement.Column;
import model.tree.TreeElement.Table;
/**
 * Vrsi pozive stored procedura cuvanih u proslijedjenoj tabeli.
 * @author Milan Vlaski
 *
 */
public class ProcedureService {

	private Connection conn;
	private final Table table;
	
	public ProcedureService(Table table) {
		this.conn = DbManipulation.dbManip.get(0).getConnection();
		this.table = table;
	}

	public ResultSet retrieve() {
		return retrieve(table.getRetrieveSProc());
	}

	public boolean create(HashMap<String, Object> params) {
		return state(getCallableStatement(table.getCreateSProc()), params);
	}

	public boolean update(HashMap<String, Object> params) {
		return state(getCallableStatement(table.getUpdateSProc()), params);
	}
	
	public boolean delete(Object key) {
		CallableStatement callableStatement = getCallableStatement(table.getDeleteSProc());
		try {
			callableStatement.setObject(1, key);
			
			if(!callableStatement.execute()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Greška sa bazom." + e.getMessage());
			e.printStackTrace();
		}
		return false;		
	}
	
	private boolean state(CallableStatement callableStatement, HashMap<String, Object> params) {
		try {
			for (int i = 0; i < table.getAllElements().size(); i++) {
				Column column = (Column) table.getElementAt(i);
				try {		
					callableStatement.setObject(column.code, params.get(column.name));						
				} catch (SQLServerException e) {
					 // progutaj exception, zato da bismo dozvolili da se setuje nepostojeci parametar
					 // tj da u slucaju gdje ne postoji objekat sa imenom "column.code" samo nastavimo metati objekte
				}
			}
			if (!callableStatement.execute()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Greska u slanju podataka." + e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
		
	public ResultSet retrieve(String storedProcedure) {
		try {
			return getCallableStatement(storedProcedure).executeQuery();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Greska u citanju podataka." + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	private CallableStatement getCallableStatement(String storedProcedure) {
		if(storedProcedure == null || storedProcedure == "") {
			JOptionPane.showMessageDialog(null, "Ta operacija nije predviđena ili dozvoljena.");
			return null;
		}
		
		try {
			return conn.prepareCall(storedProcedure, SQLServerResultSet.TYPE_SCROLL_INSENSITIVE,
					SQLServerResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Greska u pozivu baze podataka." + e.getMessage());
		}
		return null;
	}
	
	public ResultSet getUserPrivileges(String storedProcedure, String username) throws SQLException {
		CallableStatement callableStatement = getCallableStatement(storedProcedure);
		callableStatement.setObject(1, username);
		return callableStatement.executeQuery();
	}
	
}
