// The "CountChar_CompareStrings" class.
import java.awt.*;
import hsa.Console;

public class CountChar_CompareStrings
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String word;
	c.print("Enter your sentence: " );
	word= c.readLine(); 
	int count =0, index =0, where;
	char ch;
	c.println("");
	c.print("Enter a letter: ");
	ch=c.readChar();
	
	for(;;)
	{
	where=word.indexOf((int)ch, index);
	if(where!=-1)
	{
	count++;
	index=where+1;
	}
	else
	break;
	}c.println("There are " + count + " occurrences of " + ch + " in the word " + word);
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // CountChar_CompareStrings class
