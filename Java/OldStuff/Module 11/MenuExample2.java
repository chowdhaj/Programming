// The "MenuExample" class.
import java.awt.*;
import hsa.Console;
import java.util.Random;

public class MenuExample2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int Choice;

	do
	{
	    c.println ("\t\t Main Menu");
	    c.println ("\t\t *********");
	    c.println ("\t\t 1. Option 1");
	    c.println ("\t\t 2. Option 2");
	    c.println ("\t\t 3. Option 3");
	    c.println ("\t\t 4. Exit program");
	    do
	    {
		c.setTextColor (Color.blue);
		c.println ("\t\t What is you choice? \n\n");
		Choice = c.readInt ();
		if ((Choice < 1) || (Choice > 4))

		    c.println ("\t\t\n\n Invalid ... enter 1 to 4");
	    }
	    while ((Choice < 1) || (Choice > 4));
	    if (Choice == 1)

		opt1 ();

	    else if (Choice == 2)
		opt2 ();
	    else if (Choice == 3)
		opt3 ();

	}
	while (Choice != 4);

	c.println ("\t\t\n\n Thank you for using our program. Goodbye!!");
	try
	{
	    Thread.sleep (4000);

	}
	catch (InterruptedException ie)
	{
	}
	c.close ();

    }


    public static void opt1 ()
   {
	int intRndNumber, intGuess;
	int intCount=0;
	c.println ("You have chosen option 1");
	Random randomGenerator = new Random ();
	intRndNumber = randomGenerator.nextInt (10) + 1;
	c.println ("Guess my number from 1 to 20, input a number");
	do
	 {
	intGuess = c.readInt ();
	
	intCount +=1;
	if (intGuess == intRndNumber)
	{
	    c.println ("You guessed it in " + intCount + " attempts.");
	    
	}
	else
	{
	    c.println ("Try Again");
	}
	}
	 while (!(intGuess == intRndNumber));

}
	public static void opt2 ()
	{
	    c.println ("You have chosen option 2");
	}


	public static void opt3 ()
	{
	    c.println ("You have chosen option 3");
	}




	// Place your program here.  'c' is the output console
    } // main method


    // MenuExample class



