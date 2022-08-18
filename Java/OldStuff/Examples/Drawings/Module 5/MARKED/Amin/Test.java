// The "Cashier" class.
import java.awt.*;
import java.io.*; 
import java.text.*;
import javax.swing.*; 
import hsa.Console;
public class Test extends JFrame {

  

    public static void main (String[] args) throws IOException
    {
     
    
   
    
       
     
      String strName, strNumber, strTest, strMark, strMark2, strMark3, strMark4, strTitle;
      double dblAvg, dblMark, dblMark2, dblMark3, dblMark4;
  
 
 
    
   
	
	DataInputStream keyboard = new DataInputStream (System.in); 
	
	System.out.println ("Enter Your Name");
	strName = keyboard.readLine();
	
	
	System.out.println ("Enter Your Student Number");
	strNumber = keyboard.readLine();
       
	
	System.out.println("Enter Your Chapter Title 1-4");
       strTitle = keyboard.readLine();
      
       
	 System.out.println("Enter you Marks 1 to 4");
     strMark = keyboard.readLine();
     strMark2 = keyboard.readLine();
     strMark3 = keyboard.readLine();
     strMark4 = keyboard.readLine();
     
     System.out.println("MAKING REPORT");
     try {
		     Thread.sleep(3000);
	    } catch (InterruptedException e) { }
 
    
    
     
     dblMark = Double.valueOf(strMark).doubleValue();
      dblMark2 = Double.valueOf(strMark2).doubleValue();
      dblMark3 = Double.valueOf(strMark3).doubleValue();
      dblMark4 = Double.valueOf(strMark4).doubleValue();
     
     
     
     
     dblAvg = ((dblMark + dblMark2 + dblMark3 + dblMark4) / 4);
	
	
       System.out.println ("\nREPORT");
      System.out.println("---------------------------------");
	
    System.out.println("\nStudent Name: " + strName);
      
  System.out.println (" Your Student Number: " + strNumber);
      
     System.out.println(" Your Chapters:  ");
      
    System.out.println("Your Avg: " + dblAvg);
    
      
   System.out.println("----------------------------------");
      }
    
    
       
 
       }
	 // Place your program here.  'c' is the output console
     // main method
   // Cashier class
