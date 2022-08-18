//Example program with a menu
import java.awt.*;
import hsa.Console;
public class Math_Calc
{


    static Console c = new Console ();
    public static void main (String[] args)
    {

	int choice;
	double Num1 = 0, Num2 = 0, subtract = 0;
	do
	{

	    c.println ("\t\t Main Menu");
	    c.println ("\t\t *********");
	    c.println ("\t\t 1.Add");
	    c.println ("\t\t 2.Subtract");
	    c.println ("\t\t 3.Divide");
	    c.println ("\t\t 4.Multiply");
	    c.println ("\t\t 5. End");
	    do
	    {

		c.print ("What is your choice (1-5): ");
		choice = c.readInt ();
		if (choice == 5)
		{
		    break;
		}
		c.print ("Please enter first value: ");
		Num1 = c.readInt ();
		c.print ("Please enter second value: ");
		Num2 = c.readInt ();
		if ((choice < 1) || (choice > 5))
		    c.println ("Invalid ... enter 1-4 only");

	    }
	    while ((choice < 1) || (choice > 4));
	    switch (choice)
	    {

		case 1:
		    c.println ("Add");
		    c.println (Num1 + " + " + Num2 + " = " + addition (Num1, Num2));
		    try
		    {
			Thread.sleep (2000);
		    }
		    catch (InterruptedException ex)
		    {
		    }
		    c.clear ();
		    break;
		case 2:
		    c.println ("Subtract");
		    c.println (Num1 + " - " + Num2 + " = " + subtraction (Num1, Num2));
		    try
		    {
			Thread.sleep (2000);
		    }
		    catch (InterruptedException ex)
		    {
		    }
		    c.clear ();
		    break;
		case 3:
		    c.println ("Divide");
		    c.println (Num1 + " / " + Num2 + " = " + divison (Num1, Num2));
		    try
		    {
			Thread.sleep (2000);
		    }
		    catch (InterruptedException ex)
		    {
		    }
		    c.clear ();
		    break;
		case 4:
		    c.println ("Multiply");
		    c.println (Num1 + " * " + Num2 + " = " + multiply (Num1, Num2));
		    try
		    {
			Thread.sleep (2000);
		    }
		    catch (InterruptedException ex)
		    {
		    }
		    c.clear ();
		    break;
	    }

	}
	while (choice != 5);
	c.println ("\n\nBye");
	try
	{
	    Thread.sleep (2000);
	}
	catch (InterruptedException ex)
	{
	}

	c.close ();

    }


    public static double addition (double value1, double value2)
    {
	return value1 + value2;

    }


    public static double subtraction (double value1, double value2)
    {
	return value1 - value2;

    }


    public static double divison (double value1, double value2)
    {
	return value1 / value2;

    }


    public static double multiply (double value1, double value2)
    {
	return value1 * value2;

    }
}
