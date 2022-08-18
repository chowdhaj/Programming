/*
 * * * * *
 * NOTES *
 * * * * * 
 * Return statements allow you to get information back from methods
 * The keyword 'void' means that the method does not return information
 * You must specify what type of data will be returned. For example:
 *     public static int number() { // this returns an int }
 * Information is returned to the function that called it
 * After a return statement, you exit out of the method. Lines of code
 *     that are after a return statement do not get executed
 * Any data type can be returned. (i.e. int, String, boolean, etc.)
 */

package mikeDaneJavaTutorial;

// Return Statements 
public class Tutorial14ReturnStatements {

	public static void main(String[] args) {
		
		// Prints out the cube of 3 by calling the cube function
		System.out.println(cube(3));
		
		// Stores the cube of 3 in an int
		int myNum = cube(3);
		System.out.println(myNum); // Prints out int
		
		// Stores the return String data of the word function
		String returnString = word();
		System.out.println(returnString); // Prints out String
		
		// Stores the returned boolean value from the bool function
		boolean returnTrue = bool();
		System.out.println(returnTrue); // Prints it out
	}
	
	/**
	 * Calculates the cube of a number and returns it
	 * 
	 * @param numberToCube The number to be cubed
	 * @return The cubed number
	 */
	public static int cube(int numberToCube) {
		System.out.println("Top");
		return (numberToCube * numberToCube * numberToCube);
		//System.out.println("Bottom");
	    /*
	     * All code here will not be executed and will throw an error
	     * This is known as dead code OR unreachable code
	     * After a return statement, the function is no longer used
	     */
	}
	
	/**
	 * Returns a string demonstrating that any type of data
	 * can be returned
	 * 
	 * @return A String
	 */
	public static String word() {
		return ("This string is returned");
	}
	
	/**
	 * Returns the boolean value true
	 * 
	 * @return true
	 */
	public static boolean bool() {
		return true;
	}
}