package view.toolBar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import controller.state.EditorState;

public class ToolBar extends JToolBar {
	
	private EditorState editorState;
	
	JButton buttonFirst = new JButton();
    JButton buttonNext = new JButton();
    JButton buttonPrev = new JButton();
    JButton buttonLast = new JButton();
    
    JButton buttonNew = new JButton();
    JButton buttonEdit = new JButton();
    JButton buttonDelete = new JButton();
    
    JButton buttonAccept = new JButton();
    JButton buttonCancel = new JButton();

    JButton buttonReport = new JButton();
	
    public ToolBar() {
        setFloatable(false);
        
        ImageIcon firstIcon = new ImageIcon("icons/menuIcons/icons8-first-24.png");
        ImageIcon nextIcon = new ImageIcon("icons/menuIcons/icons8-next-24.png");
        ImageIcon prevIcon = new ImageIcon("icons/menuIcons/icons8-previous-24.png");
        ImageIcon lastIcon = new ImageIcon("icons/menuIcons/icons8-last-24.png");
        
        ImageIcon newIcon = new ImageIcon("icons/menuIcons/icons8-new-24.png");
        ImageIcon editIcon = new ImageIcon("icons/menuIcons/icons8-edit-24.png");
        ImageIcon deleteIcon = new ImageIcon("icons/menuIcons/icons8-delete-24.png");
        
        ImageIcon acceptIcon = new ImageIcon("icons/menuIcons/icons8-accept-24.png");
        ImageIcon cancelIcon = new ImageIcon("icons/menuIcons/icons8-cancel-24.png");

        ImageIcon reportIcon = new ImageIcon("icons/menuIcons/icons8-report-30.png");
        
        buttonFirst.setIcon(firstIcon);
        buttonNext.setIcon(nextIcon);
        buttonPrev.setIcon(prevIcon);
        buttonLast.setIcon(lastIcon);
        buttonNew.setIcon(newIcon);
        buttonEdit.setIcon(editIcon);
        buttonDelete.setIcon(deleteIcon);
        buttonAccept.setIcon(acceptIcon);
        buttonCancel.setIcon(cancelIcon);
        buttonReport.setIcon(reportIcon);
        
        
        buttonFirst.setToolTipText("First");
        buttonNext.setToolTipText("Next");
        buttonPrev.setToolTipText("Previous");
        buttonLast.setToolTipText("Last");
        buttonNew.setToolTipText("New");
        buttonEdit.setToolTipText("Edit");
        buttonDelete.setToolTipText("Delete");
        buttonCancel.setToolTipText("Cancel");
        buttonAccept.setToolTipText("Accept");
        buttonReport.setToolTipText("Report");
        

        add(buttonFirst);
        add(buttonPrev);
        add(buttonNext);
        add(buttonLast);
        add(buttonNew);
        add(buttonEdit);
        add(buttonDelete);
        add(buttonAccept);
        add(buttonCancel);
        add(buttonReport);
        
        buttonNew.addActionListener(e -> editorState.handleCreate());
		buttonEdit.addActionListener(e -> editorState.handleChange());
		buttonDelete.addActionListener(e -> editorState.handleDelete());
		buttonCancel.addActionListener(e -> editorState.handleCancel());
		buttonAccept.addActionListener(e -> editorState.handleSubmit());
    }
    
    public EditorState getEditorState() {
		return editorState;
	}

	public void setEditorState(EditorState editorState) {
		this.editorState = editorState;
	}

	public JButton getCreateBtn() {
		return buttonNew;
	}

	public JButton getChangeBtn() {
		return buttonEdit;
	}

	public JButton getDeleteBtn() {
		return buttonDelete;
	}

	public JButton getCancelBtn() {
		return buttonCancel;
	}
	public JButton getAcceptBtn() {
		return buttonAccept;
	}
	public void enableButtons() {
		 System.out.println("Enabling buttons");
        buttonFirst.setEnabled(true);
        buttonNext.setEnabled(true);
        buttonPrev.setEnabled(true);
        buttonLast.setEnabled(true);
        buttonNew.setEnabled(true);
        buttonEdit.setEnabled(true);
        buttonCancel.setEnabled(true);
        buttonAccept.setEnabled(true);
        buttonReport.setEnabled(true);
        buttonDelete.setEnabled(true);
        
    }

    public void disableButtons() {
    	 System.out.println("Disabling buttons");
    	 buttonFirst.setEnabled(false);
         buttonNext.setEnabled(false);
         buttonPrev.setEnabled(false);
         buttonLast.setEnabled(false);
         buttonNew.setEnabled(true);
         buttonEdit.setEnabled(false);
         buttonCancel.setEnabled(false);
         buttonAccept.setEnabled(false);
         buttonReport.setEnabled(false);
         buttonDelete.setEnabled(false);
    }
}
