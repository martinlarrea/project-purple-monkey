package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JDialogGridOptionalConfiguration extends javax.swing.JDialog {
	protected JTabbedPane tabbedPane;
	protected JPanel jPanelAutomatic;
	protected JPanel jPanelManual;
	protected JLabel jLabelColumns;
	protected JLabel jLabelRows;
	private JTextField textFieldColumns;
	private JTextField textFieldRows;
	
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
		
		this.jLabelRows = new JLabel(DataCenter.langResource.getString("grid_config_rows"));
		this.jLabelRows.setBounds(12, 66, 172, 32);
		jPanelManual.add(this.jLabelRows);
		
		textFieldColumns = new JTextField();
		textFieldColumns.setBounds(259, 12, 172, 32);
		jPanelManual.add(textFieldColumns);
		textFieldColumns.setColumns(10);
		
		textFieldRows = new JTextField();
		textFieldRows.setBounds(259, 66, 172, 32);
		jPanelManual.add(textFieldRows);
		textFieldRows.setColumns(10);
		
		JButton jButtonCancelManual = new JButton(DataCenter.langResource.getString("cancel"));
		jButtonCancelManual.setBounds(12, 206, 117, 25);
		jPanelManual.add(jButtonCancelManual);
		
		JButton jButtonOKManual = new JButton(DataCenter.langResource.getString("ok"));
		jButtonOKManual.setBounds(314, 206, 117, 25);
		jPanelManual.add(jButtonOKManual);
	}
}
