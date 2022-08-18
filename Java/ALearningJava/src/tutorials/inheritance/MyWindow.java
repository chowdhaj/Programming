package tutorials.inheritance;

// Imports the JFrame class
import javax.swing.JFrame;

// 'MyWindow' extends JFrame, which means that 'MyWindow' IS A JFrame, so it inherits all attributes of the JFrame class
public class MyWindow extends JFrame {
	public static void main(String[] args) {
		
		new MyWindow(); // Executes the class 'MyWindow'
}
	public MyWindow() {
		setSize(500,500); // Sets size of window to 500 x 500
		setVisible(true); // Makes the window visible
		setTitle("My Window"); // Gives the window a title of "My Window"
	}	
}