// The "Methods_Mod9" class.
import java.awt.*;
import hsa.Console;

public class Average_Mod9
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int value, average, mark1, mark2, mark3, mark4;
	c.print ("Please enter mark1");
	mark1 = c.readInt ();
	c.print ("Please enter mark1");
	mark2 = c.readInt ();
	c.print ("Please enter mark1");
	mark3 = c.readInt ();
	c.print ("Please enter mark1");
	mark4 = c.readInt ();
       value = mark1 + mark2 + mark3 + mark4;
	average = findAverage (value);
	c.println ("The average of your marks is " + average);


    }


    public static int findAverage (int gradeaverage)
    {
	return gradeaverage / 4;

    }




    // Place your program here.  'c' is the output console
    // main method
} // Methods_Mod9 class
