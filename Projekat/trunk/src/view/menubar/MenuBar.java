package view.menubar;




import javax.swing.JMenuBar;

import controller.state.EditorState;


public class MenuBar extends JMenuBar {


	FileMenu fileMenu = new FileMenu();
	EditMenu editMenu = new EditMenu();
	HelpMenu helpMenu = new HelpMenu();
	ReportMenu reportMenu = new ReportMenu();
	
	public MenuBar() {

		add(fileMenu);
		add(editMenu);
		add(reportMenu);
		add(helpMenu);		
		

	}

	public EditMenu getEditMenu() {
		return editMenu;
	}

	public void setState(EditorState editorState) {
		editMenu.setEditorState(editorState);
	}

}
