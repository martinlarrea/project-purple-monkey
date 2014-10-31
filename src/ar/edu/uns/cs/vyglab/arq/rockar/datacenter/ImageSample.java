package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.awt.Graphics;

import javax.swing.JLabel;

public class ImageSample extends JLabel {
	protected int hPoints = -1;
	protected int vPoints = -1;
	protected int pointWidth = -1;
	protected int pointHeight = -1;
	protected int pointSize = -1;
	
	public void paint( Graphics g) {
		super.paint(g);
		if(this.hPoints==-1) {return;}
		
		this.pointWidth = this.getWidth() / this.hPoints;
		this.pointHeight = this.getHeight() / this.vPoints;
		for( int i = 0; i < this.hPoints; i++ ) {
			for( int j = 0; j < this.vPoints; j++ ) {
				int xLoc = i * this.pointWidth;
				int yLoc = j * this.pointHeight;
				if( this.isPointVisible( xLoc, yLoc ) ) {
					if( DataCenter.showGrids() ) {
						g.setColor( DataCenter.getGridColor() );
						g.drawRect(xLoc, yLoc, this.pointWidth, this.pointHeight);
					}
					if( DataCenter.showPoints()) {
						g.setColor( DataCenter.getPointsColor() );
						int xMid = xLoc + (this.pointWidth / 2);
						int yMid = yLoc + (this.pointHeight / 2);
						g.drawOval(xMid-(this.pointSize/2), yMid-(this.pointSize/2), this.pointSize, this.pointSize);
					}
				}
			}
		}
	
	}

	private boolean isPointVisible(int xMiddle, int yMiddle) {
		// TODO chequear si el punto esta dentro del viewport visible del jscrollpane
		return true;
	}

	/**
	 * @return the hPoints
	 */
	public int gethPoints() {
		return hPoints;
	}

	/**
	 * @param hPoints the hPoints to set
	 */
	public void sethPoints(int hPoints) {
		this.hPoints = hPoints;
	}

	/**
	 * @return the vPoints
	 */
	public int getvPoints() {
		return vPoints;
	}

	/**
	 * @param vPoints the vPoints to set
	 */
	public void setvPoints(int vPoints) {
		this.vPoints = vPoints;
	}

	/**
	 * @return the pointWidth
	 */
	public int getPointWidth() {
		return pointWidth;
	}

	/**
	 * @param pointWidth the pointWidth to set
	 */
	public void setPointWidth(int pointWidth) {
		this.pointWidth = pointWidth;
	}

	/**
	 * @return the pointHeight
	 */
	public int getPointHeight() {
		return pointHeight;
	}

	/**
	 * @param pointHeight the pointHeight to set
	 */
	public void setPointHeight(int pointHeight) {
		this.pointHeight = pointHeight;
	}

	/**
	 * @return the pointSize
	 */
	public int getPointSize() {
		return pointSize;
	}

	/**
	 * @param pointSize the pointSize to set
	 */
	public void setPointSize(int pointSize) {
		this.pointSize = pointSize;
	}
	
}
