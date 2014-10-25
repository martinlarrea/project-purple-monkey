package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogGridConfiguration extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JFramePointSetter parent;


	/**
	 * Create the dialog.
	 */
	public JDialogGridConfiguration(JFramePointSetter main) {
		this.parent = main;
		this.setTitle(DataCenter.langResource.getString("grid_config_title"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblXnumberOfColumns = new JLabel(DataCenter.langResource.getString("grid_config_columns"));
		lblXnumberOfColumns.setBounds(12, 40, 194, 15);
		contentPanel.add(lblXnumberOfColumns);
		
		textField = new JTextField();
		textField.setBounds(233, 38, 114, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrXtext = new JTextArea();
		txtrXtext.setLineWrap(true);
		txtrXtext.setEditable(false);
		txtrXtext.setText(DataCenter.langResource.getString("grid_config_rows"));
		txtrXtext.setBounds(12, 92, 424, 116);
		contentPanel.add(txtrXtext);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton(DataCenter.langResource.getString("ok"));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ok();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton(DataCenter.langResource.getString("cancel"));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void cancel() {
		// TODO Auto-generated method stub
		
	}

	protected void ok() {
		// TODO Auto-generated method stub
		
	}
}
