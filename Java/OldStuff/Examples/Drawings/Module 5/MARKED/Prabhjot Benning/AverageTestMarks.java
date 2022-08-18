// The "AverageTestMarks" class.
//Prabhjot Benning
//Average of 4 Test Marks
//Oct 8th 2010


import java.awt.*;
import java.io.*;
import hsa.Console;
import java.text.*;

public class AverageTestMarks
{
    static Console c;            //The output console

    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	String strName, strStudentNumber, strTest1, strTest2, strTest3, strTest4, strMark1, strMark2, strMark3, strMark4;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	
	DecimalFormat x = new DecimalFormat("###.##");
	c.println("Enter Your Name, please");
	strName = c.readLine();
	
	c.println("Enter Your Student Number, please");
	strStudentNumber = c.readLine();
	c.println("Please, enter the name of your 1st test");
	strTest1 = c.readLine();
	c.println("Please, enter the mark of your 1st test");
	strMark1 = c.readLine();
	c.println("Enter the name of your 2nd test");
	strTest2 = c.readLine();
	c.println("Enter the mark of your 2nd test");
	strMark2 = c.readLine();
	c.println("Enter the name of your 3rd test");
	strTest3 = c.readLine();
	c.println("Enter the mark of your 3rd test");
	strMark3 = c.readLine();
	c.println("Enter the name of your 4th test");
	strTest4 = c.readLine();
	c.println("Enter the mark of your 4rd test");
	strMark4 = c.readLine();
       
	dblMark1 = Double.valueOf (strMark1)  .doubleValue();
	dblMark2 = Double.valueOf (strMark2)  .doubleValue();
	dblMark3 = Double.valueOf (strMark3)  .doubleValue();
	dblMark4 = Double.valueOf (strMark4)  .doubleValue();
	dblAverage = (dblMark1+dblMark2+dblMark3+dblMark4)/(4);
	c.println("            ");
	c.setTextColor(Color.blue);
	c.println(strName);
	c.println(strStudentNumber);
	c.setTextColor(Color.darkGray);
	c.println("----------------------------------------");        
	c.println("Tests                   "+" Marks");
	c.println(strTest1 + "                       "+ dblMark1);
	c.println(strTest2 + "                       "+ dblMark2);
	c.println(strTest3 + "                       "+ dblMark3);
	c.println(strTest4 + "                       "+ dblMark4);
	 c.setTextColor(Color.red);
	c.println("----------------------------------------");       
	c.println("Average Mark             %" + x.format(dblAverage));

// Place your program here.  'c' is the output console
    } // main method
} // Mod5Question3 class
