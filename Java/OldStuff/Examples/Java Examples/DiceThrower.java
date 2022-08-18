import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
DiceThrower class
*/

public class DiceThrower extends Applet
{
/*
die1 and die2 are the two Die objects that will be displayed. These
objects are created in the `init' operation. die1 and die2 are 
stored as attributes of this class 
*/
Die die1;
Die die2;

/*
paint
As always, `paint' is called automatically whenever the display needs to 
be updated. In this case the applet only paints the text message
`Click mouse anywhere to throw dice again'. The real painting is done
by the `draw' operation in the Die class
*/
public void paint (Graphics g)
	{
	die1.draw(g);
	die2.draw(g);
	g.drawString ("Click mouse anywhere", 55, 140);
	g.drawString ("to throw dice again", 65, 160);
	}

/*
init
init is called automatically when the Applet is initialized by the Web browser
or applet viewer. In this case we create two Die objects. Their values are
stored as attributes of this class. We also create an object of class
DiceThrowerMouseListener which will detect when the user has clicked the
mouse on this applet.
*/
public void init()
	{
	die1 = new Die();
	die2 = new Die();
	
	/// QUESTION: what does `setTopLeftPosition' do, and why is it
	///  important here?

	die1.setTopLeftPosition(20, 20);
	die2.setTopLeftPosition(150, 20);

	// `throw' the dice so that they start off with random numbers showing  

	throwBothDice();

	// Create a DiceThrowerMouseListener object to handle mouse
	//  clicks. The `setDiceThrower' operation informs this 
	//  DiceThrowerMouseListener object of the object that it
	//  must activate when a mouse click occurs (i.e., this applet).
	//  The keyword `this' simply means `this object here'

	DiceThrowerMouseListener diceThrowerMouseListener = 
		new DiceThrowerMouseListener();
	diceThrowerMouseListener.setDiceThrower(this);
	addMouseListener(diceThrowerMouseListener);
	}

/*
throwBothDice
This operation calls the `throw' operation in each die object and then
calls `repaint' to cause the display to be updated. In effect, repaint()
leads to `paint' being called
*/
public void throwBothDice()
	{
	die1.throwDie();
	die2.throwDie();
	repaint();
	}
}


/*
Die class
The `Die' class is responsible for throwing the die (i.e., generating a random 
number between 1 and 6, and drawing the spots in the appropriate
places. 

For simplicity I assume that there are only 7 possible places where a `spot' can
be displayed, and I have numbered them from 0 to 6, as shown in the diagram below:

  0   1
  2 3 4
  5   6

So the number `1' is shown by drawing spot `3'. The number `2' is shown by
drawing spots `0' and `6'. The number `3' is spots `0', `3' and `6' and
so on. 
*/

class Die
{
/* Attributes of the Die class */

/// QUESTION: are these attributes `public' or `private'?

int topLeftX;
int topLeftY;

// numberShowing is the number visible on the Die at any given time.
//  `throwDie' operation sets this to a random number
int numberShowing = 6;

// The spot positions are specified as their X and Y co-ordinates.
//  Spot `0' is at position (0, 0); spot `1' is at (60, 0) etc.
final int spotPositionsX[] = {0, 60,  0, 30, 60,  0,  60}; 
final int spotPositionsY[] = {0,  0, 30, 30, 30,  60, 60}; 

/// QUESTION: what does this operation do?
public void setTopLeftPosition(final int _topLeftX, final int _topLeftY)
	{
	topLeftX = _topLeftX;
	topLeftY = _topLeftY;
	}

/* 
throwDie
Generates a new random number for the Die to display.
The random number is between 1 and 6
*/
public void throwDie()
	{
	/// QUESTION: why do we multiply by 6 and add 1?
	//  perhaps try a few other numbers and see what
	//  happens. You may need to look up what 
	//  range of values Math.random() returns
	numberShowing = (int)(Math.random() * 6 + 1);
	}

/*
draw
Draw the spots on the die, according to the value stored in the
attribute `numberShowing'
*/
public void draw(Graphics g)
	{
	/// QUESTION: why do we pass `g' to each drawSpot
	//  operation, as well as the spot number?

	switch(numberShowing)
		{
		case 1:
			drawSpot(g, 3);
			break;
		case 2:
			drawSpot(g, 0);
			drawSpot(g, 6);
			break;
		case 3:
			drawSpot(g, 0);
			drawSpot(g, 3);
			drawSpot(g, 6);
			break;
		case 4:
			drawSpot(g, 0);
			drawSpot(g, 1);
			drawSpot(g, 5);
			drawSpot(g, 6);
			break;
		case 5:
			drawSpot(g, 0);
			drawSpot(g, 1);
			drawSpot(g, 3);
			drawSpot(g, 5);
			drawSpot(g, 6);
			break;
		case 6:
			drawSpot(g, 0);
			drawSpot(g, 1);
			drawSpot(g, 2);
			drawSpot(g, 4);
			drawSpot(g, 5);
			drawSpot(g, 6);
			break;
		}
	}

/*
drawSpot
The drawSpot operation draws the specified spot. The numbering of the
spots is described above
*/

void drawSpot(Graphics g, final int spotNumber)
	{
	g.fillOval(topLeftX + spotPositionsX[spotNumber], 
		topLeftY + spotPositionsY[spotNumber], 20, 20);
	}

}

/*
DiceThrowerMouseListener class
This class has an operation called `mouseClicked' that is called
automatically whenever the user clicks the mouse over the
object that this object is associated with. In the definition
of the main applet (above) we call `addMouseListener' to make
this association. These issues will be described in more detail
in a later unit of this course.
*/

class DiceThrowerMouseListener extends MouseAdapter
{
DiceThrower diceThrower;

public void mouseClicked (MouseEvent e)
	{
	diceThrower.throwBothDice();
	}

public void setDiceThrower(DiceThrower _diceThrower)
	{
	diceThrower = _diceThrower;
	}

}


