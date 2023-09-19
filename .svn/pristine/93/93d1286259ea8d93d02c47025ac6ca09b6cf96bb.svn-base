package view.menubar;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class HelpMenu extends JMenu{

	int iconWidth = 24; 
	int iconHeight = 24;
	
	public HelpMenu() {
		setText("Help");
        this.setPreferredSize(new Dimension(80, this.getPreferredSize().height));
        JMenuItem aboutItem=new JMenuItem("About");
        
        ImageIcon aboutIcon=new ImageIcon("icons/menuIcons/icons8-about-30.png");
        Image scaledAboutImage = aboutIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledAboutIcon = new ImageIcon(scaledAboutImage);
        
        aboutItem.setIcon(scaledAboutIcon);
        
        add(aboutItem);
	}
}
