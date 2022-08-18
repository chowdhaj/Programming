// The "Count_Spaces" class.
import java.awt.*;
import hsa.Console;

public class Count_Spaces
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int iCount = 0;
	String str;
	c.print ("Enter your sentence: ");
	str = c.readLine ();

	for (int i = 0 ; i < str.length () ; i++)
	{
	    if (str.charAt (i) == ' ')
		iCount++;
	}
	c.print ("There were " + iCount + " spaces in your sentence");
	// Place your program here.  'c' is the output console
    } // main method
} // Count_Spaces class
