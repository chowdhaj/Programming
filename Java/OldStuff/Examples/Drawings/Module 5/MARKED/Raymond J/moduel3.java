// The "moduel3" class.
import java.awt.*;
import java.io.*;
import java.text.*;

public class moduel3
{

    public static void main (String[] args) throws IOException
    {
    
    
    String strName, strNumber, strTitle1, strTitle2, strTitle3,strMarktitle1, strMarktitle2, strMarktitle3, strMarktitle4, strTitle4;
    double dblMarktitle1, dblMarktitle2, dblMarktitle3, dblMarktitle4,dblAverage;
   
    DataInputStream keyboard = new DataInputStream (System.in);

	 System.out.println("Enter Name:");
	   strName = keyboard.readLine (); 
	 System.out.println ("enter Student Number:");
	   strNumber = keyboard.readLine (); 
	 System.out.println ("Chapter Title 1");
	   strTitle1 = keyboard.readLine ();
	 System.out.println ("Chapter Title 2");
	   strTitle2 = keyboard.readLine ();
	 System.out.println ("Chapter Title 3");
	   strTitle3 = keyboard.readLine ();
	 System.out.println ("Chapter Title 4");
	   strTitle4 = keyboard.readLine ();
	 System.out.println ("Chapter 1 mark ");
	   strMarktitle1 = keyboard.readLine ();
	 System.out.println ("Chapter 2 Mark ");
	   strMarktitle2 = keyboard.readLine ();
	 System.out.println ("Chapter 3 Mark ");
	   strMarktitle3 = keyboard.readLine ();
	 System.out.println ("Chapter 4 Mark ");
	   strMarktitle4 = keyboard.readLine ();
	   
	   dblMarktitle1 = Double.valueOf(strMarktitle1).doubleValue();
	   dblMarktitle2 = Double.valueOf(strMarktitle2).doubleValue();
	   dblMarktitle3 = Double.valueOf(strMarktitle3).doubleValue();
	   dblMarktitle4 = Double.valueOf(strMarktitle4).doubleValue();
	   dblAverage = ( dblMarktitle1 + dblMarktitle2 + dblMarktitle3 + dblMarktitle4)/4; 
	   
	   System.out.println("Name: " + strName);
	   System.out.println("Student #: " + strNumber);
	   System.out.println(strTitle1 + ": " + dblMarktitle1);
	   System.out.println(strTitle2 + ": " + dblMarktitle2);
	   System.out.println(strTitle3 + ": " + dblMarktitle3);
	   System.out.println(strTitle4 + ": " + dblMarktitle4);
	   System.out.println("Average: " + dblAverage);
	 
	 
	 
	 
	
 
    } // main method
} // moduel3 class
