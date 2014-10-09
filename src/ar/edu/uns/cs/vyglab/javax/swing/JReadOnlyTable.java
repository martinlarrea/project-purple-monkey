package ar.edu.uns.cs.vyglab.javax.swing;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.util.Vector;

public class JReadOnlyTable extends JTable {
	
	public JReadOnlyTable()
	{
		super();
	}
    
	public JReadOnlyTable(int numRows, int numColumns)
	{
		super( numRows, numColumns );
	}
    
	public JReadOnlyTable(Object[][] rowData, Object[] columnNames)
	{
		super(rowData, columnNames);
	}
    
	public JReadOnlyTable(TableModel dm)
	{
		super(dm);
	}
    
	public JReadOnlyTable(TableModel dm, TableColumnModel cm)
	{
		super(dm, cm);
	}
  
	public JReadOnlyTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm)
	{
		super(dm, cm, sm);
	}

	public JReadOnlyTable(Vector rowData, Vector columnNames)
	{
		super(rowData, columnNames);
	}
	
	public boolean isCellEditable(int row, int column )
	{
		return false;
	}
}
