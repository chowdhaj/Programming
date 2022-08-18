/** Challenge Activity 3 - Roll ability scores for an RPG
 * 
 * Now that we have for loops under our belt, let's improve our dice roller to
 * include a method to role a die a specific number of times. This is often 
 * required when rolling ability scores for an RPG (Role-playing game)
 * 
 * Do do this, overload the roll() method of the Die.java class to accept a 
 * parameter for the number of times the Die needs to be rolled. Inside the method
 * use a for loop to roll the die that many times. For example:
 * 
 * Die d6 = new Die(6);
 * int Strength= d6.roll(3);  // Roll a 6 sided die three times.
 * 
 * Once you get that working modify the main() method here
 * to roll out a character's abilities, which should roll a six sided die
 * three times for each ability :
 * (there are 6 abilities: str, int, dex, con, wis, cha)
 * 
 *  SAMPLE OUTPUT (using seed = 5555 for the die):
 * 
 *  Character Roll:
 *  Str Int Dex Con Wis Cha
 *   11  17  10  10  13  12 
 */

package lesson.activities.rpgabilityscores;

public class RPGAbilityScores {

    public static void main(String[] args) {
        Die d6 = new Die(6, 5555); // Creates a six sided die with a seed of 5555
        System.out.printf("Character Ability Roll:\n"); // Prints text to console
        System.out.printf("Str Int Dex Con Wid Cha\n"); // Prints text to console
        // TODO: Write for loop to roll d6 3 times for each of the 6 abilities, 
        // printing them out directly to the console
        for (int i = 0; i < 6; i++) { // Prints 6 dice rolls to console using a for loop
        	System.out.printf("%d  ", d6.roll(3)); // Output is: "11  17  10  10  13  12"
        }
    }
}

/*
								RELEVANT INFORMATION
		
You need to create a method in the 'Die.java' file where it rolls the die 3 times and adds the sum and... 
... returns it. Just create an overloaded method for the 'roll()' method. Then, roll the die 6 times and...
... repeat the sample output above.

*/