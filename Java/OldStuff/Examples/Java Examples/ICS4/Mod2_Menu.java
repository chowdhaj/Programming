// The "Mod2_Menu" class.
import java.awt.*;
import hsa.Console;
import java.text.*;
import java.io.*;
public class Mod2_Menu
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	
     
c = new Console ();
int choice;
do
{
c.setTextColor(Color.blue);
c.println("\t\t Main Menu");
c.setTextColor(Color.black);


c.println("\t\t *********");
c.println("\t\t 1. Option 1");
c.println("\t\t 2. Option 2");
c.println("\t\t 3. Option 3");
c.println("\t\t 4. Exit");
do
{ 

c.print("\t\t What is your choice? ");
choice=c.readInt();
if ( (choice < 1) || (choice > 4) )

c.println("\t\t\t Invalid ... enter 1-4");
}
while ( (choice < 1) || (choice > 4) );
if (choice == 1) option1();
else if (choice == 2) option2();
else if (choice == 3) option3();

}
while (choice !=4);
c.println("\t\t Thank you for using our program. Goodbye!!");
c.close();


}
	
public static void option1()

{ 
c.clear ( );
c.println("You have chosen option 1"); }

public static void option2()
{ 
c.clear ( );
c.println("You have chosen option 2"); }

public static void option3()
{ 
c.clear ( );

c.println("You have chosen option 3"); }

	
	
    
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
 // Mod2_Menu class
