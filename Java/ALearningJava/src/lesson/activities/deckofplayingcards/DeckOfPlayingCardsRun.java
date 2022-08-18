/** Challenge Activity 2 - A Deck of Playing Cards
 * 
 * In this activity we will implement a class to satisfy a deck of cards
 * 
 * In Deck.java you'll implement all the methods with TODO sections.
 * 
 *  Then write a main() program to accomplish the following
 *      - print the random number seed
 *      - create a new deck of cards (one deck) with seed as random number seed
 *      - print the new deck of cards (unshuffled)
 *      - shuffle the deck
 *      - print the deck again (now its shuffled)
 *      - deal 1 cards into a variable
 *      - print the deck  (now there's one less card)
 *      - return the card to the deck
 *      - print the deck again (52 card again returned card is at the end of the deck)
 
 * PROGRAM OUTPUT:

Random number seed : 44
Deck(52) : 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
Shuffling....
Deck(52) : K♣ 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Deal a card. You got the K♣
Deck(51) : 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Discard a card. Returning the K♣ to the deck
Deck(52) : 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ K♣ 

 */

package lesson.activities.deckofplayingcards; // Location of our class file

import lesson.activities.deckofplayingcards.*; // Imports the classes required to run this program

public class DeckOfPlayingCardsRun {
    
   public static void main(String[] args) { 
	   
      int seed = 44; // Creates an int named 'seed' and assigns it a value of 44
      System.out.printf("Random Number Seed: %d\n", seed); // Prints out the value of 'seed' to console
      Deck d44 = new Deck(1, seed); // Creates a new deck and feeds it a seed of 44
      System.out.printf("Deck (%d): %s", d44.cardCount() ,d44.toString()); // Prints out the size and contents of the deck to console
      System.out.printf("\n\nShuffling..."); // Prints text to console
      d44.shuffle(); // Shuffles the deck
      System.out.printf("\nDeck (%d): %s", d44.cardCount() ,d44.toString()); // Prints out shuffled deck to console
      Card c = d44.deal(); // Creates a new card 'c' and it holds the top card of our deck 'd44'
      System.out.printf("\n\nDeal a card. You got the %s", c.toString()); // Prints out the first card in 'd44' to console which is 'c'
      System.out.printf("\nDeck (%d): %s", d44.cardCount() ,d44.toString()); // Prints out the size and contents of the deck to console
      System.out.printf("\n\nDiscard a card. Returning the %s to the deck", c.toString()); // Prints text to console
      d44.discard(c); // Returns the dealt card to the bottom of the deck
      System.out.printf("\nDeck (%d): %s", d44.cardCount() ,d44.toString()); // Prints out the size and contents of the deck to console  
   }
}
