package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import ar.edu.uns.cs.vyglab.util.ImageScaler;


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
				jToolBar.setLayout( new FlowLayout(FlowLayout.LEFT));
				getContentPane().add(jToolBar, BorderLayout.NORTH);
				jToolBar.setFloatable(false);
				{
					jButtonNewWork = new JButton();
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
					jToolBar.add(jButtonOpenWork);
					jButtonOpenWork.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/open.png")));
				}
				{
					jButtonSaveWork = new JButton();
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
					jToolBar.add(jToggleButtonCells);
					jToggleButtonCells.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonCells.setSize(44, 44);
					jToggleButtonCells.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/cells.png")));
					jToggleButtonCells.setSelected(true);
					jToggleButtonCells.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jToggleButtonCellsActionPerformed(evt);
						}
					});
				}
				{
					jToggleButtonSelectedPoint = new JToggleButton();
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
					jToolBar.add(jButtonColorConfig);
					jButtonColorConfig.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Actions-format-stroke-color-icon.png")));
				}
				{
					jSeparator4 = new JSeparator();
					jToolBar.add(jSeparator4);
					jSeparator4.setOrientation(SwingConstants.VERTICAL);
					jSeparator4.setPreferredSize(new java.awt.Dimension(10, 44));
				}
				{
					jToggleButtonNoShowColor = new JToggleButton();
					jToolBar.add(jToggleButtonNoShowColor);
					jToggleButtonNoShowColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonNoShowColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/nocolor.png")));
					jToggleButtonNoShowColor.setSelected(true);
				}
				{
					jToggleButtonTransparentColor = new JToggleButton();
					jToolBar.add(jToggleButtonTransparentColor);
					jToggleButtonTransparentColor.setPreferredSize(new java.awt.Dimension(44, 44));
					jToggleButtonTransparentColor.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/semitrans.png")));
				}
				{
					jToggleButtonFullColor = new JToggleButton();
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
					jToolBar.add(jButtonLangChooser);
					jButtonLangChooser.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/1411756268_config-language.png")));
				}
				{
					jButtonAbout = new JButton();
					jToolBar.add(jButtonAbout);
					jButtonAbout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/abut.png")));
				}
				{
					jButtonHelp = new JButton();
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
						jLabelMineralKey.setText("XXX Key:");
					}
					{
						jTextFieldKey = new JTextField();
						jPanelKeyInput.add(jTextFieldKey);
						jTextFieldKey.setPreferredSize(new java.awt.Dimension(55, 22));
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
					jLabelInformation.setText("XXX Information:");
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
			this.jLabelImage.setIcon(DataCenter.sampleImage);
			
			//
			this.jLabelImage.sethPoints(90);
			this.jLabelImage.setvPoints(90);
			this.jLabelImage.setPointSize(10);
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

}
