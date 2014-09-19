package ar.edu.uns.cs.vyglab.arq.rockar.main;
import ar.edu.uns.cs.vyglab.arq.rockar.splash.SplashScreen;
import ar.edu.uns.cs.vyglab.util.Reporter;

public class Main {



	public static void main(String[] args) {
		// Throw a nice little title page up on the screen first
		SplashScreen splash = new SplashScreen(2000);
		// 	Normally, we'd call splash.showSplash() and get on with the program.
		// But, since this is only a test...
		splash.showSplashAndExit();
		Reporter.Report("fin");
	}

}
