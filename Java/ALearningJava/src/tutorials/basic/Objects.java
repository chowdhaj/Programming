package tutorials.basic;
// Import JFrame from library
import javax.swing.JFrame;

// Import JLabel from library
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		
		int x = 5; 
		
		// Create Our Window
		JFrame window = new JFrame(); // Window variable that holds JFrame objects, and we're creating a new JFrame to assign to our variable
		// Calling methods on JFrame to configure it
		window.setTitle("My Window"); // Sets the title of our window
		window.setSize(480, 272); // Sets the size of our window
		window.setVisible(true); // Displays our window // If set to false, then it would not come on our screen when we run the program
		
		JLabel label = new JLabel(); // Label variable holds JLabel objects, and we're creating a new JLabel to assign to our variable
		label.setText("New Label"); // We're calling the setText method on our JLabel object to set its text property
		
		window.add(label); // We're calling the add method of our JFrame object to add our label to the window
		
		String s = "Hi"; // A string is also an object. If you type "s." you will see a list of options to choose from, akin to JFrame/JLabel
		//s. // You will see all the things you can do with your String object
		
		/*/
		 * In OOP, you create some object, and then call methods and create properties on that object to make it behave in a particular way
		 * And you can use all kinds of different objects and put them together in different ways to create an ultimate application
		 * This is why you create new classes - to create new objects/methods that are not available in the Java Library
		 * For instance, Java cannot tell you if a number is odd or even, but you can create a method to do that using the modulo operator
		 * Objects have types, such as JFrame and JLabel, and they can be stored in variables like our 'window' and 'label'. To use them, you have to...
		 * ... instantiate objects using the 'new' keyword followed by the type of object and parenthesis. And once created you can call methods... 
		 * ... on that objects to set its properties and control how it works. 
		/*/
	}
}
