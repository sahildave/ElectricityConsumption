import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class Applet extends JApplet {

	frame frameApplet = new frame();

	public void init() {
		frameApplet.setVisible(true);
		frameApplet.setSize(1000, 720);
		add(frameApplet);
	}

}
