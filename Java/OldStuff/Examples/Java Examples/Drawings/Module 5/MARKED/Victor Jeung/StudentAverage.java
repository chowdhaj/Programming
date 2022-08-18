//The "StudentAverage" class.
//Victor Jeung
//Student Average
//Oct 12th, 2010

//Import java libraries for colour, input/output, text, the HSA console, util and JOptionPane
import java.awt.*;
import java.io.*; 
import java.text.*;
import java.util.*;
import hsa.Console;
import javax.swing.JOptionPane;

public class StudentAverage
{

	//The output console
	static Console c;

    public static void main (String[] args) throws IOException
    {

	//Create new console
	c = new Console ();    
    
	//Define strings, doubles and integers
	String strName, strStudentNumber, strChapterTitles1, strChapterTitles2, strChapterTitles3, strChapterTitles4, strMarks1, strMarks2, strMarks3, strMarks4;
	double dblMarks1, dblMarks2, dblMarks3, dblMarks4, dblAverage;
	int intAction;

	do {
	
	//Clear the console
	c.clear();
	  
	//Generate user input for student name, student number, chapter titles and marks
	c.println ("Enter student name.");
	strName = c.readLine ();
	c.println ("");

	c.println ("Enter student number.");
	strStudentNumber = c.readLine ();
	c.println ("");

	c.println ("Enter chapter title for test 1.");
	strChapterTitles1 = c.readLine ();
	c.println ("Enter mark for test 1.");
	strMarks1 = c.readLine ();
	c.println ("");

	c.println ("Enter chapter title for test 2.");
	strChapterTitles2 = c.readLine ();
	c.println ("Enter mark for test 2.");
	strMarks2 = c.readLine ();
	c.println ("");

	c.println ("Enter chapter title for test 3.");
	strChapterTitles3 = c.readLine ();
	c.println ("Enter mark for test 3.");
	strMarks3 = c.readLine ();
	c.println ("");

	c.println ("Enter chapter title for test 4.");
	strChapterTitles4 = c.readLine ();
	c.println ("Enter mark for test 4.");
	strMarks4 = c.readLine ();
	
	//Clear the console
	c.clear();
	
	//Create date object, define dateformat and timezone
	Date date = new Date();
	DateFormat estFormat = new SimpleDateFormat();
	TimeZone estTime = TimeZone.getTimeZone("EST");
	estFormat.setTimeZone(estTime);
	       
	//Give the doubles values and generate formula to calculate average
	dblMarks1 = Double.valueOf (strMarks1).doubleValue ();
	dblMarks2 = Double.valueOf (strMarks2).doubleValue ();
	dblMarks3 = Double.valueOf (strMarks3).doubleValue ();
	dblMarks4 = Double.valueOf (strMarks4).doubleValue ();
	dblAverage = ((dblMarks1 + dblMarks2 + dblMarks3 + dblMarks4) / 4);
	
	//Generate student report page
	c.println ("Student Report Page:");
	c.println ("");
	c.println(estFormat.format(date));
	c.println ("");
	c.println ("Student Name: " + strName);
	c.println ("Student Number: " + strStudentNumber);
	c.println ("");
	c.print ("Test 1: " + strChapterTitles1 + " - ");
	c.print (dblMarks1, 3,2);
	c.println ("%");
	c.print ("Test 2: " + strChapterTitles2 + " - ");
	c.print (dblMarks2, 3,2);
	c.println ("%");
	c.print ("Test 3: " + strChapterTitles3 + " - ");
	c.print (dblMarks3, 3,2);
	c.println ("%");
	c.print ("Test 4: " + strChapterTitles4 + " - ");
	c.print (dblMarks4, 3,2);
	c.println ("%");
	c.println ("");
	c.print ("Average: ");
	c.print (dblAverage, 3,2);
	c.print ("%");

	 //Ask user if they want to calculate another student's average, if not exit
	intAction = JOptionPane.showConfirmDialog(null, "Do you want to calculate another student's average?");
	} while (intAction == JOptionPane.YES_OPTION);
	System.exit(0);
	
    }
}
