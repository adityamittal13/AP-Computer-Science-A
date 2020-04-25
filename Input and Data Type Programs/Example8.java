import java.applet.Applet; // API package for Applets
import java.awt.*;
import java.awt.Color;
public class E2_8 extends Applet{
	public void paint (Graphics frame) {
    	Color aditya = new Color(50, 100, 150);
  	  aditya = aditya.brighter();    	
    	
    	frame.setColor(aditya);
    	frame.drawOval(50, 50, 20, 40);
	}
}
