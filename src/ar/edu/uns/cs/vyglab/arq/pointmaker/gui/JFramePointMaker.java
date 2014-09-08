package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
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
public class JFramePointMaker extends javax.swing.JFrame {
	private JPanel jPanelNorth;
	private JButton jButtonNuevoTrabajo;
	private JButton jButtonGuardarTrabajo;
	private JButton jButtonAbrirTrabajo;
	private JLabel jLabelStatus;
	private JPanel jPanelSouth;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFramePointMaker inst = new JFramePointMaker();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFramePointMaker() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			this.setTitle("Point Maker");
			getContentPane().setLayout(thisLayout);
			{
				jPanelNorth = new JPanel();
				FlowLayout jPanelNorthLayout = new FlowLayout();
				getContentPane().add(jPanelNorth, BorderLayout.NORTH);
				jPanelNorth.setLayout(jPanelNorthLayout);
				{
					jButtonNuevoTrabajo = new JButton();
					jPanelNorth.add(jButtonNuevoTrabajo);
					jButtonNuevoTrabajo.setText("Nuevo Trabajo");
				}
				{
					jButtonAbrirTrabajo = new JButton();
					jPanelNorth.add(jButtonAbrirTrabajo);
					jButtonAbrirTrabajo.setText("Abrir Trabajo");
				}
				{
					jButtonGuardarTrabajo = new JButton();
					jPanelNorth.add(jButtonGuardarTrabajo);
					jButtonGuardarTrabajo.setText("Guardar Trabajo");
				}
			}
			{
				jPanelSouth = new JPanel();
				BorderLayout jPanelSouthLayout = new BorderLayout();
				jPanelSouth.setLayout(jPanelSouthLayout);
				getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
				{
					jLabelStatus = new JLabel();
					jPanelSouth.add(jLabelStatus, BorderLayout.CENTER);
					jLabelStatus.setText("Información General");
					jLabelStatus.setBackground(new java.awt.Color(247,202,120));
					jLabelStatus.setOpaque(true);
					jLabelStatus.setFont(new java.awt.Font("Arial",1,12));
				}
			}
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
