// The "Criminals" class.
import java.awt.*;
import hsa.Console;


public class Criminals
{
    static Console c;           // The output console
    static int x, criminals;
    static String name[]=new String[1000];
    static String crime[]=new String[1000];
    static int year[]=new int[1000];
    public static void main (String[] args)
    {
	c = new Console ();
	int choice;
	do
	{
	c.println("Main Menu");
	c.println("1. Enter Criminal Data");
	c.println("2. Search for a Criminal");
	c.println("3. Exit Program");
	c.print("What is your choice: ");
	choice=c.readInt();
	if (choice==1) entercrim();
	}
	while(choice !=3);
	
       
	// Place your program here.  'c' is the output console
    } // main method
     public static void entercrim()
	{
	 c.print("How many criminals would you like to enter?");
	 criminals=c.readInt();
	for (x=0; x<criminals; x++)
	{
	c.print("What is the crimals name: ");
	name[x]=c.readLine();
	 c.print("What is the crime: ");
	 crime[x]=c.readLine();
	  c.print("What is the year of the crime: ");
	 year[x]=c.readInt();
	}
	}
} // Criminals class
