package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.java.util.CenterRenderer;
import ar.edu.uns.cs.vyglab.javax.swing.JReadOnlyTable;
import ar.edu.uns.cs.vyglab.javax.table.RockTableModel;
import ar.edu.uns.cs.vyglab.javax.table.cell.ColorRenderer;
import ar.edu.uns.cs.vyglab.util.Reporter;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

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
public class JFrameControlPanel extends javax.swing.JFrame {
	private JPanel jPanelSouth;
	private JLabel jLabelInformation;
	private JPanel jPanelTop;
	private JPanel jPanelBottom;
	private JToolBar jToolBarMineralTable;
	private JToolBar jToolBarStats;
	private JButton jButtonExportOverview;
	private JButton jButtonExportAll;
	private JButton jButtonExportExcel;
	private JButton jButtonExportStats;
	private JToolBar jToolBarOverview;
	private JTable jTableMinerals;
	private JScrollPane jScrollPaneMineralTable;
	private JLabel jLabelMineralTableInformation;
	private JButton jButtonOpen;
	private JButton jButtonRemove;
	private JButton jButtonEdit;
	private JButton jButtonAdd;
	private JSeparator jSeparator1;
	private JButton jButtonSave;
	private JButton jButtonNew;
	private JPanel jPanelEast;
	private JPanel jPanelWest;
	private JPanel jPanelCenter;
	private RockTableModel jTableMineralsModel;
	private int lowestKeyAvaiable = 1;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrameControlPanel() {
		super();
		initGUI();
		initCustomGUI();
		loadLanguage();
	}
	
	private void initCustomGUI() {
	
	}


	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/splash/purple-monkey32.png")).getImage());
			this.setTitle("Rock.AR v2.0");
			this.addComponentListener(new ComponentAdapter() {
				public void componentResized(ComponentEvent evt) {
					thisComponentResized(evt);
				}
			});
			this.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent evt) {
					thisWindowClosed(evt);
				}
			});
			{
				jPanelSouth = new JPanel();
				BorderLayout jPanelSouthLayout = new BorderLayout();
				getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
				jPanelSouth.setLayout(jPanelSouthLayout);
				{
					jLabelInformation = new JLabel();
					jPanelSouth.add(jLabelInformation, BorderLayout.CENTER);
					jLabelInformation.setText("XXX Information");
					jLabelInformation.setOpaque(true);
					jLabelInformation.setBackground(new java.awt.Color(241,191,101));
				}
			}
			{
				jPanelCenter = new JPanel();
				GridLayout jPanelCenterLayout = new GridLayout(1, 1);
				jPanelCenterLayout.setHgap(5);
				jPanelCenterLayout.setVgap(5);
				jPanelCenterLayout.setColumns(1);
				getContentPane().add(jPanelCenter, BorderLayout.CENTER);
				jPanelCenter.setLayout(jPanelCenterLayout);
				{
					jPanelWest = new JPanel();
					BorderLayout jPanelWestLayout = new BorderLayout();
					jPanelCenter.add(jPanelWest);
					jPanelWest.setLayout(jPanelWestLayout);
					jPanelWest.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					{
						jToolBarMineralTable = new JToolBar();
						jToolBarMineralTable.setLayout( new FlowLayout(FlowLayout.LEFT));
						jPanelWest.add(jToolBarMineralTable, BorderLayout.NORTH);
						jToolBarMineralTable.setFloatable(false);
						jToolBarMineralTable.setFocusable(false);
						{
							jButtonNew = new JButton();
							jToolBarMineralTable.add(jButtonNew);
							jButtonNew.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Actions-tab-new-icon.png")));
						}
						{
							jButtonOpen = new JButton();
							jToolBarMineralTable.add(jButtonOpen);
							jButtonOpen.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/open.png")));
						}
						{
							jButtonSave = new JButton();
							jToolBarMineralTable.add(jButtonSave);
							jButtonSave.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/save.png")));
						}
						{
							jSeparator1 = new JSeparator();
							jToolBarMineralTable.add(jSeparator1);
							jSeparator1.setOrientation(SwingConstants.VERTICAL);
							jSeparator1.setSize(5, 44);
							jSeparator1.setPreferredSize(new java.awt.Dimension(5, 44));
						}
						{
							jButtonAdd = new JButton();
							jToolBarMineralTable.add(jButtonAdd);
							jButtonAdd.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/add.png")));
							jButtonAdd.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jButtonAddActionPerformed(evt);
								}
							});
						}
						{
							jButtonEdit = new JButton();
							jToolBarMineralTable.add(jButtonEdit);
							jButtonEdit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/modify.png")));
							jButtonEdit.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jButtonEditActionPerformed(evt);
								}
							});
						}
						{
							jButtonRemove = new JButton();
							jToolBarMineralTable.add(jButtonRemove);
							jButtonRemove.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/remove.png")));
							jButtonRemove.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jButtonRemoveActionPerformed(evt);
								}
							});
						}
					}
					{
						jLabelMineralTableInformation = new JLabel();
						jPanelWest.add(jLabelMineralTableInformation, BorderLayout.SOUTH);
						jLabelMineralTableInformation.setText("XXX Information");
						jLabelMineralTableInformation.setHorizontalAlignment(SwingConstants.RIGHT);
						jLabelMineralTableInformation.setBackground(new java.awt.Color(255,212,133));
						jLabelMineralTableInformation.setOpaque(true);
					}
					{
						jScrollPaneMineralTable = new JScrollPane();
						jPanelWest.add(jScrollPaneMineralTable, BorderLayout.CENTER);
						{
							jTableMineralsModel = 
									new RockTableModel(
											new String[] {
													"XKey Value",
													"XName",
													"XColor",
													"XCounted Points",
													"XRelative Area" }, 0);
//							jTableMineralsModel.addRow(new Object[] {
//									0, "x?", Color.gray, 0,
//									"0.00" });
							jTableMinerals = new JReadOnlyTable();
							jScrollPaneMineralTable.setViewportView(jTableMinerals);
							jTableMinerals.setModel(jTableMineralsModel);
							jTableMinerals.setDefaultRenderer(Color.class, new ColorRenderer(true));
							TableCellRenderer centerRenderer = new CenterRenderer();
							TableColumn column = jTableMinerals.getColumnModel().getColumn(0);
					        column.setCellRenderer( centerRenderer );
					        column = jTableMinerals.getColumnModel().getColumn(1);
					        column.setCellRenderer( centerRenderer );
					        column = jTableMinerals.getColumnModel().getColumn(3);
					        column.setCellRenderer( centerRenderer );
					        column = jTableMinerals.getColumnModel().getColumn(4);
					        column.setCellRenderer( centerRenderer );

						}
					}
				}
				{
					jPanelEast = new JPanel();
					jPanelCenter.add(jPanelEast);
					GridLayout jPanelEastLayout = new GridLayout(2, 1);
					jPanelEastLayout.setHgap(5);
					jPanelEastLayout.setVgap(5);
					jPanelEastLayout.setColumns(1);
					jPanelEast.setLayout(jPanelEastLayout);
					{
						jPanelTop = new JPanel();
						BorderLayout jPanelTopLayout = new BorderLayout();
						jPanelEast.add(jPanelTop);
						jPanelTop.setLayout(jPanelTopLayout);
						jPanelTop.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						{
							jToolBarStats = new JToolBar();
							jPanelTop.add(jToolBarStats, BorderLayout.NORTH);
							jToolBarStats.setFloatable(false);
							jToolBarStats.setFocusable(false);
							{
								jButtonExportStats = new JButton();
								jToolBarStats.add(jButtonExportStats);
								jButtonExportStats.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/export-graph.png")));
							}
							{
								jButtonExportExcel = new JButton();
								jToolBarStats.add(jButtonExportExcel);
								jButtonExportExcel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/excel-icon.png")));
							}
							{
								jButtonExportAll = new JButton();
								jToolBarStats.add(jButtonExportAll);
								jButtonExportAll.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/Mimetypes-application-vnd-ms-excel-icon.png")));
							}
						}
					}
					{
						jPanelBottom = new JPanel();
						BorderLayout jPanelBottomLayout = new BorderLayout();
						jPanelEast.add(jPanelBottom);
						jPanelBottom.setLayout(jPanelBottomLayout);
						jPanelBottom.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						{
							jToolBarOverview = new JToolBar();
							jPanelBottom.add(jToolBarOverview, BorderLayout.NORTH);
							jToolBarOverview.setFloatable(false);
							jToolBarOverview.setFocusable(false);
							{
								jButtonExportOverview = new JButton();
								jToolBarOverview.add(jButtonExportOverview);
								jButtonExportOverview.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/export-graph.png")));
							}
						}
					}
				}
			}
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void thisWindowClosed(WindowEvent evt) {
		DataCenter.exitApp();
	}
	
	private void thisComponentResized(ComponentEvent evt) {

	}

	public void loadLanguage() {
		this.jTableMinerals.getTableHeader().getColumnModel().getColumn(0).setHeaderValue(DataCenter.langResource.getString("keyvalue_table"));
		this.jTableMinerals.getTableHeader().getColumnModel().getColumn(1).setHeaderValue(DataCenter.langResource.getString("name_table"));
		this.jTableMinerals.getTableHeader().getColumnModel().getColumn(2).setHeaderValue(DataCenter.langResource.getString("color_table"));
		this.jTableMinerals.getTableHeader().getColumnModel().getColumn(3).setHeaderValue(DataCenter.langResource.getString("counted_table"));
		this.jTableMinerals.getTableHeader().getColumnModel().getColumn(4).setHeaderValue(DataCenter.langResource.getString("area_table"));
		this.jTableMinerals.updateUI();
		this.jButtonAdd.setToolTipText(DataCenter.langResource.getString("newmineral_tooltip"));
		this.jButtonEdit.setToolTipText(DataCenter.langResource.getString("editmineral_tooltip"));
		this.jButtonRemove.setToolTipText(DataCenter.langResource.getString("removemineral_tooltip"));
		this.jButtonNew.setToolTipText(DataCenter.langResource.getString("newtable_tooltip"));
		this.jButtonOpen.setToolTipText(DataCenter.langResource.getString("opentable_tooltip"));
		this.jButtonSave.setToolTipText(DataCenter.langResource.getString("savetable_tooltip"));
	}
	
	private void jButtonRemoveActionPerformed(ActionEvent evt) {
		int row = this.jTableMinerals.getSelectedRow();
		if( row != -1 ) {
			int response = JOptionPane.showConfirmDialog(this, DataCenter.langResource.getString("remove_mineral_conf"));
			if( response == JOptionPane.YES_OPTION ) {
				int key = (Integer)this.jTableMineralsModel.getValueAt(row, 0);
				this.jTableMineralsModel.removeRow(response);
				DataCenter.minerals.remove(key);
				if( DataCenter.points.containsValue(key) ) {
					//TODO algo...
				}
			}
		}
	}

	/**
	 * @return the lowestKeyAvaiable
	 */
	public int getLowestKeyAvaiable() {
		return lowestKeyAvaiable;
	}

	public void increaseLowestKeyAvaiable() {
		this.lowestKeyAvaiable++;
	}
	
	private void jButtonAddActionPerformed(ActionEvent evt) {
		JDialogMineral jdm = new JDialogMineral(this);
		jdm.setVisible(true);
	}
	
	private void jButtonEditActionPerformed(ActionEvent evt) {
		JDialogMineral jdm = new JDialogMineral(this, this.jTableMinerals.getSelectedRow());
		jdm.setVisible(true);
	}

}
