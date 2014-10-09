package ar.edu.uns.cs.vyglab.javax.table;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

public class RockTableModel extends DefaultTableModel {
    
	public RockTableModel( Object[] columnNames, int rowCount )
	{
		super(columnNames, rowCount);
	}
	
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}