// The "String_Password_Generator" class.
import java.awt.*;
import hsa.Console;

public class String_Password_Generator
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String strFirst, strLast, strPassword;
	int intFirstLen, intLastLen; 
	char chr1, chr2, chr3, chr4;
	
	
	c.println("Enter your first Name: ");
	strFirst = c.readLine();
	
	c.println("Enter your last Name: ");
	strLast = c.readLine();
       
	intFirstLen =strFirst.length();
	 intLastLen =strFirst.length() ;
	 
	 strPassword="";
	 
	strPassword+=strFirst.charAt(0);
	strPassword+=strFirst.charAt(intFirstLen -1);
	strPassword+=strLast.charAt(0);
	strPassword+=strLast.charAt(intLastLen -1);
	
	
	
	// strPassword = (chr1 + "" + chr2 + "" + chr3+ "" + chr4 + "");
	 
	c.println(strPassword.toUpperCase());
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // String_Password_Generator class
