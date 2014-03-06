

import java.awt.Graphics;

import javax.print.DocFlavor.URL;
import javax.swing.*;

public class RunApp extends JApplet

{
	frame fram;
	public void init()
	{
		fram = new frame();
		fram.setSize(1000,720);
		fram.setVisible(true);
	}
	// Display code and document bases.
	public void paint(Graphics g) 
	{
		String msg;
		java.net.URL url = getCodeBase(); // get code base
		msg = "Code base: " + url.toString();
		g.drawString(msg, 10, 20);
		
		url = getDocumentBase(); // get document base
		msg = "Document base: " + url.toString();
		g.drawString(msg, 10, 40);
	}
}
