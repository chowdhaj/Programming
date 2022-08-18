//Example program with a menu
import java.awt.*;
import hsa.Console;
import java.util.Random;
public class Mod11Example
{


    static Console c = new Console ();
    public static void main (String[] args)
    {

	int choice, intRndNumber, intGuess;
int intCount =1;
	do
	{

	    c.println ("\t\t Main Menu");
	    c.println ("\t\t *********");
	    c.println ("\t\t 1.Option 1");
	    c.println ("\t\t 2.Option 2");
	    c.println ("\t\t 3.Option 3");
	    c.println ("\t\t 4. End");
	    do
	    {

		c.print ("What is your choice (1-4): ");
		choice = c.readInt ();
		if ((choice < 1) || (choice > 4))
		{
		    c.println ("Invalid ... enter 1-4 only");
		}

	    }
	    while ((choice < 1) || (choice > 4));
	    switch (choice)
	    {

		case 1:
		    c.println ("option1");
		    Random randomGenerator = new Random ();
		    intRndNumber = randomGenerator.nextInt (4) + 1;
		    c.println ("Guess a number from 1 to 20.");
		    do
		    {
			intGuess = (c.readInt ());

			if (intGuess == intRndNumber)
			{
			    c.println ("You guessed it in " + intCount + " tries.");
			    c.println (intRndNumber);
			}
			else
			{
			    c.println ("Try Again!");
			    intCount +=1;

			}
		    }
		    while (!(intGuess == intRndNumber));
		    break;
		case 2:
		    c.println ("option2");
		    break;
		case 3:
		    c.println ("option3");
		    break;

	    }

	}


	while (choice != 4)
	    ;
	c.println ("\n\nBye");

    }
}
