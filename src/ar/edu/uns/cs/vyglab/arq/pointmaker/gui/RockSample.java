package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class RockSample extends JLabel {
	protected int xPuntos = 1;
	protected int yPuntos = 1;
	protected int sizePunto = 1;
	protected int selectedX = 1;
	protected int selectedY = 1;
	protected int segX = 1;
	protected int segY = 1;
	
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
						
		segX = this.getWidth() / this.xPuntos;
		segY = this.getHeight() / this.yPuntos;
		
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
		
		if( this.getSelectedX()!= -1) {
			int x1 = (this.selectedX * this.segX) - (this.segX/2);
			int y1 = (this.selectedY * this.segY) - (this.segY/2);
			g.setColor(Color.ORANGE);
			g.drawOval(x1-(this.sizePunto/2), y1-(this.sizePunto/2), this.sizePunto, this.sizePunto);
			g.drawRect((x1-1)*this.segX, (y1-1)*this.segY, this.segX, this.segY);
		}
	}

	public int getSizePunto() {
		return sizePunto;
	}

	public void setSizePunto(int sizePunto) {
		this.sizePunto = sizePunto;
	}

	public void pointSelected(int x, int y) {
		// TODO Auto-generated method stub
		int algX = (x / this.segX) + 1;
		int algY = (y / this.segY) + 1;
		this.setSelectedX(algX);
		this.setSelectedY(algY);
		
	}

	public int getSelectedX() {
		return selectedX;
	}

	public void setSelectedX(int selectedX) {
		this.selectedX = selectedX;
	}

	public int getSelectedY() {
		return selectedY;
	}

	public void setSelectedY(int selectedY) {
		this.selectedY = selectedY;
	}
}
