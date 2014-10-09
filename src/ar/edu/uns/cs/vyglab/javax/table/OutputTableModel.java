package ar.edu.uns.cs.vyglab.javax.table;

import javax.swing.table.DefaultTableModel;

public class OutputTableModel extends DefaultTableModel {

	public OutputTableModel( int rowCount, int columnCount )
	{
		super(rowCount, columnCount);
	}
	
	public OutputTableModel()
	{
		super();
	}
	
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
	
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		return true;
	}
}
