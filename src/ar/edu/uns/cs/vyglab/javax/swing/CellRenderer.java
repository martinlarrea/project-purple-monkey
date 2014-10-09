package ar.edu.uns.cs.vyglab.javax.swing;

import javax.swing.table.DefaultTableCellRenderer;

public class CellRenderer extends DefaultTableCellRenderer {
  
	public CellRenderer() { super(); }

    public void setValue(Object value) {
    	String code = this.getText();
        setText( code + " = " + value );
    }
}