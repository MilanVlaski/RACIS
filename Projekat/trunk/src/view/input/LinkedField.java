package view.input;

import java.awt.Component;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JPanel;

import db.helper.QueryBuilder;
import db.manipulation.DbManipulation;
import model.table.CustomTableModel;
import model.table.GeneralTableModel;
import model.tree.TreeElement.Column;
import view.table.MainTableView;
/**
 * Wrappuje obicni Input, tako da Input radi sa stvarnim vrijednostima, a LinkedField
 * moze da dohvati primarni kljuc koji odgovara toj vrijednosti - iz neke vezane tabele u bazi.
 * @author Milan Vlaski
 *
 */
public class LinkedField extends JPanel implements Input{

	private final Input field;
	private final String refColumn;
	private final String refTable;
	private MainTableView tableView;
	

	public LinkedField(Input field, String refTable, String refColumn) {
		this.field = field;
		this.refColumn = refColumn;
		this.refTable = refTable;

		DbManipulation dbm = DbManipulation.dbManip.get(0);

		try {
			QueryBuilder qb = new QueryBuilder();
			String queryString = qb.selectAll().from(dbm.getDbName(), "pisg2", refTable).getQuery();
			PreparedStatement prepStmt = dbm.getConnection().prepareStatement(queryString);
			ResultSet resultSet = prepStmt.executeQuery();

			CustomTableModel tableModel = new CustomTableModel(resultSet);
			this.tableView = new MainTableView();
			this.tableView.setTableModel(tableModel);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		JButton btn = new JButton("...");
		btn.setPreferredSize(new Dimension(20, 15));

		setName(field.getName());
		setValue(field.getValue());

		btn.addActionListener(e -> {
			new SelectionDialog(this, tableView, refTable, refColumn);
		});

		setReferenceBtn(btn);
		add((Component) field);
	}
	
	@Override
	public Object getValue() {
		if(field.getValue() == null) {
			return null;
		}
		
		QueryBuilder qb = new QueryBuilder();
		try {
			DbManipulation dbm = DbManipulation.dbManip.get(0);
			Connection conn = dbm.getConnection();
			ResultSet primaryKeys;
			primaryKeys = conn.getMetaData().getPrimaryKeys(dbm.getDbName(), "pisg2", refTable);
			primaryKeys.next();
			String columnName = primaryKeys.getString("COLUMN_NAME");
			
			String queryString = qb.select(columnName)
									.from(dbm.getDbName(), "pisg2", refTable)
									.where(refColumn)
									.equals()
									.getQuery();
						
			PreparedStatement prepStmt = conn.prepareStatement(queryString);
			prepStmt.setObject(1, field.getValue());
			
			ResultSet primaryKeyRs = prepStmt.executeQuery();
			primaryKeyRs.next();
		
			return primaryKeyRs.getObject(columnName);
			
		} catch (SQLException e) {
			System.out.println("Greska " + qb.getQuery() + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void setValue(Object object) {
		field.setValue(object);
		selectRowThatMatchesField();
	}
	
	@Override
	public void setReferenceBtn(Component btn) {
		field.setReferenceBtn(btn);
	}

	private void selectRowThatMatchesField() {
		GeneralTableModel tableModel = (GeneralTableModel) tableView.getModel();
		int matchingColumn = tableModel.getIndexOfColumn(refColumn);

		for (int i = 0; i < tableModel.getRowCount(); i++) {
			Object fieldValue = tableModel.getValueAt(i, matchingColumn);
			
			if (field.getValue() == null) {
				tableView.setRowSelectionInterval(0, 0);
				return;
			} else if (field.getValue().equals(fieldValue)){
				tableView.setRowSelectionInterval(i, i);
				return;
			}
		}
	}

	@Override
	public boolean isPrimary() {
		return field.isPrimary();
	}

	@Override
	public boolean isNullable() {
		return field.isNullable();
	}
	
	@Override
	public String getName() {
		return field.getName();
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.field.setEnabled(enabled);
	}
}
