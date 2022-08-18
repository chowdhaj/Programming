/* Challenge Activity 3 - Basketball Player Stats

This challenge activitiy should ask for the following inputs:
- a basketball player's name and the following "stats" (all integers)
- total free throws made / attempted
- total field goals made / attempted

and then display the player's "Stats"

player name, total points, free throw pct, field goal pct

For example:

Enter player's name: Tony
Free throws attempted: 4
Free throws made: 3
Field goals attempted: 10
Field goals made: 5

Tony's stats:
Points: 13 
FT %: 0.75
FG %: 0.50

 */

package lesson.activities; // Location of our 'BasketballPlayerStats' class file 

import java.util.Scanner; // Import Scanner class

public class BasketballPlayerStats {

	// This is the main method
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in); // Initialize Scanner // Name = 'input'
    	
    	System.out.print(" Enter Name: "); // Ask for Player's name
    	String name = input.nextLine(); // Assign input received from user to 'name'
    	
    	System.out.print(" Free Throws Attempted: "); // Ask for free throws attempted
    	int freeThrowsAttempted = input.nextInt(); // Store value provided in an int called 'freeThrowsAttempted'
    	
    	System.out.print(" Free Throws Made: "); // Ask for free throws made
    	int freeThrowsMade = input.nextInt(); // Store value received from user into an int called 'freeThrowsMade'
    	
    	System.out.print(" Field Goals Attempted: "); // Ask for field goals attempted
    	int fieldGoalsAttempted = input.nextInt(); // Store value provided in an int called 'fieldGoalsAttempted'
    	
    	System.out.print(" Field Goals Made: "); // Ask for field goals made
    	int fieldGoalsMade = input.nextInt(); // Store value received from user in an int called 'fieldGoalsMade'
    	
    	int points = freeThrowsMade + fieldGoalsAttempted; // Declare an int called points and store 'freeThrowsMade' + 'fieldGoalsAttempted' in it
    	
    	// This is an example of explicit type casting // We tell Java to convert 'freeThrowsAttempted' from an int to a double
    	double FT = freeThrowsMade / (double) freeThrowsAttempted; // Initialize a variable of type double called 'FT' and store 'freeThrowsMade' / 'freeThrowsAttempted'
    	
    	// This is implicit type casting // Java knows to convert 'fieldGoalsAttempted' to a double when it divides it by a double (1.0)
    	double FG = fieldGoalsMade / (fieldGoalsAttempted * 1.0); // Create a variable called 'FG' of type double and store 'fieldGoalsMade' / 'fieldGoalsAttempted'
    	
    	// Print out player's stats to console in a nice format [doubles are rounded to two decimal places (%3.2f), and points are added appropriately]
    	System.out.printf("\n %s's Stats\n -------------\n Points: %d\n FT %%: %3.2f\n FG %%: %3.2f\n", name, points, FT, FG);
    	
    }
    
}

/*

Points = Free throws made + Field goals attempted
FT % = Free throws made / Free throws attempted 
FG % = Field goals made / Field goals attempted

*/