//Haaris Mian
//October 12th, 2010
// The "Tests" class.

import java.awt.*;
import java.text.*;
import hsa.Console;


public class Tests
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	DecimalFormat percentage = new DecimalFormat("##.##");
	
	String strStdntName, strT1Name, strT2Name, strT3Name, strT4Name;
	double dblT1, dblT2, dblT3, dblT4, dblAverage;
	int intStdntNmbr;
	
	//input of name/number
	c.println("What is the student's name?");
	strStdntName=c.readLine();
	c.println("What is " + strStdntName + "'s student number?");
	intStdntNmbr=c.readInt();
	
	c.clear();
	
	//input of test subjects
	c.println("What was the first test on?");
	strT1Name=c.readString();
	c.println("What was the second test on?");
	strT2Name=c.readString();
	c.println("What was the third test on?");
	strT3Name=c.readString();
	c.println("What was the fourth test on?");
	strT4Name=c.readString();
	
	c.clear();
	
	//input of test marks
	c.println("What was the mark on the " + strT1Name + " test?");
	dblT1=c.readDouble();
	c.println("What was the mark on the " + strT2Name + " test?");
	dblT2=c.readDouble();
	c.println("What was the mark on the " + strT3Name + " test?");
	dblT3=c.readDouble();
	c.println("What was the mark on the " + strT4Name + " test?");
	dblT4=c.readDouble();
	
	c.clear();
	
	dblAverage=(dblT1+dblT2+dblT3+dblT4)/4;
	
	//output of test marks/average
	c.println("    "  + strStdntName + "'s report\n" );
	c.println ("-----------------------");
	c.println(" ");
	c.print(strStdntName + "'s Student Number: ");
	c.println(intStdntNmbr,5,0);
	c.println("Mark on " + strT1Name + " test: " + (percentage.format(dblT1)) + "%"); 
	c.println("Mark on " + strT2Name + " test: " + (percentage.format(dblT2)) + "%");
	c.println("Mark on " + strT3Name + " test: " + (percentage.format(dblT3)) + "%");
	c.println("Mark on " + strT4Name + " test: " + (percentage.format(dblT4)) + "%");
	c.println("");
	c.println(strStdntName + "'s overall Average: " + dblAverage + "%");
	
	// Place your program here.  'c' is the output console
    } // main method
} // Tests class
