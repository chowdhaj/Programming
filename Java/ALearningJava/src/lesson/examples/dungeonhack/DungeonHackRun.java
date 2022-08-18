package lesson.examples.dungeonhack;

import lesson.examples.dungeonhack.*; // Imports the Actor, Die, and Weapon class

public class DungeonHackRun {

    public static void main(String[] args) {
    	
    	// Creates a new object of type Weapon called 's', and 'c' // Parameters are: string, string, and int
        Weapon s = new Weapon("Broad Sword","slashes",10);
        Weapon c = new Weapon("Arm","Claws",6);
        
        // Creates a new object of type Actor called 'player' and monster' // Parameters are: string, int, int weapon
        Actor player = new Actor("Conan the Barbarian",5,10,s);
        Actor monster = new Actor("Grumpy Troll",5,8,c);
        
        // Creates a new object of type Die called 'd20' and passes 20 as a parameter // This creates a 20 sided die
        Die d20 = new Die(20);
        
        int roll = d20.roll(); // Variable type = int // Name = 'roll' // Holds a pseudo-random number from 1 - 20
        System.out.printf("[Roll=%d|AC=%d] ",roll,monster.armorClass()); 
        System.out.printf("%s %s his %s at the %s and "
                , player.name(), player.weapon().action()
                , player.weapon().name(), monster.name());
        
        if (roll >= monster.armorClass()) { // If dice roll is greater than or equal to monster's armor then: 
        	int damage = player.weapon().hitDamage(); // Creates a new variable of type int called 'damage' and it holds a random value from 0 to max damage of sword
            monster.takeDamage(damage); // Monster takes damage equal to 'damage'
            System.out.printf("hits for %d damage", damage); // Prints out how much damage the monster took
            
            if (monster.isDead()) { // If monster is dead then:
                System.out.printf(", killing it"); } // Prints out text to console
                
        } else { // If dice roll is less than monster's armor then:
            System.out.printf("misses"); } // Print miss to console
        
        System.out.println("!"); // Prints an exclamation mark to console
                     
    }
}
