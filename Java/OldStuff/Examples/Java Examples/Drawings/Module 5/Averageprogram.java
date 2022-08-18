// The "Averageprogram" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.text.*;

public class Averageprogram
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String strName, strStudentNumber, strTest1, strTest2, strTest3, strTest4, strMark1, strMark2, strMark3, strMark4, strGrade, strSchool ;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	
	DecimalFormat x = new DecimalFormat("###.##");
	c.println("What is your name");
	strName = c.readLine();
	c.println("What is your student number");
	strStudentNumber = c.readLine();
	c.println("What is the name of your 1st test");
	strTest1 = c.readLine();
	c.println("What is the mark of your 1st test");
	strMark1 = c.readLine();
	c.println("What is the name of your 2nd test");
	strTest2 = c.readLine();
	c.println("what is the mark of your 2nd test");
	strMark2 = c.readLine();
	c.println("What is the name of your 3rd test");
	strTest3 = c.readLine();
	c.println("What is the mark of your 3rd test");
	strMark3 = c.readLine();
	c.println("What is the name of your 4th test");
	strTest4 = c.readLine();
	c.println("What is the mark of your 4rd test");
	strMark4 = c.readLine();
	dblMark1 = Double.valueOf (strMark1)  .doubleValue();
	dblMark2 = Double.valueOf (strMark2)  .doubleValue();
	dblMark3 = Double.valueOf (strMark3)  .doubleValue();
	dblMark4 = Double.valueOf (strMark4)  .doubleValue();
	dblAverage = (dblMark1 +dblMark2 +dblMark3+ dblMark4)/(4);
	c.println("            ");
	c.println(strName  + "              "  );
	c.println(strStudentNumber);
  
      
	c.println(".......................................");
	c.println("Tests                   "+ " Marks");
	c.println(strTest1+   "                       "  +dblMark1);
	c.println(strTest2  + "                       " + dblMark2);
	c.println(strTest3  + "                       " + dblMark3);
	c.println(strTest4  + "                       " + dblMark4);
	c.println("_______________________________________");
	c.println("Average Mark             %" +  x.format(dblAverage));
	
       
	
       
	
      

	
	// Place your program here.  'c' is the output console
    } // main method
} // Averageprogram class
