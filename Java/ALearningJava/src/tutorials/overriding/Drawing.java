package tutorials.overriding;

import java.awt.Color; // Imports color
import java.awt.Graphics; // Imports graphics
import javax.swing.JFrame; // Imports JFrame

// Drawing extends JFrame (Drawing = JFrame)
public class Drawing extends JFrame  {
	// This is our main method
	public static void main(String[] args) {
		new Drawing(); // Creates a new instance of 'Drawing'
	}
	
	// This is the constructor
	public Drawing(){
		setSize(500,500); // Sets size of window to 500 x 500
		setVisible(true); // Sets visibility to true
	}	
	
	@Override
	// This expects a parameter of type graphics, and graphics is an object
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		
		g.drawRect(50, 50, 100, 25); // Draws the outline of a rectangle	
		g.setColor(new Color(0, 0, 255)); // Sets color to pure blue
		g.drawOval(200, 50, 50, 80); // Draws the outline of an oval
		g.setColor(Color.GREEN); // Sets color to green
		g.fillRect(50, 200, 100, 200); // Draws and fills a rectangle
		g.setColor(Color.BLACK); // Sets color to black
		g.drawString("Nice String", 200, 200); // Draws a string
		
		int x = 250;
		while (x < 400) {
			g.fillOval(x, 250, 25, 125); // This conditional draws 4 ovals spaced 30 pixels apart
			x += 30;
		}
		
		g.drawRect(300, 50, 100, 100); // Draws the outline of a rectangle
		g.clearRect(0, 0, 250, 250); // Clears an area the shape of a rectangle
		
	}
}
