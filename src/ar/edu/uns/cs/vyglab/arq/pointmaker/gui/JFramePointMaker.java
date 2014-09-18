package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ar.edu.uns.cs.vyglab.util.Reporter;
import javax.swing.ImageIcon;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


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
	private JButton jButtonAgregarMineral;
	private JTable jTableMinerales;
	private JScrollPane jScrollPaneMinerales;
	private JButton jButtonResetZoom;
	public JTextField jTextFieldInput;
	private JPanel jPanelZoomUltra;
	private JPanel jPanelPorcentajes;
	private JPanel jPanelEast;
	private JButton jButtonZoomOut;
	private JButton jButtonZoomIn;
	private JButton jButtonGuardarTrabajo;
	private JButton jButtonAbrirTrabajo;
	private JLabel jLabelStatus;
	private JPanel jPanelSouth;
	private ImageIcon original;
	private ImageIcon onView;
	private int zoomFactor = 1;
	protected int xPoints;
	protected int yPoints;
	protected JTextArea jTextAreaInformation;
	public JScrollPane jScrollPaneMainImage;
	private JLabel jLabelZoomVision;
	private RockSample jRockSampleMain;
	
	public String workingDirectory;
	public HashMap<Point, Integer> puntos;
	public HashMap<Integer, Vector<Point> > minerales;
	public int keys = 0;
	private File archivo;

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
					jButtonAbrirTrabajo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonAbrirTrabajoActionPerformed(evt);
						}
					});
				}
				{
					jButtonGuardarTrabajo = new JButton();
					jButtonGuardarTrabajo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							guardarTrabajo();
						}
					});
					jPanelNorth.add(jButtonGuardarTrabajo);
					jButtonGuardarTrabajo.setText("Guardar Trabajo");
				}
				{
					jButtonGenerarInforme = new JButton();
					jPanelNorth.add(jButtonGenerarInforme);
					jButtonGenerarInforme.setText("Generar Informe");
					jButtonGenerarInforme.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonGenerarInformeActionPerformed(evt);
						}
					});
				}
				{
					jButtonZoomIn = new JButton();
					jPanelNorth.add(jButtonZoomIn);
					jButtonZoomIn.setText("+Zoom");
					jButtonZoomIn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonZoomInActionPerformed(evt);
						}
					});
				}
				{
					jButtonZoomOut = new JButton();
					jPanelNorth.add(jButtonZoomOut);
					jButtonZoomOut.setText("-Zoom");
					jButtonZoomOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonZoomOutActionPerformed(evt);
						}
					});
				}
				{
					jButtonResetZoom = new JButton();
					jPanelNorth.add(jButtonResetZoom);
					jButtonResetZoom.setText("#Zoom");
					jButtonResetZoom.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonResetZoomActionPerformed(evt);
						}
					});
				}
				{
					jButtonAgregarMineral = new JButton();
					jPanelNorth.add(jButtonAgregarMineral);
					jButtonAgregarMineral.setText("+Mineral");
					jButtonAgregarMineral.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonAgregarMineralActionPerformed(evt);
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
					jPanelMinerales.setPreferredSize(new java.awt.Dimension(200, 85));
					jPanelMinerales.setSize(200, 100);
					{
						jScrollPaneMinerales = new JScrollPane();
						jPanelMinerales.add(jScrollPaneMinerales, BorderLayout.CENTER);
						jScrollPaneMinerales.setPreferredSize(new java.awt.Dimension(200, 136));
						{
							TableModel jTableMineralesModel = 
									new DefaultTableModel(
											new String[][] { },
											new String[] { "Clave", "Mineral" });
							jTableMinerales = new JTable();
							jScrollPaneMinerales.setViewportView(jTableMinerales);
							jTableMinerales.setModel(jTableMineralesModel);
						}
					}
				}
				{
					jPanelPorcentajes = new JPanel();
					BorderLayout jPanelPorcentajesLayout = new BorderLayout();
					jPanelEast.add(jPanelPorcentajes);
					jPanelPorcentajes.setLayout(jPanelPorcentajesLayout);
					jPanelPorcentajes.setOpaque(false);
					{
						jTextAreaInformation = new JTextArea();
						jPanelPorcentajes.add(jTextAreaInformation, BorderLayout.CENTER);
					}
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
						jTextFieldInput.addKeyListener(new KeyAdapter() {
							public void keyPressed(KeyEvent evt) {
								jTextFieldInputKeyPressed(evt);
							}
						});
						jTextFieldInput.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jTextFieldInputActionPerformed(evt);
							}
						});
					}
					{
						jLabelZoomVision = new JLabel();
						jPanelZoomUltra.add(jLabelZoomVision, BorderLayout.CENTER);
					}
				}
			}
			{
				jScrollPaneMainImage = new JScrollPane();
				getContentPane().add(jScrollPaneMainImage, BorderLayout.CENTER);
				{
					jRockSampleMain = new RockSample();
					jRockSampleMain.setMain(this);
					jRockSampleMain.setXPuntos(10);
					jRockSampleMain.setYPuntos(10);
					jRockSampleMain.setSizePunto(6);
					jScrollPaneMainImage.setViewportView(jRockSampleMain);
					jRockSampleMain.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							jRockSampleMainMouseClicked(evt);
						}
					});
				}
			}
			pack();
			this.setSize(794, 455);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	protected void guardarTrabajo() {
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser abrir = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML File", "xml", "xml");
		abrir.setFileFilter(filter);
		int response = abrir.showSaveDialog(this);
		if( response == abrir.APPROVE_OPTION ) {
			File file = abrir.getSelectedFile();
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				// root elements
				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("work");
				doc.appendChild(rootElement);
				
				// staff elements
				Element image = doc.createElement("image");
				rootElement.appendChild(image);
				
				// set attribute to image element
				Attr attr = doc.createAttribute("name");
				attr.setValue(this.archivo.getName());
				image.setAttributeNode(attr);
				
				// mineral list elements
				Element minerals = doc.createElement("minerals");
				rootElement.appendChild(minerals);
				
				// para cada mineral en la tabla de minerales, agrego un Element
				for( int i = 0; i < this.jTableMinerales.getRowCount(); i++ ) {
					Element mineral = doc.createElement("mineral");
					
					// set attribute id to mineral element
					attr = doc.createAttribute("id");
					attr.setValue(this.jTableMinerales.getModel().getValueAt(i, 0).toString());
					mineral.setAttributeNode(attr);
					
					// set attribute name to mineral element
					attr = doc.createAttribute("name");
					attr.setValue(this.jTableMinerales.getModel().getValueAt(i, 1).toString());
					mineral.setAttributeNode(attr);
					
					// agrego el mineral a los minerales
					minerals.appendChild(mineral);
				}
				
				// grid elements
				Element grid= doc.createElement("grid");
				rootElement.appendChild(grid);
				
				// set attribute to image element
				attr = doc.createAttribute("x");
				attr.setValue(String.valueOf( this.jRockSampleMain.xPuntos ));
				grid.setAttributeNode(attr);
				
				// set attribute to image element
				attr = doc.createAttribute("y");
				attr.setValue(String.valueOf( this.jRockSampleMain.yPuntos ));
				grid.setAttributeNode(attr);
				
				// set attribute to image element
				attr = doc.createAttribute("size");
				attr.setValue(String.valueOf( this.jRockSampleMain.sizePunto ));
				grid.setAttributeNode(attr);
				
				// grid elements
				Element points= doc.createElement("points");
				rootElement.appendChild(points);
				
				//por cada punto registrado, lo guardo en el xml
				Iterator<Point> pts = this.puntos.keySet().iterator();
				while( pts.hasNext() ) {
					Point p = pts.next();
					int key = this.puntos.get(p);

					Element point = doc.createElement("point");
					
					// set attribute id to point element
					attr = doc.createAttribute("id");
					attr.setValue(String.valueOf(key));
					point.setAttributeNode(attr);
					
					// set attribute x to point element
					attr = doc.createAttribute("x");
					attr.setValue(String.valueOf(p.x));
					point.setAttributeNode(attr);
					
					// set attribute y to point element
					attr = doc.createAttribute("y");
					attr.setValue(String.valueOf(p.y));
					point.setAttributeNode(attr);
					
					// agrego el mineral a los minerales
					points.appendChild(point);

				}
				
				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(file);
		 	 
				transformer.transform(source, result);
		 
				
			} catch( Exception e) {
				
			}
			
		}
	}

	private void jTextFieldInputActionPerformed(ActionEvent evt) {		
		//this.inputValue();
	}
	
	private void  inputValue() {
		String input = this.jTextFieldInput.getText();
		boolean exito = false;
		Integer value = -1;
		try {
			value = Integer.parseInt(input);
			exito =true;
		}
		catch( NumberFormatException e ) {
			JOptionPane.showMessageDialog(this, "La clave ingresada no es un número"); 
		} 
		catch( Exception e) {
			JOptionPane.showMessageDialog(this, "Error desconocido en clave");
		}
		if (exito) {
			if( claveValida(value) ) {
				ingresarDato(value);
				JOptionPane.showMessageDialog(this, "La clave ingresada no existe"); 
			}
		}
	}

	private void ingresarDato(int input) {
		int x = this.jRockSampleMain.getSelectedX();
		int y = this.jRockSampleMain.getSelectedY();
		Point p = new Point(x,y);
		int oldmin = -1;
		
		// actualizo mapeo de puntos a mineral
		if( this.puntos.containsKey(p)) {
			if( this.puntos.get(p) != input ) {
				oldmin = this.puntos.get(p);
				// el punto existe pero con una clave diferente
				// se cambia la clave
				this.puntos.put(p, input);
			}
		} else {
			//el punto no existe
			this.puntos.put(p, input);
		}
		
		// actualizo mapeo de mineral a puntos
		if( this.minerales.containsKey(input) ) {
			// ya existe una lista de puntos asociada al mineral
			if( oldmin != -1 ) {
				//hay que sacar un punto de oldmin y ponerlo en input
				this.minerales.get(oldmin).remove(p);
				this.minerales.get(input).add(p);
			} else {
				if( !this.minerales.get(input).contains(p) ) {
					this.minerales.get(input).add(p);
				}
			}
		} else {
			Vector<Point> nuevospuntos = new Vector<Point>();
			nuevospuntos.add(p);
			this.minerales.put(input, nuevospuntos);
		}
		
		updateInformation();
	}

	private void updateInformation() {
		this.jTextAreaInformation.setText("");
		String result = "";
		int top = this.jTableMinerales.getModel().getRowCount();
		for( int i = 0; i < top; i++ ) {
			Integer mineral = Integer.parseInt( this.jTableMinerales.getModel().getValueAt(i, 0).toString());
			int count = 0;
			if( this.minerales.containsKey(mineral) ) {
				count = this.minerales.get(mineral).size();
			}
			result = result + "\n" + "Mineral " + mineral + " hay " + count + " puntos.";
		}
		this.jTextAreaInformation.setText(result);
	}

	private boolean claveValida(int input) {
		int rows = this.jTableMinerales.getModel().getRowCount();
		for( int i = 0; i < rows; i++ ) {		
			Integer key = Integer.parseInt( this.jTableMinerales.getModel().getValueAt(i, 0).toString() );
			if(  key == input ) {
				return true;
			}
		}		
		return false;
	}
	
	private void abrirImagen() {
		// TODO Auto-generated method stub
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser abrir = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpg");
		abrir.setFileFilter(filter);
		abrir.showOpenDialog(this);
		archivo = abrir.getSelectedFile();
		if( archivo != null ) {
			PointChooser pc = new PointChooser(this);
			pc.setLocationRelativeTo(this);
			pc.setVisible(true);
			this.original = new ImageIcon(archivo.getPath());
			this.onView = new ImageIcon(archivo.getPath());			
			this.jRockSampleMain.setIcon( this.onView );
			this.workingDirectory = archivo.getParent() + "/";		
			this.requestFocus();
			this.puntos = new HashMap<Point, Integer>();
			this.minerales = new HashMap<Integer, Vector<Point>>();
			//this.jRockSampleMain.setSize(this.onView.getIconWidth(), this.onView.getIconHeight());
		}

	}
	
	
	private void jButtonZoomInActionPerformed(ActionEvent evt) {
		this.zoomFactor++;

		resizeImage(this.zoomFactor);
	}
	
	private void resizeImage(int zoom) {
		//this.jRockSampleMain.setZoom(this.zoomFactor);
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
		this.jRockSampleMain.setIcon(this.onView);
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

	public int getxPoints() {
		return xPoints;
	}

	public void setxPoints(int xPoints) {
		this.xPoints = xPoints;
		this.jRockSampleMain.setXPuntos(this.xPoints);
	}

	public int getyPoints() {
		return yPoints;
	}

	public void setyPoints(int yPoints) {
		this.yPoints = yPoints;
		this.jRockSampleMain.setYPuntos(this.yPoints);
	}
	
	private void updateInputField() {
		Point p = new Point(this.jRockSampleMain.getSelectedX(), this.jRockSampleMain.getSelectedY() );
		if( this.puntos.containsKey(p) ) {
			Integer key = this.puntos.get(p);
			this.jTextFieldInput.setText(key.toString() );
		}
	}
	
	
	private void jTextFieldInputKeyPressed(KeyEvent evt) {
		switch(evt.getKeyCode()) {
			case KeyEvent.VK_ENTER: {
				this.ingresarPunto();
				this.updateInputField();
				break;
			}
			case KeyEvent.VK_UP: {
				this.moverCelda(0,-1);
				this.updateInputField();
				break;				
			}
			case KeyEvent.VK_DOWN: {
				this.moverCelda(0,1);
				this.updateInputField();
				break;				
			}
			case KeyEvent.VK_LEFT: {
				this.moverCelda(-1,0);
				this.updateInputField();
				break;				
			}
			case KeyEvent.VK_RIGHT: {
				this.moverCelda(1,0);
				this.updateInputField();
				break;				
			}
			default: {

			}
		}
		
	}

	private void moverCelda(int i, int j) {
		if( (this.jRockSampleMain.getSelectedX() + i >= 1) && (this.jRockSampleMain.getSelectedY() + j >= 1) &&
				(this.jRockSampleMain.getSelectedX() + i <= xPoints) && (this.jRockSampleMain.getSelectedY() + j <= yPoints) )
		{
			this.jRockSampleMain.setSelectedX( this.jRockSampleMain.getSelectedX() + i );
			this.jRockSampleMain.setSelectedY( this.jRockSampleMain.getSelectedY() + j );
			this.jRockSampleMain.repaint();
		}
		
	}
	
	private void moverACelda( int i, int j) {
		this.jRockSampleMain.setSelectedX(i);
		this.jRockSampleMain.setSelectedY(j);
		this.jRockSampleMain.repaint();
	}

	private void ingresarPunto() {
		String input = this.jTextFieldInput.getText();
		boolean exito = false;
		Integer value = -1;
		try {
			if (!input.isEmpty()) {
				value = Integer.parseInt(input);	
			}			
			exito = true;
		}
		catch( NumberFormatException e ) {
			JOptionPane.showMessageDialog(this, "La clave ingresada no es un número"); 
		} 
		catch( Exception e) {
			JOptionPane.showMessageDialog(this, "Error desconocido en clave");
		}
		if (exito) {
			if( !input.isEmpty() ) {
				if( claveValida(value) ) {
					ingresarDato(value);
					this.movimientoAutomatico();
				} else {
					JOptionPane.showMessageDialog(this, "La clave ingresada no existe"); 
				}
			} else {
				//el usuario no ingreso nada
				//si el punto seleccionado ya estaba cargado
				//se considera que se quiere borrar ese dato
				Point p = new Point(this.jRockSampleMain.getSelectedX(), this.jRockSampleMain.getSelectedY() );
				if( this.puntos.containsKey(p)) {
					int key = this.puntos.get(p);
					this.puntos.remove(p);
					this.minerales.get(key).remove(p);
					this.jRockSampleMain.repaint();
					this.updateInformation();
				}
			}
				
		}		
		
	}

	private void movimientoAutomatico() {
		int x = this.jRockSampleMain.getSelectedX();
		int y = this.jRockSampleMain.getSelectedY();
		int modx = x % 2;
		int mody = y % 2;	
		if( mody == 1) {
			if( y != yPoints ) {
				if( x != xPoints ) {
					this.moverCelda(1, 0);
				} else {
					this.moverACelda(x, y+1);
				}
			} else {
				if( x != xPoints ) {
					this.moverCelda(1, 0);
				} 
			}
		} else {
			if( y != yPoints ) {
				if( x != 1 ) {
					this.moverCelda(-1, 0);
				} else {
					this.moverACelda(x, y+1);
				}
			} else {
				if( x != xPoints ) {
					this.moverCelda(-1, 0);
				}
			}
		}
		
	}
	
	private void jButtonAgregarMineralActionPerformed(ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel)this.jTableMinerales.getModel();
		model.addRow(new Object[]{String.valueOf(this.keys++), "mineral"});
	}
	
	private void jButtonGenerarInformeActionPerformed(ActionEvent evt) {
		generarInforme();
	}

	private void generarInforme() {
		int top = this.jTableMinerales.getModel().getRowCount();
		for( int i = 0; i < top; i++ ) {
			Integer mineral = Integer.parseInt( this.jTableMinerales.getModel().getValueAt(i, 0).toString());
			int count = 0;
			if( this.minerales.containsKey(mineral) ) {
				count = this.minerales.get(mineral).size();
			}
			Reporter.Report("Mineral " + mineral + " hay " + count + " puntos.");
		}
	}
	
	private void jRockSampleMainMouseClicked(MouseEvent evt) {
		this.jRockSampleMain.pointSelected(evt.getX(), evt.getY() );
		this.jRockSampleMain.repaint();
		this.updateInputField();
	}
	
	private void jButtonAbrirTrabajoActionPerformed(ActionEvent evt) {
		abrirTrabajo();
	}

	private void abrirTrabajo() {
		try {
			File currentDir = new File( System.getProperty("user.dir") );
			JFileChooser abrir = new JFileChooser(currentDir);
			FileNameExtensionFilter filter = new FileNameExtensionFilter("XML File", "xml", "xml");
			abrir.setFileFilter(filter);
			int response = abrir.showOpenDialog(this);
			if( response == abrir.APPROVE_OPTION ) {					
				File fXmlFile = abrir.getSelectedFile();
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);		 
				doc.getDocumentElement().normalize();			 
				//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			 
				Node imagen = doc.getElementsByTagName("image").item(0);
				Element el = (Element)imagen;
				this.archivo = new File(el.getAttribute("name"));
				this.jRockSampleMain.setIcon(new ImageIcon(el.getAttribute("name")));
				this.original = new ImageIcon(el.getAttribute("name"));
				this.onView = new ImageIcon(el.getAttribute("name"));	
				
				
				Node grid = doc.getElementsByTagName("grid").item(0);
				Element egrid = (Element)grid;
				this.xPoints = Integer.parseInt( egrid.getAttribute("x") );
				this.yPoints = Integer.parseInt( egrid.getAttribute("y") );

				this.jRockSampleMain.setXPuntos(this.xPoints);
				this.jRockSampleMain.setYPuntos(this.yPoints);
				this.jRockSampleMain.setSizePunto( Integer.parseInt( egrid.getAttribute("size") ) );
				
				this.puntos = new HashMap<Point, Integer>();
				this.minerales = new HashMap<Integer, Vector<Point>>();
				
				TableModel jTableMineralesModel = 
						new DefaultTableModel(
								new String[][] { },
								new String[] { "Clave", "Mineral" });
				this.jTableMinerales.setModel(jTableMineralesModel);
				
				NodeList nListMinerals = doc.getElementsByTagName("mineral");
				DefaultTableModel model = (DefaultTableModel)this.jTableMinerales.getModel();
				for( int i = 0; i < nListMinerals.getLength(); i++ ) {
					Element mineral = (Element)nListMinerals.item(i);
					String id = mineral.getAttribute("id");
					String name = mineral.getAttribute("name");
					model.addRow(new Object[]{id, name});
				}
				
				//TODO CARGAR PUNTOS
				NodeList nListPoints = doc.getElementsByTagName("point");
				for( int i = 0; i < nListPoints.getLength(); i++ ) {
					Element point = (Element)nListPoints.item(i);
					int x = Integer.parseInt( point.getAttribute("x"));
					int y = Integer.parseInt( point.getAttribute("y"));
					int id = Integer.parseInt( point.getAttribute("id"));
					Point p = new Point( x, y );
					this.puntos.put(p, id);
					
					if( this.minerales.containsKey(id) ) {
						this.minerales.get(id).add(p);
					} else {
						Vector<Point> puntos = new Vector<Point>();
						puntos.add(p);
						this.minerales.put(id, puntos);
					}					
				}
				this.updateInformation();
			}
		}
		catch( Exception e ) {
			
		}	
	}
	
	public void updateZoomVision() {
		ImageIcon ii = this.jRockSampleMain.getZoomVisio();
		if( ii!= null ) {
			this.jLabelZoomVision.setIcon(ii);
		}
	}

}
