// The "Mod12_Example" class.
import java.awt.*;
import hsa.Console;

public class Mod12_Example
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int i, j, x, smallest;
	String item[] = new String [5];
	String temp;

	    c.println ("Joe's Grocery Store Items");
	    //Get 5 item names from user
	for (i = 0 ; i < 5 ; i=i+1)
	{
	    c.print ("Enter an item name ");
	    item [i] = c.readLine ();
	}
       //Sort in  Alpha order
 for (i = 0 ; i < 5 ; i++)
	{
	    smallest = i;
	    for (j = i + 1 ; j < 5 ; j++)
	    {
		if (item [j].compareTo (item [smallest]) < 0)
		    smallest = j;
	    }
	    temp = item [i];
	    item [i] = item [smallest];
	    item [smallest] = temp;
	}
	//Display info stored in the array
	for (i = 0 ; i < 5 ; i++)
	{
	    c.println (item [i]);
	}

	// Place your program here.  'c' is the output console
    } // main method
} // Mod12_Example class
