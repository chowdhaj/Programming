/*
 * * * * *
 * NOTES *
 * * * * *
 * A package is a folder where similar Java files/code are stored
 * Files in the same package have a similar relationship/purpose
 * If you want to use classes from other packages, you need to import it
 * Packages enables you to structure and organize your code better, which
 *     allows for better code readability and maintainability.
 */

// Imports & Packages
package mikeDaneJavaTutorial;

import java.util.Scanner;
import mikeDaneJavaTutorial.tutorial32.Song;

public class Tutorial38ImportsAndPackages {

	public static void main(String[] args) {
		
		/*
		 * After importing the Scanner class, I can
		 * instantiate a Scanner object and use it
		 */
		Scanner key = new Scanner(System.in);
		key.close();
		
		/*
		 * After importing the Song class, I can instantiate
		 * it and use it. All of the code remains in the other
		 * package and I can use it anywhere and any time.
		 */
		Song moneyHeist = new Song("Bella Ciao", "Professor", 2400);
		System.out.println(moneyHeist.getTitle());
	}
}