/** Challenge Activity 3 - Sorting Cards in your Hand
 * 
 * In this activity, we will write code to deal out 2 seven-card hands from
 * 1 deck of shuffled cards. You will then sort those hands by rank, then suit.
 * 
 * Inside Hand.java, implement the following methods.
 * - sortSuitFirst() sorts the hand by suit then rank (similar to the method in Deck.java)
 * - sortRankFirst() sorts the hand by rank then suit.
 * Note: In both cases you should use a comparator with Collections.sort easy.
 * 
 * Inside this file, write a main() method to
 *  use 1 deck of cards, 
 *  shuffle that deck, 
 *  deal 7 cards each into two hand (hint: use a loop, alternate cards to each hand)
 *  show hand 1
 *  sort hand 1 by rank
 *  sort hand 1 by suit
 *  show hand 2
 *  sort hand 2 by rank
 *  sort hand 2 by suit
 * 
 * PROGRAM OUTPUT: (for 1 deck of cards, random number seed 15)

FRESH DECK ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
SHUFFLED DECK ==> T♣ 4♥ T♠ 4♠ J♣ 4♦ 9♥ 5♥ Q♦ Q♠ J♦ 6♠ 6♥ 3♦ J♠ 2♣ 2♥ 5♠ T♥ Q♥ 8♠ 7♦ 5♦ A♣ K♥ T♦ 3♣ 9♦ 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦ 

HAND #1 CARDS     ==> T♣ T♠ J♣ 9♥ Q♦ J♦ 6♥ 
HAND #1 RANK SORT ==> 6♥ 9♥ T♣ T♠ J♣ J♦ Q♦ 
HAND #1 SUIT SORT ==> T♣ J♣ J♦ Q♦ 6♥ 9♥ T♠ 

HAND #2 CARDS     ==> 4♥ 4♠ 4♦ 5♥ Q♠ 6♠ 3♦ 
HAND #2 RANK SORT ==> 3♦ 4♦ 4♥ 4♠ 5♥ 6♠ Q♠ 
HAND #2 SUIT SORT ==> 3♦ 4♦ 4♥ 5♥ 4♠ 6♠ Q♠ 

*/

package lesson.activities.sortinghands;

import java.util.ArrayList;
import java.util.Collections;

public class SortingHandsRun {

    public static void main(String[] args) {

    	Deck d = new Deck(1, 15); // Creates a new deck called 'd' // Creates 1 deck of cards and passes 15 as a seed
    	System.out.printf("FRESH DECK ==> %s", d.toString()); // Prints the deck the console [un-shuffled]
    	d.shuffle(); // Shuffles the deck
    	System.out.printf("\nSHUFFLED DECK ==> %s", d.toString()); // Prints the shuffled deck to console
    	Hand hand1 = new Hand(); // Creates a new object of type Hand called 'hand1'
    	Hand hand2 = new Hand(); // Creates a new object of type Hand called 'hand2'
    	final int dealCards = 7; // Creates a final int called 'dealCards' and assigns it a value of 7    	    	
    	
    	// These two for loops add 7 cards from the top of the deck to both indices of 'hands'
    	for (int i = 0; i < dealCards; i++) { 
    		hand1.add(d.deal());
    		hand2.add(d.deal());
    	}
    	
    	// Prints out the 'Hands' and sorts them by rank and suit
    	System.out.printf("\n\nHAND #1 CARDS ======> %s", hand1.toString()); // Prints out the cards in 'hand1'
    	hand1.sortRanksFirst(); // Sorts 'hand1' by Rank
    	System.out.printf("\nHAND #1 RANK SORT ==> %s", hand1.toString());
    	hand1.sortSuitsFirst(); // Sorts 'hand1' by Suit
    	System.out.printf("\nHAND #1 SUIT SORT ==> %s", hand1.toString());

    	System.out.printf("\n\nHAND #2 CARDS ======> %s", hand2.toString()); // Prints out the cards in 'hand2'
    	hand2.sortRanksFirst(); // Sorts 'hand2' by Rank
    	System.out.printf("\nHAND #2 RANK SORT ==> %s", hand2.toString());
    	hand2.sortSuitsFirst(); // Sorts 'hand2' by Rank
    	System.out.printf("\nHAND #2 SUIT SORT ==> %s", hand2.toString());
    }
}
