package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
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
	private JButton jButtonResetZoom;
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
	private ImageIcon original;
	private ImageIcon onView;
	private int zoomFactor = 1;
	
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
					jButtonZoomIn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonZoomInActionPerformed(evt);
						}
					});
				}
				{
					jButtonZoomOut = new JButton();
					jPanelNorth.add(jButtonZoomOut);
					jButtonZoomOut.setText("Zoom Out");
					jButtonZoomOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonZoomOutActionPerformed(evt);
						}
					});
				}
				{
					jButtonResetZoom = new JButton();
					jPanelNorth.add(jButtonResetZoom);
					jButtonResetZoom.setText("Reset Zoom");
					jButtonResetZoom.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonResetZoomActionPerformed(evt);
						}
					});
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
		if( archivo != null ) {
			this.original = new ImageIcon(archivo.getPath());
			this.onView = new ImageIcon(archivo.getPath());
			
			this.jLabelImage.setIcon( this.onView );
			this.workingDirectory = archivo.getParent() + "/";
			Reporter.Report(this.workingDirectory);
		}

	}
	
	private void jButtonZoomInActionPerformed(ActionEvent evt) {
		this.zoomFactor++;
		resizeImage(this.zoomFactor);
	}
	
	private void resizeImage(int zoom) {
		if( this.zoomFactor == 1 ) {
			this.onView = new ImageIcon( this.original.getImage() );
		}
		else {
			int newWidth = this.original.getIconWidth() * this.zoomFactor;
			int newHeight = this.original.getIconHeight() * this.zoomFactor;
			BufferedImage bi = new BufferedImage( this.original.getIconWidth(), 
					this.original.getIconHeight(), BufferedImage.TYPE_INT_RGB);
			Graphics g = bi.createGraphics();
			// paint the Icon to the BufferedImage.
			this.original.paintIcon(null, g, 0,0);
			g.dispose();						
			Image newI = this.getScaledInstance(bi , newWidth, newHeight);
			this.onView = new ImageIcon(newI);			
		}
		this.jLabelImage.setIcon(this.onView);
		System.gc();
	}

	private void jButtonZoomOutActionPerformed(ActionEvent evt) {
		if( this.zoomFactor != 1 ) {
			this.zoomFactor--;
			this.resizeImage(this.zoomFactor);
		}
	}
	
	/**
     * Convenience method that returns a scaled instance of the
     * provided {@code BufferedImage}.
     *
     * @param img the original image to be scaled
     * @param targetWidth the desired width of the scaled instance,
     *    in pixels
     * @param targetHeight the desired height of the scaled instance,
     *    in pixels
     * @param hint one of the rendering hints that corresponds to
     *    {@code RenderingHints.KEY_INTERPOLATION} (e.g.
     *    {@code RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR},
     *    {@code RenderingHints.VALUE_INTERPOLATION_BILINEAR},
     *    {@code RenderingHints.VALUE_INTERPOLATION_BICUBIC})
     * @param higherQuality if true, this method will use a multi-step
     *    scaling technique that provides higher quality than the usual
     *    one-step technique (only useful in downscaling cases, where
     *    {@code targetWidth} or {@code targetHeight} is
     *    smaller than the original dimensions, and generally only when
     *    the {@code BILINEAR} hint is specified)
     * @return a scaled version of the original {@code BufferedImage}
     */
	public Image getScaledInstance(BufferedImage img,
            int targetWidth,
            int targetHeight)
	{
		// REMIND: This only works for opaque images...
		// Use multi-step technique: start with original size, then
		// 	scale down in multiple passes with drawImage()
		// until the target size is reached
			int iw = img.getWidth();
			int ih = img.getHeight();

			Object hint = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
			int type = (img.getTransparency() == Transparency.OPAQUE) ?
					BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;

			//		First get down to no more than 2x in W & H
			while (iw > targetWidth*2 || ih > targetHeight*2) {
				iw = (iw > targetWidth*2) ? iw/2 : iw;
				ih = (ih > targetHeight*2) ? ih/2 : ih;
				img = scaleImage(img, type, hint, iw, ih);
			}

			// REMIND: Conservative approach:
			// first get W right, then worry about H

			// If still too wide - do a horizontal trilinear blend
			// of img and a half-width img
			if (iw > targetWidth) {
				int iw2 = iw/2;
				BufferedImage img2 = scaleImage(img, type, hint, iw2, ih);
				if (iw2 < targetWidth) {
					img = scaleImage(img, type, hint, targetWidth, ih);
					img2 = scaleImage(img2, type, hint, targetWidth, ih);
					interp(img2, img, iw-targetWidth, targetWidth-iw2);
				}
				img = img2;
				iw = targetWidth;
			}
			// iw should now be targetWidth or smaller
			// If still too tall - do a vertical trilinear blend
			// of img and a half-height img
			if (ih > targetHeight) {
				int ih2 = ih/2;
				BufferedImage img2 = scaleImage(img, type, hint, iw, ih2);
				if (ih2 < targetHeight) {
					img = scaleImage(img, type, hint, iw, targetHeight);
					img2 = scaleImage(img2, type, hint, iw, targetHeight);
					interp(img2, img, ih-targetHeight, targetHeight-ih2);
				}
				img = img2;
				ih = targetHeight;
			}
			// ih should now be targetHeight or smaller
			// If we are too small, then it was probably because one of
			// 	the dimensions was too small from the start.
			if (iw < targetWidth && ih < targetHeight) {
				img = scaleImage(img, type, hint, targetWidth, targetHeight);
			}

			return img;	
	}

	private BufferedImage scaleImage(BufferedImage orig,
            int type,
            Object hint,
            int w, int h)
	{
		BufferedImage tmp = new BufferedImage(w, h, type);
		Graphics2D g2 = tmp.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, hint);
		g2.drawImage(orig, 0, 0, w, h, null);
		g2.dispose();
		return tmp;
	}
	
	 private void interp(BufferedImage img1,
             BufferedImage img2,
             int weight1,
             int weight2)
	 {
		 float alpha = weight1;
		 alpha /= (weight1 + weight2);
		 Graphics2D g2 = img1.createGraphics();
		 g2.setComposite(
				 AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
		 g2.drawImage(img2, 0, 0, null);
		 g2.dispose();
	 }
	 
	 private void jButtonResetZoomActionPerformed(ActionEvent evt) {
		 this.zoomFactor = 1;
		 this.resizeImage(this.zoomFactor);
	 }

}
