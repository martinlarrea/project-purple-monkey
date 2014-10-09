package ar.edu.uns.cs.vyglab.javax.table.cell;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

import ar.edu.uns.cs.vyglab.java.util.IntegerTextField;

import java.awt.Color;
import java.awt.Component;

public class IntegerTextFieldRenderer extends IntegerTextField
                           implements TableCellRenderer {
    Border unselectedBorder = null;
    Border selectedBorder = null;
    boolean isBordered = true;

    public IntegerTextFieldRenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true); //MUST do this for background to show up.
    }

    public Component getTableCellRendererComponent(
                            JTable table, Object text,
                            boolean isSelected, boolean hasFocus,
                            int row, int column) {
    	if ( text instanceof IntegerTextField )
    	{
	        //setText("0");
    	}
        return this;
    }
}
