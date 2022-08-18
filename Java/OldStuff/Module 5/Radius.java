
//Mr. SImler
//Sept 13 2011

import java.io.*;
import java.text.*;

public class Radius
{

    public static void main (String[] args) throws IOException
    {
	DataInputStream keyboard = new DataInputStream (System.in);
       
	
	 DecimalFormat df = new DecimalFormat ("#.##");

	String radius;
	double d;

	System.out.print ("Enter the Radius: ");
	radius = keyboard.readLine ();

	// Radius = Double.parseDouble(keyboard.readLine()); //Radius declared as double
	d = Double.valueOf (radius).doubleValue ();

	
	System.out.println ("The Area is " +(df.format (Math.PI * (Math.pow (d, 2)))));

    }
}
