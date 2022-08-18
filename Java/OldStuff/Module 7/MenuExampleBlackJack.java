//Example program with a menu
import java.awt.*;
import hsa.Console;
public class MenuExampleBlackJack
{


    static Console c = new Console ();
    public static void main (String[] args)
    {

	char choice = 'y';
	int intPlayerCardTotal = 0;
	char charPlayerStay = 'y';


	c.print ("Do you want to play BlackJack? (y or n)");
	choice = c.readChar ();
	if (choice == 'y')
	{
	    do

		{
		    do
		    {

			intPlayerCardTotal = 21;
			// c.print ("BlackJack");

			if (intPlayerCardTotal > 21)
			{
			    c.print ("Player busted");
			    //choice = 'n';
			    break;

			}
		    }
		    while ((intPlayerCardTotal < 22));
		    c.print ("do you want to play again?");
		    choice = c.readChar ();
		}
	    while (choice == 'y');
	    }
	    else if (choice == 'n')
	    {

		c.println ("\n\nBye");
		try
		{
		    Thread.sleep (1000);
		}
		catch (InterruptedException ex)
		{
		}

		c.close ();
	    }
	}
    }


