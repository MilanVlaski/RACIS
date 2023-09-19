package view.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import view.Colors;
import view.Fonts;

public class CustomCellRenderer extends DefaultTableCellRenderer {
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		if (component instanceof JLabel) {
			JLabel label = (JLabel) component;
			
			Font font = label.getFont();
			
			label.setBorder(new EmptyBorder(5, 5, 5, 5));// padding
			
			if (row % 2 == 0) {
				label.setBackground(Colors.DARK_BACKGROUND);
			} else {
				label.setBackground(Colors.LIGHT_BACKGROUND);
			}
			
			if (isSelected) {
				label.setForeground(Color.BLACK);
				label.setBackground(Colors.SELECTION_COLOR);
				label.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
			}
			
			if(column == 0) {
				label.setBackground(Colors.HEADER_COLOR);
			}
			
			if (value != null) {
				if (value instanceof Boolean) {
					label.setText((Boolean) value ? "Da" : "Ne");
					label.setHorizontalAlignment(JLabel.CENTER);
				} else if (isNumeric(value.toString())) {
					label.setHorizontalAlignment(JLabel.CENTER);
				} else {
					label.setHorizontalAlignment(JLabel.LEFT);
				}
			} else {
				label.setText("/");;
			}
		}
		return component;
	}
	
	private static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
