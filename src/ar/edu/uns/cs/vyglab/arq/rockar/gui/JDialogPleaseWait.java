package ar.edu.uns.cs.vyglab.arq.rockar.gui;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;


public class JDialogPleaseWait extends JDialog implements Runnable {
	
	public JDialogPleaseWait(JFrame parent) {
		super(parent);
		this.setTitle(parent.getTitle());
		JLabel label = new JLabel(DataCenter.langResource.getString("please_wait"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label, BorderLayout.NORTH);
	}

	@Override
	public void run() {
		this.setVisible(true);
	}
}
