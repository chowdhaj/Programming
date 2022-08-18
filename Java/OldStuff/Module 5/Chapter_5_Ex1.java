// The "Chapter_1_Ex1" class.
import java.awt.*;
import hsa.Console;
import java.text.*;
public class Chapter_5_Ex1
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	double dblCopies, dblCost, dblTotal;
DecimalFormat x = new DecimalFormat("###.##");

	c.println ("Enter the number of copies to be printed: ");
	dblCopies = c.readDouble ();

	if (dblCopies > 1000)
	{
	    dblCost = 0.25;
	    dblTotal = dblCost * dblCopies;
	    c.println ("Price per copy is: " + dblCost);
	    c.println ("Total cost is: $" +  x.format(dblTotal));
	}
	else if (dblCopies < 1000 && dblCopies >= 750)
	{
	    dblCost = 0.26;
	    dblTotal = dblCost * dblCopies;
	    c.println ("Price per copy is: " + dblCost);
	    c.println ("Total cost is: $" +  x.format(dblTotal));
	}
	else if (dblCopies <= 749 && dblCopies >= 500)
	{
	    dblCost = 0.27;
	    dblTotal = dblCost * dblCopies;
	    c.println ("Price per copy is: " + dblCost);
	    c.println ("Total cost is: $" + x.format(dblTotal));
	}

	else if (dblCopies <= 499 && dblCopies >= 100)
	{
	    dblCost = 0.28;
	    dblTotal = dblCost * dblCopies;
	    c.println ("Price per copy is: " + dblCost);
	    c.println ("Total cost is: $" +  x.format(dblTotal));
	}
 else 
	{
	    dblCost = 0.30;
	    dblTotal = dblCost * dblCopies;
	    c.println ("Price per copy is: " + dblCost);
	    c.println ("Total cost is: $" +  x.format(dblTotal));
	}

	// Place your program here.  'c' is the output console
    } // main method
} // Chapter_1_Ex1 class
