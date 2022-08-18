/*
 * * * * *
 * NOTES *
 * * * * * 
 * A Static method can be accessed inside of a class without creating
 *     an instance of that class
 * Static methods can be accessed anywhere
 * The Math class in Java consists of Static methods
 * Classes can also store static attributes like scientific constants
 */

// Static Class Methods
package mikeDaneJavaTutorial;

public class Tutorial33StaticClassMethods {
	
	public static void main(String[] args) {
		
		/*
		 * Calling the static methods in this class
		 * Notice how the class did not have to be instantiated:
		 *     Tutorial33StaticClassMethods class = new Tutorial33StaticClassMethods();
		 * 'Static' means that you do not have to instantiate the class to use it's
		 *     methods or attributes
		 */
		Tutorial33StaticClassMethods.sayHi();
		Tutorial33StaticClassMethods.sayGoodBye();
		
		// Methods can also be called like this:
		sayHi();
		sayGoodBye();
	}
	
	/**
	 * Prints a greeting
	 */
	public static void sayHi() {
		
		System.out.println("Hello!");
	}
	
	/**
	 * Prints a farewell
	 */
	public static void sayGoodBye() {
		
		System.out.println("Good Bye!");
	}
}