package model.table;

import java.util.HashMap;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.tree.TreeElement.Column;
/**
 * Klasa koja sadrzi kolone - iz TreeElement klase, i listu lista objekata, koja predstavlja redove.
 * Definise i interfejse za CRUD operacije.
 * @author Milan Vlaski
 *
 */
public abstract class GeneralTableModel extends AbstractTableModel {

	protected List<Column> columns;
	protected List<List<Object>> data;	
	@Override
	public int getRowCount() {
		return data.size();
	}
	@Override
	public int getColumnCount() {
		return columns.size();
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data.get(rowIndex).get(columnIndex);
	}	
	@Override
	public String getColumnName(int column) {
		return this.columns.get(column).name;
	}
	
	public int getIndexOfColumn(String name) {
		for(int i = 0; i < columns.size(); i++) {
			if(columns.get(i).name.equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public Column getColumnNamed(String name) {
		for (Column column : columns) {
			if(column.name.equals(name)) {
				return column;
			}
		}
		return null;
	}
	public List<Column> getColumns() {
		return columns;
	}
	public Column getColumn(int index) {
		return columns.get(index);
	}
	
	public abstract void getAllData();	
	public abstract boolean deleteRow(Object rowId);
	public abstract boolean getRowById(Object rowId);	
	public abstract boolean addRow(HashMap<String, Object> params);
	public abstract boolean editRow(HashMap<String, Object> params);
}