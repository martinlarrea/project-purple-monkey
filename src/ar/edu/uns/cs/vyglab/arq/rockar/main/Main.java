package ar.edu.uns.cs.vyglab.arq.rockar.main;
import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFrameControlPanel;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFramePointSetter;
import ar.edu.uns.cs.vyglab.arq.rockar.splash.SplashScreen;
import ar.edu.uns.cs.vyglab.util.Reporter;

public class Main {



	public static void main(String[] args) {

		Reporter.Report("Use 'debug' to enable trace information");
		Reporter.flag = ((args.length > 0)&&(args[0].equalsIgnoreCase("debug")));
		
		// Splash Screen 
		SplashScreen splash = new SplashScreen(2000);
		splash.showSplashAndExit();
		
		// Language configuration
		DataCenter.locale = Locale.getDefault();
		DataCenter.langResource = ResourceBundle.getBundle("ar.edu.uns.cs.vyglab.arq.rockar.resources.lang.LANG", DataCenter.locale);
				
		JFrameControlPanel cp = new JFrameControlPanel();
		cp.setVisible(true);
		
		JFramePointSetter jp = new JFramePointSetter();
		jp.setVisible(true);
		
		DataCenter.jframeControl = cp;
		DataCenter.jframeSetter = jp;
		DataCenter.begin();
		
	}

}
