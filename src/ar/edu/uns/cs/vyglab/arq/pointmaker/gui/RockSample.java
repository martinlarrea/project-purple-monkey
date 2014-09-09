package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class RockSample extends JLabel {
	protected int xPuntos;
	protected int yPuntos;
	
	public void paint( Graphics g ) {
		super.paint(g);
		g.setColor(Color.RED);
		g.drawRect(10, 10, 100, 100);
	}
}
