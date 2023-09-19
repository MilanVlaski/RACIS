package test.tablemodel;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import db.manipulation.DbManipulation;
import db.type.DatabaseType;
import model.table.CustomTableModel;
import model.tree.TreeElement.Column;
import model.tree.TreeElement.Table;
import model.xmlparser.XMLParser;
import test.procedureservice.TestProcedureService;

class TestCustomTableModel {

	private static CustomTableModel customTableModel;
	private static Connection conn;
	
	@BeforeAll
	static void setup() {
		Table table = new Table();
		table.name = "Drumska vozila";
		table.code = "Drumska vozila";
		table.setRetrieveSProc("{call pisg2.st_GetAllDrumskaVozila()}");
		
		Column column = new Column("Broj", "Broj", false, true, "Broj vozila", "Vozilo");
		
		table.addElement(column);
		table.addElement(new Column("test"));
		
		TestProcedureService.setupDb();
		customTableModel = new CustomTableModel(table);
	}
	
	@Test
	void shouldInitializeHeader() {
		assertTrue(customTableModel.getColumnCount() > 0);
	}
	
	@Test
	void shouldFindColumnValues() {
		Column broj = customTableModel.getColumnNamed("Broj");
		
		assertEquals("Broj", broj.name);
		assertFalse(broj.isNullable());
		assertTrue(broj.isPrimary());
		assertEquals("Broj vozila", broj.getRefColumn());
		assertEquals("Vozilo", broj.getRefTable());
		assertEquals("java.lang.String", broj.getType());
		assertEquals(20, broj.getSize());
		assertEquals(0, broj.getScale());
	}
	
	
	
}

