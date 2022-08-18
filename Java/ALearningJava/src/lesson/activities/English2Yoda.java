/** Challenge Activity 3 - Simple English to Yoda translator.
 * 
 * This activity will translate an English sentence (of up to 4 words) into
 * Yoda-Speak https://en.wikipedia.org/wiki/Yoda 
 * 
 * The rules behind Yoda-Speak are complicated so in this version we've 
 * simplified them to these 4 cases:
 * 1 word sentence = same
 * 2 word sentence = swap words
 * 3 word sentence = place last word in the beginning of the sentence
 * 4 work sentence = exchange the first two words with the last two words
 * 
 * Your goal is to implement the English2Yoda() method in this program by taking 
 * the array of words and placing them in the proper order depending on the
 * number of words in the sentence.
 * 
 * SAMPLE RUN:
 * 
 * ---=== English-Yoda Translator 1.0 ===---
 * This will translate any English sentence of up to 4 words into Yoda-Speak.
 * Press type 'yoda' to quit
 * English : hi
 * Yoda    : hi
 * English : eat cheese
 * Yoda    : cheese eat 
 * English : you are stubborn
 * Yoda    : stubborn you are
 * English : you must try harder
 * Yoda    : try harder you must
 * English : yoda
 * 
 */
package lesson.activities; // Location of our class file

import java.util.Scanner; // Imports the Scanner class
import java.util.Arrays; // Imports the Arrays class

public class English2Yoda {

    public static void main(String[] args) {
    	
       Scanner input = new Scanner(System.in); // Instantiates the Scaner
       System.out.print("---=== English-Yoda Translator 1.0 ===---\n"); // Prints text to console
       System.out.print("This will translate any English sentence of up to 4 words into Yoda-Speak.\n"); // Prints text to console
       System.out.print("Press type 'yoda' to quit\n"); // Prints text to console
       while (true) { // While loop executes the following statements:
           System.out.print ("English : "); // Prints text to console
           String english = input.nextLine(); // 'english' gets whatever value the user inputs
           if (english.equals("yoda")) { // If user types in 'english' then break out of the while loop
        	   System.out.println("\nMay The Force Be With You, Comrade");
        	   break;
           } 
           String yoda = English2Yoda(english); // 'yoda' gets 'english' after it is passed through the 'English2Yoda' method
           System.out.printf("Yoda    : %s\n", yoda); // Prints text to console
       }
    }
    
    /**
     * Parses a sentence into an array of words
     * @param sentence the string sentence to parse
     * @return an array of words (in the sentence)
     */
    public static String[] GetWords(String sentence) {
        return sentence.split("[ ]+");
    }
    
    /**
     * Combines the words back into a sentence
     * @param words an array of strings
     * @return those strings, in order as once sentence.
     */
    public static String CombineWords(String[] words) {
        String sentence = "";
        for (String w : words) {
            sentence += w + " ";
        }
        return sentence;
    }
     
    /**
     * Translates from english to yoda
     * @param english a string sentence in english
     * @return the same sentence translated into yoda
     */
    public static String English2Yoda(String english) {
        String[] words = GetWords(english); // Parses the sentence stored in 'english' and puts it in the array 'words'
        String yoda = ""; // Initializes the String 'yoda'
        
        if (words.length == 1) { // If the length of 'word' is 1 then:
        	yoda = words[0]; // Yoda gets the 0th element in 'word'
        } else if (words.length == 2) { // If the length of 'word is 2 then:
        	for (int i = 1; i >= 0; i--) { // Yoda gets 'word' backwards
        		yoda += words[i] + " ";
        	}
        } else if (words.length == 3) { // If the length of 'word' is 3 then: 
        	yoda = words[2] + " " + words[0] + " " + words[1]; // Yoda gets the 2th element in 'word', then 0th, and finally 1st
        } else if (words.length == 4 ) { // If the length of 'word' is 4 then:
        	yoda = words[2] + " " + words[3] + " " + words[0] + " " + words[1]; // Yoda gets the 2th element, then 3rd, then 0th, and finally 1st
        } else { // If the length of 'word' is not 1 or 2 or 3 or 4, then print the following:
        	yoda = "ERROR: COULD NOT TRANSLATE"; 
        }        
        return yoda; // Returns 'yoda'
    }
}
