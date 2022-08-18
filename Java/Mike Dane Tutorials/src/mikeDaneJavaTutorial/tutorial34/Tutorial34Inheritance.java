/*
 * * * * *
 * NOTES *
 * * * * * 
 * Inheritance allows you to extend the functionality of one class
 *     into another class
 * When a Java class inherits another Java class, it gets all the 
 *     functionalities of that class (i.e. Methods)
 * The 'extends' keyword is used for inheritance
 * You can override some methods when inheriting. This changes the 
 *     behavior of the original method
 * Add '@Override' above the method to indicate that it is being
 *     overridden
 * If you are reusing methods from classes, you should use inheritance
 */

// Inheritance (Extends)
package mikeDaneJavaTutorial.tutorial34;

public class Tutorial34Inheritance {
	
	public static void main(String[] args) {
		
		// Creates a Chef Object and calls all of its methods
		Chef normalChef = new Chef();
		normalChef.makeChicken();
		normalChef.makeSalad();
		normalChef.makeSpecialDish();
		
		System.out.println(); // new line
		
		// Creates an Italian Chef object and calls its methods
		ItalianChef italian = new ItalianChef();
		italian.makeChicken(); // This is from the 'Chef' Class
		italian.makeSpecialDish(); // This method is overridden
		italian.makePasta(); // This method is exclusive to the Italian Chef
		
		System.out.println(); // new line
		
		// Creates a Chinese Chef object and calls its methods
		ChineseChef chinese = new ChineseChef();
		chinese.makeSalad(); // This is from the 'Chef' Class
		chinese.makeSpecialDish(); // This method is overridden
		chinese.makeFriedRice(); // This method is exclusive to the Chinese Chef
	}
}