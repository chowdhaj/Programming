//Ahmed Khan
//October 19 2010
//ICS3UO-A
//Assignment 5: Part 2: Question 3
import java.awt.*;
import java.io.*;
import hsa.Console;
public class SuperAverageCalculator
{
    
    static Console c;       
    
    public static void main (String[] args) throws IOException
{
    
    c = new Console ();
	
	String sngname, sngStudentNum, sngTests, sngMarks, snghy, sngrg, sngfh;
	double douAns, doumark4, doumark3, doumark2, doumark1;
	
	
	
	DataInputStream keyboard = new DataInputStream(System.in);
	
	System.out.println("What is your name.");
	sngname = keyboard.readLine ();
	
	System.out.println("What is your student number.");
	sngStudentNum = keyboard.readLine ();
	
	System.out.println("What is the chapter title of your previous tests.");
	sngTests = keyboard.readLine ();
	
	System.out.println("What is the  first mark in the chapter.");
	sngMarks = keyboard.readLine ();
	
	System.out.println("What is the second mark in the chapter.");
	snghy = keyboard.readLine ();
	
	System.out.println("What is the third mark in the chapter.");
	sngrg = keyboard.readLine ();
	
	System.out.println("What is the fourth mark in the chapter.");
	sngfh = keyboard.readLine ();
	
	doumark1 = Double.valueOf(sngMarks).doubleValue();
	doumark2 = Double.valueOf(snghy).doubleValue ();
	doumark3 = Double.valueOf(sngrg).doubleValue ();
	doumark4 = Double.valueOf(sngfh).doubleValue ();
	douAns = (doumark1+doumark2+doumark3+doumark4) /4;
	
	System.out.println("Name:               " + sngname);
	System.out.println("Student Number:     " + sngStudentNum);
	System.out.println("Chapter Title:      " + sngTests);
	System.out.println("First Mark:         " + sngMarks);
	System.out.println("Second Mark:        " + snghy);
	System.out.println("Third Mark:         " + sngrg);
	System.out.println("Fourth Mark:        " + sngfh);
	System.out.println("Your average is:"   + douAns);
	
	
	//Ahmed Khan
	
}
}
