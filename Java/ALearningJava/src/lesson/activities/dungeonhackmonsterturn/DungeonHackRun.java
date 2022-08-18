/*Challenge Activity 3 - Dungeon Hack Monster's Turn (if alive)
 
Manipulate this main() method so that: 
  - the monster gets an attack after your turn is complete
  - the monster does not get to attack you if it is not alive
  - the monster does not get a critical hit bonus
  - code should be similar to the player's turn!
 
SAMPLE OUTPUT:

[Roll=17|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 1 damage!
[Roll=13|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 1 damage!

[Roll=19|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 3 damage!
[Roll=15|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 10 damage, killing you!

[Roll=20|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 4 damage (a critical hit)!
[Roll=20|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 2 damage!
 
 */
 
package lesson.activities.dungeonhackmonsterturn; // Location of our 'DungeonHackRun' class

import lesson.activities.dungeonhackmonsterturn.*; // Imports all classes [Actor, Die, & Weapon] from the 'dungeonhackmonsterturn' package 

public class DungeonHackRun {

	// The main method - executes first
    public static void main(String[] args) {
    	
    	// Creates a new object of type Weapon and passes 3 parameters: 2 are of type string, and 1 is an int
        Weapon sword = new Weapon("Long Sword","slashes",10); // 1st arg. = "Long Sword" = String name // 2nd arg. = "slashes" = String action // 3rd arg. = 10 = int maxDamage
        Weapon club = new Weapon("Club","swings",6); // 1st arg. = "Club" = String name // 2nd arg. = "swings" = String action // 3rd arg. = 6 = int maxDamage
        
        // Creates a new object of type Actor and passes 4 parameters: String name, int health, int armorClass, Weapon weapon
        Actor player = new Actor("Conan DeBarbarian", 5, 10, sword); // Parameters are: "Conan DeBarBarian", 5, 10, s
        Actor monster = new Actor("Grumpy Troll", 5, 8, club); // Parameters are: "Grumpy Troll", 5, 8, c
        
        
        Die d20 = new Die(20); // Creates a new object of type Die called 'd20' and passes 20 as a parameter [20]
        
        int roll = d20.roll(); // Rolls the dice to generate a random number between 0 and 19
        System.out.printf("[Roll = %d | pAC = %d] ",roll,monster.armorClass());
        System.out.printf("%s %s his %s at the %s and "
                , player.name(), player.weapon().action()
                , player.weapon().name(), monster.name());
        
        if (roll >= monster.armorClass()) { // If random number is greater than the monster's armor class, then:        
            int swordDamage = player.weapon().hitDamage(); // 'weaponDamage' gets a random number from 0 to maxDamage [0 - 10]
            
            if (roll == 20) { // If the dice roll is equal to 20, then:
                swordDamage *= 2; // 'weaponDamage' gets multiplied by two
                monster.takeDamage(swordDamage); // Monster takes damage equal to 'weaponDamage'
                System.out.printf("hits for %d damage (a critical hit)", swordDamage); // Prints out text to console     
                
            } else { // Else clause - If the above did not happen (i.e. Roll < 20), then:
                monster.takeDamage(swordDamage); // Monster takes damage equal to 'weaponDamage'
                System.out.printf("hits for %d damage", swordDamage); } // Prints out how much damage monster took to console
            
            if (monster.isDead()) { System.out.printf(", killing it"); } // If the monster is dead then print out text to console  
            
        } else { // If random number generated is less than the monster's armos class, then: 
            System.out.printf("misses"); } // Print out 'miss' to console
        
        System.out.println("!!!"); // Prints an exclamation to console
                
        if (!(monster.isDead())) { // If monster is NOT dead then do the following:
        	roll = d20.roll(); // Roll the die and generate a random number between 1 - 20
        	System.out.printf("[Roll = %d | mAC = %d] %s %s his %s at %s and ", roll,
        			player.armorClass(), monster.name(), monster.weapon().action(), 
        			monster.weapon().name(), player.name());
        	if (roll >= player.armorClass()) { // If dice roll is greater than player's armor class then: 
        		int clubDamage = monster.weapon().hitDamage(); // Generate random number between 0 and maxDamage [0 - 6]
        		player.takeDamage(clubDamage); // Apply damage to player
        		System.out.printf("hits a %d!!!", clubDamage); // Print out how much damage player takes
        	} else { // If dice roll is NOT greater than player's armor class then: 
        		System.out.print("and misses!!!"); // Print 'miss' to console
        	}
        } else { // If monster is dead then: 
        	System.out.printf("%s is dead. %s is victorious!!!!\n", monster.name(), player.name()); // Print out victor to console
        }
        //System.out.print("!!!\n\n");
        
        /* TODO: Implement your code here */
                 
    }
}

