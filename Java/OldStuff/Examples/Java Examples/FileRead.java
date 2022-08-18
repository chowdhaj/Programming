import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead
{
     // Create BufferedReader class instance
     public static InputStreamReader input         = new 
InputStreamReader(System.in);
     public static BufferedReader    keyboardInput = new 
BufferedReader(input);
     private static int numOfVouls                 = 0;

     public static void main(String[] args)
     {
	 int[] lengths = new int[100]; // Runtime error if the file contains a
	 // word of more than 100 characters
	 int longestWord = 0;
	 for(int i = 0; i < lengths.length; i++)
	 {
	     lengths[i] = 0;
	 }
	 try {
	     System.out.println("Enter the name of the file you wish to read: ");
	     String fileName         = keyboardInput.readLine();
	     FileReader file         = new FileReader(new File(fileName));
	     BufferedReader myFile   = new BufferedReader(file);
	     int numWords = 0;
	     int numChar= 0;
	     String line;

	     while ((line = myFile.readLine()) != null )
	     {
		 String[] words = line.split(" ");
		 numWords = numWords + words.length;
		 //
		 // Get number of vowels
		 vowelCount(line);

		 for (int i = 0; i < words.length;i++)
		 {
		     numChar = numChar + words[i].length();
		     if(words[i].length() > longestWord)
		     {
			 longestWord = words[i].length();
		     }
		     lengths[words[i].length()] = 
lengths[words[i].length()] + 1;
		 }
	     }
	     System.out.println("\nThere are " + numWords + " words in the text file");
	     System.out.println("\nThere are " + numOfVouls + " vowels in the text file");
	     System.out.println("\nThere are " + numChar + " characters in the text file");
	     System.out.println("\nThere length frequency of the words is as follows:");
	     System.out.println("\nLength   :  Frequency ");

	     for(int i = 0; i <= longestWord; i++)
	     {
		 // Print frequencies only up to the longest word
		 System.out.println(i + "     :"+lengths[i]);
	     }

	     myFile.close();
	 }
	 catch(IOException iO)
	 {
	     iO.printStackTrace();
	 }
     }
     //Seach for and count number of Vowels
     public static void vowelCount(String target)
     {
	 String key = "AEIOU";;
	 target = target.toUpperCase();

	 for (int i = 0; i < 5; i++)
	 {
	     int lastpos = 0;
	     while (lastpos > -1)
	     {
		 lastpos = target.indexOf( key.charAt(i), lastpos);
		 if (lastpos > -1)
		 {
		     lastpos += 1;
		     numOfVouls += 1;
		 }

	     }

	 }
     }
} 
