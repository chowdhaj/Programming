/*
 * * * * *
 * NOTES *
 * * * * *
 * Strings are the most common data type
 * Strings store text
 * The backslash is a special character called the escape sequence
 *     \n : inserts a new line
 *     \" : creates quotes
 *     \\ : creates a backlash
 *     \t : inserts a tab
 * Long strings can be broken into multiple lines using the + operator
 * The String data type has methods that can modify the string or retrieve information
 *     See below for examples
 * The index of Strings start at 0; the first character's index is 0
 *     This is how most programming languages are
 * In Java, function and method are the same
 */

// WORKING WITH STRINGS //
package mikeDaneJavaTutorial;

public class Tutorial7Strings {

	public static void main(String[] args) {
		
		// The \n is a newline and adds an 'enter'
		System.out.println("\"Java\" Is\nEasy");
		
		// Even though the code is broken up into two lines, this will not affect console output
		System.out.println("This is a long line and "
				         + "I am breaking it up in code");
		
		// Creates a String variable called 'sentence'
		String sentence = "The quick brown fox jumped over the lazy dog";
		
		// Converts all letters to uppercase in the string
		System.out.println(sentence.toUpperCase()); 
		
		// Converts all letters to lowercase in the string
		System.out.println(sentence.toLowerCase());
		
		// Returns the length of the string
		/// How many characters are in the string
		System.out.println(sentence.length());
		
		// The contains method checks if the string contains the specified word
		System.out.println(sentence.contains("fox")); // Returns true because 'fox' is in the string
		System.out.println(sentence.contains("cat")); // Returns false because 'cat' is not in the string
		
		// Returns the character that is at the specified index
		System.out.println(sentence.charAt(1)); // Returns 'h'
		System.out.println(sentence.charAt(4)); // Returns 'q'
		
		// Finds the index of the specified String
		System.out.println(sentence.indexOf("brown")); // Returns 10 because that's where 'b' is 
		System.out.println(sentence.indexOf("ox")); // Returns 17 because that's where the first 'o' is
		
		// Returns the index of the last occurence of the string
		System.out.println(sentence.lastIndexOf("o")); // Returns 42 because that's where the last 'o' is
		
		// Returns a substring
		/// The substring begins at the beginning of the specified index
		//// The index specified is inclusive
		System.out.println(sentence.substring(10));
		
		// The substring returned starts at the first specified index and ends at the second specified index
		/// The first specified index is inclusive and the second is not
		System.out.println(sentence.substring(10, 19));
		
		// Returns the first word of the String
		System.out.println(sentence.substring(0, sentence.indexOf(" ")));
	}
}
