// The "Recursion_Example_Factorial" class.
import java.awt.*;
import hsa.Console;

//Alex Dang and Muhannad Ghannam
//Mississauga Secondary School
//Recursion String Example
//Tuesday, December 11, 2007

//This program is referenced as an example for recursion in Java
//This program will ask the user for a word, and by calling a recursive method
//the program will output the user's original word backwards

public class Recursion_Example_String
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	String userInput;
	String restartInput;
	int restart = 0;
	boolean restartCorrect = true;
	boolean exit = false;
	//variables declared

	do
	{
	    c.clear ();


	    c.println ("*************************************");
	    c.print ("Enter a word: ");
	    userInput = c.readLine ();
	    //asks user for input
	    userInput = backwards (userInput);
	    //calls on the backwards method
	    c.println ("");
	    c.println ("Your Word Backwards: ");
	    c.println (userInput);
	    //prints out the user's word backwards

	    do
	    {
		restartCorrect = true;
		//if errors are found in this section, restartCorrect will be set to false
		//if there are no errors, restartCorrect will remain true which will exit out of the loop
		c.println ("");
		c.println ("Do you wish to continue? If yes, please input 1. If no, please input 2.");
		restartInput = c.readLine ();
		//asks user if he/she wishes to restart
		try
		{
		    restart = Integer.parseInt (restartInput);
		    //the user's input is being converted to an integer
		    //this is done while the string is being parsed to catch
		    //instances where the user's input contains string values
		}
		catch (Exception e)
		{
		    //when string values are found
		    //the error is handled and will print out statements then stops the program
		    c.println ("");
		    c.println ("Input 1 or 2 u Foo!, Good Try Nub(aka Roger)...GOOD GAME");
		    sleeper1500 ();
		    restartCorrect = false;
		}

		if ((restart > 2) || (restart < 1))
		{

		    c.println ("Unexpected Input...U PULLED OFF A ROGER U NUB!!!. Restarting...");
		    sleeper1500 ();
		    restartCorrect = false;
		    //catches if the user inputs an integer greater than 2 or less than 1
		}

		if (restart == 2)
		{
		    exit = true;
		    //if user inputs 2 indicating he/she wishes to exit then exit will be true
		}

	    }
	    while (restartCorrect == false);


	}
	while (exit == false);
	//when user wishes to exit, it will exit out of the loop


	c.clear ();
	c.println ("Shutting Down.");
	sleeper750 ();
	c.clear ();
	c.println ("Shutting Down..");
	sleeper750 ();
	c.clear ();
	c.println ("Shutting Down...");
	sleeper750 ();
	c.clear ();
	c.println ("Shutting Down.");
	c.clear ();
	c.close ();
	//shuts down program


	// Place your program here.  'c' is the output console
    } // main method


    public static void sleeper750 ()
    {
	try
	{
	    Thread.sleep (750);
	    //sleeper method
	}
	catch (InterruptedException e)
	{
	}
    }


    public static void sleeper1500 ()
    {
	try
	{
	    Thread.sleep (1500);
	    //longer sleeper method
	}
	catch (InterruptedException e)
	{
	}
    }


    public static String backwards (String userInput)
	//creates an object string called backwards that will call on the userInput
    {
	if (userInput.length () == 1)
	    return userInput;

	//when the user inputs a letter, the output will be that letter
	else
	    userInput = backwards (userInput.substring (1, userInput.length ())) + userInput.substring (0, 1);
	//userInput will equal to backwars
	//(userInput.substring (1, userInput.length ())) represents (1,6) position in the userInput which is it's first letter
	//the first letter is then transferred to the backwards as its last letter which is represented by
	//userInput.substring (0, 1); The coordinates (0,1) indicates the last position of the backwards string
	//will continue until there are no more letters left in userInput
	return userInput;
	//returns the backwards word
    }
} // Recursion_Example_String class


