package lesson.activities.playingcardshand;

import java.util.ArrayList;

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
        Card tmp = cards.remove(index);
        return tmp;
    }
    
     /**
     * Add a card to your hand
     * @param c the card to add
     */
    public void add(Card c) {
        cards.add(c);
    }
    
     /**
     * Get a count of cards in the hand
     * @return the number of cards in the hand
     */    
    public int cardCount() {
        return cards.size();
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
        
    /**
     * count the number of cards with a specified rank in the hand
     * @param rank the rank to count
     * @return an integer of the count
     */
    public int rankCount (int rank ) {
    	Card c = cards.get(0);
    	int countRank = 0, i = 1;
    	for (;i < cards.size(); i++) {
    		if (rank == c.rank()) {
    			countRank++;
    		} 
    		c = cards.get(i);
    	}
        return countRank;
    }
    
}

/*

String cardRank;
        for (int i = 0; i < cards.size();) {
        	cardRank = cards.get(i).toString();
        	if (rank > Integer.parseInt(cardRank)) {
        		i++;
        	}
        }
        */
