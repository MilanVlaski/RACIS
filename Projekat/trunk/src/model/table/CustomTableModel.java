package model.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.ProcedureService;
import model.tree.TreeElement.Column;
import model.tree.TreeElement.Table;
/**
 *  Predstavlja konacni skup podataka o nekoj tabeli u aplikaciji. Ne zna nista o
 *  konkretnim stored procedurama, one se nalaze u Table klasi. Podatke o kolonama uzima iz 
 *  CustomTreeModela, tj njegove odgovarajuce tabele koju referencira ovaj model.
 * @author Milan Vlaski
 *
 */
public class CustomTableModel extends GeneralTableModel{

	private ProcedureService procedureService;
	private Table table;
	
	public CustomTableModel(Table table) {
		this.table = table;
		this.procedureService = new ProcedureService(table);
		setColumns();
		setColumnTypeData();
		getAllData();
	}
	/**
	 * Koristiti ako zelimo da rucno uradimo neki SQL upit, i da rezultujuci
	 * ResultSet stavimo u model tabele. Ovo koristimo za tabelu Selektorskog dijaloga.
	 * @param resultSet
	 */
	public CustomTableModel(ResultSet resultSet) {
		try {
			ResultSetMetaData rsmd = resultSet.getMetaData();
			
			this.columns = new ArrayList<>();

			for(int i = 0; i < rsmd.getColumnCount(); i++) {
				Column column = new Column(rsmd.getColumnName(i+1));
				column.setSize(rsmd.getPrecision(i+1));
				this.columns.add(column);
			}
			
			// Pravi redove
			this.data = new ArrayList<>();
			while (resultSet.next()) {
				List<Object> row = new ArrayList<>();
				for (int i = 1; i <= columns.size(); i++) {
					row.add(resultSet.getObject(i));
				}
				
				this.data.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void getAllData() {
		try {
			ResultSet resultSet = procedureService.retrieve();
			
			// Pravi redove
			this.data = new ArrayList<>();
			while (resultSet.next()) {
				List<Object> row = new ArrayList<>();
				for (int i = 1; i <= columns.size(); i++) {
					row.add(resultSet.getObject(i));
				}

				this.data.add(row);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addRow(HashMap<String, Object> params) {
		boolean result = procedureService.create(params);
		getAllData();
		return result;
	}
	
	@Override
	public boolean editRow(HashMap<String, Object> params) {
		boolean result = procedureService.update(params);
		getAllData();
		return result;
	}
	
	@Override
	public boolean deleteRow(Object rowId) {
		boolean result = procedureService.delete(rowId);
		getAllData();
		return result;
	}

	@Override
	public boolean getRowById(Object rowId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	private void setColumns() {
		this.columns = new ArrayList<>();
		for (int i = 0; i < table.getAllElements().size(); i++) {
			this.columns.add(((Column) table.getElementAt(i)));
		}
	}
	
	private void setColumnTypeData()  {
		try {
			ResultSetMetaData rsmd = procedureService.retrieve().getMetaData();
			for (int i = 0; i < table.getAllElements().size(); i++) {
				getColumn(i).setType(rsmd.getColumnClassName(i + 1));
				getColumn(i).setSize(rsmd.getPrecision(i + 1));
				getColumn(i).setScale(rsmd.getScale(i + 1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Ispisuje resultset na konzolu.
	 * @param resultset za ispis
	 * @throws SQLException
	 */
	private void showData(ResultSet rs) throws SQLException {
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		//ispis naziva kolona
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(String.format("%-50s", rsmd.getColumnLabel(i)));
		}
		
		System.out.println();
		//ispis tipova kolona
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(String.format("%-50s", rsmd.getColumnClassName(i)));
		}
		
		//ispis separatora
		System.out.println();
		String separator = new String("-").repeat(50 * rsmd.getColumnCount());
		System.out.println(separator);
		
		//Vraca kursor na pocetak
		rs.absolute(0);
		//ispis podataka
		while(rs.next())
		{
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(String.format("%-50s", rs.getObject(i)));
			}
			System.out.println();
		}		
	}
}
