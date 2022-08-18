// The "Create_a_Data_File" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class Create_a_Data_File
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	
	 int x, number;
	 
	PrintWriter fileoutput;
	fileoutput = new PrintWriter (new FileWriter ("ints.txt"));
	for (x = 1 ; x <= 4 ; x++)
	{
	    c.print("Please enter an integer ");
	    number = c.readInt();
	    fileoutput.println(number);
	    
	}
	fileoutput.close ();
	
	// Place your program here.  'c' is the output console
    } // main method
} // Create_a_Data_File class
