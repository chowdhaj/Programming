/*
 * * * * *
 * NOTES *
 * * * * *
 * A method is a block of code that can be repeated many times
 * A method performs a specific task/function
 * When methods are called, all the code inside of it is executed
 * Methods are also referred to as functions
 * The 'main' method is special because it is the first block 
 *     of code that runs when a program is started
 * This is the basic skeleton for a method:
 *     public static void methodName) { // Code }
 * When a function is called, Java jumps to the function's code 
 *     and executes it
 * Functions/methods can take parameters; a piece of information 
 *     you give to it
 * If you have a piece of code that does the same thing over again, 
 *     it is good practice to put it inside a method
 */

// METHODS //
package mikeDaneJavaTutorial;

public class Tutorial13Methods {

	// The main method is the first method that is executed in a Java program
	public static void main(String[] args) {
		
		// First line of code
		System.out.println("Top");
		
		/*
		 * The method 'sayHi' is called three times
		 * It is sandwiched between the two other print statements
		 */
		sayHi();
		sayHi();
		sayHi();
		
		// This is executed after the method above
		System.out.println("Bottom\n");
		
		/*
		 * Methods can take in information such as variables
		 * Different information can be passed each time
		 * The following method takes in a String, and an Integer
		 */
		sayHiTo("Linda", 45);
		sayHiTo("Billy", 12);
		sayHiTo("David", 25);
	}
	
	/**
	 * Prints a greeting message
	 */
	public static void sayHi() {
		System.out.println("Hello, Dude");
	}
	
	/**
	 * Prints a greeting message to a person and prints their age
	 * 
	 * @param name The name of the person 
	 * @param age The age of the person
	 */
	public static void sayHiTo(String name, int age) {
		System.out.println("Hello " + name + ". You are " + 
	                       age + " years old.");
	}	
}