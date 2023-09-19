package controller.state;

import view.menubar.EditMenu;
import view.table.TablePanel;
import view.toolBar.ToolBar;

public class Idle extends Common {

	ToolBar toolBar;

	public Idle(TablePanel context) {
		super(context);
		context.getStatusBar().setStatusMessage("Ready");

		this.context.getChangeBtn().setEnabled(false);
		this.context.getDeleteBtn().setEnabled(false);
		this.context.getCancelBtn().setEnabled(false);

		EditMenu editMenu = this.menuBar.getEditMenu();
		editMenu.getDeleteItem().setEnabled(false);
		editMenu.getChangeItem().setEnabled(false);
		editMenu.getCancelItem().setEnabled(false);
		editMenu.getAcceptItem().setEnabled(false);

		this.toolBar = context.getToolbar();
		toolBar.disableButtons();

	}

	@Override
	protected void handleSelectionSpecific() {
		inputPanel.disablePKeyInputs();
		context.setEditorState(new Selection(context));
	}

	@Override
	public void handleCreate() {
		inputPanel.enableAllInputs();
		inputPanel.setVisible(true);
		if (inputPanel.isVisible())
			toolBar.enableButtons();

		context.setEditorState(new Creation(context));
	}

	@Override
	public void handleChange() {
	}

	@Override
	public void handleDelete() {
	}

	@Override
	public void handleCancel() {
	}

	@Override
	protected void handleSubmitSpecific() {
	}

}
