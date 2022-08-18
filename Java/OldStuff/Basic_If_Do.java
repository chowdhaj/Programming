// The "Test_1_Piyush" class.
import java.text.*;
import java.io.*;
public class Basic_If_Do
{

    public static void main (String[] args) throws IOException



    {


	int intPeriod;

	do
	{
	    System.out.println ("What day is it?");
	    DataInputStream keyboard = new DataInputStream (System.in);
	    intPeriod = Integer.parseInt (keyboard.readLine ());
	    if (intPeriod == 1)

		{
		    System.out.println ("Day 1 School Schedule");

		}
	    else if (intPeriod == 2)
	    {
		System.out.println ("Day 2 School Schedule");

	    }
	    // else
	    // {
	    //  System.out.println ("Invalid Entry");

	    //}

	}
	while (intPeriod != 3);
	    
    }
}
