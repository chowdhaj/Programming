package tutorials.basic;

public class Conditionals {

	public static void main(String[] args) {
		
		// if (some expression that evaluates to true) then {do something}
		
		boolean sayHello = true;
		boolean sayHey = false;
		
		/*
		 * Only the first statement to evaluate to true gets executed
		 * If 'sayHello' is true then ONLY it is executed - same logic for 'sayHey'
		 * If 'sayHello' and 'sayHey' are FALSE, then NEITHER are executed and "GoodBye" is printed to console
		 */
		
		if (sayHello) {
			System.out.println("Hello");
		} else  if (sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("GoodBye");
		}
		
		// Conditional/relational operators are: >, <, >=, <=, !=, ==
		// Greater than, less than, greater than or equal to, less than or equal to, logical not, equals
		
		// if (x = 5) // This assigns 5 to 'x'
		// if (x == 5) // Test whether 'x' has the value 5 (It will either be true or false)
		
		// The AND operator is: && 
		// THe OR operator is: ||
				
		if (true && true) {
			System.out.println("AND Executed"); 
		}
		
		if (true || false) {
			System.out.println("OR Executed");
		}
		
		// Position of player
		int playerX = 50; 
		
		// If player is past the left side of the screen or if player is past the right side of the screen
		if (playerX < 0 || playerX > 800) {
			// Some code that reverse player's direction 
		}
		
		
	}
}
