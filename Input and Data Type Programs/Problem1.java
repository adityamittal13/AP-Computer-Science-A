import java.awt.Rectangle; import javax.swing.JFrame; import javax.swing.JOptionPane;
public class TranslateDemo {  
public static void main(String[] args)   {  	
// Construct a frame and show it  	
JFrame frame = new JFrame();  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  	frame.setVisible(true);
	System.out.println(“Draw a rectangle in the space provided below:”);
	frame.setVisible(false);
  	
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JOptionPane.showMessageDialog(frame, "Click OK to continue");
 } }
