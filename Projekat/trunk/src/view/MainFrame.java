package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.TreeListener;
import model.ApplicationModel;
import view.input.InputPanel;
import view.menubar.MenuBar;
import view.table.MainTableView;
import view.table.TablePanel;
import view.tree.MainTree;
import view.statusbar.StatusBar;
import view.toolBar.ToolBar;

public class MainFrame extends JFrame {

	private JPanel cardPanel;
	private CardLayout cardLayout;
	private ApplicationModel appModel;

	public MainFrame(ApplicationModel appModel) {

		this.appModel = appModel;

		// Set title
		this.setTitle("RACIS");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Set the window size and position
		this.setSize(screenSize.width, screenSize.height);
		this.setLocation(0, 0);

		// Maximize the window
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(new BorderLayout());
		 
		InputPanel inputPanel = new InputPanel(appModel.getMainTableModel());
		this.appModel.subscribe(inputPanel);

		MainTableView mainTable = new MainTableView();
		this.appModel.subscribe(mainTable);	

		
		MenuBar menuBar=new MenuBar();
		StatusBar statusBar=new StatusBar();
		ToolBar toolbar=new ToolBar();
		
		mainTable.setToolBar(toolbar);
		
		TablePanel tablePanel = new TablePanel(mainTable, inputPanel, statusBar, menuBar, toolbar);
		
		
		MainTree mainTree = new MainTree(appModel.getTreeModel());
		this.appModel.subscribe(mainTree);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		centerPanel.add(tablePanel);
		centerPanel.add(inputPanel);
		

		getContentPane().add(centerPanel, BorderLayout.CENTER);
		getContentPane().add(mainTree, BorderLayout.WEST);
		getContentPane().add(toolbar, BorderLayout.NORTH); 
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		this.setJMenuBar(menuBar);
		
		mainTree.setListener(new TreeListener(appModel, tablePanel));

		
		// Podesavanja ikonice
		ImageIcon icon = new ImageIcon("icons/logo.png");
		setIconImage(icon.getImage());

		this.setVisible(true);
	}

}
