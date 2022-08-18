/*
 * * * * *
 * NOTES *
 * * * * * 
 * A constructor is a special method we can put inside of a class,
 *     which will allow us to give that class information when
 *     we create it
 * Putting information inside a constructor automatically populates
 *     the object's attributes
 * The information goes inside the brackets
 * A constructor is also referred to as an initialize method or an
 *     init method
 * A constructor gives the object some default information when it
 *     is created
 * Every time you create a new object, the constructor method is 
 *     called
 * The keyword 'this' refers to the attributes of the object
 * The information passed in the constructor gets assigned to the
 *     attributes of the object
 * The benefit of constructors is that it allows you to give objects
 *     default information, which saves you a lot of space and time
 */

// Constructors
package mikeDaneJavaTutorial.tutorial28;

public class Tutorial28Constructors {
	
	public static void main(String[] args) {
		
		// Creates a new Book object with the constructors:
		Book book1 = new Book("Harry Potter", "JK Rowling", 500, "English");
		
		// Creates a new Book object with the constructors:
		Book book2 = new Book("The 4 Hour Work Week", "Tim Ferris", 
				               300, "English");
		
		System.out.println(book1.title); // prints title of book 1
		System.out.println(book2.author); // prints author of book 2
	}
}