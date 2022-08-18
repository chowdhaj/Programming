// The "Ee" class.
import java.awt.*;
import hsa.Console;

public class Random_Letter_Method
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	
	char password;
	
	password=rndChar();
	
	c.print(password );
	
	// Place your program here.  'c' is the output console
    } // main method
    
    private static char rndChar( )
	{
	    int rnd = (int) (Math.random () * 52);
	    
	    
	    char base = (rnd < 26) ? 'A':'a';
	     c.print(rnd );
	    return (char) (base + rnd % 26);
	   
	}
    
    
} // Ee class
