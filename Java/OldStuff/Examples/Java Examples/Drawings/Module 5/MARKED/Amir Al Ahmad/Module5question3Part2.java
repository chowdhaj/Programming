// The "Module 5 question 3 Part 2" class.
// Amir Al Ahmad
//Oct 11 2010
import java.awt.*;
import java.io.*;
import java.text.*;
public class Module5question3Part2
{
   
    public static void main (String[] args) throws IOException
    {
	

	String strFirstName, strLastName, strStudentNumber, strChapterTitles, strMark1, strMark2, strMark3, strMark4;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	DecimalFormat x = new DecimalFormat("###.#");
	
	DataInputStream keyboard = new DataInputStream (System.in);
	System.out.println (" MarkpastBook.");
	System.out.println (" ");

	System.out.println ("The Student Number: ");
	strStudentNumber = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The student's Last and First name: ");
	System.out.println (" First Name: ");
	strLastName = keyboard.readLine ();
	System.out.println (" ");
	System.out.println (" Last Name: ");
	strFirstName = keyboard.readLine (); 
	System.out.println (" ");
		
	System.out.println (" The Chapter One: project 1 Mark 1 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark1 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Two: Essay 2 Mark 2 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark2 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Three Exam 3 Mark 3 (%)");
	System.out.println (" Subject ");
	strChapterTitles = keyboard.readLine ();
	System.out.println (" Mark ");
	strMark3 = keyboard.readLine ();
	System.out.println (" ");
	
	System.out.println (" The Chapter Four Exam 4 Mark 4 (%)");
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
