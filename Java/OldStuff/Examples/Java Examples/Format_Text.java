// The "Format_Text" class.
import java.awt.*;
import hsa.Console;
import java.awt.Font;


public class Format_Text
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();



	     
	{
	    

	

	Font f = new Font ("Monospaced", Font.BOLD | Font.ITALIC, 14);
	c.setFont (f);
	c.drawString ("Monospaced - BOLD and ITALIC - 14", 10, 90);
}

	// Place your program here.  'c' is the output console
    } // main method
} // E1 class
