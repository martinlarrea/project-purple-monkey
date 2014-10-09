package ar.edu.uns.cs.vyglab.javax.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class Spreadsheet extends JTable {

	public Spreadsheet( int numRow, int numColumn )
	{
		//super(numRow, numColumn);
		super();
		/*
		TableCellRenderer aRenderer = getTableHeader().getDefaultRenderer();
//		Component  aComponent = 
//			   aRenderer.getTableCellRendererComponent( 
//					   this, aColumn.getHeaderValue(), false, false, -1, 0);
//		Font  aFont = aComponent.getFont();
//		Color aBackground = aComponent.getBackground();
//		Color aForeground = aComponent.getForeground();
		
		Border border  = (Border)UIManager.getDefaults().get("TableHeader.cellBorder");
		
		Font  cellFont = new Font("Times", Font.PLAIN, 20);
		FontMetrics metrics = getFontMetrics(cellFont);

//		 Create a scroll pane that wraps the SpreadSheet
		JScrollPane scrollPane = new JScrollPane(this);

//		 Using the border obtain from the table header to 
//		 get the inset
		Insets insets = border.getBorderInsets(tableHeader);

		rowHeight = insets.bottom + metrics.getHeight() + 
		   insets.top;

//		 Creating the panel to be used as the row header
		JPanel  panel = new JPanel((LayoutManager)null);
		Dimension dim   = new Dimension( 
		   metrics.stringWidth("999")+
		      insets.right+insets.left, rowHeight*numRow);
		panel.setPreferredSize(dim);

		dim.height = rowHeight;
		   for (int ii=0; ii<numRow; ii++) {
		   JLabel lbl = new JLabel(
		      Integer.toString(ii+1), SwingConstants.CENTER);
		   //lbl.setFont(aFont);
		   //lbl.setBackground(aBackground);
		   //lbl.setForeground(aForeground);
		   lbl.setBorder(border);
		   lbl.setBounds(
		      0, ii*dim.height, dim.width, dim.height);
		   panel.add(lbl);
		   }
	   JViewport vp = new JViewport();
	   dim = new Dimension(metrics.stringWidth("999")+insets.right+insets.left,
	         rowHeight*numRow);
	   vp.setViewSize(dim);
	   vp.setView(panel);
	   scrollPane.setRowHeader(vp);
	   */
	}
}
