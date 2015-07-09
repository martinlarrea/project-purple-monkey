package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.java.util.IntegerTextField;
import ar.edu.uns.cs.vyglab.util.Reporter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class JDialogGridConfiguration extends javax.swing.JDialog {
	private JButton jButtonCancel;
	private JTextPane jTextPane;
	private JButton jButtonOk;
	private JLabel jLabelLang;
	private JTextField jTextFieldNColumns;
	private JFramePointSetter parent;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public JDialogGridConfiguration(JFramePointSetter frame) {
		super(frame);
		this.parent = frame;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.setTitle(DataCenter.langResource.getString("grid_config_title"));
				{
					jLabelLang = new JLabel();
					getContentPane().add(jLabelLang);
					jLabelLang.setText(DataCenter.langResource.getString("grid_config_columns"));
					jLabelLang.setBounds(12, 12, 226, 15);
				}
				{
					jButtonOk = new JButton();
					getContentPane().add(jButtonOk);
					jButtonOk.setText(DataCenter.langResource.getString("ok"));
					jButtonOk.setBounds(270, 228, 93, 31);
					jButtonOk.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonOkActionPerformed(evt);
						}
					});
				}
				{
					jButtonCancel = new JButton();
					getContentPane().add(jButtonCancel);
					jButtonCancel.setText(DataCenter.langResource.getString("cancel"));
					jButtonCancel.setBounds(12, 228, 93, 31);
					{
						jTextFieldNColumns = new IntegerTextField();
						jTextFieldNColumns.setBounds(248, 12, 114, 19);
						getContentPane().add(jTextFieldNColumns);
						jTextFieldNColumns.setColumns(10);
					}
					{
						jTextPane = new JTextPane();
						getContentPane().add(jTextPane);
						jTextPane.setText(DataCenter.langResource.getString("grid_config_rows"));
						jTextPane.setBounds(12, 57, 350, 150);
						jTextPane.setFocusable(false);
					}
					jButtonCancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCancelActionPerformed(evt);
						}
					});
				}
			}
			this.setSize(384, 295);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonOkActionPerformed(ActionEvent evt) {
		try{
			int x = Integer.parseInt( this.jTextFieldNColumns.getText() );
			int y = -1;
			y = x;
			int width = DataCenter.sampleImage.getIconWidth();
			int height = DataCenter.sampleImage.getIconHeight();
			if( width % x != 0 ) {
				for(; (width % x != 0)&&(width>x); x++) {
				
				}
			}		
			y = (height * x) / width;
			Reporter.Report("Columns " + x);
			Reporter.Report("Rows " + y);
			this.parent.getjLabelImage().sethPoints(x);
			this.parent.getjLabelImage().setvPoints(y);	
			this.parent.getjLabelImage().setPointSize(2);
			this.parent.getjLabelImage().getParent().repaint();
			DataCenter.pointsHorizontal = x;
			DataCenter.pointsVertical = y;
			DataCenter.pointsSize = 2;
			
			DataCenter.jframeControl.setInformationMessage(DataCenter.langResource.getString("grid_information_label") 
					+ " " + DataCenter.pointsHorizontal + "x" + DataCenter.pointsVertical);
		} catch( Exception e ) {
			
		}
		this.dispose();
		
	}
	
	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
