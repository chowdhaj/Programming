// The "Mod5Question3" class.
//Ravtar Singh Braich
//Calculate and print bill
//October,13,2010
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.text.*;
public class Mod5Question3
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	
	String strName, strStudentNumber, strTest1, strTest2, strTest3, strTest4, strMark1, strMark2, strMark3, strMark4, strGrade, strSchool ;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	

	DecimalFormat x = new DecimalFormat("###.##");
	c.println(" Please enter your name");
	strName = c.readLine();
	//defines value of strName
	c.println(" Please enter your schools name");
	strSchool = c.readLine();
	//defines value of strSchool
	c.println(" Please enter your grade");
	strGrade = c.readLine();
	//defines value of strGrade
	c.println(" Please enter your student number");
	strStudentNumber = c.readLine();
	//defines value of strStudentNumber
	c.println("Please enter the name of your 1st test");
	strTest1 = c.readLine();
	//defines value of strTest1
	c.println("Please enter the mark of your 1st test");
	strMark1 = c.readLine();
	//defines value of strMark1
	c.println("Please enter the name of your 2nd test");
	strTest2 = c.readLine();
	//defines value of strTest2
	c.println("Please enter the mark of your 2nd test");
	strMark2 = c.readLine();
	//defines value of strMark2
	c.println("Please enter the name of your 3rd test");
	strTest3 = c.readLine();
	//defines value of strTest3
	c.println("Please enter the mark of your 3rd test");
	strMark3 = c.readLine();
	//defines value of strMark3
	c.println("Please enter the name of your 4th test");
	strTest4 = c.readLine();
	//defines value of strTest4
	c.println("Please enter the mark of your 4rd test");
	strMark4 = c.readLine();
	//defines value of strMark4
	c.setTextBackgroundColor(Color.gray);
	// Sets a background colour behind the text

	dblMark1 = Double.valueOf (strMark1)  .doubleValue();
	//Convertes strMark1 to dblMark1
	dblMark2 = Double.valueOf (strMark2)  .doubleValue();
	//Convertes strMark2 to dblMark2
	dblMark3 = Double.valueOf (strMark3)  .doubleValue();
	//Convertes strMark3 to dblMark3
	dblMark4 = Double.valueOf (strMark4)  .doubleValue();
	//Convertes strMark4 to dblMark4
	dblAverage = (dblMark1+dblMark2+dblMark3+dblMark4)/(4);
	//defines value of dblAverage
	c.println("            ");
	c.setTextColor(Color.white);
	c.println(strName + "              " + strStudentNumber);
	c.println(strSchool + "        Grade" + strGrade);
	c.println("----------------------------------------");
	c.setTextColor(Color.green);
	c.println("Tests                   "+" Marks");
	c.println(strTest1 + "                       "+ x.format(dblMark1)+"%") ;
	c.println(strTest2 + "                       "+ x.format(dblMark2)+"%");
	c.println(strTest3 + "                       "+ x.format(dblMark3)+"%");
	c.println(strTest4 + "                       "+ x.format(dblMark4)+"%");
	c.println("----------------------------------------");
	c.setTextColor(Color.magenta);
	c.println("Average Mark              " + x.format(dblAverage) + "%");
	//The Layout/ Mark update Page
	
	// Place your program here.  'c' is the output console
    } // main method
} // Mod5Question3 class
