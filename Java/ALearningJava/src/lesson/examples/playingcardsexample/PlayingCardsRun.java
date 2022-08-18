/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.examples.playingcardsexample;

import lesson.examples.playingcardsexample.*; // Imports all classes located in the 'playingcardsexample' package
import java.util.Random; // Imports the Random class

public class PlayingCardsRun {

    public static void main(String[] args) {
  
        Random gen = new Random(); // Creates a new object of type Random called 'gen' // No arguments are passed
        Card c1 = new Card(Ranks.ACE, Suits.HEARTS); // Creates a new object of type Card, called 'c1' and passes Ranks.ACE, and Suits.HEARTS as parameters
        Card c2 = new Card(gen.nextInt(52)); // Creates a new object of type Card, called 'c2' and passes a random integer from 0 to 51 as a parameter
        
        System.out.printf("Cards: %s %s\n", c1.toString(), c2.toString()); // Prints out the suit and rank of 'c1' and 'c2'
        System.out.printf("SAME RANK: %s\n", c1.sameRank(c2)); // Prints out the boolean condition if 'c1' has the same rank as 'c2'
        System.out.printf("SAME SUIT: %s\n", c1.sameSuit(c2)); // Prints out the boolean condition if 'c1' has the same suit as 'c2'
        System.out.printf("SAME CARD: %s\n", c1.sameCard(c2)); // Prints out true if the cards are the same [i.e. have the same rank and suit], false otherwise
        
    }
}
