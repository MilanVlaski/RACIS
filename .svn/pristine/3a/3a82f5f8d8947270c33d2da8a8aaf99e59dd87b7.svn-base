package test.input;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.tree.TreeElement.Column;
import view.input.InputFactory;
import view.input.InputPanel;
import view.input.LinkedField;
import view.input.InputPanel.SubmitAction;

class TestSubmit {
	
	@Test
	void shouldCallGetKeyForValue_FromLinkedField_WhenSubmit() {
		List<Column> columns = new ArrayList<>();
		columns.add(new Column("Klasa", "Klasa", true, false, "Naziv", "Klasa", "java.lang.String", 500, 500));
		
		InputPanel inputPanel = new InputPanel(null);
		inputPanel.setInputs(columns);
		inputPanel.getInputs().get(0).setValue("suv");
		
		
		assertEquals("4", inputPanel.getValues().get("Klasa").toString());
	}

}
