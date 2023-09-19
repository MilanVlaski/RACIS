package test.treemodel;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.ProcedureService;
import model.tree.CustomTreeModel;
import model.tree.TreeElement;
import model.tree.TreeElement.Column;
import model.tree.TreeElement.Package;
import model.tree.TreeElement.Table;
import model.xmlparser.XMLParser;

class TestTreeModel {

	static CustomTreeModel ctm;
	static TreeElement rootPackage;
	
	@BeforeAll
	static void setup() {
		ctm = new CustomTreeModel(null);
		XMLParser.setFileLocation("xmlsetup//test//test.xml");
		ctm.initializeFromXml(new XMLParser());
		rootPackage = (Package) ctm.getRoot();
	}
	
	@Test
	void shouldInitializePackageAsFirstElement() {
		assertTrue(rootPackage.getElementAt(0) instanceof Package);
	}
	
	@Test
	void shouldInitializeSubPackage() {
		assertTrue(rootPackage.getElementAt(1).getElementAt(0) instanceof Package);
	}
	
	@Test
	void shouldInitTableDrumskaVozila() {
		
		Table drumskaVozila = (Table) rootPackage.getElementAt(0).getElementAt(1);
		
		assertEquals("Drumska vozila", drumskaVozila.name);
		assertEquals("Drumska vozila", drumskaVozila.code);
		assertEquals("{call pisg2.st_GetAllDrumskaVozila()}", drumskaVozila.getRetrieveSProc());
	}
	
	@Test
	void shouldInitColumnBrojVozilaInDrumskaVozila() {
		Table drumskaVozila = (Table) rootPackage.getElementAt(0).getElementAt(1);
		Column brojVozila = (Column) drumskaVozila.getElementAt(0);
		
		assertEquals("Broj", brojVozila.name);
		assertFalse(brojVozila.isNullable());
		assertTrue(brojVozila.isPrimary());
		assertEquals("Broj vozila", brojVozila.getRefColumn());
		assertEquals("Vozilo", brojVozila.getRefTable());
	}
	
//	public void compareColumns(TreeElement el) {
//		for (TreeElement current : el.getAllElements()) {
//			if(current instanceof Package) {
//				compareColumns(current);
//			}
//			
//			if (current instanceof Table) {
//				ProcedureService service = new ProcedureService((Table) current);
//				ResultSet rs = service.retrieve();
//				
//				try {
//					for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
//						assertTrue(((Table) current).getElementAt(i).name.equals(rs.getMetaData().getColumnLabel(i+1)));
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}
