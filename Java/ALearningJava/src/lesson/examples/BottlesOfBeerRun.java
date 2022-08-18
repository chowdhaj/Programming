package lesson.examples; // Location of our class file


public class BottlesOfBeerRun {

    /**
     * demonstrates the for loop, with the classic song...
     */
	
    public static void main(String[] args) {
    	
    	// Initializes a variable called 'i' of type int and it gets 99. As long as 'i' is less than 0, execute the following statements, then decrement 'i' by 1
       for(int i = 99; i > 0; i--) {
           System.out.printf("%d bottles of beer on the wall, ", i); // Prints out text to console
           System.out.printf("%d bottles of beer. You take one down, you pass it around, you got ", i); // Prints to console
           System.out.printf("%d bottles of beer on the wall!\n", i - 1); // Prints out text to console
       }
    }
}
