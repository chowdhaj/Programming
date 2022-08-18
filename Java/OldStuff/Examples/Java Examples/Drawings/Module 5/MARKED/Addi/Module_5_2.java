// The "Module_5_2" class.
//Addi Dhankar
//Moudle 5, Student Average
//October 12th, 2010

import hsa.Console;
import java.awt.*;
import java.io.*;
import java.text.*;

public class Module_5_2
{
    static Console c;
    public static void main (String[] args) throws IOException
    
    {
	c = new Console ();
	String strName, strNumber, strTitle, strMarks1, strMarks2, strMarks3, strMarks4, strAverage;
	double dblMarks1, dblMarks2, dblMarks3, dblMarks4, dblAvg;
	DataInputStream keyboard = new DataInputStream(System.in);
	
	c.println("What is your Name?");
	strName = c.readLine();
	c.println("Student Name: " + strName);
	c.println(" ");
	
	c.println("What is your Student Number?");
	strNumber = c.readLine();
	c.println("Student Name: " + strNumber);
	c.println(" ");
	
	c.println("What are the title of the Four Chapters?");
	strTitle = c.readLine();
	c.println("");
	c.println("The Name Of The Chapers are: " + strTitle);
	c.println(" ");
	
	c.println("Enter Your Marks For Chapter 1");
	strMarks1 = c.readLine();
	
	c.println("Enter Your Marks For Chapter 2");
	strMarks2 = c.readLine();
	
	c.println("Enter Your Marks For Chapter 3");
	strMarks3 = c.readLine();
	
	c.println("Enter Your Marks For Chapter 4");
	strMarks4 = c.readLine();

	dblMarks1 = Double.valueOf(strMarks1).doubleValue();
	dblMarks2 = Double.valueOf(strMarks2).doubleValue();
	dblMarks3 = Double.valueOf(strMarks3).doubleValue();
	dblMarks4 = Double.valueOf(strMarks4).doubleValue();
	
	dblAvg = ((dblMarks1 + dblMarks2 + dblMarks3 + dblMarks4) / 4);
	c.print("The average mark you recieved is ");
	c.print(dblAvg,3,2);
	c.print("%");

    } //main method
} //Module_5_2 class
