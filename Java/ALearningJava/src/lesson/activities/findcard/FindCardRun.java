/** Challenge Activity 2 - Find the Card
 * 
 * In this activity, we will write code to deal out 7 cards each to 4 players 
 * from a shuffled deck. 
 * 
 * Next, the program should display where the A♠ is located - within one 
 * of the hands or still found in the remaining deck.
 * 
 * => You will need to implement the indexOf() methods in Deck.java and Hand.java 
 *    before attempting to implement main() java. This will require you to 
 *    search for the card... good luck!
 * 
 * PROGRAM OUTPUT: (for 1 deck of cards, random number seed 15)

FRESH DECK ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
SHUFFLED DECK ==> T♣ 4♥ T♠ 4♠ J♣ 4♦ 9♥ 5♥ Q♦ Q♠ J♦ 6♠ 6♥ 3♦ J♠ 2♣ 2♥ 5♠ T♥ Q♥ 8♠ 7♦ 5♦ A♣ K♥ T♦ 3♣ 9♦ 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦ 

LOOKING FOR: A♠
HAND #0 CARDS ==> T♣ J♣ Q♦ 6♥ 2♥ 8♠ K♥  
HAND #1 CARDS ==> 4♥ 4♦ Q♠ 3♦ 5♠ 7♦ T♦  
HAND #2 CARDS ==> T♠ 9♥ J♦ J♠ T♥ 5♦ 3♣  
HAND #3 CARDS ==> 4♠ 5♥ 6♠ 2♣ Q♥ A♣ 9♦  
REMAINING DECK ==> 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦  FOUND

*/

package lesson.activities.findcard; // Location of our class file

import lesson.activities.findcard.*; // Imports all the classes needed to make this program run

public class FindCardRun {

    public static void main(String[] args) {
    	
        Deck d = new Deck(1, 15); // Creates a new object of type Deck and calls it 'd' // Creates one deck and passes 15 as a seed
        Card find = new Card(Ranks.ACE, Suits.SPADES); // Creates a new object of type Card and calls it 'find' // The card created is Ace of Spades
        Hand[] hands = new Hand[] { new Hand(), new Hand(), new Hand(), new Hand() }; // Creates 5 arrays of type object Hand called 'hands'
        System.out.printf("FRESH DECK ==> %s\n", d.toString()); // Prints the deck of cards to console
        d.shuffle(); // Shuffles the deck
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString()); // Prints the shuffled deck to console
       
        // Using two for loops, the deck is enumerated and a card from the deck is removed and added to the 'hands'
        for (int i = 0; i < 7; i++) { // This for loop tracks how many cards to add to the 'hands' [i.e. 7]
        	for (int j = 0; j < 4; j++) { // This for loop is for the number of 'hands' [i.e. 4]
        		hands[j].add(d.deal()); // Removes a card from 'd' and adds it to 'hands' at the j(th) position
        	}
        }
        
        System.out.printf("\nLOOKING FOR: %s\n", find.toString()); // Prints what card it is looking for to console // It is 'find' in this case
                
        int found = -1; // Creates an int called 'found' and assigns it a value of -1
        for (int x = 0; x < hands.length; x++) { // Interates over 'hands'
        	System.out.printf("HAND #%d CARDS ==> %s[%s]\n", x, // Prints the cards found in the 'hands' at the x(th) element
        			hands[x].toString(), (hands[x].indexOf(find) == 1) ? "Found It" : "Not Here"); // Searches for 'find' and returns result 
        	
        	if (x == 3) { // If 'x' is equal to 3 then do the following:
        		System.out.printf("REMAINING DECK ==> %s[%s]", // Print the remaining deck of cards to console 
        				d.toString(), (d.indexOf(find) == 1) ? "Found It" : "Not Here" ); // Searches for 'find' and returns result
        	}
        }        
    }
}
