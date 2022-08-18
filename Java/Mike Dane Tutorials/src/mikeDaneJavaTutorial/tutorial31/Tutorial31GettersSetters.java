/*
 * * * * *
 * NOTES *
 * * * * * 
 * Getters and Setters are certain methods inside classes which allows
 *     us to control how other programs access and interact with those
 *     classes
 * Getters/Setters are like middle-men between the person creating the
 *     object and the object itself
 * Getters/Setters allow you to enforce certain rules on what kind of
 *     data the Object is allowed to have
 * Setter methods always start with the word 'set'. For example:
 *     setRating()
 *     setTitle()
 *     setAuthor()
 * Getter methods should always start with the word 'get'. For example:
 *     getRating()
 *     getTitle()
 *     getAuthor()
 * An Object's attributes should be set to private. This way, the attribute
 *     can only be accessed by the movie class, and all other classes
 *     must use the Getters and Setters to access or change the attribute's
 *     value
 * All attributes should be private and have their respective Getter and
 *     Setter functions, if needed
 * You can use the Setter functions inside the constructor method, and 
 *     increase the restrictions on what type of information the Object
 *     can have
 */

// Getters & Setters
package mikeDaneJavaTutorial.tutorial31;

public class Tutorial31GettersSetters {
	
	public static void main(String[] args) {
		
		// Creates a Movie Object
		Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R");
		
		System.out.println(movie1.getRating());
		movie1.setRating("dog"); // Sets movie1 ratings to 'dog' (Invalid)
		System.out.println(movie1.getRating()); // Prints 'NR'
		movie1.setRating("g"); // Sets movie1 ratings to 'g'
		System.out.println(movie1.getRating());
		
		System.out.println(); // New line
		
		// Prints movie2 information, changes the data, then prints it again
		movie2.printInformation(); 
		movie2.setTitle("The Dark Knight");
		movie2.setDirector("Christopher Nolan");
		movie2.setRating("PG-13");
		System.out.println(); // New line
		movie2.printInformation();		
	}
}