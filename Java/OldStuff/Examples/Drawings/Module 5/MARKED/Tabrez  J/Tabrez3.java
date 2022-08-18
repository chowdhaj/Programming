
import java.awt.*;
import java.io.*;
import hsa.Console;

public class Total 
{
    
    static Console c;       //The 0utput Console
    
    public static void main (String[] args) throws IOException
    {
    
    c = new Console ();
	
	String strname, strStudentNum, strTests, strMarks, strhy, strrg, strfh;
	double dblAns, dblmark4, dblmark3, dblmark2, dblmark1;
	
	
	
	DataInputStream keyboard = new DataInputStream(System.in);
	
	System.out.println("Please enter your name");
	strname = keyboard.readLine ();
	
	System.out.println("Please enter your student number");
	strStudentNum = keyboard.readLine ();
	
	System.out.println("Please enter the chapter title of the tests");
	strTests = keyboard.readLine ();
	
	System.out.println("Please enter the  first mark for the chapter");
	strMarks = keyboard.readLine ();
	
	System.out.println("Please enter the second mark for the chapter");
	strhy = keyboard.readLine ();
	
	System.out.println("Please enter the third mark for the chapter");
	strrg = keyboard.readLine ();
	
	System.out.println("Please enter the fourth mark the chapter");
	strfh = keyboard.readLine ();
	
	dblmark1 = Double.valueOf(strMarks).doubleValue();
	dblmark2 = Double.valueOf(strhy).doubleValue ();
	dblmark3 = Double.valueOf(strrg).doubleValue ();
	dblmark4 = Double.valueOf(strfh).doubleValue ();
	dblAns = (dblmark1+dblmark2+dblmark3+dblmark4) /4;
	
	System.out.println("Name:               " + strname);
	System.out.println("Student Number:     " + strStudentNum);
	System.out.println("Chapter Title:      " + strTests);
	System.out.println("First Mark:         " + strMarks);
	System.out.println("Second Mark:        " + strhy);
	System.out.println("Third Mark:         " + strrg);
	System.out.println("Fourth Mark:        " + strfh);
	System.out.println("Your average is:"   + dblAns);
	
	

	
	
	
	
	
	
	
	
    

  
	
}
}
