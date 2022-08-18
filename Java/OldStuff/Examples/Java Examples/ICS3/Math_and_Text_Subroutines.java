// The "Math_and_Text_Subroutines" class.
import java.awt.*;
import hsa.Console;
import hsa.book.*;


public class Math_and_Text_Subroutines
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	Turtle t, turtle1, turtle2;
	t = new Turtle(c);
	turtle1= new Turtle(c);
	turtle2= new Turtle(c);
	
	//set turtle1 and turtle2 color
	turtle1.setColor(Color.black);
	turtle2.setColor(Color.orange);
	
	//set starting point 
	//(upper left)
	turtle1.turnLeft(120);
	//(upper right)
	turtle2.turnLeft(60);
	
	//Draw two spirals simultaneously
	for(int distance =c.getWidth()/4;distance>1;distance--)
	{
	turtle1.move(distance);
	turtle1.turnLeft(70);
	turtle2.move(distance);
	turtle2.turnRight(70);
	}
       
	
	
	
	//Draw ring
	for(int square=1;square<=36;square++)
	{
       
	for(int side= 1; side<=4; side ++)
	
	{
	 //radius 60 pixels
	t.move(60);
	t.turnRight(90);
	t.setColor(Color.blue);
	}
	t.turnRight(10);
	}
       
	
	
      
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Math_and_Text_Subroutines class
