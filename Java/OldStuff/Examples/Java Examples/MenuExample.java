//Example program with a menu
import java.awt.*;
import hsa.Console;
public class MenuExample
{


static Console c = new Console ();
public static void main (String[] args)
{

int choice;
do
{

c.println("\t\t Main Menu");
c.println("\t\t *********");
c.println("\t\t 1.Option 1");
c.println("\t\t 2.Option 2");
c.println("\t\t 3.Option 3");
c.println("\t\t 4. End");
do
{

c.print ("What is your choice (1-4): ");
choice = c.readInt ();
if ((choice < 1) || (choice > 4))
c.println ("Invalid ... enter 1-4 only");

}
while ((choice < 1) || (choice > 4));
switch (choice)
{

case 1: c.println("option1"); 
break;
case 2: c.println("option2"); 
break;
case 3: c.println("optrion3");
 break;

} 

}
while (choice != 4);
c.println("\n\nBye");
try 
{
Thread.sleep(2000);
}
catch(InterruptedException ex)
{
}

c.close();

}

}
