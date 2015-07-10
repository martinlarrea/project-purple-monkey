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
	private JButton jButtonApply;
	
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
		this.tabbedPane.add("XAutomatic", this.jPanelAutomatic);
		jPanelAutomatic.setLayout(null);
		
		this.jLabelColumns = new JLabel(DataCenter.langResource.getString("grid_config_columns"));
		this.jLabelColumns.setBounds(12, 12, 172, 32);
		//jPanelAutomatic.add(this.jLabelColumns);
		jPanelManual.add(this.jLabelColumns);
		this.tabbedPane.add("XManual", this.jPanelManual);
		jPanelManual.setLayout(null);
		
		this.jLabelRows = new JLabel(DataCenter.langResource.getString("grid_config_lrows"));
		this.jLabelRows.setBounds(12, 66, 172, 32);
		jPanelManual.add(this.jLabelRows);
		
		textFieldColumns = new IntegerTextField();
		textFieldColumns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldColumns.setBounds(259, 12, 172, 32);
		jPanelManual.add(textFieldColumns);
		textFieldColumns.setColumns(10);
		
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
		
		jButtonApply = new JButton(DataCenter.langResource.getString("apply"));
		jButtonApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyManual();
			}
		});
		jButtonApply.setBounds(166, 206, 117, 25);
		jPanelManual.add(jButtonApply);
		
		this.setSize(459, 295);

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
		//?
	}
}
