// Zorx demo program Displays Zorx in an applet window
import java.applet.*;
import java.awt.*;
public class ZorxDemo extends Applet
{
    public void paint (Graphics g)
    {
	int x;
	Zorx.show (g); // Show Zorx
	for (x = 1 ; x <= 50000000 ; x++) // pause for a few seconds
	{
	}
	Zorx.move (200, 100, g, getBackground ()); // Move Zorx to the right
    }
}
