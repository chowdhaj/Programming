/*
 * * * * * 
 * NOTES *
 * * * * * 
 * The main method is important because it is the first piece of
 *     code that is executed when you run the Java program.
 * The 'static' keyword allows you to access variables and methods
 *     without having to instantiate the class
 */

// Main & Non-Static Methods
package mikeDaneJavaTutorial;

public class Tutorial37MethodsCont {
	
	public static void main(String[] args) {
	
		// Calling a static method
		sayHiStatic("Bob");
		
		//sayHiNonStatic("Billy"); // This won't work
		
		// Instantiating the class
		Tutorial37MethodsCont app = new Tutorial37MethodsCont();
		
		// Calling the non static method
		app.sayHiNonStatic("billy"); 
	}
	
	/**
	 * Non-Static method that says Hi. You must instantiate the class
	 * in order to use this method.
	 * 
	 * @param name The name of the person to say Hi to
	 */
	public void sayHiNonStatic(String name) {
		System.out.println("Hi" + name);
	}
	
	/**
	 * Static method to say Hi. Does not require you to
	 * instantiate the class to use it.
	 * 
	 * @param name The name of the person to say Hi to
	 */
	public static void sayHiStatic(String name) {
		System.out.println("Hi " + name); 
	}
}