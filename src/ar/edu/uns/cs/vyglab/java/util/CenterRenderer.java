package ar.edu.uns.cs.vyglab.java.util;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CenterRenderer extends DefaultTableCellRenderer
{
    public CenterRenderer()
    {
        setHorizontalAlignment( CENTER );
    }

    public Component getTableCellRendererComponent(
        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;
    }
}