
package lesson.examples; // Location of our class file

public class ForLoopBasics {

    public static void main(String[] args) {

    	int max = 10; // Creates a variable of type int called 'max' and assigns it a value of 10 
        System.out.println("Counting Up..."); // Prints text to console
        // This for loop says that: As long as the variable 'i' is less than 'max', 'i' will be printed to console and then incremented by 1
        for (int i = 1; i <= max; i++) {  // This is a 'for loop' // Initialization: int i = 1 // Condition: i <= max // Increment: i++
            System.out.printf("%d ",i);
        }
        System.out.println(); // Adds a line to console like '\n'
        System.out.println("\nCounting Down..."); // Prints text to console
        // This 'for loop' says that: As long as 'i' (which is 10) is less than 1, 'i' gets printed to console and then decremented by 1
        for (int i = max; i >= 1; i--) { // This is a 'for loop' // Initialization: int i = max // Condition: i >= 1 // Increment: i--
            System.out.printf("%d ",i);
        }
        System.out.println("\n"); // Adds a line to console [i.e \n]
        
        System.out.println("\t\tMultiplication Table\n"); // This prints out "Multiplication Table" to console
        for (int x = 1; x <= 10; x++) { // This for loop iterates 'x' and increases it by 1 every run
        	for (int y = 1; y <= 10; y++) { // This for loop iterates 'y' as like 'x'
        		System.out.printf("%5d", x * y); // Prints out the product of x and y to console
        	}
        	System.out.println(""); // Adds a line between each run
        }
        
    }
}

/*
		GENERAL NOTES

'%5d' Adds 5 spaces after the argument. i.e.
System.out.printf("%5dHI", Jim); 
Outputs: Jim     HI

*/