// The "Methods_Mod9" class.
import java.awt.*;
import hsa.Console;

public class Methods_Mod9
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int value, square;
	c.print("Please enter a value");
	value=c.readInt();
	square=findsquare(value);
	c.println("The square of " + value + " is " + square);
	
	
	}// main method
	
	public static int findsquare (int valtosqu)
	{
	return valtosqu * valtosqu;
	
	}
	
	
	
	
	// Place your program here.  'c' is the output console
    
} // Methods_Mod9 class
