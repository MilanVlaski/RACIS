package main;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.ApplicationModel;
import view.login.LoginView;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * perop - pp123 - admin
		 * admin2 - 123admin* - admin
		 * nikolas - 4567 - agent za prodaju vozila
		 * ad12 - 123456789 - admin
		 * nin232 - dhdhdh - predstavnik sluzbe za klijente
		 * srdjan - dfgh - upravitelj voznog parka
		 * marija - masamare - strucnjak za marketing
		 */
		
		ApplicationModel appModel = new ApplicationModel();
		LoginView loginView = new LoginView(appModel);
		loginView.getContentPane().setForeground(Color.DARK_GRAY);
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
	}

}
