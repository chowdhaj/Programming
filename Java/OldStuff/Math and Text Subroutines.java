// The "Ex" class.
import java.awt.*;
import hsa.Console;

public class Ex
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	String s, words;
	words="hello";
	char l8;
       int l;
	s ="computer";
	 l=words.length();
	c.println( s.charAt(2) ); 
       l8 = words.charAt(l-2);
       c.println(l8);
	// Place your program here.  'c' is the output console
    } // main method
} // Ex class
