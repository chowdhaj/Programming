// The "GradeAvg" class.
import java.awt.*;
import hsa.Console;

public class GradeAvg
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	
	int intGrade1, intGrade2, intGrade3, intGrade4, intGrade5, intAvg;
	
	 
    c.println("Enter your marks for 5 classes");
    intGrade1 = c.readInt();
    intGrade2 = c.readInt();
    intGrade3 = c.readInt();
    intGrade4 = c.readInt();
    intGrade5 = c.readInt();
    
    intAvg = (intGrade1 + intGrade2 + intGrade3 + intGrade4 + intGrade5)/5;
    c.print("your average is " + intAvg);
    
	
	// Place your program here.  'c' is the output console
    } // main method
} // GradeAvg class
