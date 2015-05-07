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

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
	private int currentZoom = 1;

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
					jButtonOpenWork.setFocusable(false);
					jToolBar.add(jButtonOpenWork);
					jButtonOpenWork.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/open.png")));
				}
				{
					jButtonSaveWork = new JButton();
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
					jToggleButtonNoShowColor.setFocusable(false);
					jToolBar.add(jToggleButtonNoShowColor);
					jToggleButtonNoShowColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonNoShowColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/nocolor.png")));
					jToggleButtonNoShowColor.setSelected(true);
				}
				{
					jToggleButtonTransparentColor = new JToggleButton();
					jToggleButtonTransparentColor.setFocusable(false);
					jToolBar.add(jToggleButtonTransparentColor);
					jToggleButtonTransparentColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonTransparentColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/semitrans.png")));
				}
				{
					jToggleButtonFullColor = new JToggleButton();
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
					jButtonAbout.setFocusable(false);
					jToolBar.add(jButtonAbout);
					jButtonAbout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/abut.png")));
				}
				{
					jButtonHelp = new JButton();
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
			
			/*
			this.jLabelImage.sethPoints(90);
			this.jLabelImage.setvPoints(90);
			this.jLabelImage.setPointSize(10);*/
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
		int columns = this.jLabelImage.gethPoints();
		int rows = this.jLabelImage.getvPoints();
		int hseparation = this.jLabelImage.getWidth() / this.jLabelImage.gethPoints();
		int vseparation = this.jLabelImage.getHeight() / this.jLabelImage.getvPoints();
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
				this.assignValue(this.jLabelImage.getSelectedhPoint(), this.jLabelImage.getSelectedvPoint(), this.jTextFieldKey.getText());
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

	private void assignValue(int selectedhPoint, int selectedvPoint, String key) {
		if(selectedhPoint != -1) {
			Reporter.Report(selectedhPoint + " " + selectedvPoint + " " + key); 
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
			// Se le asigna el nuevo valor al punto
			Integer value = Integer.parseInt(key);
			DataCenter.points.put(p, value);
			DataCenter.minerals.get(value).add(p);
			Reporter.Report("New value" + value);
			DataCenter.jframeControl.updateVisualizations();
		}
		
	}

	private void moveSelectedCell(int i, int j) {
		if( (this.jLabelImage != null) && (this.jLabelImage.getSelectedhPoint() != -1) ) {
			int selectedx = this.jLabelImage.getSelectedhPoint();
			int selectedy = this.jLabelImage.getSelectedvPoint();
			// TODO
			// Antes de moverse, si la celda actual tiene cargado una key
			// hay que guardarla
			this.assignValue(this.jLabelImage.getSelectedhPoint(), this.jLabelImage.getSelectedvPoint(), this.jTextFieldKey.getText());
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

}
