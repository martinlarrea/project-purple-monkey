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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JTextField;

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
	private JButton jButtonOk;
	private JLabel jLabelLang;
	private JTextField jTextFieldNColumns;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public JDialogGridConfiguration(JFrame frame) {
		super(frame);
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
					jButtonOk.setBounds(277, 228, 93, 31);
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
						jTextFieldNColumns.setBounds(256, 10, 114, 19);
						getContentPane().add(jTextFieldNColumns);
						jTextFieldNColumns.setColumns(10);
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
		this.dispose();
		
	}
	
	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
