// The "Module5question3" class.
// Matt Tripa
// Class Average
// Oct 14 2010
import java.awt.*;
import java.io.*;
import java.text.*;
public class Module5question3
{
   
    public static void main (String[] args) throws IOException
    {
	

	String strFirstName, strLastName, strStudentNumber, strChapterTitles, strMark1, strMark2, strMark3, strMark4;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	DecimalFormat x = new DecimalFormat("###.##");
	
	DataInputStream keyboard = new DataInputStream (System.in);
	System.out.println (" MarkBook.");
	System.out.println (" ");

	System.out.println (" Last Name: ");
	strLastName = keyboard.readLine ();
	System.out.println (" ");
	System.out.println (" First Name: ");
	strFirstName = keyboard.readLine (); 
	System.out.println (" ");
	
	System.out.println ("The Student Number: ");
	strStudentNumber = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter One: Test 1 Mark 1 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark1 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Two: Test 2 Mark 2 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark2 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Three Test 3 Mark 3 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark3 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Four Test 4 Mark 4 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark4 = keyboard.readLine ();
	System.out.println (" ");
	
	
	dblMark1 = Double.valueOf (strMark1).doubleValue ();
	dblMark2 = Double.valueOf (strMark2).doubleValue ();
	dblMark3 = Double.valueOf (strMark3).doubleValue ();
	dblMark4 = Double.valueOf (strMark4).doubleValue ();
	dblAverage = ((dblMark1 + dblMark2 + dblMark3 + dblMark4/4 ));
       System.out.print ("The total average of the student is " + dblAverage + "%");
 } 
}
