/* Challenge Activity 3 - Role Playing Game


Use the Actor and Weapon classes in the roleplaying package to do the following

1) Make a weapon called sword which does up to 10 damage
2) Make a weapon called bite which does up to 5 damage
3) Make a knight "Sir Glagane" with 20 health, 5 armor, and the sword as a weapon
4) Make a snake called "Viper" with 10 health, 1 armor and the bite as a weapon
5) Print out the knight and snake.
6) Make the snake bite the knight, and apply damage to the knight
7) Make the knight slash the snake, and apply damage to the snake.
8) Print out the knight and the snake.

 */

package lesson.activities.roleplayinggame; // Location of our 'RolePlayingGame' class - it is located inside packages called 'roleplayinggame', 'activities', and 'lesson'

import lesson.activities.roleplayinggame.Actor; // Imports the Actor class
import lesson.activities.roleplayinggame.Die; // Imports the Die class
import lesson.activities.roleplayinggame.Weapon; // Imports the Weapon class

public class RolePlayingGame {

    public static void main(String[] args) {

    	// Creates a new object of type Weapon, and refers to it by 'sword'
    	Weapon sword = new Weapon("Sword", "Slashes", 10); // Passes three parameters, and they are 'String name', 'String action', and 'int damage' 
    	
    	// Creates a new object of type Weapon, and refers to it by 'bite'
    	Weapon bite = new Weapon("Bite", "Bites", 5); // Passes three parameters: 'String name', 'String action', and 'int damage'

    	// Creates a new object of type Actor, and calls him 'sirGlagane'
    	Actor sirGlagane = new Actor("Sir Glagane", 20, 5, sword); // Passes four parameters, and they are 'String name', 'String health', 'int armorClass', and 'Weapon'
    	
    	// Creates a new object of type Actor, and call him 'viper'
    	Actor viper = new Actor("Viper", 10, 1, bite); // Passes four parameters, and they are 'String name', 'String health', 'int armorClass', and 'Weapon'
    	
    	System.out.printf("%s\n%s", sirGlagane, viper); // Prints out the stats of Sir Glagane, and Viper
    	
    	// Creates a new object of type Die, and calls it 'swordSlashes'
		Die swordSlashes = new Die(sword.hitDamage()); // Passes one parameter, and it is 'int sides'

		// Creates a new object of type Die, and calls it 'viperBites'
		Die viperBites = new Die(bite.hitDamage()); // Passes one parameter, and it is 'int sides'

		int damage = viperBites.roll(); // Creates a new variable called 'damage' of type int and assigns it a pseudo-random value from 0 to Viper's max hit [0 - 5]
		sirGlagane.takeDamage(damage); // 'sirGlagane' takes damage // His health decreases by 'damage'
		System.out.printf("\n\n%s hits a %d on the %s", sirGlagane.name(), damage, viper.name()); // Prints out how much damage Sir Glagane did on the Viper
		
		damage = swordSlashes.roll(); // Damage gets a pseudo-random value from 0 to Sir Glagane's max hit [0 - 10]
		viper.takeDamage(damage); // Viper takes damage and its health decreases by 'damage'
		System.out.printf("\n%s damages %s by %d points", viper.name(), sirGlagane.name(), damage); // Prints out how much damage the Viper did on Sir Glagane
		
    	System.out.printf("\n\n%s\n%s", sirGlagane, viper); // Prints out stats for Sir Glagane and Viper
    }
}
