package model.tree;

import java.util.List;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import model.tree.TreeElement.Package;
import model.tree.TreeElement.Table;
import model.xmlparser.XMLTreeParser;
/**
 * Obicno predefinisanje Defoltnog tree modela u swingu, osim sto se 
 * postavljanje root paketa (elementa) radi iz XML.
 * @author Milan Vlaski
 *
 */
public class CustomTreeModel extends DefaultTreeModel{
	
	TreeElement rootPackage;
	
	public CustomTreeModel(TreeElement rootPackage) {
		super(null);
		this.rootPackage = rootPackage;
	}

	public void initializeFromXml(XMLTreeParser parser) {
		rootPackage = parser.initializeTree();
	}
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public Object getChild(Object parent, int index) {
		if (parent instanceof Package) 
		{
			return ((Package)parent).getElementAt(index);
		}
		else if (parent instanceof Table) 
		{
			return null;
		}
		return null;
	}

	@Override
	public int getChildCount(Object parent) {
		if (parent instanceof Package) 
		{
			return ((Package)parent).getAllElements().size();
		}
		else if (parent instanceof Table) 
		{
			return 0;
		}
		return 0;
	}
	
	@Override
	public int getIndexOfChild(Object parent, Object child) {
		if (parent instanceof Package) 
		{
			return ((Package)parent).getIndexOfElement(((TreeElement) child));
		}
		else if (parent instanceof Table) 
		{
			return -1;
		}
		return -1;
	}
	
	@Override
	public Object getRoot() 
	{
		return this.rootPackage;
	}
	
	@Override
	public boolean isLeaf(Object node) 
	{
		if (node instanceof Table) 
		{
			return true;
		}
		return false;
	}
	
	public List<TreeElement> getElements() {
		return rootPackage.getAllElements();
	}
}
