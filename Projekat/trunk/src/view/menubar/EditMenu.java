package view.menubar;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.state.EditorState;


public class EditMenu extends JMenu {

	int iconWidth = 24;
	int iconHeight = 24;
	private EditorState editorState;

	JMenuItem firstItem = new JMenuItem("First");
	JMenuItem nextItem = new JMenuItem("Next");
	JMenuItem previousItem = new JMenuItem("Previous");
	JMenuItem lastItem = new JMenuItem("Last");

	JMenuItem newItem = new JMenuItem("New");
	JMenuItem editItem = new JMenuItem("Edit");
	JMenuItem deleteItem = new JMenuItem("Delete");

	JMenuItem acceptItem = new JMenuItem("Accept");
	JMenuItem cancelItem = new JMenuItem("Cancel");

	JMenuItem reportItem = new JMenuItem("Report");

	public EditMenu() {
		setText("Edit");
		this.setPreferredSize(new Dimension(80, this.getPreferredSize().height));

		nextItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_MASK));
		previousItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
		acceptItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, KeyEvent.CTRL_MASK));
		reportItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));

		ImageIcon firstIcon = new ImageIcon("icons/menuIcons/icons8-first-24.png");
		ImageIcon nextIcon = new ImageIcon("icons/menuIcons/icons8-next-24.png");
		ImageIcon previousIcon = new ImageIcon("icons/menuIcons/icons8-previous-24.png");
		ImageIcon lastIcon = new ImageIcon("icons/menuIcons/icons8-last-24.png");

		ImageIcon newIcon = new ImageIcon("icons/menuIcons/icons8-new-24.png");
		ImageIcon editIcon = new ImageIcon("icons/menuIcons/icons8-edit-24.png");
		ImageIcon deleteIcon = new ImageIcon("icons/menuIcons/icons8-delete-24.png");

		ImageIcon acceptIcon = new ImageIcon("icons/menuIcons/icons8-accept-24.png");
		ImageIcon cancelIcon = new ImageIcon("icons/menuIcons/icons8-cancel-24.png");

		ImageIcon reportIcon = new ImageIcon("icons/menuIcons/icons8-report-30.png");
		Image scaledReportImage = reportIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
		ImageIcon scaledReportIcon = new ImageIcon(scaledReportImage);

		firstItem.setIcon(firstIcon);
		nextItem.setIcon(nextIcon);
		previousItem.setIcon(previousIcon);
		lastItem.setIcon(lastIcon);
		newItem.setIcon(newIcon);
		editItem.setIcon(editIcon);
		deleteItem.setIcon(deleteIcon);
		acceptItem.setIcon(acceptIcon);
		cancelItem.setIcon(cancelIcon);
		reportItem.setIcon(scaledReportIcon);

		add(firstItem);
		add(nextItem);
		add(previousItem);
		add(lastItem);
		add(firstItem);
		addSeparator();
		add(newItem);
		add(editItem);
		add(deleteItem);
		addSeparator();
		add(acceptItem);
		add(cancelItem);
		addSeparator();
		add(reportItem);

		newItem.addActionListener(e -> editorState.handleCreate());
		editItem.addActionListener(e -> editorState.handleChange());
		deleteItem.addActionListener(e -> editorState.handleDelete());
		cancelItem.addActionListener(e -> editorState.handleCancel());
		acceptItem.addActionListener(e -> editorState.handleSubmit());
	}

	public EditorState getEditorState() {
		return editorState;
	}

	public void setEditorState(EditorState editorState) {
		this.editorState = editorState;
	}

	public JMenuItem getCreateItem() {
		return newItem;
	}

	public JMenuItem getChangeItem() {
		return editItem;
	}

	public JMenuItem getDeleteItem() {
		return deleteItem;
	}

	public JMenuItem getCancelItem() {
		return cancelItem;
	}
	public JMenuItem getAcceptItem() {
		return acceptItem;
	}
}
