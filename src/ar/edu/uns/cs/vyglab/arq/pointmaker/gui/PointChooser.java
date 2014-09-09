package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
public class PointChooser extends javax.swing.JDialog {
	private JButton jButtonAceptar;
	private JLabel jLabel2;
	private JTextField jTextFieldPuntosVerticales;
	private JLabel jLabel1;
	private JTextField jTextFieldPuntosHorizontales;
	private JButton jButtonCancelar;
	private JFramePointMaker parent;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public PointChooser(JFramePointMaker frame) {
		super(frame);
		this.parent = frame;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.setResizable(false);
				this.setTitle("Definir Cantidad de Puntos");
				{
					jButtonAceptar = new JButton();
					getContentPane().add(jButtonAceptar);
					jButtonAceptar.setText("Aceptar");
					jButtonAceptar.setBounds(12, 100, 111, 22);
					jButtonAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonAceptarActionPerformed(evt);
						}
					});
				}
				{
					jButtonCancelar = new JButton();
					getContentPane().add(jButtonCancelar);
					jButtonCancelar.setText("Cancelar");
					jButtonCancelar.setBounds(193, 100, 121, 22);
					jButtonCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCancelarActionPerformed(evt);
						}
					});
				}
				{
					jTextFieldPuntosHorizontales = new JTextField();
					getContentPane().add(jTextFieldPuntosHorizontales);
					jTextFieldPuntosHorizontales.setBounds(220, 26, 94, 22);
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Puntos Horizontales:");
					jLabel1.setBounds(12, 29, 181, 15);
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Puntos Verticales:");
					jLabel2.setBounds(12, 64, 181, 15);
				}
				{
					jTextFieldPuntosVerticales = new JTextField();
					getContentPane().add(jTextFieldPuntosVerticales);
					jTextFieldPuntosVerticales.setBounds(220, 61, 94, 22);
				}
			}
			this.setSize(338, 186);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonAceptarActionPerformed(ActionEvent evt) {
		boolean exito = false;
		int x = -1;
		int y = -1;
		try {
			x = Integer.parseInt( this.jTextFieldPuntosHorizontales.getText() );
			y = Integer.parseInt( this.jTextFieldPuntosVerticales.getText() );
			exito =true;
		}
		catch( NumberFormatException e ) {
			JOptionPane.showMessageDialog(this, "Los valores ingresados no son números"); 
		} 
		catch( Exception e) {
			JOptionPane.showMessageDialog(this, "Error desconocido en valores");
		}
		if(exito) {
			this.parent.setxPoints(x);
			this.parent.setyPoints(y);
			this.parent.repaint();
			this.dispose();
		}

	}
	
	private void jButtonCancelarActionPerformed(ActionEvent evt) {
		System.out.println("jButtonCancelar.actionPerformed, event="+evt);
		//TODO add your code for jButtonCancelar.actionPerformed
	}

}
