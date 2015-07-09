package ar.edu.uns.cs.vyglab.arq.rockar.datacenter;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class PointLoader implements Runnable {
	protected File file;
	
	public PointLoader( File _file ) {
		this.file = _file;
	}
	
	@Override
	public void run() {
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
			NodeList nPoints= doc.getElementsByTagName("point");
			for( int i = 0; i < nPoints.getLength(); i++ ) {
				DataCenter.jframeSetter.setInformationMessage(DataCenter.langResource.getString("please_wait") + " " + i + "/" + nPoints.getLength());
				Element point = (Element)nPoints.item(i);
				Integer x = Integer.parseInt( point.getAttribute("x") );
				Integer y = Integer.parseInt( point.getAttribute("y") );
				String m = point.getAttribute("m");
				DataCenter.jframeSetter.assignValue(x, y, m, false);
			}
			//actualizar la visualización/tablas
			DataCenter.jframeControl.updateVisualizations();
			DataCenter.jframeSetter.setInformationMessage(DataCenter.langResource.getString("wait_over"));
			DataCenter.jframeControl.setInformationMessage(DataCenter.langResource.getString("grid_information_label") 
					+ " " + DataCenter.pointsHorizontal + "x" + DataCenter.pointsVertical);
		}
		catch (Exception e) {
			
		}
	}
}
