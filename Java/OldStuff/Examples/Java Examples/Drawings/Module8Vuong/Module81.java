// The "Module81" class.
import java.awt.*;
import hsa.Console;

public class Module81
	/*
	*Module8 question1
	*ICS3U0-Computer Science
	*Date
	*Output: part of the downtown
	*/
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
	c = new Console ();
	int xPoint0[] = {0, 640, 640, 0};
	int yPoint0[] = {0, 0, 500, 500};
	c.setColor (new Color (105, 105, 105));
	c.fillPolygon (xPoint0, yPoint0, 4);

	c.setColor (new Color (238, 201, 0));
	c.drawStar (320, 200, 4, 4);
	c.fillStar (320, 200, 3, 3);
	c.drawStar (200, 200, 4, 4);
	c.fillStar (200, 200, 3, 3);
	c.drawStar (243, 123, 4, 4);
	c.fillStar (240, 120, 3, 3);
	c.drawStar (222, 111, 5, 5);
	c.fillStar (222, 111, 3, 3);
	c.drawStar (110, 40, 6, 6);
	c.fillStar (110, 40, 4, 4);
	c.drawStar (190, 50, 7, 7);
	c.fillStar (190, 50, 7, 7);
	c.drawStar (300, 15, 4, 4);
	c.fillStar (300, 15, 3, 3);
	c.drawStar (310, 70, 7, 7);
	c.fillStar (312, 72, 3, 3);
	c.drawStar (310, 190, 4, 4);
	c.fillStar (310, 190, 3, 3);
	c.drawStar (320, 230, 4, 4);
	c.fillStar (320, 230, 3, 3);
	c.drawStar (300, 240, 4, 4);
	c.fillStar (300, 240, 3, 3);
	c.drawStar (330, 300, 4, 4);
	c.fillStar (330, 300, 3, 3);
	c.drawStar (220, 230, 4, 4);
	c.fillStar (220, 230, 3, 3);
	c.drawStar (290, 200, 4, 4);
	c.fillStar (290, 200, 3, 3);
	c.drawStar (320, 340, 2, 2);
	c.fillStar (320, 340, 2, 2);
	c.drawStar (330, 350, 4, 4);
	c.fillStar (330, 350, 3, 3);
	c.drawStar (310, 295, 4, 4);
	c.fillStar (310, 295, 3, 3);
	c.drawStar (336, 370, 6, 6);
	c.drawStar (340, 380, 8, 8);
	c.drawStar (347, 400, 11, 11);
	c.drawStar (355, 420, 14, 14);
	c.drawStar (364, 440, 17, 17);
	c.drawStar (375, 460, 22, 22);

	int xPoint[] = {640, 504, 508, 640};
	int yPoint[] = {128, 219, 235, 153};
	c.setColor (new Color (104, 131, 139));
	c.drawPolygon (xPoint, yPoint, 4);
	c.fillPolygon (xPoint, yPoint, 4);

	int xPoint1[] = {640, 508, 545, 640};
	int yPoint1[] = {153, 235, 235, 181};
	c.setColor (new Color (69, 139, 131));
	c.drawPolygon (xPoint1, yPoint1, 4);
	c.fillPolygon (xPoint1, yPoint1, 4);

	int xPoint2[] = {640, 545, 545, 640};
	int yPoint2[] = {82, 165, 192, 128};
	c.setColor (new Color (104, 131, 139));
	c.drawPolygon (xPoint2, yPoint2, 4);
	c.fillPolygon (xPoint2, yPoint2, 4);

	int xPoint3[] = {640, 603, 603, 640};
	int yPoint3[] = {87, 119, 153, 128};
	c.setColor (Color.black);
	c.drawPolygon (xPoint3, yPoint3, 4);
	c.fillPolygon (xPoint3, yPoint3, 4);

	int xPoint4[] = {601, 547, 547, 601};
	int yPoint4[] = {121, 166, 190, 154};
	c.setColor (Color.black);
	c.drawPolygon (xPoint4, yPoint4, 4);
	c.fillPolygon (xPoint4, yPoint4, 4);

	c.drawLine (640, 87, 547, 166);

	int xPoint5[] = {640, 545, 545, 640};
	int yPoint5[] = {181, 235, 380, 409};
	c.setColor (new Color (69, 139, 116));
	c.drawPolygon (xPoint5, yPoint5, 4);
	c.fillPolygon (xPoint5, yPoint5, 4);

	int xPoint6[] = {640, 547, 547, 640};
	int yPoint6[] = {184, 237, 277, 244};
	c.setColor (new Color (83, 134, 139));
	c.drawPolygon (xPoint6, yPoint6, 4);
	c.fillPolygon (xPoint6, yPoint6, 4);

	int xPoint7[] = {640, 594, 594, 640};
	int yPoint7[] = {251, 268, 387, 400};
	c.setColor (Color.gray);
	c.drawPolygon (xPoint7, yPoint7, 4);
	c.fillPolygon (xPoint7, yPoint7, 4);

	int xPoint8[] = {589, 549, 549, 589};
	int yPoint8[] = {269, 282, 374, 385};
	c.setColor (Color.gray);
	c.drawPolygon (xPoint8, yPoint8, 4);
	c.fillPolygon (xPoint8, yPoint8, 4);

	int xPoint9[] = {545, 508, 508, 545};
	int yPoint9[] = {165, 165, 216, 192};
	c.setColor (new Color (0, 139, 139));
	c.drawPolygon (xPoint9, yPoint9, 4);
	c.fillPolygon (xPoint9, yPoint9, 4);

	c.setColor (new Color (0, 139, 139));
	c.drawRect (508, 235, 37, 145);
	c.fillRect (508, 235, 37, 145);
	c.setColor (new Color (83, 134, 139));
	c.drawLine (508, 277, 545, 277);

	int xPoint10[] = {508, 450, 450, 508};
	int yPoint10[] = {165, 190, 350, 380};
	c.setColor (new Color (83, 134, 139));
	c.drawPolygon (xPoint10, yPoint10, 4);
	c.fillPolygon (xPoint10, yPoint10, 4);

	int xPoint11[] = {450, 380, 380, 450};
	int yPoint11[] = {190, 190, 358, 350};
	c.setColor (new Color (0, 139, 139));
	c.drawPolygon (xPoint11, yPoint11, 4);
	c.fillPolygon (xPoint11, yPoint11, 4);

	c.setColor (new Color (83, 134, 139));
	c.drawLine (380, 270, 450, 270);

	int xPoint12[] = {380, 360, 360, 380};
	int yPoint12[] = {190, 220, 348, 358};
	c.setColor (new Color (83, 139, 139));
	c.drawPolygon (xPoint12, yPoint12, 4);
	c.fillPolygon (xPoint12, yPoint12, 4);

	c.setColor (new Color (0, 139, 139));
	c.drawLine (380, 270, 360, 279);

	int xPoint13[] = {640, 545, 508, 450, 380, 360, 335, 385, 640};
	int yPoint13[] = {82, 165, 165, 190, 190, 220, 220, 0, 0};
	c.setColor (new Color (104, 131, 139));
	c.drawPolygon (xPoint13, yPoint13, 9);
	c.fillPolygon (xPoint13, yPoint13, 9);

	c.setColor (new Color (0, 139, 139));
	c.drawLine (340, 220, 390, 0);
	c.drawLine (360, 220, 507, 0);

	int xPoint14[] = {385, 370, 330, 335};
	int yPoint14[] = {0, 0, 210, 220};
	c.setColor (new Color (83, 139, 139));
	c.drawPolygon (xPoint14, yPoint14, 4);
	c.fillPolygon (xPoint14, yPoint14, 4);

	int xPoint15[] = {360, 357, 620, 640, 640, 545, 508, 450, 380, 360};
	int yPoint15[] = {348, 350, 500, 500, 409, 380, 380, 350, 358, 348};
	c.setColor (new Color (139, 125, 125));
	c.drawPolygon (xPoint15, yPoint15, 10);
	c.fillPolygon (xPoint15, yPoint15, 10);

	c.setColor (new Color (131, 139, 139));
	c.drawLine (360, 348, 650, 500);
	c.drawLine (640, 420, 536, 440);
	c.drawLine (536, 440, 532, 450);

	int xPoint16[] = {300, 264, 0, 0, 149, 99, 99};
	int yPoint16[] = {350, 500, 500, 388, 350, 340, 335};
	c.setColor (new Color (139, 137, 137));
	c.drawPolygon (xPoint16, yPoint16, 7);
	c.fillPolygon (xPoint16, yPoint16, 7);

	c.setColor (new Color (139, 117, 0));
	c.drawLine (254, 500, 298, 350);
	c.drawLine (165, 500, 300, 330);
	c.drawLine (153, 500, 298, 330);
	c.drawLine (300, 330, 99, 330);
	c.drawLine (0, 358, 149, 335);
	c.drawLine (0, 360, 149, 336);
	c.drawLine (149, 335, 99, 332);
	c.drawLine (300, 349, 300, 330);
	c.drawLine (149, 350, 149, 335);

	int xPoint17[] = {33, 58, 132, 116};
	int yPoint17[] = {429, 430, 405, 404};
	c.setColor (new Color (139, 117, 0));
	c.drawPolygon (xPoint17, yPoint17, 4);
	c.fillPolygon (xPoint17, yPoint17, 4);

	int xPoint18[] = {198, 188, 231, 235};
	int yPoint18[] = {384, 383, 367, 367};
	c.setColor (new Color (139, 117, 0));
	c.drawPolygon (xPoint18, yPoint18, 4);
	c.fillPolygon (xPoint18, yPoint18, 4);

	int xPoint19[] = {99, 0, 0, 37, 149, 149, 99};
	int yPoint19[] = {355, 378, 0, 0, 100, 290, 300};
	c.setColor (new Color (139, 34, 82));
	c.drawPolygon (xPoint19, yPoint19, 7);
	c.fillPolygon (xPoint19, yPoint19, 7);

	int xPoint20[] = {140, 140, 0, 0, 25};
	int yPoint20[] = {100, 173, 78, 0, 0};
	c.setColor (new Color (159, 54, 38));
	c.drawPolygon (xPoint20, yPoint20, 5);
	c.fillPolygon (xPoint20, yPoint20, 5);

	int xPoint21[] = {140, 140, 0, 0};
	int yPoint21[] = {180, 252, 202, 91};
	c.setColor (new Color (159, 54, 38));
	c.drawPolygon (xPoint21, yPoint21, 4);
	c.fillPolygon (xPoint21, yPoint21, 4);

	int xPoint22[] = {145, 149, 99, 99};
	int yPoint22[] = {297, 290, 300, 307};
	c.setColor (new Color (139, 37, 0));
	c.drawPolygon (xPoint22, yPoint22, 4);
	c.fillPolygon (xPoint22, yPoint22, 4);

	// Place your program here.  'c' is the output console
    } // main method
} // Module81 class



