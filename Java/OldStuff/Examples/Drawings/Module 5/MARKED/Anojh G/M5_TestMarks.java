// Anojh Gnanachandran
// October 12th, 2010
// The "M5_TestMarks" class.

import java.awt.*;
import java.text.*;
import hsa.Console;

public class M5_TestMarks
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	DecimalFormat num = new DecimalFormat("######"); //Declares the student number format.
	
	//Declare variables.
	String strName, strChapT1, strChapT2, strChapT3, strChapT4;
	double dblSNum, dblCh1, dblCh2, dblCh3, dblCh4, dblAverage;
	
	c.setTextColor(Color.blue); //Changes colour.
	
	//Asks for student's information.
	c.println("What is your name?");
	strName = c.readLine();
	c.println("What is your student number?");
	dblSNum = c.readDouble();
	c.println("What is the chapter title of the first test?");
	strChapT1 = c.readLine();
	c.println("What is the chapter title of the second test?"); 
	strChapT2 = c.readLine();
	c.println("What is the chapter title of the third test?");
	strChapT3 = c.readLine();
	c.println("What is the chapter title of the fourth test?");
	strChapT4 = c.readLine();
	
	//Clears the screen.
	c.clear();
	
	//Asks for students' test marks.
	c.println("What is your mark on the test: " + strChapT1 + "?");
	dblCh1 = c.readDouble();
	c.println("What is your mark on the test: " + strChapT2 + "?");
	dblCh2 = c.readDouble();
	c.println("What is your mark on the test: " + strChapT3 + "?");
	dblCh3 = c.readDouble();
	c.println("What is your mark on the test: " + strChapT4 + "?");
	dblCh4 = c.readDouble();
	
	//Clears the screen.
	c.clear();
	
	//Displays information.
	c.println("  " + strName +"'s Marks\n");
	c.println("Student Number: " + (num.format(dblSNum)));
	c.println(strChapT1 + ": " + dblCh1 + "%");
	c.println(strChapT2 + ": " + dblCh2 + "%");
	c.println(strChapT3 + ": " + dblCh3 + "%");
	c.println(strChapT4 + ": " + dblCh4 + "%\n");
	
	//Displays average of marks.
	dblAverage = (dblCh1+dblCh2+dblCh3+dblCh4)/4;
	c.println(strName + "'s" + " Average: " + dblAverage + "%");
	
	// Place your program here.  'c' is the output console
    } // main method
} // M5_TestMarks class
