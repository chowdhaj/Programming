// The "Check_Input" class.
import java.awt.*;
import hsa.Console;
import java.io.*;


public class Check_Input
{
    static Console c;           // The output console
   
    
    public static void main (String[] args) throws IOException
    {
	
	DataInputStream keyboard = new DataInputStream(System.in); 
	String str;  // Get this from your input control 
	int x=0; //varible used to repeat loop if number is not entered.
	
      do
{  
	
	System.out.print("Enter a number: ");
str= keyboard.readLine();


try
{ 
   int test = Integer.valueOf(str).intValue();
System.out.print(4*test);
   // If you made it this far, you've got a valid number. Continue processing. 
} 
catch(NumberFormatException e) 
{ 
x=1;
   System.out.println("Dude, that's not a number"); 
} 
}
while((x==1));
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Check_Input class
