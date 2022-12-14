package lesson.activities.findcard;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hand : an arbitrary collection of cards.
 * @author mafudge
 */
public class Hand {
    private ArrayList<Card> cards;  // the big pile of cards
    
    /**
     * Constructor - new hand
     */
    public Hand() {
        cards = new ArrayList<Card>();        
    }
         
     /**
     * Removes a card from the hand at index
     * @param index the position of the card to remove
     * @return the card removed
     */
    public Card remove(int index) {
        // TODO: Implement this method
        return this.cards.remove(index);
    }
    
     /**
     * Add a card to your hand
     * @param c the card to add
     */
    public void add(Card c) {
        // TODO: Implement this method
        this.cards.add(c);
    }
    
     /**
     * Get a count of cards in the hand
     * @return the number of cards in the hand
     */    
    public int cardCount() {
        return cards.size();
    }
    
    /**
     * Returns the position of Card c in the deck, -1 it it does not exist
     * @param c the card to find in the deck
     * @return the position in the deck as an integer, or -1 if it does not exist
     */
    public int indexOf(Card c) {
        // TODO: loop through the deck looking for card c when you find it return it's index, when you don't return -1
    	int found = -1;
    	for (int i = 0; i < cards.size(); i++) {
    		if (c.sameCard(cards.get(i))) {
    			found = 1;
    		}
    	}
        return found;
    }

    /**
     * Converts the hand of cards to a string for display.
     * @return the cards represented as a string
     */
    @Override
    public String toString() {
        String result = "";
        for (Card c : cards) {
           result += c.toString() + " ";            
        }
        return result;
    }
 
    public int rankCount (int rank ) {
        // TODO: Implement this method
        int count = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            count += this.cards.get(i).rank() == rank ? 1 : 0;
        }
        return count;
        
    }    
}