// The "FileReadEx" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class FileReadEx
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    // make sure you have IOExceptions that modify and check your input and the output
    {
	c = new Console ();
	int x;
	String line;
	//
	BufferedReader fileinput;
	fileinput = new BufferedReader (new FileReader("names.txt"));
	// object named fileinput is allowing to read names.txt
	for (x=0;x<2;x++)
	{
	line = fileinput.readLine();
	// a line of data is read from names.txt and information is stored
	c.println(line);
	}
	fileinput.close();
	// Place your program here.  'c' is the output console
    } // main method
} // FileReadEx class
