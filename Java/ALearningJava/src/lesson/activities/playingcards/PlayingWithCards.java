/* Challenge Activity 1 - Playing with Cards

Write a program which uses the Card class in the 'playingcards' package and Random
class in java.util to :

1) Create the queen of hearts card
2) Create a random card (one of the 52 possible cards)
3) print out both cards and whether they are the same suit.
 
 */

package lesson.activities.playingcards; // Location of our class file [inside packages called 'playing cards', 'activities', and 'lesson']

import lesson.activities.playingcards.Suits; // Imports the suits class
import lesson.activities.playingcards.Card; // Imports the cards class
import lesson.activities.playingcards.Ranks; // Imports the ranks class

import java.util.Random; // Imports the random class

public class PlayingWithCards {

    public static void main(String[] args) {

    	Random pseudoRandom = new Random(); // Creates a new object of type Random called 'pseudoRandom'
    	Card queenOfHearts = new Card(Ranks.QUEEN, Suits.HEARTS); // Creates a new object of type Card called 'queenOfHearts' and gives it a rank of 'Queen' and a 'Hearts' suit
    	Card randomCard = new Card(pseudoRandom.nextInt(52)); // Creates a new object of type Card called 'randomCard' and assigns it a random rank and suit
    	
    	// Prints out both cards and if they share the same suit, then print 'similar', and if suits are different, then print 'different' // Accomplished using ternary operator
    	System.out.printf("The %s & %s Have %s Suits", queenOfHearts, randomCard, (randomCard.sameSuit(queenOfHearts)) ? "SIMILAR" : "DIFFERENT");
    }
}

/*

* Ranks range from 0 - 12 [AKA TWO - ACE]
* Suits range from 0 - 3 [AKA CLUBS - SPADES]

* Another way to create the Queen Of Hearts:

Card newCard = new Card(10, 2);

* Another way to generate a random card:

Card randomCard = new Card(ran.nextInt(13), ran.nextInt(4));
ran.nextInt(13) // Will randomly pick a rank from 0 - 12
ran.nextInt(4) // Will randomly pick a suit from 0 - 3

*/