// The "module5part3" class.
import java.awt.*;
import hsa.Console;

public class module5part3
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	String strName, strStudentNumber, strChapterTitles, strChapterTitles2, strChapterTitles3, strChapterTitles4, strMarks;
	double dblName, dblMarks, dblMarks1, dblMarks2, dblMarks3, dblAverage;
    
	c.println("Enter Name: ");
	c.readString();
	
	c.println("Enter Student Number: " );
	c.readString();

	c.println("Enter Chapter Titles: ");
	strChapterTitles=c.readString();
	strChapterTitles2=c.readString();
	strChapterTitles3=c.readString();
	strChapterTitles4=c.readString();

	c.println("Enter Chapter Marks: ");
	dblMarks=c.readDouble();
	dblMarks1=c.readDouble();
	dblMarks2=c.readDouble();
	dblMarks3=c.readDouble();
	
	
	dblAverage= (dblMarks + dblMarks1 + dblMarks2 + dblMarks3) /4; 
	c.println("Your Total Average is: " + dblAverage);
	
	c.println("Name: ");
	c.println("Student Number: ");
	c.println("Chapter Titles: " + strChapterTitles);
	c.println("Chapter Marks: " + dblMarks);
	c.println("Your Total Average: " + dblAverage);
	c.readString();
	c.readDouble();
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // module5part3 class
