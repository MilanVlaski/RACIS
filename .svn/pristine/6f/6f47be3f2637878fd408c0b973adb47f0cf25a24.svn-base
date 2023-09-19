package view.tree;

import java.awt.Component;
import java.awt.Font;

import javax.swing.CellRendererPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultTreeCellRenderer;

import model.tree.TreeElement;
import model.tree.TreeElement.Table;
import view.Colors;
import view.Fonts;
import view.table.CustomCellRenderer;

/**
 * Prosireni renderer JTree komponente. Postavlja razlicite ikonice za elemente stabla,
 * razlikuje tri vrste elemenata: root, !leaf i leaf.
 * @author Dijana
 *
 */
public class CustomTreeCellRenderer extends DefaultTreeCellRenderer
{
	Icon packageIcon = new ImageIcon("icons/package-icon.png");
	Icon tableIcon = new ImageIcon("icons/table-icon.png");
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus)
	{
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
				row, hasFocus);
		
		
		
		/*if (leaf) 
		{
			setIcon(tableIcon);
		}
		else 
		{
			setIcon(packageIcon);
		}*/
		
		/*if (value instanceof Package) {
            Package pkg = (Package) value;
            setIcon(new ImageIcon("icons/ugovor.png"));
        } else if (value instanceof Table) {
        	setIcon(new ImageIcon("icons/ugovor.png"));
        }*/
		
		//ikonice se sad postavljaju direktno u parseru
		if (value instanceof TreeElement) {
            TreeElement treeElement = (TreeElement) value;
            setIcon(treeElement.getIcon());
        }
		/*if (leaf) 
		{
			setIcon(tableIcon);
		}*/
		//setFont(Fonts.TREE);
		//smanjio font da bude pregledno
		setFont(Fonts.TREE.deriveFont((float) Fonts.TREE.getSize() - 4));
		setBackgroundSelectionColor(Colors.SELECTION_COLOR);
		
		
		return this;
	}

}