//Gartick
//October 19 2010
//ICS3UO-A
import java.awt.*;
import java.io.*;
import hsa.Console;
public class Total 
{
    
    static Console c;       
    
    public static void main (String[] args) throws IOException
{
    
    c = new Console ();
	//strings
	String sngGartick, sngNumber, sngTest, sngMark, sngTitle, sngthird, sngfourth;
	double douAnswer, doumark4, doumark3, doumark2, doumark1;
	
	
	
	DataInputStream keyboard = new DataInputStream(System.in);
	// Strings
	System.out.println("Please Enter your name");
	sngGartick = keyboard.readLine ();
	//string Gartick
	System.out.println("Please Enter your student number");
	sngNumber = keyboard.readLine ();
	//string number
	System.out.println("Please Enter the chapter title of the tests");
	sngTest = keyboard.readLine ();
	//string mark
	System.out.println("Please Enter the  first mark for the chapter");
	sngMark = keyboard.readLine ();
	//string print
	System.out.println("Please Enter the second mark for the chapter");
	sngTitle = keyboard.readLine ();
	//string thrid
	System.out.println(" Please Enter the third mark for the chapter");
	sngthird = keyboard.readLine ();
	//string fourth
	System.out.println("Please Enter the fourth mark the chapter");
	sngfourth = keyboard.readLine ();

	
	doumark1 = Double.valueOf(sngMark).doubleValue();
	doumark2 = Double.valueOf(sngTitle).doubleValue ();
	doumark3 = Double.valueOf(sngthird).doubleValue ();
	doumark4 = Double.valueOf(sngfourth).doubleValue ();
	douAnswer = (doumark1+doumark2+doumark3+doumark4) /4;
	//Text Answers
	System.out.println("Your Name Is:               " + sngGartick);
	System.out.println("Your Student Number Is:     " + sngNumber);
	System.out.println("Your Chapter Title is:      " + sngTest);
	System.out.println("Your First Mark Is:         " + sngMark);
	System.out.println("Your Second Mark Is:        " + sngTitle);
	System.out.println("Your Third Mark Is:         " + sngthird);
	System.out.println("Your Fourth Mark Is:        " + sngfourth);
	System.out.println("Your average Mark that you have got is:"   + douAnswer);
	
	
	
	
}
}
