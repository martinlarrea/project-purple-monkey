package ar.edu.uns.cs.vyglab.arq.pointmaker.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JViewport;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class RockSample extends JLabel {
	protected int xPuntos = 1;
	protected int yPuntos = 1;
	protected int sizePunto = 1;
	protected int baseSizePunto = 1;
	protected int selectedX = 1;
	protected int selectedY = 1;
	protected int segX = 1;
	protected int segY = 1;
	protected JFramePointMaker main = null; 
	protected int zoom = 1;
	
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
						
		if( main == null ) {return;}
		
		segX = this.getWidth() / this.xPuntos;
		segY = this.getHeight() / this.yPuntos;
		
		int modsegX = this.getWidth() % this.xPuntos;
		int modsegY = this.getHeight() % this.yPuntos;
	
		int initX = 0;
		int initY = 0;
		for( int i = 0; i < this.xPuntos; i++ ) {	
			for( int j = 0; j < this.yPuntos; j++ ) {										
				
				int middleX = initX + (segX/2);
				int middleY = initY + (segY/2);
				if( visible(middleX,middleY) ) {
					g.setColor(Color.GREEN);
					g.drawOval(middleX-(this.sizePunto/2), middleY-(this.sizePunto/2), this.sizePunto, this.sizePunto);					
					Point p = new Point(i+1,j+1);
					if( (this.getMain().puntos != null) && (this.getMain().puntos.containsKey(p)) ) {
						g.setColor(Color.WHITE);
						g.fillOval(middleX-(this.sizePunto/2), middleY-(this.sizePunto/2), this.sizePunto, this.sizePunto);
						
					}					
				} else {
					
				}
				initY = initY + segY;
			}
			initX = initX + segX;
			initY = 0;
		}
		
		if( this.getSelectedX()!= -1) {
			int x1 = (this.selectedX * this.segX) - (this.segX/2);
			int y1 = (this.selectedY * this.segY) - (this.segY/2);
			g.setColor(Color.ORANGE);
			g.drawRect((this.selectedX-1)*this.segX, (this.selectedY-1)*this.segY, this.segX, this.segY);
		}
	}

	private boolean visible(int i, int j) {
		
		if( this.main == null ) {return false;}
		
		int scrollX = this.main.jScrollPaneMainImage.getHorizontalScrollBar().getValue();
		int scrollY = this.main.jScrollPaneMainImage.getVerticalScrollBar().getValue();
		int imageWidth = this.getWidth();
		int imageHeigt = this.getHeight();
		int viewPortWidth = this.main.jScrollPaneMainImage.getViewport().getWidth();
		int viewPortHeight = this.main.jScrollPaneMainImage.getViewport().getHeight();
		
		if( (scrollX < i) && (i <scrollX+viewPortWidth) && (scrollY < j) && (j < scrollY+viewPortHeight) )
		{
			return true;
		} else {
			return false;
		}
	}

	public int getSizePunto() {
		return sizePunto;
	}

	public void setSizePunto(int sizePunto) {
		this.sizePunto = sizePunto;
		this.baseSizePunto = sizePunto;
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

	public JFramePointMaker getMain() {
		return main;
	}

	public void setMain(JFramePointMaker main) {
		this.main = main;
	}

	public ImageIcon getZoomVisio() {
		int x = this.getSelectedX();
		int y = this.getSelectedY();
		return null;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
		this.sizePunto = zoom * this.baseSizePunto;
	}
}
