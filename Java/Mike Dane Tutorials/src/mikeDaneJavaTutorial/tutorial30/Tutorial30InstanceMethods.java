/*
 * * * * *
 * NOTES *
 * * * * * 
 * Class methods are methods that you can put inside a Java class,
 *     and they can help that class become more powerful, and
 *     perform specific functions
 * The 'this' variable refers to the Object's attributes
 * You can create as many methods as you want inside a class
 */

// Object & Instance Methods
package mikeDaneJavaTutorial.tutorial30;

public class Tutorial30InstanceMethods {
	
	public static void main(String[] args) {
		
		// Creates a new Student Object
		Student myStudent = new Student("Mike", "Computer Science", 3.5);
		
		// Prints out whether student is on honor roll or not
		System.out.println(myStudent.isOnHonorRoll());
	}
}