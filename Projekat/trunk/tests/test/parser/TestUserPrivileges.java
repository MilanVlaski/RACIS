package test.parser;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Login;
import model.ProcedureService;
import model.tree.CustomTreeModel;
import model.tree.TreeElement;
import model.tree.TreeElement.Package;
import model.xmlparser.XMLParser;
import test.procedureservice.TestProcedureService;

class TestUserPrivileges {

	static final String STORED_PROC = "{call pisg2.st_GetPrivilegijeKorisnika(?)}";
	static final String ADMIN_USERNAME = "perop";
	static final String VOZNIPARK_USERNAME = "srdjan";
	static Package vozila;
	static Package root;

	@BeforeAll
	static void setup() {
		TestProcedureService.setupDb();
	}
	
	@BeforeEach
	void setupStuff() {
		vozila = new Package("Vozila");
		root = new Package();
	}
	
	@Test
	void shouldGetStoredProcedureForUserPrivileges() {
		XMLParser.setFileLocation("xmlsetup//test//test.xml");
		XMLParser parser = new XMLParser();

		assertEquals(STORED_PROC, parser.getProcedureForGetPrivileges());
	}
	
	@Test
	void shouldReturnPrivilegesResultSet_ForStoredProc() throws SQLException {
		ProcedureService procService = new ProcedureService(null);
		ResultSet privilegesRs = procService.getUserPrivileges(STORED_PROC, ADMIN_USERNAME);
		assertNotNull(privilegesRs);
	}
	
	@Test
	void shouldReturnEmptyTreeModelIfPackageDoesntMatchAnyPrivileges() {
		root.addElement(new Package("bla bla"));
		CustomTreeModel baseModel = new CustomTreeModel(root);
		
		CustomTreeModel privilegedModel = Login.treeModelWithAppliedPrivileges(baseModel, ADMIN_USERNAME, STORED_PROC);
		
		assertEquals(0, privilegedModel.getElements().size());
	}
	
	@Test
	void shouldRemoveRezervacije_AndKeepVozila() {
		Package rezervacije = new Package("Rezervacije");
		
		root.addElement(vozila);
		root.addElement(rezervacije);
		CustomTreeModel baseModel = new CustomTreeModel(root);
		
		CustomTreeModel privilegedModel = Login.treeModelWithAppliedPrivileges(baseModel, VOZNIPARK_USERNAME, STORED_PROC);
		assertEquals(vozila.name, privilegedModel.getElements().get(0).name);
	}	
	
	@Test
	void shouldSetNameOfRootPackageToAdmin() {
		CustomTreeModel treeModel = new CustomTreeModel(root);
		CustomTreeModel privilegedModel = Login.treeModelWithAppliedPrivileges(treeModel, ADMIN_USERNAME, STORED_PROC);
		
		Package adminRoot = new Package("Administrator sistema");
		CustomTreeModel adminModel = new CustomTreeModel(adminRoot);
		
		Package adminPackage = (Package) adminModel.getRoot();	
		Package rootPackage = (Package) privilegedModel.getRoot();
		assertEquals(adminPackage.name, rootPackage.name);
	}	
}
