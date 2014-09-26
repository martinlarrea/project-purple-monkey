package ar.edu.uns.cs.vyglab.arq.rockar.main;
import java.util.Locale;
import java.util.ResourceBundle;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;
import ar.edu.uns.cs.vyglab.arq.rockar.gui.JFramePointSetter;
import ar.edu.uns.cs.vyglab.arq.rockar.splash.SplashScreen;
import ar.edu.uns.cs.vyglab.util.Reporter;

public class Main {



	public static void main(String[] args) {

		// Splash Screen
		SplashScreen splash = new SplashScreen(2000);
		splash.showSplashAndExit();
		
		// Language configuration
		DataCenter.locale = Locale.getDefault();
		DataCenter.langResource = ResourceBundle.getBundle("ar.edu.uns.cs.vyglab.arq.rockar.resources.lang.LANG", DataCenter.locale);
		
		JFramePointSetter jp = new JFramePointSetter();
		jp.setVisible(true);
		
	}

}
