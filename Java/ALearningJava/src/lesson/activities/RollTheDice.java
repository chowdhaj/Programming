/* Challenge Activity 2 - Roll the dice!
 * 
 * In this activity, you will simulate the roll of 2 six-sided dice.
 * 
 * Complete the functions given to solve the problem of rolling 1 six-sided die, 
 * generating a random number between 1 and 6. 
 * Then call the function twice to roll the dice!
 * 
 * In addition, you should check for and detect "doubles" 
 * (when the same number comes up on each die)
 * 
 * SAMPLE RUNS(3 executions)
 *
 *  Dice Roll : 2,6; total==8 
 *  Dice Roll : 1,1; doubles total==2
 *  Dice Roll : 5,2; total==7
 */

package lesson.activities; // Location of our class file

import java.util.Random; // Imports the Random class from the Java library

public class RollTheDice {

    public static void main(String[] args) {
    	
    	int rollOne = roll(); // Creates a variable of type int called 'rollOne' and assigns it a value by calling the 'roll()' method
    	int rollTwo = roll(); // Creates a variable of type int, refers to it by 'rollTwo', and assigns it a value by calling 'roll()'
    	boolean doublesIsTrue = doubles(rollOne, rollTwo); // Variable type = boolean // Name = 'doublesIsTrue' // Holds value (true or false) returned by 'doubles()' method
    	int diceTotal = total(rollOne, rollTwo); // Variable type = int // Name = 'diceTotal' // Assigned value based off return of 'total()' method - returns the sum of 'rollOne' and 'rollTwo'
    	
    	System.out.printf("Dice Roll: %d,%d; %s == %d", rollOne, rollTwo, // Prints out dice roll numbers, if they were doubles, and the sum of the dice roll numbers
    			((doublesIsTrue == true) ? "Doubles Total" : "Total"), diceTotal); // Evaluates if dice roll numbers are doubles by the ternary operator by checking boolean 'doublesIsTrue'
    }
    
    /**
     * Simulate a six-sided dice roll by generating a random number
     * between 1 and 6 and returning its value.
     * @return an integer value between 1 and 6 
     */
    // This is the 'roll()' method and returns a pseudo random number between 1 - 6
    public static int roll() {
    	Random rnd = new Random(); // Creates a new object of type random called 'rnd'
        return rnd.nextInt(6) + 1;
    }
    
    /**
     * This function returns true when both dice d1 and d2 are the same
     * @param d1 the value of the first die
     * @param d2 the value of the second die
     * @return true/false based on whether d1 equals d2
     */
   // This is the 'doubles()' method and returns true if the rolls are the same, and false if they are different
    public static boolean doubles(int d1, int d2) {
    	boolean doubleisTrue = ((d1 == d2) ? true : false); // Using the ternary operator, checks if d1 == d2 and assigns true to variable if d1 == d1, else false
        return doubleisTrue;
    }
    
    /**
     * This function returns the total values of d1 and d2
     * @param d1 the value of the first die
     * @param d2 the value of the second die
     * @return total value of the dice
     */
    // This is the 'total()' method and returns the sum of the dice rolls
    public static int total(int d1, int d2) {
        return d1 + d2;
    }
}
