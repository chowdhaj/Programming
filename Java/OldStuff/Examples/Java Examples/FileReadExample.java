// The "FileReadExample" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class FileReadExample
{
    static Console c;           // The output console

    public static void main (String[] args)throws IOException
    {
	c = new Console ();

	int x;
	String line;

	BufferedReader fileinput;
	fileinput = new BufferedReader (new FileReader ("names.txt"));
	for (x = 1 ; x <= 6 ; x++)
	{
	    line = fileinput.readLine ();
	    c.println (line);
	}
	fileinput.close ();
    }
}




// Place your program here.  'c' is the output console
// main method
// FileReadExample class
