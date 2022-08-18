// The "mod5_3" class.
import java.awt.*;
import java.io.*;
import hsa.Console;

public class mod5_3
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	String strName, strTitle1, strTitle2, strTitle3, strTitle4;
	double dblSNumber, dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	DataInputStream keyboard = new DataInputStream(System.in);
	
	c.println("Enter your name: ");
	strName= c.readLine ();
	
	c.println("Enter your student number: ");
	dblSNumber= c.readDouble ();
	
	c.println("Enter chapter titles for the four tests. ");
	strTitle1= c.readLine ();
	strTitle2= c.readLine ();
	strTitle3= c.readLine ();
	strTitle4= c.readLine ();
	
	c.println("Enter your marks for each chapter. ");
	dblMark1= c.readDouble ();
	dblMark2= c.readDouble ();
	dblMark3= c.readDouble ();
	dblMark4= c.readDouble ();
	
	dblAverage= (dblMark1 + dblMark2 + dblMark3 + dblMark4)/4;
	
	//dblAverage= c.readDouble ();
	c.print(" Your average is ");
	c.println(dblAverage,5,1);
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // mod5_3 class
