package ar.edu.uns.cs.vyglab.javax.table.cell;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;


public class OutpuCellRenderer extends JTextField implements TableCellRenderer {

    public Component getTableCellRendererComponent(
            JTable table, Object text,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
	if ( text instanceof JTextField )
	{

	}
	return this;
	}
}
