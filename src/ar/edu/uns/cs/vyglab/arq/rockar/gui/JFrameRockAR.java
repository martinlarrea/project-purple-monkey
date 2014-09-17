package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.resources.information.Configuration;
import ar.edu.uns.cs.vyglab.util.Reporter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToolBar;

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
public class JFrameRockAR extends javax.swing.JFrame {
	private JToolBar jToolBarMain;
	private JButton jButtonLegalInformation;
	private JButton jButtonExit;
	private JButton jButtonLanguage;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameRockAR inst = new JFrameRockAR();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFrameRockAR() {
		super();
		initGUI();
	}
	

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jToolBarMain = new JToolBar();
				getContentPane().add(jToolBarMain, BorderLayout.NORTH);
				{
					jButtonLanguage = new JButton();
					jToolBarMain.add(jButtonLanguage);
					jButtonLanguage.setText("Seleccionar Idioma");
					jButtonLanguage.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonLanguageActionPerformed(evt);
						}
					});
				}
				{
					jButtonLegalInformation = new JButton();
					jToolBarMain.add(jButtonLegalInformation);
					jButtonLegalInformation.setText("Legal");
				}
				{
					jButtonExit = new JButton();
					jToolBarMain.add(jButtonExit);
					jButtonExit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Users-Exit-icon.png")));
					jButtonExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonExitActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonLanguageActionPerformed(ActionEvent evt) {
		this.chooseLang();
	}
	
	public void chooseLang() {
		JDialogLanguage dl = new JDialogLanguage(this);
		dl.setLocationRelativeTo(this);
		dl.setVisible(true);
	}	
	
	private void jButtonExitActionPerformed(ActionEvent evt) {
		this.exit();
	}
	
	public void exit() {
		//TODO verificar si hay que guardar primero
		System.exit(0);
	}

}
