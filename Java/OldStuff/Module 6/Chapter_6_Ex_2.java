// The "Chapter_6_Ex_1" class.
import java.awt.*;
import hsa.Console;

public class Chapter_6_Ex_2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	int intCounter = 2;
	int x;
	c.print("Enter a number:");
	x = c.readInt();
	
	
	c.print("Prime factors: ");
	while (intCounter  <= x)
	{
	    
	
	if ((x%intCounter) == 0)
	    {
		c.print (intCounter);
		x=x/intCounter;
	   c.print(", ");
		
	    }
	    else
	    
	    {
	    intCounter+=1;
	    }

	}//c.println();

	// Place your program here.  'c' is the output console
    } // main method
} // Chapter_6_Ex_1 class
