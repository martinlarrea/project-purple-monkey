package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.awt.Point;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFrameControlPanel;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFramePointSetter;

public class DataCenter {
	public static String samplePath = null; //sample image file name, the location is the current directory
	public static ImageIcon sampleImage = null; //the imageicon created by the samplePath
	public static int pointsHorizontal = 0; //number of points on the x axis
	public static int pointsVertical = 0; //number of points on the y axis
	public static int pointsSize = 0; //size of each point
	public static HashMap<Point, Integer> points = null; //each assign point is stored here
	public static HashMap<Integer, Vector<Point>> minerals = null; //each mineral has it points assign here
	public static JFrameControlPanel jframeControl = null;
	public static JFramePointSetter jframeSetter = null;
	
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
	
}
