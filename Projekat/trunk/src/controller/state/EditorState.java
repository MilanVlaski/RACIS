package controller.state;

import javax.swing.event.ListSelectionEvent;
import view.statusbar.StatusBar;

public interface EditorState {
	void handleSelectionChanged(ListSelectionEvent e);
	void handleCreate();
	void handleChange();
	void handleDelete();
	void handleCancel();
	void handleSubmit();
}
