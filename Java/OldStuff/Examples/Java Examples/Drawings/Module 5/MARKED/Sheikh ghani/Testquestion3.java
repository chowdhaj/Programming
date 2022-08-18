// The "Testquestion3" class.
import java.awt.*;
import java.text.*;
import hsa.Console;

public class Testquestion3
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	  DecimalFormat percentage = new DecimalFormat("##.##");
	
	String StdntName, T1Name, T2Name, T3Name, T4Name;
	double T1, T2, T3, T4, Average;
	int StdntNmbr;
	
	c.println("What your name?");
	StdntName=c.readString();
	c.println("What is " + StdntName + "'s student number?");
	StdntNmbr=c.readInt();
	
	c.clear();
	
	c.println("What was the first test on?");
	T1Name=c.readString();
	c.println("What was the second test on?");
	T2Name=c.readString();
	c.println("What was the third test on?");
	T3Name=c.readString();
	c.println("What was the fourth test on?");
	T4Name=c.readString();
	
	c.clear();
	
	c.println("What was the mark on the " + T1Name + " test?");
	T1=c.readDouble();
	c.println("What was the mark on the " + T2Name + " test?");
	T2=c.readDouble();
	c.println("What was the mark on the " + T3Name + " test?");
	T3=c.readDouble();
	c.println("What was the mark on the " + T4Name + " test?");
	T4=c.readDouble();
	
	c.clear();
	
	Average=(T1+T2+T3+T4)/4;
	
	c.println(StdntName + "'s report\n" );
	c.print(StdntName + "'s Student Number: ");
	c.println(StdntNmbr,5,0);
	c.println("Mark on " + T1Name + " test: " + (percentage.format(T1)) + "%"); 
	c.println("Mark on " + T2Name + " test: " + (percentage.format(T2)) + "%");
	c.println("Mark on " + T3Name + " test: " + (percentage.format(T3)) + "%");
	c.println("Mark on " + T4Name + " test: " + (percentage.format(T4)) + "%");
	c.println("");
	c.println(StdntName + "'s overall Average: " + Average + "%");
	// Place your program here.  'c' is the output console
    } // main method
} // Testquestion3 class
