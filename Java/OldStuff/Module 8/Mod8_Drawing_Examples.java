// The "Draw_Rectangle" class.
import java.awt.*;
import hsa.Console;

public class Mod8_Drawing_Examples
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Custom color using RGB
	Color lime= new Color(128,255,0);
	c.setColor(lime);
	
	//create varible for font style(Monospaced/Ariel/Times etc) and size
	Font smallMonoFont= new Font("Times New Roman", Font.BOLD,18);
	c.setFont(smallMonoFont);
	c.drawString("Tiny", 200,200);
	
	//Various shapes
       c.drawRect(100,10,200,50);
      c.drawOval(100,10,200,50);
       c.drawOval(175,10,50,50);
       c.drawLine(10,10, 200,200);
	
      
       c.setColor(Color.pink);
	//Draw filled triangle
	//////////{x1, x2, x3}
       int[] xTri={0,100,200};
       ////////////{y1,y2,y3}
	int[] yTri={100,0,100};
	c.fillPolygon(xTri,yTri,3);
	
	     c.setColor(Color.gray);           
	//filled quadrilateral 
      int[]xQuad={200,320,300,220};
       int[]yQuad={20,40,10,50};
       c.fillPolygon(xQuad,yQuad,4);
       
       //roof top
       
       c.setColor(Color.black); 
	//////////{x1, x2, x3, x4}
	  int[] xRec={150,200,275,225};
       ////////////{y1,y2,y3,y4}
	int[] yRec={150,100,100,150};
	c.fillPolygon(xRec,yRec,4);
	
	// Place your program here.  'c' is the output console
    } // main method
} // Draw_Rectangle class
