// The "E1" class.
import java.awt.*;
import hsa.Console;
import java.awt.Font;


public class E1
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

      Font  f = new Font ("Monospaced", Font.BOLD| Font.ITALIC, 14);
      c.setFont (f);
      c.drawString ("Monospaced - BOLD and ITALIC - 14", 10, 90);
	
	/* c.println("Menu");
	
	int x;
	x = 0;
      

      
	c.println ("What is the value of x?\n\n");
	while (x < 10)
	{
	    x = x + 1;
	    c.println (x + "is still less than 10 ");
	}

*/


	// Place your program here.  'c' is the output console
    } // main method
} // E1 class
