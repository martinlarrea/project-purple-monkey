package ar.edu.uns.cs.vyglab.arq.rockar.splash;

//SplashScreen.java
//A simple application to show a title screen in the center of the screen
//for the amount of time given in the constructor.  This class includes
//a sample main() method to test the splash screen, but it's meant for use
//with other applications.
//

import java.awt.*;
import javax.swing.*;

import ar.edu.uns.cs.vyglab.util.Reporter;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class SplashScreen extends JWindow {
	private int duration;
	private JLabel jLabelTitle;

	public SplashScreen(int d) {
		duration = d;
	}

	// A simple little method to show a title screen in the center
	// of the screen for the amount of time given in the constructor
	public void showSplash() {
		 JPanel content = (JPanel)getContentPane();
		 content.setBackground(new java.awt.Color(191,191,191));
		
		 // Set the window's bounds, centering the window
		 int width = 450;
		 int height =115;
		 Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		 int x = (screen.width-width)/2;
		 int y = (screen.height-height)/2;
		 setBounds(x,y,width,height);
		
		 // Build the splash screen
		 JLabel label = new JLabel(new ImageIcon("oreilly.gif"));
		 JLabel copyrt = new JLabel
		   ("Rock.AR v2.0 - Created by Martín L. Larrea", JLabel.CENTER);
		 copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
		 content.add(label, BorderLayout.WEST);
		 label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/splash/purple-monkey.png")));
		 content.add(copyrt, BorderLayout.SOUTH);
		 {
			 jLabelTitle = new JLabel();
			 content.add(jLabelTitle, BorderLayout.CENTER);
			 jLabelTitle.setText("Rock.AR");
			 jLabelTitle.setFont(new java.awt.Font("Ubuntu",0,72));
			 jLabelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		 }

		 // Display it
		 setVisible(true);
		
		 // Wait a little while, maybe while loading resources
		 try { Thread.sleep(duration); } catch (Exception e) {}
		
		 setVisible(false);
	}

	public void showSplashAndExit() {
		showSplash();
		
	}

}
