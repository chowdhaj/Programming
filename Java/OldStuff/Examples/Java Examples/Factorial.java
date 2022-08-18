// Factorial program
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Factorial extends Applet implements ActionListener
{


    // instance variables
    Label lblfact; // prompt text used for user input
    TextField txtfact; // input values here
    int number; // store input value
    int fact; //store factorial of integers
    // initialize variable and set up the design
    public void init ()
    {


	//Initializing instance variables
	lblfact = new Label ("Enter an integer and press Enter: ");
	txtfact = new TextField (10);
	// determine the character width of text field
	add (lblfact); // put the label on the applet
	add (txtfact); // put the textfield on the applet
	fact = 1; // set factorial to 1
	txtfact.addActionListener (this);
	// registers an action event (input) for the text field

    }


    // processes a user's action on the text field
    public void actionPerformed (ActionEvent e)
    {


	number = Integer.parseInt (e.getActionCommand ());
	// gets a number
	for (int i = 1 ; i <= number ; i++)
	{

	    fact = fact * i;
	}
	txtfact.setText (""); // clears the data entry field
	showStatus (Integer.toString (fact));
	// shows the result in the status bar area of the screen
	fact = 1;
	// resetting factorial for next occurrence of the applet

    }
}
