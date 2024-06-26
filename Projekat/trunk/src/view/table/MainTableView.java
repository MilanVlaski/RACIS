package view.table;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import model.ApplicationModel;
import model.Publisher;
import model.table.GeneralTableModel;
import view.*;
import view.toolBar.ToolBar;

public class MainTableView extends JTable implements Subscriber {

	private GeneralTableModel tableModel;

	public MainTableView() {

		setRowHeight(30);
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setAutoResizeMode(AUTO_RESIZE_LAST_COLUMN);
		tableHeader.setReorderingAllowed(true);
		tableHeader.setResizingAllowed(true);

		tableHeader.setBackground(Colors.HEADER_COLOR);
		setFont(Fonts.TABLE);
		UIManager.put("TableHeader.font", Fonts.TABLE_HEADER);
		setDefaultRenderer(Object.class, new CustomCellRenderer());
	}

	public void setToolBar(ToolBar toolbar) {
		System.out.println("setToolBar called");
		ListSelectionModel selectionModel = getSelectionModel();
		selectionModel.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting()) {
				if (selectionModel.isSelectionEmpty()) {
					toolbar.disableButtons();
				} else {
					toolbar.enableButtons();
				}
			}
		});
	}

	public GeneralTableModel getTableModel() {
		return tableModel;
	}

	/**
	 * Uz postavljanje modela, postavlja i sirinu svih kolona. Ovo koristiti umjesto
	 * setModel!
	 * 
	 * @param tableModel
	 */
	public void setTableModel(GeneralTableModel tableModel) {
		this.tableModel = tableModel;
		setModel(tableModel);
//		setColumnWidths();
	}

	private void setColumnWidths() {
		for (int i = 0; i < tableModel.getColumns().size(); i++) {
			TableColumn displayedColumn = getColumnModel().getColumn(i);

			int columnNameLength = tableModel.getColumns().get(i).name.length();

			int sizeOfFirstValue = 0;
			if (null != tableModel.getValueAt(0, i)) {
				sizeOfFirstValue = tableModel.getValueAt(0, i).toString().length();
			}

			int minSize = (columnNameLength > sizeOfFirstValue) ? columnNameLength : sizeOfFirstValue;
			displayedColumn.setMinWidth(minSize * 9);

			if (sizeOfFirstValue > 50) {
				displayedColumn.setPreferredWidth((int) (sizeOfFirstValue * 1.2 * 9));
			} else {
				displayedColumn.setPreferredWidth((int) (sizeOfFirstValue * 0.8 * 9));
			}
		}
	}

	// omogucava skrolanje iako smo postavili da tabela zauzme maks prostor
	@Override
	public boolean getScrollableTracksViewportWidth() {
		return getPreferredSize().width < getParent().getWidth();
	}

	@Override
	public void update(Publisher context) {
		GeneralTableModel model = ((ApplicationModel) context).getMainTableModel();
		if (model.getRowCount() > 0) {
			setTableModel(model);
		} else {
			model.setValueAt("Nema podataka", 0, 0);
		}
	}

	public void setSelectionListener(ListSelectionListener listener) {
		getSelectionModel().addListSelectionListener(listener);
	}

	public String getSelectedTableName() {
		int selectedRow = getSelectedRow();
		int numOfRow = selectedRow + 1;

		if (numOfRow != 0) {
			TableModel model = getModel();
			int numOfRows = model.getRowCount();
			int numOfColumns = model.getColumnCount();

			Object itemName = null;
			Object itemType = null;

			if (numOfColumns >= 1) {
				itemName = model.getValueAt(numOfRow - 1, 1);
				if (itemName == null) {
					itemName = "";
				}
			}

			if (numOfColumns >= 2) {
				itemType = model.getValueAt(numOfRow - 1, 2);
				if (itemType == null) {
					itemType = "";
				}
			}

			return itemName + " " + itemType + "    Selected row: " + numOfRow + "/" + numOfRows;
		}
		return null;
	}
}