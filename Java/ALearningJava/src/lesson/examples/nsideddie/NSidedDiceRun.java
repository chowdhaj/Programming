package lesson.examples.nsideddie; // Location of our class file

import lesson.examples.nsideddie.Die; // Imports the 'Die' class so we create a die

public class NSidedDiceRun {

    public static void main(String[] args) {
    	
        Die d6 = new Die(6); // Creates a new object of type Die // Name = 'd6' // Has 6 sides
        Die d12 = new Die(12); // Creates a new object of type Die // Name = 'd12' // Has 12 sides
        Die skullCrusher = new Die(20); // Creates a new object of type Die // Name = 'skullCrusher' // Is a 20 sided die
       
        System.out.printf("Rolling %d Sided Die: %d\n",d6.getSides(), d6.roll()); // Prints out how many sides (6) the die has and what number it rolled
        //System.out.printf("Rolling %d Sided Die: %d\n",d12.getSides(), d12.roll()); // Prints out how many sides (12) the die has and what number it rolled
        System.out.printf("Rolling %d Sided Die: %d\n"
                ,skullCrusher.getSides(), skullCrusher.roll()); // Prints out how many sides (20) the die has and what number it rolled to console
        
    }
}

/*/

										GENERAL NOTES
 
 This is how you create a new die that has 8 sides, manipulate it's variables, and return them
 
 die d8 = new Die(8); // The 'd8' is the name of the die and the 8 in brackets dictates how many sides the die has
 
 die d8 = new Die(8, 1); // Does the same as above, but gives it a seed of 1 to generate the same number for testing purposes
 
 d8.getSides(); // Retrieves how many sides the die has // In this case it is 8
 
 d8.setSides(20); // Sets the number of sides the dice has // 20 in this case
 
 d8.getValue(); // Gets the value of the die it currently holds
 
 d8.setValue(2); // Sets the value of the die // 2 in this case
 
 d8.roll(); // Rolls the die and generates a random number between 1 and number of sides it has 
 			// and assigns it to the die // If a 2 is rolled, 'd8' holds 2
 
/*/

