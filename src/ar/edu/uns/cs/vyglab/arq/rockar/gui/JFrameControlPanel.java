package ar.edu.uns.cs.vyglab.arq.rockar.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.vyglab.arq.rockar.datacenter.DataCenter;


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
public class JFrameControlPanel extends javax.swing.JFrame {
	private JPanel jPanelSouth;
	private JLabel jLabelInformation;
	private JPanel jPanelTop;
	private JPanel jPanelBottom;
	private JPanel jPanelEast;
	private JPanel jPanelWest;
	private JPanel jPanelCenter;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrameControlPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/vyglab/arq/rockar/resources/images/splash/purple-monkey32.png")).getImage());
			this.setTitle("Rock.AR v2.0");
			this.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent evt) {
					thisWindowClosed(evt);
				}
			});
			{
				jPanelSouth = new JPanel();
				BorderLayout jPanelSouthLayout = new BorderLayout();
				getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
				jPanelSouth.setLayout(jPanelSouthLayout);
				{
					jLabelInformation = new JLabel();
					jPanelSouth.add(jLabelInformation, BorderLayout.CENTER);
					jLabelInformation.setText("XXX Information");
					jLabelInformation.setOpaque(true);
					jLabelInformation.setBackground(new java.awt.Color(241,191,101));
				}
			}
			{
				jPanelCenter = new JPanel();
				BoxLayout jPanelCenterLayout = new BoxLayout(jPanelCenter, javax.swing.BoxLayout.X_AXIS);
				getContentPane().add(jPanelCenter, BorderLayout.CENTER);
				jPanelCenter.setLayout(jPanelCenterLayout);
				{
					jPanelWest = new JPanel();
					BorderLayout jPanelWestLayout = new BorderLayout();
					jPanelCenter.add(jPanelWest);
					jPanelWest.setLayout(jPanelWestLayout);
					jPanelWest.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				}
				{
					jPanelEast = new JPanel();
					jPanelCenter.add(jPanelEast);
					BoxLayout jPanelEastLayout = new BoxLayout(jPanelEast, javax.swing.BoxLayout.Y_AXIS);
					jPanelEast.setLayout(jPanelEastLayout);
					{
						jPanelTop = new JPanel();
						BorderLayout jPanelTopLayout = new BorderLayout();
						jPanelEast.add(jPanelTop);
						jPanelTop.setLayout(jPanelTopLayout);
						jPanelTop.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
					{
						jPanelBottom = new JPanel();
						BorderLayout jPanelBottomLayout = new BorderLayout();
						jPanelEast.add(jPanelBottom);
						jPanelBottom.setLayout(jPanelBottomLayout);
						jPanelBottom.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					}
				}
			}
			pack();
			this.setSize(800, 600);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void thisWindowClosed(WindowEvent evt) {
		DataCenter.exitApp();
	}

}
