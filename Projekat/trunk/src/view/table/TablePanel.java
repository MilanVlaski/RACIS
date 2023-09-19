package view.table;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.state.EditorState;
import controller.state.Idle;
import view.input.InputPanel;
import view.menubar.MenuBar;
import view.statusbar.StatusBar;
import view.toolBar.ToolBar;

public class TablePanel extends JPanel {

	private final MainTableView table;
	private final InputPanel inputPanel;
	private final MenuBar menuBar;
	private StatusBar statusBar;
	private EditorState editorState;
	private ToolBar toolbar;

	public JButton createBtn = new JButton("Kreiraj novo");
	public JButton changeBtn = new JButton("Izmijeni");
	public JButton deleteBtn = new JButton("Izbrisi");
	public JButton cancelBtn = new JButton("Odustani");

	public TablePanel(MainTableView table, InputPanel inputPanel, StatusBar stBar, MenuBar menuBar, ToolBar toolbar) {
		this.table = table;
		this.inputPanel = inputPanel;
		this.statusBar = stBar;
		this.menuBar = menuBar;
		this.toolbar = toolbar;

		setEditorState(new Idle(this));

		JScrollPane scrollTable = new JScrollPane(this.table);

		createBtn.addActionListener(e -> editorState.handleCreate());
		changeBtn.addActionListener(e -> editorState.handleChange());
		deleteBtn.addActionListener(e -> editorState.handleDelete());
		cancelBtn.addActionListener(e -> editorState.handleCancel());
		table.setSelectionListener(e -> editorState.handleSelectionChanged(e));

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnPanel.add(createBtn);
		btnPanel.add(changeBtn);
		btnPanel.add(deleteBtn);
		btnPanel.add(cancelBtn);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(scrollTable);
		add(btnPanel);

		setVisible(false);
	}

	public EditorState getEditorState() {
		return editorState;
	}

	/**
	 * Samo ovdje treba mijenjati state!
	 * 
	 * @param editorState
	 */
	public void setEditorState(EditorState editorState) {
		this.editorState = editorState;
		this.menuBar.setState(editorState);
		this.inputPanel.setState(editorState);
		this.toolbar.setEditorState(editorState);
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

	public ToolBar getToolbar() {
		return toolbar;
	}

	public StatusBar getStatusBar() {
		return statusBar;
	}

	public InputPanel getInputPanel() {
		return inputPanel;
	}

	public MainTableView getTable() {
		return table;
	}

	public JButton getCreateBtn() {
		return createBtn;
	}

	public JButton getChangeBtn() {
		return changeBtn;
	}

	public JButton getDeleteBtn() {
		return deleteBtn;
	}

	public JButton getCancelBtn() {
		return cancelBtn;
	}
}
