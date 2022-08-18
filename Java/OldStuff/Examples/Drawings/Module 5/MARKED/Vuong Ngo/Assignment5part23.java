// The "Assignment5part23" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.text.*;

public class Assignment5part23
{
/*
*Vuong Ngo
*Oct14
*Assignment5part2-3
*/
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	String strname,strchap1,strchap2,strchap3,strchap4;
	
	DataInputStream keyboard= new DataInputStream(System.in);
	
	System.out.println("Enter your name: ");
	strname=keyboard.readLine();
	
	System.out.println("Enter you student number: ");
	long lnumber= Long.parseLong(keyboard.readLine());
	
	System.out.println("Enter the title of chapter 1: ");
	strchap1=keyboard.readLine();
	System.out.println("Enter the title of chapter 2: ");
	strchap2=keyboard.readLine();
	System.out.println("Enter the title of chapter 3: ");
	strchap3=keyboard.readLine();
	System.out.println("Enter the title of chapter 4: ");
	strchap4=keyboard.readLine();
	
	System.out.println("Enter your mark of chapter 1: ");
	int intmark1= Integer.parseInt(keyboard.readLine());
	System.out.println("Enter your mark of chapter 2: ");
	int intmark2= Integer.parseInt(keyboard.readLine());
	System.out.println("Enter your mark of chapter 3: ");
	int intmark3= Integer.parseInt(keyboard.readLine());
	System.out.println("Enter your mark of chapter 4: ");
	int intmark4= Integer.parseInt(keyboard.readLine());
	
	double dblaverage= (intmark1+intmark2+intmark3+intmark4)/4;
	
	c.println("--The report card of 4 test marks of "+strname+" ("+lnumber+")--");
	c.println("\t"+"Mark of Chapter 1("+strchap1+")"+": "+intmark1+"%");
	c.println("\t"+"Mark of Chapter 2("+strchap2+")"+": "+intmark2+"%");
	c.println("\t"+"Mark of Chapter 3("+strchap3+")"+": "+intmark3+"%");
	c.println("\t"+"Mark of Chapter 4("+strchap4+")"+": "+intmark4+"%");
	c.println("---------------------------------------------");
	c.println("\t"+"Average: "+dblaverage+"%");

	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment5part23 class
