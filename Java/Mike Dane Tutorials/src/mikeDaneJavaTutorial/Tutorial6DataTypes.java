/*
 * * * * *
 * NOTES *
 * * * * *
 * A data type is data that we can work with inside Java
 * With data types we can represent different types of information
 * Variables allow us to store different pieces of data
 * Different variables can hold different data types
 * The 'String' data type stores textual information
 *     i.e. String phrase = "To be or not to be";
 *     i.e. String hi = "Hello";
 * In Java there are two different types of numbers:
 *     1. Integers / Counting Numbers / Whole Numbers
 *        i.e. 1, 2, 3, 4, 5, -6, -12, -20, etc.
 *     2. Floating Point / Decimals
 *        i.e. 1.1, 2.2, 4.23232, 334.343414, etc.
 * There are two data types for creating floating point numbers:
 *     1. floats
 *     2. doubles
 * The character data type stores a single character
 *     i.e. char grade = 'B';
 *     Note: 'char' requires the use of SINGLE quotation marks
 * Booleans are used to represent true and false values
 *     i.e. boolean isMale = true;
 *     i.e. boolean knowsJava = true;
 *     You can only store true or false inside a Boolean
 */

// DATA TYPES // 
package mikeDaneJavaTutorial;

public class Tutorial6DataTypes {
	
	public static void main(String[] args) {
	
		// Creates a "String" variable called "phrase" and stores the expression: "To be or not to be"
		String phrase = "To be or not to be";
		System.out.println(phrase); // Prints the value that "phrase" holds
		
		// Creates an 'int' variable called age and stores the value 21
		int age = 21;
		System.out.println(age); // Prints the value that 'age' holds
		
		// Creates a 'double' variable called 'gpa' and stores the value 9000.9
		double gpa = 9000.9;
		System.out.println(gpa); // Prints the value that 'gpa' holds
		
		// Creates a 'char' variable called 'grade' and stores the character 'A'
		char grade = 'A';
		System.out.println(grade); // Prints the character that 'grade' holds
		
		// Creates a 'boolean' variable called 'isMale' and stores the value 'true'
		boolean isMale = true;
		System.out.println(isMale); // Prints the value of 'isMale'
		
		// The 'char' data type can directly be printed to console
		System.out.println('A');
		
		// The 'double' data type can be directly printed
		System.out.println(42.42);
		
		// The "String" data type can be directly printed
		System.out.println("WOW, NOICE!");
	}
}
