package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.ImageSample;
import ar.edu.uns.cs.vyglab.java.util.IntegerTextField;
import ar.edu.uns.cs.vyglab.util.ImageScaler;
import ar.edu.uns.cs.vyglab.util.Reporter;


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
public class JFramePointSetter extends javax.swing.JFrame {
	private JToolBar jToolBar;
	private JPanel jPanelSouth;
	private JLabel jLabelInformation;
	private JButton jButtonZoomIn;
	private JToggleButton jToggleButtonSelectedCell;
	private JButton jButtonAbout;
	private JButton jButtonExit;
	private ImageSample jLabelImage;
	private JScrollPane jScrollPaneImage;
	private JTextField jTextFieldKey;
	private JLabel jLabelMineralKey;
	private JPanel jPanelKeyInput;
	private JSeparator jSeparator7;
	private JSeparator jSeparator6;
	private JButton jButtonHelp;
	private JButton jButtonLangChooser;
	private JSeparator jSeparator5;
	private JToggleButton jToggleButtonFullColor;
	private JToggleButton jToggleButtonTransparentColor;
	private JToggleButton jToggleButtonNoShowColor;
	private JSeparator jSeparator4;
	private JButton jButtonColorConfig;
	private JSeparator jSeparator3;
	private JToggleButton jToggleButtonSelectedPoint;
	private JToggleButton jToggleButtonCells;
	private JToggleButton jToggleButtonPoints;
	private JSeparator jSeparator2;
	private JButton jButtonZoomReset;
	private JButton jButtonZoomOut;
	private JSeparator jSeparator1;
	private JButton jButtonSaveWork;
	private JButton jButtonOpenWork;
	private JButton jButtonNewWork;
	public int currentZoom = 1;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFramePointSetter() {
		super();
		initGUI();
		loadLanguage();
	}
	
	public void loadLanguage() {
		this.jLabelInformation.setText(DataCenter.langResource.getString("main_information_label"));
		this.jButtonNewWork.setToolTipText(DataCenter.langResource.getString("mainnew_button_tooltip"));
		this.jButtonOpenWork.setToolTipText(DataCenter.langResource.getString("mainopen_button_tooltip"));
		this.jButtonSaveWork.setToolTipText(DataCenter.langResource.getString("mainsave_button_tooltip"));
		this.jButtonZoomIn.setToolTipText(DataCenter.langResource.getString("zoomin_button_tooltip"));
		this.jButtonZoomOut.setToolTipText(DataCenter.langResource.getString("zoomout_button_tooltip"));
		this.jButtonZoomReset.setToolTipText(DataCenter.langResource.getString("zoomreset_button_tooltip"));
		this.jToggleButtonCells.setToolTipText(DataCenter.langResource.getString("grids_tooltip"));
		this.jToggleButtonPoints.setToolTipText(DataCenter.langResource.getString("points_tooltip"));
		this.jToggleButtonSelectedCell.setToolTipText(DataCenter.langResource.getString("grid_tooltip"));
		this.jToggleButtonSelectedPoint.setToolTipText(DataCenter.langResource.getString("point_tooltip"));
		this.jButtonColorConfig.setToolTipText(DataCenter.langResource.getString("maincolors_tooltip"));
		this.jToggleButtonFullColor.setToolTipText(DataCenter.langResource.getString("fullshow_tooltip"));
		this.jToggleButtonNoShowColor.setToolTipText(DataCenter.langResource.getString("noshow_tooltip"));
		this.jToggleButtonTransparentColor.setToolTipText(DataCenter.langResource.getString("semishow_tooltip"));
		this.jButtonLangChooser.setToolTipText(DataCenter.langResource.getString("lang_tooltip"));
		this.jButtonAbout.setToolTipText(DataCenter.langResource.getString("about_tooltip"));
		this.jButtonHelp.setToolTipText(DataCenter.langResource.getString("help_tooltip"));
		this.jButtonExit.setToolTipText(DataCenter.langResource.getString("exit_tooltip"));
		this.jLabelMineralKey.setText(DataCenter.langResource.getString("key"));

	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/splash/purple-monkey32.png")).getImage());
			this.setTitle("Rock.AR v2.0");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent evt) {
					thisWindowClosed(evt);
				}
			});
			{
				jToolBar = new JToolBar();
				jToolBar.setFocusable(false);
				jToolBar.setLayout( new FlowLayout(FlowLayout.LEFT));
				getContentPane().add(jToolBar, BorderLayout.NORTH);
				jToolBar.setFloatable(false);
				{
					jButtonNewWork = new JButton();
					jButtonNewWork.setFocusable(false);
					jButtonNewWork.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							newWork();
						}
					});
					jToolBar.add(jButtonNewWork);
					jButtonNewWork.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Actions-tab-new-icon.png")));
				}
				{
					jButtonOpenWork = new JButton();
					jButtonOpenWork.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openSavedWork();
						}
					});
					jButtonOpenWork.setFocusable(false);
					jToolBar.add(jButtonOpenWork);
					jButtonOpenWork.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/open.png")));
				}
				{
					jButtonSaveWork = new JButton();
					jButtonSaveWork.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							saveCurrentWork();
						}
					});
					jButtonSaveWork.setFocusable(false);
					jToolBar.add(jButtonSaveWork);
					jButtonSaveWork.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/save.png")));
				}
				{
					jSeparator1 = new JSeparator();
					jToolBar.add(jSeparator1);
					jSeparator1.setOrientation(SwingConstants.VERTICAL);
					jSeparator1.setSize(44, 44);
					jSeparator1.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jButtonZoomIn = new JButton();
					jButtonZoomIn.setFocusable(false);
					jButtonZoomIn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							zoomIn();
						}
					});
					jToolBar.add(jButtonZoomIn);
					jButtonZoomIn.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/zoom-in.png")));
				}
				{
					jButtonZoomOut = new JButton();
					jButtonZoomOut.setFocusable(false);
					jButtonZoomOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							zoomOut();
						}
					});
					jToolBar.add(jButtonZoomOut);
					jButtonZoomOut.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/zoom-out.png")));
					jButtonZoomOut.setEnabled(false);
				}
				{
					jButtonZoomReset = new JButton();
					jButtonZoomReset.setFocusable(false);
					jButtonZoomReset.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							zoomReset();
						}
					});
					jToolBar.add(jButtonZoomReset);
					jButtonZoomReset.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/resetzoom.png")));
				}
				{
					jSeparator2 = new JSeparator();
					jToolBar.add(jSeparator2);
					jSeparator2.setOrientation(SwingConstants.VERTICAL);
					jSeparator2.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jToggleButtonPoints = new JToggleButton();
					jToggleButtonPoints.setFocusable(false);
					jToolBar.add(jToggleButtonPoints);
					jToggleButtonPoints.setSize(44, 44);
					jToggleButtonPoints.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonPoints.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/grid.png")));
					jToggleButtonPoints.setSelected(true);
					jToggleButtonPoints.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jToggleButtonCellsActionPerformed(evt);
						}
					});
				}
				{
					jToggleButtonCells = new JToggleButton();
					jToggleButtonCells.setFocusable(false);
					jToolBar.add(jToggleButtonCells);
					jToggleButtonCells.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonCells.setSize(44, 44);
					jToggleButtonCells.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/cells.png")));
					jToggleButtonCells.setSelected(false);
					jToggleButtonCells.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jToggleButtonCellsActionPerformed(evt);
						}
					});
				}
				{
					jToggleButtonSelectedPoint = new JToggleButton();
					jToggleButtonSelectedPoint.setFocusable(false);
					jToolBar.add(jToggleButtonSelectedPoint);
					jToggleButtonSelectedPoint.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonSelectedPoint.setSize(44, 44);
					jToggleButtonSelectedPoint.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/selectedPoint.png")));
					jToggleButtonSelectedPoint.setSelected(true);
					jToggleButtonSelectedPoint.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jToggleButtonCellsActionPerformed(evt);
						}
					});
					
				}
				{
					jToggleButtonSelectedCell = new JToggleButton();
					jToggleButtonSelectedCell.setFocusable(false);
					jToolBar.add(jToggleButtonSelectedCell);
					jToggleButtonSelectedCell.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonSelectedCell.setSize(44, 44);
					jToggleButtonSelectedCell.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/selectedCell.png")));
					jToggleButtonSelectedCell.setSelected(true);
					jToggleButtonSelectedCell.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jToggleButtonCellsActionPerformed(evt);
						}
					});
				}
				{
					jSeparator3 = new JSeparator();
					jToolBar.add(jSeparator3);
					jSeparator3.setOrientation(SwingConstants.VERTICAL);
					jSeparator3.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jButtonColorConfig = new JButton();
					jButtonColorConfig.setFocusable(false);
					jToolBar.add(jButtonColorConfig);
					jButtonColorConfig.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Actions-format-stroke-color-icon.png")));
					jButtonColorConfig.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonColorConfigActionPerformed(evt);
						}
					});
				}
				{
					jSeparator4 = new JSeparator();
					jToolBar.add(jSeparator4);
					jSeparator4.setOrientation(SwingConstants.VERTICAL);
					jSeparator4.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jToggleButtonNoShowColor = new JToggleButton();
					jToggleButtonNoShowColor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							updateSampleImage();
						}
					});
					jToggleButtonNoShowColor.setFocusable(false);
					jToolBar.add(jToggleButtonNoShowColor);
					jToggleButtonNoShowColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonNoShowColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/nocolor.png")));
					jToggleButtonNoShowColor.setSelected(true);
				}
				{
					jToggleButtonTransparentColor = new JToggleButton();
					jToggleButtonTransparentColor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							updateSampleImage();
						}
					});
					jToggleButtonTransparentColor.setFocusable(false);
					jToolBar.add(jToggleButtonTransparentColor);
					jToggleButtonTransparentColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonTransparentColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/semitrans.png")));
				}
				{
					jToggleButtonFullColor = new JToggleButton();
					jToggleButtonFullColor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							updateSampleImage();
						}
					});
					jToggleButtonFullColor.setFocusable(false);
					jToolBar.add(jToggleButtonFullColor);
					jToggleButtonFullColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonFullColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/fullcolor.png")));
					
					ButtonGroup bg = new ButtonGroup();
					bg.add(this.jToggleButtonFullColor);
					bg.add(this.jToggleButtonNoShowColor);
					bg.add(this.jToggleButtonTransparentColor);
				}
				{
					jSeparator5 = new JSeparator();
					jToolBar.add(jSeparator5);
					jSeparator5.setOrientation(SwingConstants.VERTICAL);
					jSeparator5.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jButtonLangChooser = new JButton();
					jButtonLangChooser.setFocusable(false);
					jToolBar.add(jButtonLangChooser);
					jButtonLangChooser.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/1411756268_config-language.png")));
					jButtonLangChooser.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonLangChooserActionPerformed(evt);
						}
					});
				}
				{
					jButtonAbout = new JButton();
					jButtonAbout.setEnabled(false);
					jButtonAbout.setFocusable(false);
					jToolBar.add(jButtonAbout);
					jButtonAbout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/abut.png")));
				}
				{
					jButtonHelp = new JButton();
					jButtonHelp.setEnabled(false);
					jButtonHelp.setFocusable(false);
					jToolBar.add(jButtonHelp);
					jButtonHelp.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/help.png")));
				}
				{
					jSeparator6 = new JSeparator();
					jToolBar.add(jSeparator6);
					jSeparator6.setOrientation(SwingConstants.VERTICAL);
					jSeparator6.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jButtonExit = new JButton();
					jButtonExit.setFocusable(false);
					jToolBar.add(jButtonExit);
					jButtonExit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/exit.png")));
					jButtonExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonExitActionPerformed(evt);
						}
					});
				}
				{
					jSeparator7 = new JSeparator();
					jToolBar.add(jSeparator7);
					jSeparator7.setPreferredSize(new java.awt.Dimension(10, 44));
					jSeparator7.setOrientation(SwingConstants.VERTICAL);
				}
				{
					jPanelKeyInput = new JPanel();
					BoxLayout jPanelKeyInputLayout = new BoxLayout(jPanelKeyInput, javax.swing.BoxLayout.X_AXIS);
					jPanelKeyInput.setLayout(jPanelKeyInputLayout);
					jToolBar.add(jPanelKeyInput);
					{
						jLabelMineralKey = new JLabel();
						jPanelKeyInput.add(jLabelMineralKey);
						jLabelMineralKey.setText(DataCenter.langResource.getString("key"));
					}
					{
						jTextFieldKey = new IntegerTextField();
						jPanelKeyInput.add(jTextFieldKey);
						jTextFieldKey.setPreferredSize(new java.awt.Dimension(55, 22));
						jTextFieldKey.setHorizontalAlignment(SwingConstants.CENTER);
						jTextFieldKey.addKeyListener(new KeyAdapter() {
							public void keyPressed(KeyEvent evt) {
								jTextFieldKeyKeyPressed(evt);
							}
						});
					}
				}
			}
			{
				jPanelSouth = new JPanel();
				BorderLayout jPanelSouthLayout = new BorderLayout();
				getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
				jPanelSouth.setLayout(jPanelSouthLayout);
				{
					jLabelInformation = new JLabel();
					jPanelSouth.add(jLabelInformation, BorderLayout.CENTER);
					jLabelInformation.setText(DataCenter.langResource.getString("control_information_label"));
					jLabelInformation.setBackground(new java.awt.Color(234,187,100));
					jLabelInformation.setOpaque(true);
				}
			}
			{
				jScrollPaneImage = new JScrollPane();
				getContentPane().add(jScrollPaneImage, BorderLayout.CENTER);
				{
					jLabelImage = new ImageSample();
					jScrollPaneImage.setViewportView(jLabelImage);
					jLabelImage.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							jLabelImageMouseClicked(evt);
						}
					});
				}
			}
			pack();
			this.setSize(1200, 400);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	protected void openSavedWork() {
		this.checkToSave();
		DataCenter.end();
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser openDialgo = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("RCK File", "rck", "rck");
		openDialgo.setFileFilter(filter);
		int response = openDialgo.showOpenDialog(this);
		if( response == openDialgo.APPROVE_OPTION ) {
			try {
				DataCenter.begin(openDialgo.getSelectedFile());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

	private void checkToSave() {
		if( DataCenter.samplePath != null ) {
			int response = JOptionPane.showConfirmDialog(this, DataCenter.langResource.getString("save_work"));
			if( response == JOptionPane.YES_OPTION ) {
				this.saveCurrentWork();
			}
		}
	}

	protected void saveCurrentWork() {
		// TODO Auto-generated method stub
		// la tabla de minerales que se uso, si filemineralList es distinto a null, entonces
		// la tabla en ejecución es la misma que en el archivo, no hace falta guardarla.
		if(DataCenter.fileMineralList == null) {
			//la tabla que se ve en ejecución no se corresponde con un archivo
			//se tiene que guardar la tabla
			JOptionPane.showMessageDialog(this,
				DataCenter.langResource.getString("mineral_table_mod")
					);
				DataCenter.jframeControl.saveTable();
		}
		Reporter.Report("Mineral list: " + DataCenter.fileMineralList);
				
				
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser saveDialog = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("RCK File", "rck", "rck");		
		saveDialog.setFileFilter(filter);
		int response = saveDialog.showSaveDialog(this);
		if( response == saveDialog.APPROVE_OPTION ) {
			File file = saveDialog.getSelectedFile();
			if(file.getName().lastIndexOf(".") == -1) {
				file = new File( file.getName() + ".rck");
			}
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				// root elements
				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("work");
				doc.appendChild(rootElement);
				
				Element xmlPoints = doc.createElement("points");
				rootElement.appendChild(xmlPoints);
				// en un mismo archivo queda, la lista de puntos contados, cada punto es un (x, y, z), 
				// donde x,y es la posición e y es el mineral
				Set<Entry<Point, Integer>> points = DataCenter.points.entrySet();
				for( Entry<Point, Integer> item : points) {
					Point key = item.getKey();
					int value = item.getValue();
					Reporter.Report( "Key: " + key.toString() );
					Reporter.Report("Value: " + value);
					Element point = doc.createElement("point");
					
					// set attribute Key.x to point element
					Attr attrX = doc.createAttribute("x");
					attrX.setValue(Integer.toString(key.x) );
					point.setAttributeNode(attrX);
					
					// set attribute Key.x to point element
					Attr attrY = doc.createAttribute("y");
					attrY.setValue(Integer.toString(key.y) );
					point.setAttributeNode(attrY);
					
					// set attribute value to point element
					Attr attrM = doc.createAttribute("m");
					attrM.setValue(Integer.toString(value) );
					point.setAttributeNode(attrM);
					
					xmlPoints.appendChild(point);
				}
				
				// el tamaño de la grilla
				Element grid = doc.createElement("grid");
				// set attribute columns to grid element
				Attr attrCols = doc.createAttribute("cols");
				attrCols.setValue(Integer.toString(DataCenter.pointsHorizontal) );
				grid.setAttributeNode(attrCols);
				// set attribute rows to grid element
				Attr attrRows = doc.createAttribute("rows");
				attrRows.setValue(Integer.toString(DataCenter.pointsVertical) );
				grid.setAttributeNode(attrRows);
				rootElement.appendChild(grid);
				
				// la imagen que se usa
				Element image = doc.createElement("image");
				// set attribute columns to grid element
				Attr attrImage = doc.createAttribute("file");
				attrImage.setValue(DataCenter.samplePath );
				image.setAttributeNode(attrImage);
				rootElement.appendChild(image);
				
				// la tabla que se usa
				Element list = doc.createElement("list");
				// set attribute columns to grid element
				Attr attrList = doc.createAttribute("file");
				attrList.setValue(DataCenter.fileMineralList.toString());
				list.setAttributeNode(attrList);
				rootElement.appendChild(list);

				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(file);
				transformer.transform(source, result);			
			}
			catch( Exception e ){
	
			}
		}
	}

	protected void zoomReset() {
		this.currentZoom = 1;
		this.jButtonZoomOut.setEnabled(false);
		this.applyZoom(this.currentZoom);
	}

	protected void zoomOut() {
		if(this.currentZoom > 1) {
			this.currentZoom--;
			this.applyZoom(this.currentZoom);
		}
		if(this.currentZoom == 1) {
			this.jButtonZoomOut.setEnabled(false);
		}
	}

	private void applyZoom(int currentZoom) {
		if( currentZoom == 1) {
			this.jLabelImage.setIcon( DataCenter.sampleImage );
		} else {
			this.jLabelImage.setIcon(null);
			int newWidth = DataCenter.sampleImage.getIconWidth() * currentZoom;
			int newHeight = DataCenter.sampleImage.getIconHeight() * currentZoom;
			BufferedImage bi = new BufferedImage( DataCenter.sampleImage.getIconWidth(), 
					DataCenter.sampleImage.getIconHeight(), BufferedImage.TYPE_INT_RGB);
			Graphics g = bi.createGraphics();
			DataCenter.sampleImage.paintIcon(null, g, 0, 0);
			Image scaledImage = ImageScaler.getScaledInstance(bi , newWidth, newHeight);
			this.jLabelImage.setIcon( new ImageIcon(scaledImage));
		}
	}

	protected void zoomIn() {
		this.currentZoom++;
		this.applyZoom(this.currentZoom);
		this.jButtonZoomOut.setEnabled(true);

	}
	
	/*
	protected void newWork() {
		this.resetGUI();
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser openD = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpg");
		openD.setFileFilter(filter);
		openD.showOpenDialog(this);
		File file = openD.getSelectedFile();
		if( file != null ) {
			DataCenter.samplePath = file.getAbsolutePath();
			DataCenter.sampleImage = new ImageIcon(DataCenter.samplePath);
			DataCenter.jframeSetter = this;
			JDialogGridConfiguration jdg = new JDialogGridConfiguration(this);
			jdg.setVisible(true);
			
			this.jLabelImage.setIcon(DataCenter.sampleImage);
		}
	} */
	
	protected void newWork() {
		DataCenter.begin();
		DataCenter.jframeControl.updateVisualizations();
		this.newWork(false);
	}
	
	protected void newWork(boolean skip) {
		File currentDir = new File( System.getProperty("user.dir") );
		JFileChooser openD = new JFileChooser(currentDir);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpg");
		openD.setFileFilter(filter);
		openD.showOpenDialog(this);
		File file = openD.getSelectedFile();
		this.newWork(file, skip);
	}
	
	public void newWork(String filePath, boolean skip) {
		File file = new File(filePath);
		this.newWork(file, skip);
		
	}
	
	protected void newWork(File file, boolean skip) {
		this.resetGUI();
		if( file != null ) {
			DataCenter.samplePath = file.getAbsolutePath();
			DataCenter.sampleImage = new ImageIcon(DataCenter.samplePath);
			DataCenter.jframeSetter = this;
			if(!skip) {
				//JDialogGridConfiguration jdg = new JDialogGridConfiguration(this);
				JDialogGridOptionalConfiguration jdg = new JDialogGridOptionalConfiguration(this);
				jdg.setVisible(true);
			}
			this.jLabelImage.setIcon(DataCenter.sampleImage);
			
			
		}
	}

	private void resetGUI() {
		this.jButtonZoomOut.setEnabled(false);
		this.currentZoom = 1;
	}

	private void jButtonExitActionPerformed(ActionEvent evt) {
		DataCenter.exitApp();
	}
	
	private void thisWindowClosed(WindowEvent evt) {
		DataCenter.exitApp();
	}
	
	public boolean showGrids() {
		return this.jToggleButtonCells.isSelected();
	}
	
	public boolean showPoints() {
		return this.jToggleButtonPoints.isSelected();
	}
	
	private void jToggleButtonCellsActionPerformed(ActionEvent evt) {
		this.updateSampleImage();
	}
	
	private void updateSampleImage() {
		this.jLabelImage.repaint();
	}
	
	private void jButtonLangChooserActionPerformed(ActionEvent evt) {
		this.languageDialog();
	}

	private void languageDialog() {
		JDialogLangChooser dLang = new JDialogLangChooser(this);
		dLang.setVisible(true);
	}
	
	private void jLabelImageMouseClicked(MouseEvent evt) {
		if( DataCenter.sampleImage != null ) {
			System.out.println("jLabelImage.mouseClicked, event="+evt);
			this.sampleClick( evt.getX(), evt.getY() );
			this.jTextFieldKey.requestFocusInWindow();
		}
	}

	private void sampleClick(int x, int y) {
		//validar que el click sea sobre la muestra
		//en caso de que la muestra sea más chica que el visor
		
		if(( x <= DataCenter.sampleImage.getIconWidth()*this.currentZoom ) && 
				(y <= DataCenter.sampleImage.getIconHeight()*this.currentZoom)) {
			int columns = this.jLabelImage.gethPoints();
			int rows = this.jLabelImage.getvPoints();
			int hseparation;
			int vseparation;
			if(this.currentZoom == 1) {
				hseparation = DataCenter.sampleImage.getIconWidth() / this.jLabelImage.gethPoints();
				vseparation = DataCenter.sampleImage.getIconHeight() / this.jLabelImage.getvPoints();
			} else {
				hseparation = this.jLabelImage.getWidth() / this.jLabelImage.gethPoints();
				vseparation = this.jLabelImage.getHeight() / this.jLabelImage.getvPoints();
			}
			int hstep = x / hseparation;
			int vstep = y / vseparation;
			this.jLabelImage.setSelectedhPoint(hstep);
			this.jLabelImage.setSelectedvPoint(vstep);
			//después de seleccionar el punto hay que ver
			// si tiene un mineral asociado y cargarlo
			// Después de moverse, si la nueva celda tiene cargada una key
						// hay que cargarla en el jtextfield
			Point p = new Point(hstep, vstep);
			if( DataCenter.points.containsKey(p) ) {
				int value = DataCenter.points.get(p);
				this.jTextFieldKey.setText(String.valueOf(value));
			}
			this.jLabelImage.repaint();
		}
		
	}
	
	
	private void jTextFieldKeyKeyPressed(KeyEvent evt) {
		Reporter.Report("TextField Key Press");
		if(this.validate(this.jTextFieldKey.getText()) ) {
			switch(evt.getKeyCode()) {
			case(KeyEvent.VK_UP) : {
				Reporter.Report("Key UP");
				this.moveSelectedCell(0,-1);
				break;
				}
			case(KeyEvent.VK_DOWN) : {
				Reporter.Report("Key DOWN");
				this.moveSelectedCell(0,1);
				break;
				}
			case(KeyEvent.VK_LEFT) : {
				Reporter.Report("Key LEFT");
				this.moveSelectedCell(-1,0);
				break;
				}
			case(KeyEvent.VK_RIGHT) : {
				Reporter.Report("Key RIGHT");
				this.moveSelectedCell(1,0);
				break;
				}
			case(KeyEvent.VK_ENTER) : {
				Reporter.Report("Key ENTER");
				this.assignValue(this.jLabelImage.getSelectedhPoint(), this.jLabelImage.getSelectedvPoint(), this.jTextFieldKey.getText(), true);
				break;
				}
			}
		}
		else {
			Reporter.Report("Validation Negative");
		}
		Reporter.Report("Focus Requested");
		this.jTextFieldKey.requestFocusInWindow();
	}

	public void assignValue(int selectedhPoint, int selectedvPoint, String key, boolean update) {
		if((selectedhPoint != -1)) {
			// primero ver si el punto ya tiene un valor asignado
			Point p = new Point(selectedhPoint, selectedvPoint);
			if( DataCenter.points.containsKey(p)) { 
				// el punto ya tenia un valor asignado
				// se obtiene el value asociado, se elimina el punto y se elimina la asociación inversa 
				// en el hash de minerales
				int value = DataCenter.points.get(p);
				Reporter.Report("Old value" + value);
				DataCenter.points.remove(p);
				DataCenter.minerals.get(value).remove(p);
			}
			// si el key no es empty
			// Se le asigna el nuevo valor al punto
			if(!key.isEmpty()) {
				Integer value = Integer.parseInt(key);
				DataCenter.points.put(p, value);
				DataCenter.minerals.get(value).add(p);
			}
			if( update ) {
				DataCenter.jframeControl.updateVisualizations();
			}
		}
	}

	private void moveSelectedCell(int i, int j) {
		if( (this.jLabelImage != null) && (this.jLabelImage.getSelectedhPoint() != -1) ) {
			int selectedx = this.jLabelImage.getSelectedhPoint();
			int selectedy = this.jLabelImage.getSelectedvPoint();
			// TODO
			// Antes de moverse, si la celda actual tiene cargado una key
			// hay que guardarla
			this.assignValue(this.jLabelImage.getSelectedhPoint(), this.jLabelImage.getSelectedvPoint(), this.jTextFieldKey.getText(), true);
			if(selectedx + i < 0) {
				selectedx = 0;
			} else if (selectedx + i >= this.jLabelImage.gethPoints()) {
				selectedx = this.jLabelImage.gethPoints() - 1;
			} else {
				selectedx = selectedx + i;
			}
			
			if(selectedy + j < 0) {
				selectedy = 0;
			} else if( selectedy + j >= this.jLabelImage.getvPoints()) {
				selectedy = this.jLabelImage.getvPoints() - 1;
			} else {
				selectedy = selectedy + j;
			}
			
			this.jLabelImage.setSelectedhPoint(selectedx);
			this.jLabelImage.setSelectedvPoint(selectedy);
			// Después de moverse, si la nueva celda tiene cargada una key
			// hay que cargarla en el jtextfield
			Point p = new Point(selectedx, selectedy);
			if( DataCenter.points.containsKey(p) ) {
				int value = DataCenter.points.get(p);
				this.jTextFieldKey.setText(String.valueOf(value));
			}
			
			this.jLabelImage.repaint();
		}
		
	}

	private boolean validate(String text) {
		if (!text.isEmpty()) {
			int key = Integer.parseInt(text);
			return DataCenter.minerals.containsKey(key); }
		else {
			return true;
		}
	}

	/**
	 * @return the jLabelImage
	 */
	public ImageSample getjLabelImage() {
		return jLabelImage;
	}
	
	private void jButtonColorConfigActionPerformed(ActionEvent evt) {
		this.ColorConfiguration();
	}
	
	private void ColorConfiguration() {
		JDialogColorConfiguration jdcc = new JDialogColorConfiguration(this);
		jdcc.setVisible(true);
	}

	public boolean showSelectedGrid() {
		return this.jToggleButtonSelectedCell.isSelected();
	}

	public boolean showSelectedPoint() {
		return this.jToggleButtonSelectedPoint.isSelected();
	}

	public boolean showNoColorsPoints() {
		return this.jToggleButtonNoShowColor.isSelected();
	}

	public boolean showFullColorsPoints() {
		return this.jToggleButtonFullColor.isSelected();
	}

	public boolean showSemiColorsPoints() {
		return this.jToggleButtonTransparentColor.isSelected();
	}

	public void setInformationMessage(String string) {
		this.jLabelInformation.setText( DataCenter.langResource.getString("main_information_label") + " " + string);
	}
}
