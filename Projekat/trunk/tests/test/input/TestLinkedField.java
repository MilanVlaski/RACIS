package test.input;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.tree.TreeElement.Column;
import view.input.InputFactory;
import view.input.InputPanel;
import view.input.LinkedField;

class TestLinkedField {

	static Column column;
	
	@BeforeAll
	static void beforeAll() {		
		column = new Column("Klasa", "Klasa", true, false, "Naziv", "Klasa", "java.lang.String", 500, 500);
	}
	 
	@Test
	void shouldGetPrimaryKeyThatMatchesValueOfLinkedField() {
		LinkedField linkedField = (LinkedField) InputFactory.createInput(column);
		linkedField.setValue("suv");
		
		assertEquals("4", linkedField.getValue());
	}
	
	@Test
	void whenGetKeyForValue_shouldReturnNull_ifLinkedFieldIsNull() throws SQLException {
		LinkedField linkedField = (LinkedField) InputFactory.createInput(column);
		linkedField.setValue(null);
		
		assertEquals(null, linkedField.getValue());
	}
	
	@Test // Integration test, that tests the LinkedField through the InputPanel
	void shouldCallGetKeyForValue_FromLinkedField_WhenSubmit() {
		List<Column> columns = new ArrayList<>();
		columns.add(column);
		
		InputPanel inputPanel = new InputPanel(null);
		inputPanel.setInputs(columns);
		inputPanel.getInputs().get(0).setValue("suv");
		
		assertEquals("4", inputPanel.getValues().get("Klasa").toString());
	}

}
