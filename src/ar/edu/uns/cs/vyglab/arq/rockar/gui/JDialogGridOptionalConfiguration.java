package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.java.util.IntegerTextField;
import ar.edu.uns.cs.vyglab.util.Reporter;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogGridOptionalConfiguration extends javax.swing.JDialog {
	protected JTabbedPane tabbedPane;
	protected JPanel jPanelAutomatic;
	protected JPanel jPanelManual;
	protected JLabel jLabelColumns;
	protected JLabel jLabelRows;
	private IntegerTextField textFieldColumns;
	private IntegerTextField textFieldRows;
	private JButton jButtonCancelManual;
	private JButton jButtonOKManual;
	private JButton jButtonApplyManual;
	
	protected JLabel jLabelColumnsAuto;
	private IntegerTextField textFieldColumnsAuto;
	private JButton jButtonCancelAuto;
	private JButton jButtonOKAuto;
	private JButton jButtonApplyAuto;
	private JTextPane jTextPaneAuto;
	private JTextPane jTextPaneObservation;
	
	
	public JDialogGridOptionalConfiguration( JFramePointSetter parent) {
		super(parent);
		this.initGUI();
	}
	
	protected void initGUI() {
		this.setTitle(DataCenter.langResource.getString("grid_config_title"));
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		this.jPanelAutomatic = new JPanel();
		this.jPanelManual = new JPanel();
		this.tabbedPane.add(DataCenter.langResource.getString("grid_config_automatic"), this.jPanelAutomatic);
		jPanelAutomatic.setLayout(null);
		
		this.jLabelColumns = new JLabel(DataCenter.langResource.getString("grid_config_columns"));
		this.jLabelColumns.setBounds(12, 12, 172, 32);
		jPanelManual.add(this.jLabelColumns);
		
		this.jLabelColumnsAuto = new JLabel(DataCenter.langResource.getString("grid_config_columns"));
		this.jLabelColumnsAuto.setBounds(12, 12, 172, 32);
		this.jPanelAutomatic.add(this.jLabelColumnsAuto);
		
		this.tabbedPane.add(DataCenter.langResource.getString("grid_config_manual"), this.jPanelManual);
		jPanelManual.setLayout(null);
		
		this.jLabelRows = new JLabel(DataCenter.langResource.getString("grid_config_lrows"));
		this.jLabelRows.setBounds(12, 66, 172, 32);
		jPanelManual.add(this.jLabelRows);
		
		textFieldColumns = new IntegerTextField();
		textFieldColumns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldColumns.setBounds(259, 12, 172, 32);
		jPanelManual.add(textFieldColumns);
		textFieldColumns.setColumns(10);
		
		textFieldColumnsAuto = new IntegerTextField();
		textFieldColumnsAuto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldColumnsAuto.setBounds(259, 12, 172, 32);
		jPanelAutomatic.add(textFieldColumnsAuto);
		textFieldColumnsAuto.setColumns(10);
		
		textFieldRows = new IntegerTextField();
		textFieldRows.setBounds(259, 66, 172, 32);
		textFieldRows.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelManual.add(textFieldRows);
		textFieldRows.setColumns(10);
		
		jButtonCancelManual = new JButton(DataCenter.langResource.getString("cancel"));
		jButtonCancelManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelManual();
			}
		});
		jButtonCancelManual.setBounds(12, 206, 117, 25);
		jPanelManual.add(jButtonCancelManual);
		
		jButtonOKManual = new JButton(DataCenter.langResource.getString("ok"));
		jButtonOKManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okManual();
			}
		});
		jButtonOKManual.setBounds(314, 206, 117, 25);
		jPanelManual.add(jButtonOKManual);
		
		jButtonApplyManual = new JButton(DataCenter.langResource.getString("apply"));
		jButtonApplyManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyManual();
			}
		});
		jButtonApplyManual.setBounds(166, 206, 117, 25);
		jPanelManual.add(jButtonApplyManual);
		
		jButtonCancelAuto = new JButton(DataCenter.langResource.getString("cancel"));
		jButtonCancelAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelManual();
			}
		});
		jButtonCancelAuto.setBounds(12, 206, 117, 25);
		jPanelAutomatic.add(jButtonCancelAuto);
		
		jButtonOKAuto= new JButton(DataCenter.langResource.getString("ok"));
		jButtonOKAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okAuto();
			}
		});
		jButtonOKAuto.setBounds(314, 206, 117, 25);
		jPanelAutomatic.add(jButtonOKAuto);
		
		jButtonApplyAuto= new JButton(DataCenter.langResource.getString("apply"));
		jButtonApplyAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyAuto();
			}
		});
		jButtonApplyAuto.setBounds(166, 206, 117, 25);
		jPanelAutomatic.add(jButtonApplyAuto);
		
		jTextPaneObservation = new JTextPane();
		jTextPaneObservation.setBounds(12, 79, 419, 115);
		jTextPaneObservation.setText(DataCenter.langResource.getString("grid_config_rows"));
		jPanelAutomatic.add(jTextPaneObservation);
		
		this.setSize(459, 295);

	}

	protected void applyAuto() {
		try{
			int x = Integer.parseInt(this.textFieldColumnsAuto.getText());
			int y = -1;
			y = x;
			int width = DataCenter.sampleImage.getIconWidth();
			int height = DataCenter.sampleImage.getIconHeight();
			if( width % x != 0 ) {
				for(; (width % x != 0)&&(width>x); x++) {
				
				}
			}		
			y = (height * x) / width;
			Reporter.Report("Columns " + x);
			Reporter.Report("Rows " + y);
			((JFramePointSetter) this.getParent()).getjLabelImage().sethPoints(x);
			((JFramePointSetter) this.getParent()).getjLabelImage().setvPoints(y);	
			((JFramePointSetter) this.getParent()).getjLabelImage().setPointSize(2);
			((JFramePointSetter) this.getParent()).getjLabelImage().getParent().repaint();
			DataCenter.pointsHorizontal = x;
			DataCenter.pointsVertical = y;
			DataCenter.pointsSize = 2;
			
			DataCenter.jframeControl.setInformationMessage(DataCenter.langResource.getString("grid_information_label") 
					+ " " + DataCenter.pointsHorizontal + "x" + DataCenter.pointsVertical);
			
			this.getParent().repaint();
		}
		catch( Exception e ) {
			
		}
		
	}

	protected void okAuto() {
		this.applyAuto();
		this.setVisible(false);
		this.dispose();
		
	}

	protected void okManual() {
		// TODO Auto-generated method stub
		// general la grilla, cierra el dialogo
		this.applyManual();
		this.setVisible(false);
		this.dispose();

	}

	protected void applyManual() {
		// TODO Auto-generated method stub
		// genera la grilla, mantiene el dialog abierto
		int x = Integer.parseInt(this.textFieldColumns.getText());
		int y = Integer.parseInt(this.textFieldRows.getText());
		Reporter.Report("Columns " + x);
		Reporter.Report("Rows " + y);
		((JFramePointSetter) this.getParent()).getjLabelImage().sethPoints(x);
		((JFramePointSetter) this.getParent()).getjLabelImage().setvPoints(y);	
		((JFramePointSetter) this.getParent()).getjLabelImage().setPointSize(2);
		((JFramePointSetter) this.getParent()).getjLabelImage().getParent().repaint();
		DataCenter.pointsHorizontal = x;
		DataCenter.pointsVertical = y;
		DataCenter.pointsSize = 2;
		
		DataCenter.jframeControl.setInformationMessage(DataCenter.langResource.getString("grid_information_label") 
				+ " " + DataCenter.pointsHorizontal + "x" + DataCenter.pointsVertical);
		
		this.getParent().repaint();
		
	}

	protected void cancelManual() {
		// TODO Auto-generated method stub
		this.setVisible(false);
		this.dispose();
	}
}
