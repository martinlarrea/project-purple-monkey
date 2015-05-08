package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFrameControlPanel;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFramePointSetter;

public class DataCenter {
	
	public static Locale locale; 
	public static ResourceBundle langResource;
	public static String samplePath = null; //sample image file name, the location is the current directory
	public static ImageIcon sampleImage = null; //the imageicon created by the samplePath
	public static int pointsHorizontal = 0; //number of points on the x axis
	public static int pointsVertical = 0; //number of points on the y axis
	public static int pointsSize = 0; //size of each point
	public static HashMap<Point, Integer> points = null; //each assign point is stored here
	public static HashMap<Integer, Vector<Point>> minerals = null; //each mineral has it points assign here
	public static HashMap<Integer, Color> colors = null; // each mineral has its own color
	public static HashMap<Integer, String> names = null; // each mineral has its own name
	public static JFrameControlPanel jframeControl = null;
	public static JFramePointSetter jframeSetter = null;
	public static Color gridColor;
	public static Color pointsColor;
	public static Color selectedGridColor;
	public static Color selectedPointColor;
	
	/**
	 * This method is call every time a new work begin
	 */
	public static void begin() {
		
	}
	
	/**
	 * This method is call every time a work is loaded
	 * @param file Where the work is to be loaded
	 */
	public static void begin(File file) {
		
	}
	
	/**
	 * This method clear all variables and release all memory
	 */
	public static void end() {
		
	}

	public static void exitApp() {
		DataCenter.jframeControl.dispose();
		DataCenter.jframeSetter.dispose();
		System.exit(0);
	}	
	
	public static boolean showGrids() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showGrids();
		} else {
			return false;
		}
	}
	
	public static boolean showPoints() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showPoints();
		} else {
			return false;
		}
	}
	
	public static boolean showSelectedGrid() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showSelectedGrid();
		} else {
			return false;
		}
	}
	
	public static boolean showSelectedPoint() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showSelectedPoint();
		} else {
			return false;
		}
	}
	
	public static Color getFillColor( Point p ) {
		return Color.white;
	}

	public static void updateLanguages() {
		DataCenter.jframeSetter.loadLanguage();
		DataCenter.jframeControl.loadLanguage();
		
	}

	/**
	 * @param gridColor the gridColor to set
	 */
	public static void setGridColor(Color gridColor) {
		DataCenter.gridColor = gridColor;
	}

	/**
	 * @param pointsColor the pointsColor to set
	 */
	public static void setPointsColor(Color pointsColor) {
		DataCenter.pointsColor = pointsColor;
	}

	/**
	 * @param selectedGridColor the selectedGridColor to set
	 */
	public static void setSelectedGridColor(Color selectedGridColor) {
		DataCenter.selectedGridColor = selectedGridColor;
	}

	/**
	 * @param selectedPointColor the selectedPointColor to set
	 */
	public static void setSelectedPointColor(Color selectedPointColor) {
		DataCenter.selectedPointColor = selectedPointColor;
	}

	/**
	 * @return the gridColor
	 */
	public static Color getGridColor() {
		return gridColor;
	}

	/**
	 * @return the pointsColor
	 */
	public static Color getPointsColor() {
		return pointsColor;
	}

	/**
	 * @return the selectedGridColor
	 */
	public static Color getSelectedGridColor() {
		return selectedGridColor;
	}

	/**
	 * @return the selectedPointColor
	 */
	public static Color getSelectedPointColor() {
		return selectedPointColor;
	}
	
}
