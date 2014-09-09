package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class RockSample extends JLabel {
	protected int xPuntos = 1;
	protected int yPuntos = 1;
	protected int sizePunto = 1;
	
	public void setXPuntos( int x ) {
		this.xPuntos = x;
	}
	
	public void setYPuntos( int y ) {
		this.yPuntos = y;
	}
	
	public int getXPuntos() {
		return this.xPuntos;
	}
	
	public int getYPuntos() {
		return this.yPuntos;
	}
	
	public void paint( Graphics g ) {
		super.paint(g);
						
		int segX = this.getWidth() / this.xPuntos;
		int segY = this.getHeight() / this.yPuntos;
		
		int initX = 0;
		int initY = 0;
		for( int i = 0; i < this.xPuntos; i++ ) {
			for( int j = 0; j < this.yPuntos; j++ ) {
				g.setColor(Color.MAGENTA);
				g.drawRect(initX, initY, segX, segY);				
				int middleX = initX + (segX/2);
				int middleY = initY + (segY/2);
				g.setColor(Color.GREEN);
				g.drawOval(middleX-(this.sizePunto/2), middleY-(this.sizePunto/2), this.sizePunto, this.sizePunto);				
				initY = initY + segY;
			}
			initX = initX + segX;
			initY = 0;
		}		
	}

	public int getSizePunto() {
		return sizePunto;
	}

	public void setSizePunto(int sizePunto) {
		this.sizePunto = sizePunto;
	}
}
