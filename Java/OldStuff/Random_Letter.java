// The "Ex" class.
import java.awt.*;
import hsa.Console;
import java.util.Random; 
public class Random_Letter
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	
	   // Random r = new Random();  
	  //  String alphabet = "123xyz";  
	    //   for (int i = 0; i < 5; i++) 
	    //   {         
	     //  c.print(alphabet.charAt(r.nextInt(alphabet.length())));   
	      //   } 
	      
		 
		 Random r = new Random(); 
		 char cr = (char)(r.nextInt(26) + 'a');
	 c.print(cr);   
	 
	 
	// Place your program here.  'c' is the output console
    } // main method
} // Ex class
