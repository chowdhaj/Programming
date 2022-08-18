/*
In this file, we will write code to test the 4 cases of the fizzbuzz() method.
We expect:
1) fizzbuzz(3) to return "fizz"
2) fizzbuzz(5) to return "buzz"
3) fizzbuzz(15) to return "fizzbuzz"
4) fizzbuzz(1) to return ""

We will do this by writing one "test method" for each of these 4 cases. 
When we run the tests, think of each test method as its own independent program
(with the test method being the main() method). 

Test methods are coded under the following convention:
// Arrange - setup the test
// Act - call the method you're testing
// Assert - check whether the method returned what you expected

 * IMPORTANT: EDIT ONLY THE LINES OF CODE IN THE //arrange PORTION OF THE TESTS
 * 
 * Press CTRL+F6 to run the tests in Netbeans.    
 */

package lesson.activities.unittestbasics;

import lesson.activities.unittestbasics.BlackBox;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackBoxTest {
    
    // TEST1: I wrote this one but you read it and run it. 
    @Test
    public void testFizzBuzzExpectFizzWhenNumberIs3() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 3;                     // when the number is 3
        String expectedResult = "fizz";     // we expect "fizz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number); // String 'actualResult' gets 3
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult); // Checks whether what we expected is what we got
    }
    
    // TEST2: This test was not setup correctly and so it fails, please fix it!
    @Test
    public void testFizzBuzzExpectBuzzWhenNumberIs5() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 5;                    // when the number is 5
        String expectedResult = "buzz";    // we expect "buzz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST3: This test was not setup correctly and so it fails, please fix it!
    @Test
    public void testFizzBuzzExpectEmptyWhenNumberIs1() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 7;                     // when the number is 1
        String expectedResult = "";      // we expect ""
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST4: Write this entire test yourself
    @Test
    public void testFizzBuzzExpectFizzBuzzWhenNumberIs15() {
        //arrange - setup the test
    	BlackBox testBox = new BlackBox();
    	int test = 15;
    	String expectedResult = "fizzbuzz";
        //act - call the method 
    	String actualResult = testBox.FizzBuzz(test);
        //assert - check whether you got what you expected!
    	assertEquals(expectedResult, actualResult);
    }
}

/*

To summarize, in a JUnit test, we test the methods of the classes we write by:

1. Creating a new instance of the class 							// BlackBox testBox = new BlackBox(); //
2. Create new variables to compare results 							// int test = 15; // String expectedResult = "fizzbuzz" //
3. Call the method of the class  									// String actualResult = testbox.FizzBuzz(test); //
4. Check whether what we got was what we expected 					// assertEquals(expectedResult, actualResult); //

*/