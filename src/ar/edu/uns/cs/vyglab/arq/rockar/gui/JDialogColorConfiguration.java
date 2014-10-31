package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.java.util.IntegerTextField;
import ar.edu.uns.cs.vyglab.util.Reporter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JTextField;
import javax.swing.JTextPane;

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
public class JDialogColorConfiguration extends javax.swing.JDialog {
	private JButton jButtonCancel;
	private JLabel jLabelSelectedCell;
	private JLabel jLabelSelectedPoint;
	private JButton jButtonSelectedPoint;
	private JButton jButtonSelectedCell;
	private JButton jButtonCellsColor;
	private JLabel jLabelCellsColor;
	private JButton jButtonGridColor;
	private JLabel jLabelGridColor;
	private JButton jButtonOk;
	private JFramePointSetter parent;

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public JDialogColorConfiguration(JFramePointSetter frame) {
		super(frame);
		this.parent = frame;
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.setTitle(DataCenter.langResource.getString("color_config_title"));
				{
					jButtonOk = new JButton();
					getContentPane().add(jButtonOk);
					jButtonOk.setText(DataCenter.langResource.getString("ok"));
					jButtonOk.setBounds(270, 228, 93, 31);
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
					jButtonCancel.setBounds(12, 228, 93, 31);
					jButtonCancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCancelActionPerformed(evt);
						}
					});
				}
				{
					jLabelGridColor = new JLabel();
					getContentPane().add(jLabelGridColor);
					jLabelGridColor.setText(DataCenter.langResource.getString("color_grids"));
					jLabelGridColor.setBounds(24, 12, 165, 23);
				}
				{
					jButtonGridColor = new JButton();
					getContentPane().add(jButtonGridColor);
					jButtonGridColor.setBounds(207, 12, 156, 23);
					jButtonGridColor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonGridColorActionPerformed(evt);
						}
					});
					jButtonGridColor.setBackground(DataCenter.getGridColor());
				}
				{
					jLabelCellsColor = new JLabel();
					getContentPane().add(jLabelCellsColor);
					jLabelCellsColor.setText(DataCenter.langResource.getString("color_points"));
					jLabelCellsColor.setBounds(24, 47, 165, 23);
				}
				{
					jButtonCellsColor = new JButton();
					getContentPane().add(jButtonCellsColor);
					jButtonCellsColor.setBackground(DataCenter.getPointsColor());
					jButtonCellsColor.setBounds(207, 47, 156, 23);
					jButtonCellsColor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonCellsColorActionPerformed(evt);
						}
					});
				}
				{
					jLabelSelectedCell = new JLabel();
					getContentPane().add(jLabelSelectedCell);
					jLabelSelectedCell.setText(DataCenter.langResource.getString("color_sgrid"));
					jLabelSelectedCell.setBounds(24, 82, 165, 23);
				}
				{
					jButtonSelectedCell = new JButton();
					getContentPane().add(jButtonSelectedCell);
					jButtonSelectedCell.setBackground(DataCenter.getSelectedGridColor());
					jButtonSelectedCell.setBounds(207, 82, 156, 23);
					jButtonSelectedCell.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonSelectedCellActionPerformed(evt);
						}
					});
				}
				{
					jLabelSelectedPoint = new JLabel();
					getContentPane().add(jLabelSelectedPoint);
					jLabelSelectedPoint.setText(DataCenter.langResource.getString("color_spoint"));
					jLabelSelectedPoint.setBounds(24, 117, 165, 24);
				}
				{
					jButtonSelectedPoint = new JButton();
					getContentPane().add(jButtonSelectedPoint);
					jButtonSelectedPoint.setBackground(DataCenter.getSelectedPointColor());
					jButtonSelectedPoint.setBounds(207, 117, 156, 23);
					jButtonSelectedPoint.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonSelectedPointActionPerformed(evt);
						}
					});
				}
			}
			this.setSize(384, 295);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonOkActionPerformed(ActionEvent evt) {
		DataCenter.setGridColor(this.jButtonGridColor.getBackground());
		DataCenter.setPointsColor(this.jButtonCellsColor.getBackground());
		DataCenter.setSelectedGridColor(this.jButtonSelectedCell.getBackground());
		DataCenter.setSelectedPointColor(this.jButtonSelectedPoint.getBackground());
		this.parent.getjLabelImage().repaint();
		this.dispose();
		
	}
	
	private void jButtonCancelActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
	private void jButtonGridColorActionPerformed(ActionEvent evt) {
		this.jButtonBackgroundColorSelector((JButton)evt.getSource());
	}
	
	private void jButtonCellsColorActionPerformed(ActionEvent evt) {
		this.jButtonBackgroundColorSelector((JButton)evt.getSource());
	}
	
	private void jButtonSelectedCellActionPerformed(ActionEvent evt) {
		this.jButtonBackgroundColorSelector((JButton)evt.getSource());
	}
	
	private void jButtonSelectedPointActionPerformed(ActionEvent evt) {
		this.jButtonBackgroundColorSelector((JButton)evt.getSource());
	}
	
	private void jButtonBackgroundColorSelector( JButton button ) {
		JColorChooser jcc = new JColorChooser();
		Color c = jcc.showDialog(this, DataCenter.langResource.getString("color_chooser"), button.getBackground());
		button.setBackground(c);
	}

}
