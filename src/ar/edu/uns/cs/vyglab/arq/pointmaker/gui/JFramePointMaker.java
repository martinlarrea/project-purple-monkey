package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import ar.edu.uns.cs.vyglab.util.Reporter;
import javax.swing.ImageIcon;


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
	private JButton jButtonGenerarInforme;
	private JPanel jPanelMinerales;
	private JScrollPane jScrollPaneMainImage;
	private JTextField jTextFieldInput;
	private JPanel jPanelZoomUltra;
	private JPanel jPanelPorcentajes;
	private JPanel jPanelEast;
	private JButton jButtonZoomOut;
	private JButton jButtonZoomIn;
	private JButton jButtonGuardarTrabajo;
	private JButton jButtonAbrirTrabajo;
	private JLabel jLabelStatus;
	private JPanel jPanelSouth;
	private JLabel jLabelImage;
	
	public String workingDirectory;

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
				jPanelNorthLayout.setAlignment(FlowLayout.LEFT);
				getContentPane().add(jPanelNorth, BorderLayout.NORTH);
				jPanelNorth.setLayout(jPanelNorthLayout);
				{
					jButtonNuevoTrabajo = new JButton();
					jButtonNuevoTrabajo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							abrirImagen();
						}

					});
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
				{
					jButtonGenerarInforme = new JButton();
					jPanelNorth.add(jButtonGenerarInforme);
					jButtonGenerarInforme.setText("Generar Informe");
				}
				{
					jButtonZoomIn = new JButton();
					jPanelNorth.add(jButtonZoomIn);
					jButtonZoomIn.setText("Zoom In");
				}
				{
					jButtonZoomOut = new JButton();
					jPanelNorth.add(jButtonZoomOut);
					jButtonZoomOut.setText("Zoom Out");
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
			{
				jPanelEast = new JPanel();
				BoxLayout jPanelEastLayout = new BoxLayout(jPanelEast, javax.swing.BoxLayout.Y_AXIS);
				getContentPane().add(jPanelEast, BorderLayout.EAST);
				jPanelEast.setLayout(jPanelEastLayout);
				jPanelEast.setSize(200, 529);
				jPanelEast.setPreferredSize(new java.awt.Dimension(200, 10));
				jPanelEast.setBackground(new java.awt.Color(196,196,196));
				{
					jPanelMinerales = new JPanel();
					BorderLayout jPanelMineralesLayout = new BorderLayout();
					jPanelEast.add(jPanelMinerales);
					jPanelMinerales.setLayout(jPanelMineralesLayout);
					jPanelMinerales.setOpaque(false);
				}
				{
					jPanelPorcentajes = new JPanel();
					BorderLayout jPanelPorcentajesLayout = new BorderLayout();
					jPanelEast.add(jPanelPorcentajes);
					jPanelPorcentajes.setLayout(jPanelPorcentajesLayout);
					jPanelPorcentajes.setOpaque(false);
				}
				{
					jPanelZoomUltra = new JPanel();
					BorderLayout jPanelZoomUltraLayout = new BorderLayout();
					jPanelEast.add(jPanelZoomUltra);
					jPanelZoomUltra.setLayout(jPanelZoomUltraLayout);
					jPanelZoomUltra.setOpaque(false);
					{
						jTextFieldInput = new JTextField();
						jPanelZoomUltra.add(jTextFieldInput, BorderLayout.SOUTH);
						jTextFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
						jTextFieldInput.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jTextFieldInputActionPerformed(evt);
							}
						});
					}
				}
			}
			{
				this.jLabelImage = new JLabel();
				jScrollPaneMainImage = new JScrollPane(this.jLabelImage);
				getContentPane().add(jScrollPaneMainImage, BorderLayout.CENTER);
			}
			pack();
			this.setSize(794, 455);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jTextFieldInputActionPerformed(ActionEvent evt) {		
		this.inputValue();
	}
	
	private void  inputValue() {
		Reporter.Report("Clave Mineral " + this.jTextFieldInput.getText());
		String input = this.jTextFieldInput.getText();
		boolean exito = false;
		try {
			Integer value = Integer.parseInt(input);
			exito =true;
		}
		catch( NumberFormatException e ) {
			JOptionPane.showMessageDialog(this, "La clave ingresada no es un número"); 
		} 
		catch( Exception e) {
			JOptionPane.showMessageDialog(this, "Error desconocido en clave");
		}
		if (exito) {
			if( claveValida(input) ) {
				Reporter.Report("Clave Mineral " + this.jTextFieldInput.getText());
				ingresarDato(input);
			} else {
				JOptionPane.showMessageDialog(this, "La clave ingresada no existe"); 
			}
		}
	}

	private void ingresarDato(String input) {
		// TODO Auto-generated method stub
		
	}

	private boolean claveValida(String input) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void abrirImagen() {
		// TODO Auto-generated method stub
		JFileChooser abrir = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpg");
		abrir.setFileFilter(filter);
		abrir.showOpenDialog(this);
		File archivo = abrir.getSelectedFile();
		this.jLabelImage.setIcon( new ImageIcon(archivo.getPath()));
		this.workingDirectory = archivo.getParent() + "/";
		Reporter.Report(this.workingDirectory);

	}

}
