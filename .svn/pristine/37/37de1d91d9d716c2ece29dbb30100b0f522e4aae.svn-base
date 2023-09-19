package test.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ApplicationModel;
import model.tree.TreeElement.Column;
import model.tree.TreeElement.Table;
import model.xmlparser.XMLParser;

class TestApplicationModel {

	static ApplicationModel appModel;
	
	@BeforeAll
	static void setup() {
		XMLParser.setFileLocation("xmlsetup//test//test.xml");
		appModel = new ApplicationModel();
	}
	
	@Test
	void shouldReturnMainTableModelNullOnInit() {
		assertEquals(null, appModel.getMainTableModel());
	}
	
	@Test
	void shouldSetMainTable() {
		Table table = new Table();
		table.setRetrieveSProc("{call st_GetAllVozila()}");
		Column column = new Column();
		table.addElement(column);
		
		appModel.setMainTableModel(table);
		assertTrue(appModel.getMainTableModel().getColumnCount() > 0);
	}
	
	@Test
	void shouldSetMainTableModelToNull() {
		appModel.setMainTableModel(null);
		assertEquals(null, appModel.getMainTableModel());
	}

}
