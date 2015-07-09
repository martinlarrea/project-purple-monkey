package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFrameControlPanel;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFramePointSetter;
import ar.edu.uns.cs.vyglab.util.Reporter;

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
	public static File fileMineralList = null;
	
	/**
	 * This method is call every time a new work begin
	 */
	public static void begin() {
		DataCenter.points = new HashMap<Point, Integer>();
		DataCenter.minerals = new HashMap<Integer, Vector<Point>>();
		DataCenter.names = new HashMap<Integer, String>();
		DataCenter.colors = new HashMap<Integer, Color>();
		DataCenter.setGridColor(Color.white);
		DataCenter.setPointsColor(Color.white);
		DataCenter.setSelectedGridColor(Color.red);
		DataCenter.setSelectedPointColor(Color.red);
		DataCenter.jframeControl.clearJTable();
	}
	
	/**
	 * This method is call every time a work is loaded
	 * @param file Where the work is to be loaded
	 */
	public static void begin(File file) {
		DataCenter.jframeSetter.setInformationMessage("Loading points");
		PointLoader pl = new PointLoader(file);
		Thread t = new Thread(pl);
		t.start();		
		/*
		try {
			DataCenter.begin();
			Reporter.Report(file.getName());
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);		 
			doc.getDocumentElement().normalize();
			
			//primero cargar la tabla de minerales
			Element list = (Element)doc.getElementsByTagName("list").item(0);
			String listPath = list.getAttribute("file");
			DataCenter.jframeControl.openTable(listPath);
			
			//cargar la imagen
			Element image = (Element)doc.getElementsByTagName("image").item(0);
			String imagePath = image.getAttribute("file");
			DataCenter.jframeSetter.newWork(imagePath, true);
			
			//configurar la grilla
			Element grid = (Element)doc.getElementsByTagName("grid").item(0);
			int cols = Integer.parseInt( grid.getAttribute("cols") );
			int rows = Integer.parseInt( grid.getAttribute("rows") );
			DataCenter.pointsHorizontal = cols;
			DataCenter.pointsVertical = rows;
			DataCenter.pointsSize = 2;
			DataCenter.jframeSetter.getjLabelImage().sethPoints(cols);
			DataCenter.jframeSetter.getjLabelImage().setvPoints(rows);	
			DataCenter.jframeSetter.getjLabelImage().setPointSize(2);
			DataCenter.jframeSetter.getjLabelImage().getParent().repaint();
			
			//cargar los puntos
			DataCenter.jframeSetter.setInformationMessage("Loading points");
			NodeList nPoints= doc.getElementsByTagName("point");
			for( int i = 0; i < nPoints.getLength(); i++ ) {
				Element point = (Element)nPoints.item(i);
				Integer x = Integer.parseInt( point.getAttribute("x") );
				Integer y = Integer.parseInt( point.getAttribute("y") );
				String m = point.getAttribute("m");
				DataCenter.jframeSetter.assignValue(x, y, m);
			}
			//actualizar la visualización/tablas
		}
		catch (Exception e) {
			
		}
		*/
	}
	
	/**
	 * This method clear all variables and release all memory
	 */
	public static void end() {
		samplePath = null; //sample image file name, the location is the current directory
		sampleImage = null; //the imageicon created by the samplePath
		pointsHorizontal = 0; //number of points on the x axis
		pointsVertical = 0; //number of points on the y axis
		pointsSize = 0; //size of each point
		points = null; //each assign point is stored here
		minerals = null; //each mineral has it points assign here
		colors = null; // each mineral has its own color
		names = null; // each mineral has its own name
		fileMineralList = null;
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

	public static boolean showNoColors() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showNoColorsPoints();
		} else {
			return false;
		}
	}

	public static boolean showFullColors() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showFullColorsPoints();
		} else {
			return false;
		}
	}

	public static boolean showSemiColors() {
		if( DataCenter.jframeSetter != null ) {
			return DataCenter.jframeSetter.showSemiColorsPoints();
		} else {
			return false;
		}
	}
	
}
