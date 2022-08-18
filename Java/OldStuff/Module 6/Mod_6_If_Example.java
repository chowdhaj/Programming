// The "Loop" class.
import java.awt.*;
import hsa.Console;
import java.math.*;

public class Mod_6_If_Example
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	double pick, average;
	c.println("What is your marks? ");
	average = Double.parseDouble(c.readLine());

	if (average < 50)
	{
	    c.println ("You have been unsuccessful in obtaining the credit");
	}
	else if ((average >= 50) && (average <= 79))
	{
	    c.println ("You have passed the course and obtained the credit");

	}
	else
	{


	    if ((average >= 80) && (average <= 90))
	    {

		c.println ("You had honours standing.");
		c.println ("Credit earned");
	    }
	    else
	    {
		pick = Math.ceil (Math.random () * 3);

		// requires #import java.math;
		// Math.ceil converts a real number to an integer,
		// ensuring that the value is the closest
		// integer ABOVE the real number
		// ie 5.5-->6, 1.1-->2
		// Math.random picks a number between 0.0 and 1.0
		// *3 ensures that the values, after undergoing the Math.ceil
		// command, are randomly between 1 and 3

		if (pick == 1)
		{

		    c.println ("Credit earned with advanced honours ... Congrats!");
		}
		else if (pick == 2)
		{


		    c.println ("Advanced honours ... Congratulations!");
		}
		else
		{


		    c.println ("Congratulations ... Advanced honours received!");
		}




	    }
	}







	// Place your program here.  'c' is the output console
    } // main method
} // Loop class
