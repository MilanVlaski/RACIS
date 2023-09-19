package test.input;

import java.util.HashMap;

import model.table.GeneralTableModel;

public class MockCustomTableModel extends GeneralTableModel {

	public boolean rowWasAdded = false;
	public boolean rowWasUpdated = false;
	
	@Override
	public void getAllData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteRow(Object rowId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getRowById(Object rowId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRow(HashMap<String, Object> params) {
		rowWasAdded = true;
		return rowWasAdded;
	}

	@Override
	public boolean editRow(HashMap<String, Object> params) {
		rowWasUpdated = true;
		return rowWasUpdated;
	}

}
