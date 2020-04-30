import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FrameViewer {
  public static void main(String[] args)   {
    JFrame frame = new JFrame();  	
    frame.setSize(400, 400);
    JLabel label = new JLabel("Hello!");
    label.setOpaque(true);
    Color lightgreen = new Color(144,238,144);  	
    label.setBackground(lightgreen);  	
    frame.add(label);  	
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  
  } 
}
