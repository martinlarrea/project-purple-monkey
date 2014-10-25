package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

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
	private JLabel jLabelLangChoose;
	private JComboBox jComboBoxLangs;
	private JButton jButtonCancel;
	private JButton jButtonOk;
	private JLabel jLabelLang;

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
				this.setTitle(DataCenter.langResource.getString("lang_dialog_title"));
				{
					jLabelLangChoose = new JLabel();
					getContentPane().add(jLabelLangChoose);
					jLabelLangChoose.setText(DataCenter.langResource.getString("lang_dialog_available"));
					jLabelLangChoose.setBounds(12, 12, 366, 24);
				}
				{
					jLabelLang = new JLabel();
					getContentPane().add(jLabelLang);
					jLabelLang.setText(DataCenter.langResource.getString("language_label"));
					jLabelLang.setBounds(24, 60, 93, 15);
				}
				{
					ComboBoxModel jComboBoxLangsModel = 
							new DefaultComboBoxModel(
									new String[] { DataCenter.langResource.getString("lang_english"),
											DataCenter.langResource.getString("lang_spanish"),
											DataCenter.langResource.getString("lang_german")});
					jComboBoxLangs = new JComboBox();
					getContentPane().add(jComboBoxLangs);
					jComboBoxLangs.setModel(jComboBoxLangsModel);
					jComboBoxLangs.setBounds(112, 56, 162, 22);
				}
				{
					jButtonOk = new JButton();
					getContentPane().add(jButtonOk);
					jButtonOk.setText(DataCenter.langResource.getString("ok"));
					jButtonOk.setBounds(181, 228, 93, 31);
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
					jButtonCancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCancelActionPerformed(evt);
						}
					});
				}
			}
			this.setSize(288, 295);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonOkActionPerformed(ActionEvent evt) {
		switch(this.jComboBoxLangs.getSelectedIndex()) {
		case 0: {
				DataCenter.locale = Locale.getDefault();
			break;
		}
		case 1: {
				DataCenter.locale = new Locale("es", "AR");
			break;
		}
		case 2: {
				DataCenter.locale = new Locale("de", "DE");
			break;
		}		
		}
		DataCenter.langResource = ResourceBundle.getBundle("ar.edu.uns.cs.vyglab.arq.rockar.resources.lang.LANG", DataCenter.locale);
		DataCenter.updateLanguages();
		this.dispose();
		
	}
	
	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
