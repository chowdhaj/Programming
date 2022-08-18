/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson.examples.playingcardsexample; // Location of the 'Class' file

/**
 * Playing Cards Implemented In Java
 * @author Respect
 */

public class Card {  
	
	// The following variables are private, of type int, and store the cards's suit and rank
    private int suit; // Clubs = 0, Diamonds = 1, Hearts = 2, Spades = 3
    private int rank; // Two = 0, Three = 1, Four = 2, ..., King = 11, Ace = 12

    /**
     * Creates A New Card
     * @param Card: The Integer Representation Of The Card From 0 - 51
     */
    public Card(int card) { // This is the default constructor // It takes one parameter of type int and generates a random card between 0 - 52
        rank = card % 13; // Rank gets card % 13 
        suit = (card / 13) % 4; // Suit gets (card / 13) % 4
    }

    /**
     * Creates A New Card
     * @param Rank: The Integer Representation Of The Card [Two = 0, Three = 1, ..., King = 11, Ace = 12]
     * @param Suit: The Integer Representation Of The Card [Clubs = 0, Diamonds = 1, Hearts = 2, Spades = 3]
     */
    public Card(int rank, int suit) { // This is the overloaded constructor // It takes two parameters of type ints and generates a card specified by user
        this.rank = rank % 13; 
    	this.suit = suit % 4;
    }
 
    /**
     * Gets The Rank Of The Card
     * @return Rank Of Card - Represented As Integer
     */
    public int rank() { return rank; } // This method returns the rank of the card
    
    /** 
     * Gets The Suit Of The Card
     * @return Suit Of Card - Represented As Integer
     */
    public int suit() { return suit; } // This method returns the suit of the card

    /**
     * Compares Two Cards To See If They Are The Same Suit
     * @param c: The Card To Compare This Card
     * @return True If Same Suit, False Otherwise
     */
    public boolean sameSuit(Card c) { return (this.suit == c.suit); } // This method checks if two cards are of the same suit // Returns 'true' if they are, 'false' if they are not
    
    /**
     * Compares Two Cards To See If They Are The Same Rank
     * @param c: The Card To Compare This Card
     * @return True If Same Suit, False Otherwise
     */
    public boolean sameRank(Card c) { return (this.rank == c.rank); } // This method checks if two cards are of the same rank // Returns 'true' if they are, 'false' if they're not
    
    /**
     * Compares Two Cards To See If They Are The Same Rank
     * @param c: The Card To Compare This Card
     * @return True If Same Card, False Otherwise
     */
    public boolean sameCard(Card c) { return (this.sameRank(c) && this.sameSuit(c)); } // This method checks if two cards are identical [Same suit and same rank] // Returns true/false
    
    /** 
     * Returns The Difference In Ranking Between Two Cards
     * @param c: The Card To Compare This Card
     * @return An Integer Difference Between This Card And 'c'
     */
    public int rankDiff(Card c) { return (this.rank - c.rank); } // This method returns the difference in ranking between the cards
    
    /**
     * Converts The Card To A String Format For Printing
     * @return The Card's Representation As A String
     */
    @Override // Overrides the default 'print' class in Java
    public String toString() { // This method converts the card's rank and suit to a string
        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660"; //"CDHS";
        return ranks.charAt(rank) +  "" + suits.charAt(suit);
    }
}

/*
					GENERAL NOTES
					
public Card(int card) { 
    rank = card % 13;
	suit = (card / 13) % 4;
}

This method takes accepts a parameter of type int called card. The number has to be between 0 and 51. Then, the variable rank...
... gets card mod 13, and the variable suit gets card divided by 13 mod 4. So imagine 23 is passed as an argument when 'Card'...
... is instantiated. Then, rank gets 23 % 13, which is 10. So rank gets 10, and 10 corresponds to Queen in our 'Ranks' class. The...
... variable suits gets (23 / 13) % 4 = 1 % 4 = 1. And 1 corresponds to Diamonds in our 'Suits' class. So passing a value of 23 as an argument...
... yields Queen Of Diamonds


public Card(int rank, int suit) {
	this.rank = rank % 13; 
	this.suit = suit % 4;
}

This method takes accepts two parameters of type int called rank and suit. You can pass a number, or type in Rank.QUEEN, Suit.HEART. This...
... works because QUEEN, KING, ACE, JACK, etc. are all numbers. And so are HEARTS, CLUBS, etc. These are all numbers and they can be passed as...
... arguments in our 'Card' constructor. The numbers passed are then assigned to suit and rank. So let's assume rank = Rank.QUEEN, and...
... suit = Suit.HEARTS. Since Rank.QUEEN and Suit.HEARTS are actually numbers, rank = 10, and suit = 2. Then, rank = rank % 13, and...
... suit = suit % 4. (10 % 13) is 10, and (2 % 4) is 2. So the rank and suit variables do not change and the card is Queen of Hearts.

public String toString() {
	String ranks = "23456789TJQKA";
    String suits =  "\u2663\u2666\u2665\u2660"; // Clubs, Diamonds, Hearts, Spades
    return ranks.charAt(rank) +  "" + suits.charAt(suit);
}

This method converts the card's rank and suit into a string and allows you to output it to console. String ranks stores the ranks of the card, and...
... String suits stores the suit of the card in unicode characters. Based on the rank and suit of the card, the appropriate string is...
... output to console. Let's take Queen Of Hearts as an example. We know that Rank.QUEEN = 10, and Suits.HEARTS = 2. So the code:
ranks.charAt(rank) can be written as ranks.charAt(10) and suits.charAt(2). So the 'toString()' method outputs the character at the... 
... 10th position, which is Q, and the 2nd position is the unicode character \u2665. See below for a better clarification.


2	3	4	5	6	7	8	9	T	J	Q	K	A	[RANKS]
0	1	2	3	4	5	6	7	8	9	10	11	12	[POSITION]

\u2663	\u2666	\u2665	\u2660	[SUITS]
0		1		2		3		[POSITION]

*/