package lesson.activities.playingcards;

// Imports all the files from the JUnit class
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lesson.activities.playingcards.Card;
import lesson.activities.playingcards.Ranks;
import lesson.activities.playingcards.Suits;

public class CardTest {
   
   public CardTest() {
   }
   
   /**
    * Tests the 'rank' method, of class Card
    */
   @Test
   public void testRank() {
       System.out.println("rank()");
       //arrange
       Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
       int expResult = Ranks.QUEEN;
       //act
       int result = instance.rank();
       //assert
       assertEquals(expResult, result);
   }

   /**
    * Tests the 'suit' method, of class Card
    */
   @Test
   public void testSuit() {
       System.out.println("suit()");
       //arrange
       Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
       int expResult = Suits.HEARTS;
       //act
       int result = instance.suit();
       //assert
       assertEquals(expResult, result);
   }

   /**
    * Tests the 'sameSuit' method, of class Card
    */
   @Test
   public void testSameSuit() {
       System.out.println("sameSuit()");
       //arrange
       Card c = new Card(Ranks.EIGHT, Suits.CLUBS);
       Card instance = new Card(Ranks.SEVEN, Suits.CLUBS);
       boolean expResult = true;
       //act
       boolean result = instance.sameSuit(c);
       //assert
       assertEquals(expResult, result);
   }

   /**
    * Tests the 'sameRank' method, of class Card.
    */
   @Test
   public void testSameRank() {
       System.out.println("sameRank()");
       //arrange
       Card c = new Card(Ranks.JACK, Suits.CLUBS);
       Card instance = new Card(Ranks.JACK, Suits.DIAMONDS);
       boolean expResult = true;
       //act
       boolean result = instance.sameRank(c);
       //assert
       assertEquals(expResult, result);
   }

   /**
    * Tests the 'sameCard' method, of class Card.
    */
   @Test
   public void testSameCard() {
       System.out.println("sameCard()");
       //arrange
       Card c = new Card(Ranks.ACE, Suits.SPADES);
       Card instance = new Card(Ranks.ACE, Suits.SPADES);
       boolean expResult = true;
       //act
       boolean result = instance.sameCard(c);
       //assert
       assertEquals(expResult, result);
   }

//   /**
//    * Tests the 'rankDiff' method, of class Card.
//    */
//   @Test
//   public void testRankDiff() {
//       System.out.println("rankDiff()");
//       //arrange
//       Card c = new Card(Ranks.TWO, Suits.DIAMONDS);
//       Card instance = new Card(Ranks.NINE, Suits.HEARTS);
//       int expResult = 7;
//       //act
//       int result = instance.rankDiff(c);
//       //asert
//      assertEquals(expResult, result);
//   }

}

/*
													GENERAL NOTES
			
This is called Unit Test - JUnit in Java. This aims to reduce semantic errors from our code by testing methods to see if they...
... yield the expected result. Let's take the first method for example, method 'testRank'. 

public void testRank() {
	System.out.println("rank()"); 								[0]
    Card instance = new Card(Ranks.QUEEN, Suits.HEARTS); 		[1]
    int expResult = Ranks.QUEEN;      							[2]
    int result = instance.rank();								[3]
    assertEquals(expResult, result);							[4] 
}

[0] - Prints out "rank()' to console so we know that this method is testing to see if the ranking system works
[1] - Creates a new object of type 'Card' called 'instance' and passes Ranks.QUEEN, and Suits.HEARTS as the parameters. Essentially this creates a Queen of Hearts
[2] - Initializes a variable of type int called 'expResult' and it holds Ranks.QUEEN [remember: Ranks.QUEEN = 10, so int 'expResult' holds 10]
[3] - Initializes a variable of type int called 'result' and it holds 'instance.rank()', and the Rank is Queen and Rank.QUEEN = 10
[4] - Tests whether the variable 'expResult' equals to 'result' [if expected result = actual result] and if it returns true, then our method 'rank()' works as programmed

*/