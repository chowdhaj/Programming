// The "Module5Part2Number3" class.
//Arshdeep Mann
//Module 5 part 2 Question 3
import java.awt.*;
import hsa.Console;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.Color;
import java.io.*;
import java.text.*; 
public class Module5Part2Number3
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	String name;String StudentNumber;String Chaptertitle1;String Chaptertitle2;String Chaptertitle3;String Chaptertitle4;
	double chapter1mark, chapter2mark, chapter3mark, chapter4mark, marksavg;
	c.println("What is your Name?: ");
	name = c.readLine( );
	c.println("What is your Student Number?: ");
	StudentNumber = c.readLine( );
	c.println("What is the chapter title for the first test?: ");
	Chaptertitle1 = c.readLine( );
	c.println("What is the chapter title for the second test?: ");
	Chaptertitle2 = c.readLine( );
	c.println("What is the chapter title for the third test?: ");
	Chaptertitle3 = c.readLine( );
	c.println("What is the chapter title for the fourth test?: ");
	Chaptertitle4 = c.readLine( );
	c.println("What was your mark on test one?: ");
	chapter1mark = c.readDouble();
	c.println("What was your mark on test two?: ");
	chapter2mark = c.readDouble();
	c.println("What was your mark on test three?: ");
	chapter3mark = c.readDouble();
	c.println("What was your mark on test four?: ");
	chapter4mark = c.readDouble();
	marksavg = ((chapter1mark + chapter2mark + chapter3mark + chapter4mark)/4);
	c.println("-------------------------------------------------------------------------------");
	c.print("Student Name:");
	c.println(name);
	c.print("Student Number:");
	c.println(StudentNumber);
	c.print("Chapter 1 Title:");
	c.println(Chaptertitle1);
	c.print("Chapter 1 Mark:");
	c.println(chapter1mark);
	c.print("Chapter 2 Title:");
	c.println(Chaptertitle2);
	c.print("Chapter 2 Mark:");
	c.println(chapter2mark);
	c.print("Chapter 3 Title:");
	c.println(Chaptertitle3);
	c.print("Chapter 3 Mark:");
	c.println(chapter3mark);
	c.print("Chapter 4 Title:");
	c.println(Chaptertitle4);
	c.print("Chapter 4 Mark:");
	c.println(chapter4mark);
	c.print("Student Average:");
	c.println(marksavg); 
	// Place your program here.  'c' is the output console
    } // main method
} // Module5Part2Number3 class
