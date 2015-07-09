package ar.edu.uns.cs.vyglab.javax.swing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class JImagePanel extends JPanel {

	private BufferedImage overview = null;
	
	public void setOverview( BufferedImage i ) {
		this.overview = i;
	}
	
	protected void paintComponent( Graphics g ) {
		g.drawImage(this.overview, 0, 0, null);
	}
}
