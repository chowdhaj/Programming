// The "Module5_Part2_1" class.
//Bakhshish Ahluwalia
//Oct. 14,2010
//Mr.Simler
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
	
	String strName, strStudentNumber, strTest1, strTest2, strTest3, strTest4, strMark1, strMark2, strMark3, strMark4 ;
	double dblMark1, dblMark2, dblMark3, dblMark4, dblAverage;
	
	DecimalFormat x = new DecimalFormat("###.##");
	c.println(" Please enter your name");
	strName = c.readLine();
	c.println(" Please enter your student number");
	strStudentNumber = c.readLine();
	c.println("Please enter the name of your Four Tests:");
	strTest1 = c.readLine();        
	strTest2 = c.readLine();
	strTest3 = c.readLine();
	strTest4 = c.readLine();
	c.println("Please enter the mark for your Four Tests:");
	strMark1 = c.readLine();
	strMark2 = c.readLine();
	strMark3 = c.readLine();
	strMark4 = c.readLine();
	c.setTextBackgroundColor(Color.black);
	dblMark1 = Double.valueOf (strMark1)  .doubleValue();
	dblMark2 = Double.valueOf (strMark2)  .doubleValue();
	dblMark3 = Double.valueOf (strMark3)  .doubleValue();
	dblMark4 = Double.valueOf (strMark4)  .doubleValue();
	dblAverage = (dblMark1+dblMark2+dblMark3+dblMark4)/(4);
	c.println("            ");
	c.setTextColor(Color.green);
	c.println(strName + "              " + strStudentNumber);
	c.println("___________________________________________");
	c.setTextColor(Color.yellow);
	c.println("Tests                   "+" Marks");
	c.println(strTest1 + "                       "+ x.format(dblMark1)+"%") ;
	c.println(strTest2 + "                       "+ x.format(dblMark2)+"%");
	c.println(strTest3 + "                       "+ x.format(dblMark3)+"%");
	c.println(strTest4 + "                       "+ x.format(dblMark4)+"%");
	c.setTextColor(Color.green);
	c.println("____________________________________________");
	c.println("Average Mark              " + x.format(dblAverage) + "%");
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Mod5Question3 class
