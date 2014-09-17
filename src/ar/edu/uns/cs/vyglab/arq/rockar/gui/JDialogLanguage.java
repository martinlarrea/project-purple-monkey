package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


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
public class JDialogLanguage extends javax.swing.JDialog {
	private JLabel jLabelLanguage;
	private JComboBox jComboBoxLanguage;
	private JButton jButtonCancel;
	private JButton jButtonOK;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public JDialogLanguage(JFrame frame) {
		super(frame);
		initGUI();
		loadLanguages();
	}
	
	private void loadLanguages() {
		//TODO detectar cuantos idiomas hay en la carpeta de recursos
		//TODO cargarlos en el combobox
		
	}

	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setModal(true);
			this.setResizable(false);
			this.setTitle("Choose language");
			{
				jButtonOK = new JButton();
				getContentPane().add(jButtonOK, new AnchorConstraint(881, 429, 961, 35, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jButtonOK.setText("OK");
				jButtonOK.setPreferredSize(new java.awt.Dimension(137, 22));
				jButtonOK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonOKActionPerformed(evt);
					}
				});
			}
			{
				ComboBoxModel jComboBoxLanguageModel = 
						new DefaultComboBoxModel(
								new String[] { });
				jComboBoxLanguage = new JComboBox();
				getContentPane().add(jComboBoxLanguage, new AnchorConstraint(30, 972, 110, 383, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jComboBoxLanguage.setModel(jComboBoxLanguageModel);
				jComboBoxLanguage.setPreferredSize(new java.awt.Dimension(205, 22));
			}
			{
				jLabelLanguage = new JLabel();
				getContentPane().add(jLabelLanguage, new AnchorConstraint(45, 332, 100, 31, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jLabelLanguage.setText("Language:");
				jLabelLanguage.setPreferredSize(new java.awt.Dimension(120, 15));
			}
			{
				jButtonCancel = new JButton();
				getContentPane().add(jButtonCancel, new AnchorConstraint(881, 969, 961, 576, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jButtonCancel.setText("Cancel");
				jButtonCancel.setPreferredSize(new java.awt.Dimension(137, 22));
				jButtonCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCancelActionPerformed(evt);
					}
				});
			}
			this.setSize(350, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonOKActionPerformed(ActionEvent evt) {	
		updateResourceBundle();
		this.dispose();
	}
	
	private void updateResourceBundle() {
		//TODO actualizar resource bundle
		
	}

	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
