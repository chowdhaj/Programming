// The "Criminal" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
public class Criminal
{
    static Console c;       // The output console
    static int x, criminals;
    static String name[] = new String [1001];
    static String crime[] = new String [1001];
    static int year[] = new int [1001];

    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	int choice, choice1;


	

	    c.println ("how many criminals ");
	    criminals = c.readInt ();
	    PrintWriter fileoutput;
	    fileoutput = new PrintWriter (new FileWriter ("criminals.txt"));
	    for (x = 0 ; x < criminals ; x++)
	    {
		c.print ("name ");
		name [x] = c.readLine ();
		fileoutput.println (name [x]);
	       c.print ("crime ");
	       crime [x] = c.readLine ();
	       fileoutput.println (crime [x]);
	       c.print ("year ");
		year [x] = c.readInt ();
		fileoutput.println (year [x]);

	    }
	    fileoutput.close ();
	}
    }



// Place your program here.  'c' is the output console




// Criminal class
