// The "Ex" class.
import java.awt.*;
import hsa.Console;

public class UpperCase_RemoveVowels
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	String x, word, newWord;
	final String VOWELS = "aeiouAEIOU";
	x = "kkkkk";

	//change text to uppercase
	c.println (x.toUpperCase ());

	c.println ("Enter a series of words one to a line, end with *");

	while (true)
	{
	    word = c.readLine ();
	    if (word.equals ("*"))
	   { c.close();
		break;
		}
	    newWord = "";
	    for (int i = 0 ; i < word.length () ; i++)
	    {
		if (VOWELS.indexOf(word.charAt (i)) == -1)
		{
		    newWord = newWord + word.charAt (i);
		}
	    }
	    c.println ("Word without vowels is " + newWord);
	}


	// Place your program here.  'c' is the output console
    } // main method
} // Ex class
