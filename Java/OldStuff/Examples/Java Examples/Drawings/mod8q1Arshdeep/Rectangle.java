// The "Rectangle" class.
//Arshdeep Mann
//November 16,2010
//Module 8 question 1
import java.awt.*;
import hsa.Console;
import javax.swing.*;
import java.awt.event.*;
public class Rectangle
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	//Backround Color 
	c.setTextBackgroundColor (new Color(135,206, 255));
	c.print ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	c.setColor (new Color(46, 139, 87));
	//Ground
	c.fillRect(0,380,650,120);
	//Main castle
	c.setColor (new Color(205,38, 38));
	c.fillRect(300,250,250,130); 
	c.fillRect(300,230,15,20);
	c.fillRect(325,230,20,20);
	c.fillRect(360,230,20,20);
	c.fillRect(390,230,20,20);
	c.fillRect(420,230,20,20);
	c.fillRect(450,230,20,20);
	c.fillRect(480,230,20,20);
	c.fillRect(510,230,20,20);
	c.fillRect(540,230,10,20);
	c.fillRect(333,180,185,100);
	c.fillRect(333,160,15,20);
	c.fillRect(355,160,20,20); 
	c.fillRect(380,160,20,20);
	c.fillRect(405,160,20,20);
	c.fillRect(430,160,20,20); 
	c.fillRect(455,160,20,20);
	c.fillRect(480,160,20,20);
	c.fillRect(505,160,13,20);  
	//castle outline 
	c.setColor(Color.black);
	c.drawRect(333,180,1,50);
	c.drawRect(517,180,1,50);
	c.drawRect(300,250,250,130); 
	c.drawRect(300,230,15,20);
	c.drawRect(325,230,20,20);
	c.drawRect(360,230,20,20);
	c.drawRect(390,230,20,20);
	c.drawRect(420,230,20,20);
	c.drawRect(450,230,20,20);
	c.drawRect(480,230,20,20);
	c.drawRect(510,230,20,20);
	c.drawRect(540,230,10,20); 
	c.drawRect(333,160,15,20);
	c.drawRect(355,160,20,20); 
	c.drawRect(380,160,20,20);
	c.drawRect(405,160,20,20);
	c.drawRect(430,160,20,20); 
	c.drawRect(455,160,20,20);
	c.drawRect(480,160,20,20);
	c.drawRect(505,160,13,20);
	c.fillRect(400,320,50,60); 
	c.fillRect(360,190,25,35);
	c.fillRect(460,190,25,35);
	c.fillOval(400,290,50,60);
	//flag
	c.setColor(new Color(205,92, 92));
	c.fillRect(415,130,2,30); 
	c.setColor(new Color(255,165, 0));
	c.fillRect(414,126,4,4);
	c.setColor(Color.white);
	c.fillRect(417,129,20,15); 
	c.setColor(new Color(205,92, 92));
	c.fillStar(422,132,10,10);
	//Brick outline
	c.setColor(Color.black);
	c.drawRect(300,265,250,0);
	c.drawRect(300,280,250,0);
	c.drawRect(300,295,250,0);
	c.drawRect(300,310,250,0);
	c.drawRect(300,325,250,0);
	c.drawRect(300,340,250,0);
	c.drawRect(300,355,250,0);
	c.drawRect(300,370,250,0);
	c.drawRect(320,250,0,15);
	c.drawRect(345,250,0,15);
	c.drawRect(370,250,0,15);
	c.drawRect(395,250,0,15);
	c.drawRect(420,250,0,15);
	c.drawRect(455,250,0,15);
	c.drawRect(480,250,0,15);
	c.drawRect(505,250,0,15);
	c.drawRect(530,250,0,15);
	c.drawRect(320,280,0,15);
	c.drawRect(320,280,0,15);
	c.drawRect(345,280,0,15);
	c.drawRect(370,280,0,15);
	c.drawRect(395,280,0,15);
	c.drawRect(420,280,0,15);
	c.drawRect(455,280,0,15);
	c.drawRect(480,280,0,15);
	c.drawRect(505,280,0,15);
	c.drawRect(530,280,0,15);
	c.drawRect(320,310,0,15);
	c.drawRect(320,310,0,15);
	c.drawRect(345,310,0,15);
	c.drawRect(370,310,0,15);
	c.drawRect(395,310,0,15);
	c.drawRect(420,310,0,15);
	c.drawRect(455,310,0,15);
	c.drawRect(480,310,0,15);
	c.drawRect(505,310,0,15);
	c.drawRect(530,310,0,15);
	c.drawRect(320,340,0,15);
	c.drawRect(345,340,0,15);
	c.drawRect(370,340,0,15);
	c.drawRect(395,340,0,15);
	c.drawRect(420,340,0,15);
	c.drawRect(455,340,0,15);
	c.drawRect(480,340,0,15);
	c.drawRect(505,340,0,15);
	c.drawRect(530,340,0,15);
	c.drawRect(320,370,0,10);
	c.drawRect(345,370,0,10);
	c.drawRect(370,370,0,10);
	c.drawRect(395,370,0,10);
	c.drawRect(420,370,0,10);
	c.drawRect(455,370,0,10);
	c.drawRect(480,370,0,10);
	c.drawRect(505,370,0,10);
	c.drawRect(530,370,0,10);
	c.drawRect(300,265,0,15);
	c.drawRect(300,280,0,15);
	c.drawRect(300,265,15,15);
	c.drawRect(315,265,25,15);
	c.drawRect(340,265,25,15);
	c.drawRect(365,265,25,15);
	c.drawRect(390,265,25,15);
	c.drawRect(415,265,25,15);
	c.drawRect(440,265,25,15);
	c.drawRect(465,265,25,15);
	c.drawRect(490,265,25,15);
	c.drawRect(515,265,25,15);
	c.drawRect(300,295,15,15);
	c.drawRect(315,295,25,15);
	c.drawRect(340,295,25,15);
	c.drawRect(365,295,25,15);
	c.drawRect(390,295,25,15);
	c.drawRect(415,295,25,15);
	c.drawRect(440,295,25,15);
	c.drawRect(465,295,25,15);
	c.drawRect(490,295,25,15);
	c.drawRect(515,295,25,15);
	c.drawRect(300,325,15,15);
	c.drawRect(315,325,25,15);
	c.drawRect(340,325,25,15);
	c.drawRect(365,325,25,15);
	c.drawRect(390,325,25,15);
	c.drawRect(415,325,25,15);
	c.drawRect(440,325,25,15);
	c.drawRect(465,325,25,15);
	c.drawRect(490,325,25,15);
	c.drawRect(515,325,25,15);
	c.drawRect(300,355,15,15);
	c.drawRect(315,355,25,15);
	c.drawRect(340,355,25,15);
	c.drawRect(365,355,25,15);
	c.drawRect(390,355,25,15);
	c.drawRect(415,355,25,15);
	c.drawRect(440,355,25,15);
	c.drawRect(465,355,25,15);
	c.drawRect(490,355,25,15);
	c.drawRect(515,355,25,15);
	/*upper bricks*/
	c.drawRect(334,180,15,15);
	c.drawRect(349,180,30,15);
	c.drawRect(379,180,30,15);
	c.drawRect(409,180,30,15);
	c.drawRect(439,180,30,15);
	c.drawRect(469,180,30,15);
	c.drawRect(499,180,18,15);
	c.drawRect(334,210,15,15);
	c.drawRect(349,210,30,15);
	c.drawRect(379,210,30,15);
	c.drawRect(409,210,30,15);
	c.drawRect(439,210,30,15);
	c.drawRect(469,210,30,15);
	c.drawRect(499,210,18,15);
	c.drawRect(339,195,15,15);
	c.drawRect(354,195,30,15);
	c.drawRect(384,195,30,15);
	c.drawRect(414,195,30,15);
	c.drawRect(444,195,30,15);
	c.drawRect(474,195,30,15);
	c.drawRect(504,195,14,15);
	/* FLAG 2 */ 
	c.setColor(new Color(178,34, 34)); 
	c.fillRect(40,343,35,37);
	c.setColor(Color.black);
	c.drawRect(40,343,35,37);
	c.drawRect(47,351,20,20);
	c.setColor(new Color(46,139, 87));
	c.fillRect(55,20,10,323);
	c.fillOval(53,6,15,17); 
	c.setColor(Color.black);
	c.drawRect(55,20,10,323);
	c.drawOval(53,6,15,15); 
	c.drawLine(40,343,47,351);
	c.drawLine(75,343,67,351);
	c.drawLine(40,378,47,371);
	c.drawLine(75,378,67,371);
	c.setColor(Color.white);
	for (int y = 23; y<58; y++)
	 {
	 c.drawLine(54,y,1,40);
	 }
	c.setColor(Color.black); 
	 c.fillStar(33,30,15,15);
	 
	// Place your program here.  'c' is the output console
    } // main method
} // Rectangle class
