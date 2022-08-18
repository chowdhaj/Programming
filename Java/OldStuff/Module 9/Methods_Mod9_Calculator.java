// The "Methods_Mod9" class.
import java.awt.*;
import hsa.Console;

public class Methods_Mod9_Calculator
{

    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int Num1, Num2, add, subtract;
	c.print ("Please enter first value: ");
	Num1 = c.readInt ();
	c.print ("Please enter second value: ");
	Num2 = c.readInt ();

	add = addition (Num1, Num2);
	subtract = subtraction (Num1, Num2);
	
	c.println (Num1 + " + " + Num2 + " = " + add);
	c.println (Num1 + " - " + Num2 + " = " + subtract);

    } // main method


    public static int addition (int value1, int value2)
    {
	return value1 + value2;

    }


    public static int subtraction (int value1, int value2)
    {
	return value1 - value2;

    }


    // Place your program here.  'c' is the output console

} // Methods_Mod9 class
