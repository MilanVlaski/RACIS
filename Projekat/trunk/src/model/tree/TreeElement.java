package model.tree;
/**
 * Objekat cvor stablo strukture.
 * @author Dijana
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.TableColumnModel;

import java.sql.Types;
/**
 * Osnovna klasa elementa u stablu.
 * @author Milan Vlaski
 *
 */
public abstract class TreeElement {

	public String code;
	public String name;
	public ImageIcon icon; // Custom ikonica za svaki element
	
	private List<TreeElement> elements = new ArrayList<>();
	
	public int getIndexOfElement(TreeElement element) {
		return elements.indexOf(element);
	}
	
	public List<TreeElement> getAllElements() {
		return elements;
	}
	
	public TreeElement getElementAt(int index) {
		return elements.get(index);
	}
	
	public void addElement(TreeElement element) {
		elements.add(element);
	}
	
	 public void setIcon(ImageIcon icon) {
	        this.icon = icon;
	    }
	    
	    public ImageIcon getIcon() {
	        return icon;
	    }
	
	@Override
	public String toString() {
		return name;
	}
	/**
	 * Paket samo sadrzi tabele ili druge pakete.
	 * @author Milan Vlaski
	 */
	public static class Package extends TreeElement {
		
		public Package() {}
		
		public Package(String name) {
			this.name = name;
		}
		public Package(String name, Icon icon) {
			this.name = name;
			this.icon = (ImageIcon) icon;
		}
	}
	/**
	 * Tabela sadrzi kolone,i cuva svoje CRUD stored procedure.
	 * @author Milan Vlaski
	 */
	public static class Table extends TreeElement {
		
		private String createSProc = null;
		private String retrieveSProc = null;
		private String updateSProc = null;
		private String deleteSProc = null;
		
		public Table() {}
		
		public Table(Icon icon) {
			this.icon = (ImageIcon) icon;
		}
		
		public String getCreateSProc() {
			return createSProc;
		}

		public void setCreateSProc(String createSProc) {
			this.createSProc = createSProc;
		}

		public String getRetrieveSProc() {
			return retrieveSProc;
		}

		public void setRetrieveSProc(String retrieveSProc) {
			this.retrieveSProc = retrieveSProc;
		}

		public String getUpdateSProc() {
			return updateSProc;
		}

		public void setUpdateSProc(String updateSProc) {
			this.updateSProc = updateSProc;
		}

		public String getDeleteSProc() {
			return deleteSProc;
		}

		public void setDeleteSProc(String deleteSProc) {
			this.deleteSProc = deleteSProc;
		}
	}
	
	/**
	 * Govori da li je podatak primarni kljuc, moze li biti nula,
	 * kao i reference na druge kolone i tabelu te kolone,
	 * u slucaju da se radi o stranom kljucu. Podaci o tipu i velicini se
	 * mogu upisati naknadno iz ResultSeta, te nisu dodati u konstruktor.
	 * @author Milan Vlaski
	 *
	 */
	public static class Column extends TreeElement
	{
		private Boolean nullable = false;
		private Boolean primary = false;
		private String refColumn;
		private String refTable;
		
		private String type;
		private int size;
		private int scale; //brojevi nakon decimalne tacke
		
		public Column() {}
		
		public Column(String name) {
			this.name = name;
		}
		
		public Column(String name, String code, Boolean nullable, Boolean primary,
				String refColumn, String refTable) {
			this(name);
			this.code = code;
			this.nullable = nullable;
			this.primary = primary;
			this.refColumn = refColumn;
			this.refTable = refTable;
			
			if(nullable && primary) {
				throw new IllegalArgumentException("Key should not be both primary and nullable in table "
						+ refTable + " in column " + refColumn);
			}
		}
		
		public Column(String name, String code, Boolean nullable, Boolean primary, String refColumn,
				String refTable, String type, int size, int scale) {
			this(name, code, nullable, primary, refColumn, refTable);
			this.type = type;
			this.size = size;
			this.scale = scale;
		}
		
		public Boolean isNullable() 
		{
			return nullable;
		}
		public void setNullable(Boolean nullable) 
		{
			this.nullable = nullable;
		}
		public Boolean isPrimary() 
		{
			return primary;
		}
		public void setPrimary(Boolean primary) 
		{
			this.primary = primary;
		}
		public String getRefColumn() {
			return refColumn;
		}
		public void setRefColumn(String refColumn) {
			this.refColumn = refColumn;
		}
		public String getRefTable() {
			return refTable;
		}
		public void setRefTable(String refTable) {
			this.refTable = refTable;
		}	
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getScale() {
			return scale;
		}
		public void setScale(int scale) {
			this.scale = scale;
		}
	}
}
