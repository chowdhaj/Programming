/**  				BONUS CHALLENGE ACTIVITY!!!
 *  
 * Write a program that:
 * - Takes input from user as to what they want their player/weapon called [or generate a random one]
 * - Takes input form the user as to what they want the monster/weapon called [or generate a random one]
 * - Print a big title: ROUND X [where x = the round number]
 * - Player goes first and attacks monster, than monster attacks player
 * - Player gets a bonus multiplier but monster does not
 * - If player misses, monster heals to full health, and vice versa
 * - Specify armor class in output window (i.e. pAC = Player Armor Class && mAC = Monster Armor Class)
 * - Checks if monster or player is dead and writes that to console
 * - This is very similar to the other dungeon hack
 * 
 * SAMPLE OUTPUT
 * 
 * 			ROUND 1
 * 
 * [Roll = X | pAC = Y] Player_Name slashes his sword at Monster_Name and hits for Z Damage
 * [Roll = X | pAC = Y] Monster slashes his sword at Player and hits for Z Damage
 * 
 * 			ROUND 2
 * 
 * [Roll = X | pAC = Y] Player slashes his sword at Monster and hits for Z Damage (a critical hit)!
 * [Roll = X | pAC = Y] Monster slashes his sword at Player and misses - Player nurtures back to full health!
 * 
 * 			ROUND 3
 * 	...
 * 	...
 * 
 */

package lesson.activities.dungeonhackcombat;

import java.util.Scanner;
import java.util.Random;
import lesson.activities.dungeonhackcombat.*;

public class DungeonHackRunV2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		String answerFromUser = "null";
		
		System.out.printf("Welcome To Dungeon Hack Run V2\n");
		
		while (true) {
			System.out.printf("Would you like to play? [Y/N] ==> ");
			answerFromUser = sc.next();
			if (answerFromUser.equalsIgnoreCase("y")) {
				System.out.println("Awesome, let's get you started!");
				break;
			} else if (answerFromUser.equalsIgnoreCase("n")) {
				System.out.printf("Maybe Next Time!\n");
				System.exit(0);
			} else {
				System.out.printf("\n| INVALID RESPONSE | TRY AGAIN |\n\n");
			}
		}
		
		String playerName = "Player One";
		String playerWeapon = "Sword";
		String weaponAttack = "Slash";
		System.out.print("\nWhat is your name, champion? (i.e. Arthur) ==> ");
		playerName = sc.next();
		System.out.print("Pick your weapon of choice? (i.e. sword) ==> ");
		playerWeapon = sc.next();
		System.out.print("What does your weapon do? (i.e. slashes) ==> ");
		weaponAttack = sc.next();
		
		Weapon player = new Weapon(playerWeapon, weaponAttack, 10);
		Weapon monster = new Weapon("Club", "bashes", 8);
		
		Actor playerOne = new Actor(playerName, 10, 10, player);
		Actor monsterOne = new Actor("Grumpy Troll", 8, 14, monster);
		
		Die d20 = new Die(20); 
				
		int round = 1, roll, damage;
		
		while (true) {
			// Player's Turn
			System.out.printf("\n\n\t\t\t\tROUND %d\n", round);
			roll = d20.roll() + 1;
			System.out.printf("\n[Roll = %d][%sAC = %d] %s %s his %s at %s and ", roll,"m", monsterOne.armorClass(), 
					playerOne.name(), playerOne.weapon().action(), playerOne.weapon().name(), monsterOne.name());
			if (roll >= monsterOne.armorClass()) {
				damage = player.hitDamage();
				monsterOne.takeDamage(damage);
				System.out.printf("hits %d damage!", damage);
			} else {
				System.out.print("and misses!");
			}
			
			// Check if Monster is dead 
			if (monsterOne.isDead()) {
				System.out.printf("\nHooray, the %s is DEAD!", monsterOne.name());
				break;
			} else {
				System.out.printf("\n%s currently has %d health left\n", monsterOne.name(), monsterOne.health());
			}
			
			// Monster's Turn
			roll = d20.roll() + 1;
			System.out.printf("\n[Roll = %d][%sAC = %d] %s %s his %s at %s and ", roll, "p", playerOne.armorClass(), 
					monsterOne.name(), monsterOne.weapon().action(), monsterOne.weapon().name(), playerOne.name());
			if (roll >= playerOne.armorClass()) {
				damage = monster.hitDamage();
				playerOne.takeDamage(damage);
				System.out.printf("hits %d damage!", damage);
			} else {
				System.out.print("and misses!");
			}
			
			// Check if player is dead
			if (playerOne.isDead()) {
				System.out.printf("\nOh dear, you are DEAD!");
				break;
			} else {
				System.out.printf("\n%s currently has %d health left\n", playerOne.name(), playerOne.health());
			}
			round++;
		}
	}
}
/*

This is a bonus challenge made by myself to make the DungeonHackCombat activity more fun and challenging. Do this
at your own discretion and if you are up for a challenge. Read the instructions above to get an understanding of what 
is going on. This is very similar to the DungeonHackCombat you did earlier but the code is going to be more concise and
organized and in turn so will the output window. 

*/