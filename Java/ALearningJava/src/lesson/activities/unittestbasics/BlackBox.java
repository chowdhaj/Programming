package lesson.activities.unittestbasics;

/**
 * The mysterious BlackBox
 */
public class BlackBox {
    /**
     * Fizzbuzz returns:
     *  "fizzbuzz" when the number is a multiple of 3 and 5: 15, 30, etc...
     *  "fizz" when the number is a multiple of 3: 3, 6, 9, 12, 15, etc...
     *  "buzz" when the number is a multiple of 5: 5, 10, 15, 20, etc...
     *  "" in all other cases.
     * @param number an integer 
     * @return String value of "" "fizz" "buzz" or "fizzbuzz"
     */
    public String FizzBuzz(int number) {        
        return (number % 3 == 0 ? "fizz" : "") + (number % 5 == 0 ? "buzz" : "");
    }   
}

/*/
 * return (number % 3 == 0 ? "fizz" : "") + (number % 5 == 0 ? "buzz" : "");
 * 
 * The statement above checks whether the number passed is divisible by 3 and 5 by using the mod operand, and returns the appropriate string
 * Return "fizz" if divisible by 3 and "buzz" if divisible by 5, and both strings if divisible by both 3 and 5
 * 
/*/
