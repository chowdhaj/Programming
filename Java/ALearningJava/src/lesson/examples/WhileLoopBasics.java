package lesson.examples; // Location of our class file

public class WhileLoopBasics {

    public static void main(String[] args) {

    	int max = 10; // Creates an int // Calls it 'max' // Holds a value of 10
        int i = 1; // Creates an int // Calls it 'i' // Holds a value of 1
        
        System.out.println("Counting Up..."); // Prints text to console
        while (i <= max) { // This is a while loop and tests the condition: if 'i' is less than or equal to 'max'
            System.out.printf("%d ",i); // Print 'i' to console
            i++; // This is the increment operator and increases 'i' by 1 // Can be written as: i = i + 1 OR i += 1
        }
        System.out.println(); // Functions as '\n'
        
        i = max; // The integer 'i' holds a value that is equal in magnitude to 'max' // Since 'max' is 10, 'i' gets 10
        System.out.println("Counting Down..."); // Prints text to console
        while (i >= 1) { // While 'i' is greater than or equal to 1, execute the following statements:
            System.out.printf("%d ",i); // Print 'i' to console
            i--; // This is the decrement operator and decreases 'i' by 1 // Can be written as: i = i - 1 OR i -= 1
        }
        System.out.println(); // Functions as '\n'
    }
}
