/*
 * * * * *
 * NOTES *
 * * * * * 
 * Interface inheritance is a special type of inheritance where you can
 *     define a template for a category of classes called an Interface, 
 *     and then implement that Interface in specific instances
 * Interfaces are templates for other classes
 * With Interfaces you can have a group of classes that are all related
 * You should use an interface when your classes fall into the same
 *     category and will have the same functions
 */

// Interface Inheritance (Implements)
package mikeDaneJavaTutorial.tutorial35;

public class Tutorial35Interface {
	
	public static void main(String[] args) {
		
		// Creates an array of Animal Objects
		Animal animals[] = {
				
				/*
				 * Since Cow, Dog, and Bird are all sub classes of
				 * the Animal class, technically they are classified
				 * as Animal Objects by java. This is why the Animal
				 * array can have Cow, Dog, and Bird as its elements
				 */
				new Cow(),
				new Dog(),
				new Bird()
		};
		
		// Iterates through the array of Animals and calls their methods
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak(); // calls speak method
			animals[i].eat(); // calls eat method
			System.out.println(); // prints new line
		}
	}
}