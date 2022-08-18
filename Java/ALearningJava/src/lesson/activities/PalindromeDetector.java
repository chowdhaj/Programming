/* Challenge Activity 2 - Palindrome Detector.
 * 
 * Write a program which given a string input will detect whether that
 * string is a palindrome. see: https://en.wikipedia.org/wiki/Palindrome 
 * for details.
 * 
 * HINT: use the reverse method of StringBuilder to assist you.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter phrase : abba 
 *   That's a palindrome!
 * 
 *   Enter phrase : mike 
 *   That's not a palindrome!
 * 
 */

package lesson.activities; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class PalindromeDetector {

    public static void main(String[] args) {
    		
    	Scanner inputPalindrome = new Scanner(System.in); // Initialize the Scanner, and refer to it by 'inputPalindrome'
    	StringBuilder sb = new StringBuilder(); // Create a new object of type StringBuilder and call it 'sb'
    	
    	System.out.print("Enter Phrase: "); // Ask the user to input a phrase
    	String palindrome = inputPalindrome.nextLine(); // Variable type = String // Name = 'palindrome' // Assign whatever user inputs to it
    	
    	sb.append(palindrome); // Add 'palindrome' to 'sb' // 'sb' now holds a value equal to the String 'palindrome'
    	String checkPalindrome = sb.reverse().toString(); // Variable type = String // Name = 'checkPalindrome' // Holds 'sb' BUT reversed and converted to a string
    	
    	System.out.printf("That's a %s palindrome", (palindrome.equals(checkPalindrome))); // Print's out 'true' if 'palindrome' == 'checkPalindrome', and false if they don't
    	
    }
}

/*

You cannot use the 'equals' method like this:

palindrome.equals(sb)

This is because Java compares a String to an Object and returns false every time, even if you know that the input...
... really is a palindrome. For Java, String != Object, thus you need to convert 'sb' to a string type, and then compare

*/