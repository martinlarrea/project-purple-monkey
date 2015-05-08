package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JLabel;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class ImageSample extends JLabel {
	protected int hPoints = -1;
	protected int vPoints = -1;
	protected int pointWidth = -1;
	protected int pointHeight = -1;
	protected int pointSize = -1;
	protected int selectedhPoint = -1;
	protected int selectedvPoint = -1;
	
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
					if( DataCenter.showSelectedPoint() ) {
						if ((i==this.selectedhPoint)&&(j==this.selectedvPoint)) {
							g.setColor( DataCenter.getSelectedPointColor());
							int xMid = xLoc + (this.pointWidth / 2);
							int yMid = yLoc + (this.pointHeight / 2);
							g.drawOval(xMid-(this.pointSize/2), yMid-(this.pointSize/2), this.pointSize, this.pointSize);	
						}
					}
					if( DataCenter.showSelectedGrid() ) {
						if ((i==this.selectedhPoint)&&(j==this.selectedvPoint)) {
							g.setColor( DataCenter.getSelectedGridColor() );
							g.drawRect(xLoc, yLoc, this.pointWidth-1, this.pointHeight-1);
						}
					}
					if( DataCenter.showFullColors() ) {
						Point p = new Point(i,j);
						if( DataCenter.points.containsKey(p)) {
							int mineral = DataCenter.points.get(p);
							Color color = DataCenter.colors.get(mineral);
							g.setColor(color);
							g.fillRect(xLoc, yLoc, this.pointWidth, this.pointHeight);
						}
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

	/**
	 * @return the selectedhPoint
	 */
	public int getSelectedhPoint() {
		return selectedhPoint;
	}

	/**
	 * @param selectedhPoint the selectedhPoint to set
	 */
	public void setSelectedhPoint(int selectedhPoint) {
		this.selectedhPoint = selectedhPoint;
	}

	/**
	 * @return the selectedvPoint
	 */
	public int getSelectedvPoint() {
		return selectedvPoint;
	}

	/**
	 * @param selectedvPoint the selectedvPoint to set
	 */
	public void setSelectedvPoint(int selectedvPoint) {
		this.selectedvPoint = selectedvPoint;
	}
	
}
