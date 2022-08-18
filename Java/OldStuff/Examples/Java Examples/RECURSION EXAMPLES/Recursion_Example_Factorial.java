// The "Recursion_Example_Factorial" class.
import java.awt.*;
import hsa.Console;

//Alex Dang and Muhannad Ghannam
//Mississauga Secondary School
//Recursion String Example
//Tuesday, December 11, 2007

//This program is referenced as an example for recursion in Java
//This program will ask the user for a non-negative integer, and by calling a recursive method
//the program will output the factorial of the user's integer

public class Recursion_Example_Factorial
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int userInput = 0;
	String initialInput;
	boolean inputCorrect = true;
	String restartInput;
	int restart = 0;
	//variables declared

	boolean restartCorrect = true;
	boolean exit = false;
	do
	{
	    c.clear ();
	    do
	    {
		inputCorrect = true;
		//if errors are found in this section, inputCorrect will be set to false
		//if there are no errors, inputCorrect will remain true which will exit out of the loop
		c.println ("*************************************");
		c.print ("Enter a non-negative integer: ");
		initialInput = c.readLine ();
		//asks user for a non-negative integer
		try
		{
		    userInput = Integer.parseInt (initialInput);
		    //the user's input is being converted to an integer
		    //this is done while the string is being parsed to catch
		    //instances where the user's input contains string values
		}
		catch (Exception e)
		{
		    //when string values are found
		    //the error is handled and will print out statements then stops the program
		    c.println ("");
		    c.println ("A Non-Negative Integer u Foo!, Good Try Nub(aka Roger)...GOOD GAME");
		    sleeper1500 ();
		    inputCorrect = false;

		}

		if (userInput < 0)
		{
		    //not possible to factorial a negatime number
		    //this section catches when a user inputs a negative number
		    c.println ("");
		    c.println ("Oops! U PULLED OFF A ROGER U NUB!!!");
		    sleeper1500 ();
		    inputCorrect = false;

		}

	    }
	    while (inputCorrect == false);

	    c.print (userInput + "! = " + factorial (userInput));
	    //this line calls the factorial method and prints out the result of the recursive method
	    do
	    {
		restartCorrect = true;
		c.println ("");
		c.println ("Do you wish to continue? If yes, please input 1. If no, please input 2.");
		restartInput = c.readLine ();
		//asks the user if he/she wishes to restart
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
		    c.println ("Input 1 or 2 u Foo!, Good Try Nub...GOOD GAME");
		    sleeper1500 ();
		    restartCorrect = false;
		}

		if ((restart > 2) || (restart < 1))
		{

		    c.println ("Unexpected Input...Restarting");
		    sleeper1500 ();
		    restartCorrect = false;
		    //catches if the user inputs an integer greater than 2 or less than 1
		}

		if (restart == 2)
		{
		    //if user inputs 2 indicating he/she wishes to exit then exit will be true
		    exit = true;

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


    public static int factorial (int userInput)
    //creates an integer object called factorial which calls userInput from the main
    {
	if (userInput == 0)
	    return 1;
	//when the user inputs 0, the output will be 1
	else
	    return userInput * factorial (userInput - 1);
	//the factorial method is called which recalls itself with an
	//integer 1 less everytime
	//will stop when the userInput is equal to one
	//will return the result back to the main
    }
} // Recursion_Example_Factorial class


