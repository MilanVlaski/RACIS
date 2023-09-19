package controller.state;

import javax.swing.JOptionPane;

import view.input.InputPanel;
import view.menubar.EditMenu;
import view.table.TablePanel;

public class Creation extends Common {

	public Creation(TablePanel context) {
		super(context);
		context.getStatusBar().setStatusMessage("Create item");

		context.getChangeBtn().setEnabled(false);
		context.getDeleteBtn().setEnabled(false);
		context.getCancelBtn().setEnabled(true);

		EditMenu editM = this.menuBar.getEditMenu();
		editM.getDeleteItem().setEnabled(false);
		editM.getChangeItem().setEnabled(false);
		editM.getCancelItem().setEnabled(true);
		editM.getAcceptItem().setEnabled(true);
	}

	@Override
	protected void handleSelectionSpecific() {
		inputPanel.disablePKeyInputs();
		context.setEditorState(new Selection(context));
	}
	
	@Override
	public void handleCreate() {
		inputPanel.clearInputs();
	}

	@Override
	public void handleChange() {
	}

	@Override
	public void handleDelete() {
	}

	@Override
	public void handleCancel() {
		inputPanel.setVisible(false);
		inputPanel.clearInputs();

		context.setEditorState(new Idle(context));
	}

	@Override
	protected void handleSubmitSpecific() {
		boolean successful = false;
		successful = inputPanel.getTableModel().addRow(inputPanel.getValues());

		if (successful) {
			InputPanel.showTimedAlert(inputPanel, "Uspješan unos!", 2000);
			context.getTable().revalidate();
			inputPanel.clearInputs();
		} else {
			InputPanel.showTimedAlert(inputPanel, "Neuspješan unos!", 2000);
		}
	}
}

