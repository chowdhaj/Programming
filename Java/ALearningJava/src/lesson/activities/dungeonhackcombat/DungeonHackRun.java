/** Challenge Activity 3 - Dungeon Hack Combat
 *  
 * Below is code from the last dungeon hack example, where both the player 
 * and monster get turns attacking each other. 
 * 
 * Manipulate the code in this main() method so that it works like true combat  
 * where both the player and monster exchange attacks until one of them is dead.
 * Each combination of player and monster attacks is called a ROUND. 
 * Include the round number with the attack information, and increment the round
 * through each combat cycle.
 * 
 * SAMPLE OUTPUT #1:
 * 
 * [Round=1|Roll=8|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 4 damage!
 * [Round=1|Roll=8|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 1 damage!
 * [Round=2|Roll=20|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 8 damage (a critical hit), killing it!
 * The Grumpy Troll is dead.
 * 
 * SAMPLE OUTPUT #2:
 * [Round=1|Roll=5|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and misses!
 * [Round=1|Roll=16|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 2 damage!
 * [Round=2|Roll=14|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 6 damage!
 * [Round=2|Roll=19|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 5 damage!
 * [Round=3|Roll=6|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and misses!
 * [Round=3|Roll=14|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 4 damage, killing you!
 * You are dead.
 *  
 */
 
 
package lesson.activities.dungeonhackcombat; // Location of our class file

public class DungeonHackRun {

    /**
     * The beginnings of a super cool dungeon hack simulator
     */
    public static void main(String[] args) {
    	
        Weapon s = new Weapon("Broad Sword","slashes",10); // Creates a new object of type Weapon called 's'
        Weapon c = new Weapon("Arm","Claws",6); // Creates a new object of type Weapon called 'c'
        Actor player = new Actor("Conan the Barbarian",10,10,s); // Creates a new Actor // Parameters are passed in the constructor
        Actor monster = new Actor("Grumpy Troll",12,8,c); // Creates a new Actor // Parameters are passed in the constructor
        Die d20 = new Die(20); // Creates a 20 sided die
        int round = 0; // Creates an int called 'round' and assigns it a value of 1
        
        while (true) {
        	int roll = d20.roll(); // Rolls the 20 sided dice
        	round++; // Increments 'round' by one
        	System.out.printf("[Round %d | Roll = %d | AC = %d] ",round,roll,monster.armorClass()); // Prints the status to console
        	System.out.printf("%s %s his %s at the %s and " // Prints the player's actions to console
        			, player.name(), player.weapon().action()
        			, player.weapon().name(), monster.name());
        	if (roll >= monster.armorClass()) { // If the roll of the dice is greater than the monster's armor class then:
        		int damage = player.weapon().hitDamage(); // Generate a random number between 1 and 10
        		if (roll == 20) { // If the dice roll equals 20
        			damage = damage * 2; // Multiply the damage by 2
        			monster.takeDamage(damage); // Monster takes damage
        			System.out.printf("hits for %d damage (a critical hit)", damage); // Prints out how much damage the monster took to console           
        		} else { // If the dice roll is NOT 20, then:
        			monster.takeDamage(damage); // Monster takes damage
        			System.out.printf("hits for %d damage", damage); // Prints out how much damage the monster took
        		}
        		if (monster.isDead()) { // If monster is dead, then:
        			System.out.printf(", killing it"); // Prints text to console
        			System.out.printf("\n%s is dead\n", monster.name());
        			break; // Exists out of the loop
        		}           
        	} else { // If the dice roll is less than the armor class then print "miss" to console
        		System.out.printf("misses"); // Prints text to console
        	}
        	System.out.println("!"); // Prints exclamation point
            
        	if (!(monster.isDead())) { // If the monster is NOT dead, then:
        		roll = d20.roll(); // Roll the dice
        		System.out.printf("[Round %d | Roll = %d | AC = %d] ",round,roll,player.armorClass()); // Prints the status to console
        		System.out.printf("%s %s its %s at %s and " // Prints the monster's actions to console
        			, monster.name(), monster.weapon().action()
                	, monster.weapon().name(), player.name());
        		if (roll >= player.armorClass()) { // If the roll is greater than or equal to player's armor class then:
        			int damage = monster.weapon().hitDamage(); // 'damage' gets a random number from 1 to 6
        			player.takeDamage(damage); // Player takes damage
        			System.out.printf("hits you for %d damage", damage); // Prints how much damage player took to console
        			if (player.isDead()) { // If player is dead, then:
        				System.out.printf(", killing you!"); // Prints text to console
        				System.out.print("\nYou are dead!\n");
        				break; // Exits out of the loop
        			}           
        		} else { // If the roll is NOT greater than or equal to the player's armor class then print text to console
        			System.out.printf("misses"); // Prints 'miss' to console
        		}
        		System.out.println("!"); // Prints an exclamation to console
        	}       
        }
    }
}