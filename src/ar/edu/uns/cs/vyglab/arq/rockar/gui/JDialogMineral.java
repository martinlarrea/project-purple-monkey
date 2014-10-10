package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;

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
public class JDialogMineral extends javax.swing.JDialog {
	private JLabel jLabelKeyValue;
	private JLabel jLabelName;
	private JLabel jLabelKeyValueNumber;
	private JButton jButtonCancel;
	private JButton jButtonOk;
	private JButton jButtonColor;
	private JTextField jTextFieldName;
	private JLabel jLabelColor;
	private int modify = -1;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public JDialogMineral(JFrameControlPanel frame) {
		super(frame);
		initGUI();
		modify = -1;
	}
	
	public JDialogMineral(JFrameControlPanel frame, int key ) {
		this(frame);
		loadData( key );
		modify = key;
	}
	
	private void loadData(int key) {
		this.jLabelKeyValueNumber.setText(DataCenter.jframeControl.getjTableMineralsModel().getValueAt(key, 0).toString());
		this.jTextFieldName.setText(DataCenter.jframeControl.getjTableMineralsModel().getValueAt(key, 1).toString());
		this.jButtonColor.setBackground((Color)DataCenter.jframeControl.getjTableMineralsModel().getValueAt(key, 2));
	}

	private void initGUI() {
		try {
			{
			}
			getContentPane().setLayout(null);
			{
				jLabelKeyValue = new JLabel();
				getContentPane().add(jLabelKeyValue, "Center");
				jLabelKeyValue.setText(DataCenter.langResource.getString("keyvalue_dialog"));
				jLabelKeyValue.setBounds(12, 12, 146, 24);
			}
			{
				jLabelName = new JLabel();
				getContentPane().add(jLabelName);
				jLabelName.setText(DataCenter.langResource.getString("name_dialog"));
				jLabelName.setBounds(12, 48, 146, 24);
			}
			{
				jLabelColor = new JLabel();
				getContentPane().add(jLabelColor);
				jLabelColor.setText(DataCenter.langResource.getString("color_dialog"));
				jLabelColor.setBounds(12, 84, 146, 24);
			}
			{
				jLabelKeyValueNumber = new JLabel();
				getContentPane().add(jLabelKeyValueNumber);
				jLabelKeyValueNumber.setBounds(164, 12, 135, 24);
				jLabelKeyValueNumber.setHorizontalAlignment(SwingConstants.CENTER);
				jLabelKeyValueNumber.setText(String.valueOf( ((JFrameControlPanel)this.getParent()).getLowestKeyAvaiable()) );
			}
			{
				jTextFieldName = new JTextField();
				getContentPane().add(jTextFieldName);
				jTextFieldName.setBounds(164, 49, 135, 24);
			}
			{
				jButtonColor = new JButton();
				getContentPane().add(jButtonColor);
				jButtonColor.setBackground(Color.gray);
				jButtonColor.setBounds(165, 85, 135, 24);
				jButtonColor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonColorActionPerformed(evt);
					}
				});
			}
			{
				jButtonOk = new JButton();
				getContentPane().add(jButtonOk);
				jButtonOk.setText(DataCenter.langResource.getString("ok"));
				jButtonOk.setBounds(200, 224, 100, 25);
				jButtonOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonOkActionPerformed(evt);
					}
				});
			}
			{
				jButtonCancel = new JButton();
				getContentPane().add(jButtonCancel);
				jButtonCancel.setText(DataCenter.langResource.getString("cancel"));
				jButtonCancel.setBounds(12, 224, 100, 25);
				jButtonCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCancelActionPerformed(evt);
					}
				});
			}
			{
				this.setTitle(DataCenter.langResource.getString("mineral_title"));
			}
			this.setSize(321, 285);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonOkActionPerformed(ActionEvent evt) {
		int key = Integer.parseInt(this.jLabelKeyValueNumber.getText());
		String name = this.jTextFieldName.getText();
		Color color = this.jButtonColor.getBackground();
		if( modify == -1) {	
			DataCenter.jframeControl.getjTableMineralsModel().addRow(new Object[] {key, name, color, 0, "0.00%"});		
			DataCenter.jframeControl.increaseLowestKeyAvaiable();
			DataCenter.minerals.put(key, new Vector<Point>());
		} else {
			DataCenter.jframeControl.getjTableMineralsModel().setValueAt(name, this.modify, 1);
			DataCenter.jframeControl.getjTableMineralsModel().setValueAt(color, this.modify, 2);
		}
		this.dispose();
	}
	
	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
	private void jButtonColorActionPerformed(ActionEvent evt) {
		JColorChooser jcc = new JColorChooser();
		Color c = jcc.showDialog(this, DataCenter.langResource.getString("color_chooser"), Color.gray);
		this.jButtonColor.setBackground(c);
	}

}
