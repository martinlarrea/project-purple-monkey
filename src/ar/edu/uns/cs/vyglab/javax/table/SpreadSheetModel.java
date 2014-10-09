package ar.edu.uns.cs.vyglab.javax.table;

import javax.swing.table.DefaultTableModel;

public class SpreadSheetModel extends DefaultTableModel {

	public SpreadSheetModel( int row, int col )
	{
		super(row, col);
	}
	
	public SpreadSheetModel()
	{
		super();
	}
	
	public boolean isCellEditable(
			   int row, int col) { 
			   return true; 
			}
	
}
