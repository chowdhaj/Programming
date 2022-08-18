/* Challenge Activity 3

This challenge activity should ask for the following inputs:
- a basketball player's name
- average points per game
- height in inches

and then display the player name, average points per game, 
and height in FT and inches. Program should also use proper pronoun he/she [there are ONLY 2 genders]

There are 12 inches in 1 FT. so 75 inches is 6ft 3 inches

 */
package lesson.activities; // Location of our 'BasketBallPlayer' class

import java.util.Scanner; // Import the Scanner class

class BasketballPlayer {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in); // Initialize the Scanner
    	
    	System.out.print("Basketball Player's Name? ===> "); // Ask user for player's name
    	String name = input.nextLine(); // Store input received from user into 'name'
    	
    	System.out.printf("Is %s a male? (true/false) ===> ", name); // Ask for gender of player
    	boolean isMale = input.nextBoolean(); // Store response (true/false) in boolean named 'male'- For using proper pronoun
    	
    	System.out.printf("How many points does %s score per game? ===> ", (isMale ? "he" : "she")); // Ask for points scored by player
    	int points = input.nextInt(); // Store points in a variable of type int called 'points'
    	
    	System.out.printf("What is %s height in INCHES? ===> ", (isMale ? "his" : "her")); // Ask for height of player
    	int height = input.nextInt(); // Store height of player in a variable called 'height' of type int
    	
    	int heightInFeet = height / 12; // Divides height by 12 to get height of player in FEET
    	int remainingInches = height % 12; // Finds the remainder of height divided by 12 to get remaining height of player in INCHES
    	
    	// This outputs all information in a nicely formatted String
    	System.out.printf("%s scores an average of %d %s per game. %s is %dft %d inches - which is %s tall.", // %s = String, %d = int
    			name, points, ((points > 1) ? "points" : "point"), // Checks to see if the variable 'points' is greater than 1, if so then use "points", if not, use "point"
    			(isMale ? "He" : "She"), // Checks if Basketball player is girl or guy 
    			heightInFeet, remainingInches, 
    			((height > 72) ? "pretty damn" : "not that")); // If height is greater than 72, then height is "pretty damn tall", otherwise it is "not that tall"

    }
}

/*/ 
 * Remember this well: JAVA ALWAYS ROUNDS DOWN!!!
 * And because it always rounds down, we can divide height in inches by 12 to get height in feet, and then...
 * ... use modulo to find the remaining height in inches
 * 
 * In order to use the ternary operator in 'syso' you must use 'printf', and place a %s where parameters go and supply an argument at the end. For example:
 * boolean isMale = true;
 * System.out.printf("I am a %s", (isMale ? "guy" : "girl"));
/*/
