package controller.state;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableModel;

import view.input.InputPanel;
import view.menubar.MenuBar;
import view.table.TablePanel;
import view.toolBar.ToolBar;

public abstract class Common implements EditorState {

	protected TablePanel context;
	protected InputPanel inputPanel;
	protected MenuBar menuBar;
	protected ToolBar toolBar;

	public Common(TablePanel context) {
		this.context = context;
		this.inputPanel = context.getInputPanel();
		this.menuBar = context.getMenuBar();
		this.toolBar=context.getToolbar();
	}
	
	protected abstract void handleSelectionSpecific();
	protected abstract void handleSubmitSpecific();
	
	@Override
	public void handleSelectionChanged(ListSelectionEvent e) {
		boolean selectionHappened = handleSelectionCommon(e);
		if(selectionHappened) {
			handleSelectionSpecific();
		}
	}
	
	@Override
	public void handleSubmit() {
		if (!inputPanel.inputsValid()) {
			JOptionPane.showMessageDialog(null, "Morate unijeti: " + inputPanel.mandatoryButEmptyInputNames() + ".",
					"Nepotpun unos", JOptionPane.WARNING_MESSAGE);
		} else {
			handleSubmitSpecific();
		}
	}
	
	private boolean handleSelectionCommon(ListSelectionEvent e) {
		boolean didSelectionHappen = false;
		if (e.getValueIsAdjusting()) {
			return didSelectionHappen;
		}
		
		TableModel model = context.getTable().getModel();
		
		ListSelectionModel lsm = (ListSelectionModel) e.getSource();
		if (!lsm.isSelectionEmpty()) {
			
			int selectedRow = lsm.getMinSelectionIndex();
			List<Object> row = new ArrayList<>();
			for (int i = 0; i < model.getColumnCount(); i++) {
				row.add(model.getValueAt(selectedRow, i));
			}
			
			inputPanel.fillInputs(row);
			didSelectionHappen = true;
		} else {
			didSelectionHappen = false;
		}
		return didSelectionHappen;
	}
	
	
}
