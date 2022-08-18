// The "Module5q3" class.
import java.awt.*;
import hsa.Console;

public class Module5q3
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	
	String strName, strStudentnumber, strChaptertitles, strMarks, strAverage;
	double dblStudentnumber, dblAverage;
       
       
	c.println("Enter your name");  
	strName = c.readLine();        
	
	c.println("Enter student number");
	dblStudentnumber = c.readDouble();
	
	c.println("Enter chapter titles");
	strChaptertitles = c.readLine ();
	strChaptertitles = c.readLine ();
	strChaptertitles = c.readLine ();
	strChaptertitles = c.readLine ();
	
	c.println("Enter Marks");
	strMarks = c.readLine ();
	strMarks = c.readLine ();
	strMarks = c.readLine ();
	strMarks = c.readLine ();
	
	
	
	dblAverage = strMarks/4;
	c.print("Your average is");
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Module5q3 class
