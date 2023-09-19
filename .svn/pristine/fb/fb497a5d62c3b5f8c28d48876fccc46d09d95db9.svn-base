package view.menubar;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class FileMenu extends JMenu {
	private static final long serialVersionUID = 1160589017458578140L;
	int iconWidth = 24; 
	int iconHeight = 24;
	
	
	public FileMenu() {
		
		setText("File");
		
		this.setPreferredSize(new Dimension(80, this.getPreferredSize().height));
	    JMenuItem switchItem = new JMenuItem("Switch XML");
	    JMenuItem closeItem = new JMenuItem("Close application");
    
	    switchItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
	    ImageIcon switchIcon=new ImageIcon("icons/menuIcons/icons8-switch-48.png");
	    Image scaledSwitchImage = switchIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
	    ImageIcon scaledIcon = new ImageIcon(scaledSwitchImage);
	    
	    ImageIcon closeIcon=new ImageIcon("icons/menuIcons/icons8-close-30.png");
	    Image scaledCloseImage = closeIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
	    ImageIcon scaledCloseIcon = new ImageIcon(scaledCloseImage);
	    
	    switchItem.setIcon(scaledIcon);
	    closeItem.setIcon(scaledCloseIcon);
	
	    closeItem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Close the application
	            System.exit(0);
	        }
	    });
	    
	    add(switchItem);
	    addSeparator();
	    add(closeItem);
	}
}
