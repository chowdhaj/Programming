import java.io.*;

public class MarksReader
{
    // Create BufferedReader

    public static InputStreamReader input = new
	InputStreamReader (System.in);
    public static BufferedReader keyboardInput = new
	BufferedReader (input);
    private static void main (String[] args) throws IOException
    {
	try
	{
	    // Input and main variable declaration
	    System.out.println ("Enter the record file you wish to read:");
	    String fileName = keyboardInput.readLine ();
	    FileReader file = new FileReader (new File (fileName));
	    BufferedReader myFile = new BufferedReader (file);
	    String line;
	    PrintWriter pass = new PrintWriter (new FileWriter ("Pass.txt"));
	    PrintWriter fail = new PrintWriter (new FileWriter ("Fail.txt"));
	    while ((line = myFile.readLine ()) != null)
	    {
		// Course line check
		if (line.length () == 5)
		{
		    // Mark variable declaration
		    String marks = myFile.readLine ();
		    int mark = Integer.valueOf (marks).intValue ();
		    // Pass check and output
		    if (mark > 49)
		    {
			pass.println (line);
			pass.println (mark);
		    }
		    else if (mark < 50)
		    {
			fail.println (line);
			fail.println (mark);
		    }
		}
	    }
	    // Closing all streams
	    myFile.close ();
	    pass.close ();
	    fail.close ();
	}
	catch (IOException iO)
	{
	    iO.printStackTrace ();
	}
    }
}
