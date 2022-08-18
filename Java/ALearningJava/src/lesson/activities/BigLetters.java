/* Challenge Activity 1 - DAD and ADD in Bigletters
 * 
 * This is a great challenge in writing and calling functions.
 * 
 * This program will print out big letters (but only "D" and "A" 
 * it it then used used to print words DAD and ADD
 * 
 * The letters print vertically. Sample output
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 *   X  
 *  X X 
 * X   X
 * XXXXX
 * X   X
 * X   X
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 * 
 *   X  
 *  X X 
 * X   X
 * XXXXX
 * X   X
 * X   X
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 */

package lesson.activities; // Location of our 'BigLetters' class file

public class BigLetters {

	// This is the main method and prints out 'DAD' and 'ADD' when the program is executed
    public static void main(String[] args) {
    	PrintDAD(); // Calls the 'PrintDAD()' method
    	System.out.println("\n\n"); // Prints out two lines to divide the 'DAD' and 'ADD'
    	PrintADD(); // Calls the 'PrintADD()' method
    }

    // This method prints out 'ADD' when called
    public static void PrintADD() {
    	PrintA(); // Calls the 'PrintA()' method
    	PrintD(); // Calls the 'PrintD()' method
    	PrintD(); // Calls the 'PrintD()' method
    }
    
    // This method prints out 'DAD' when called
    public static void PrintDAD() {
    	PrintD(); // Calls the 'PrintD()' method
    	PrintA(); // Calls the 'PrintA()' method
    	PrintD(); // Calls the 'PrintD()' method
    }
    
    // This method prints the letter 'A' to console when called
    public static void PrintA() {
    	System.out.println("   X");
    	System.out.println("  X X");
    	System.out.println(" X   X");
    	System.out.println(" XXXXX");
    	System.out.println(" X   X");
    	System.out.println(" X   X\n");
    }
    
    // This method prints the letter 'D' to console when called
    public static void PrintD() {
    	System.out.println(" XXX");
    	System.out.println(" X  X");
    	System.out.println(" X   X");
    	System.out.println(" X   X");
    	System.out.println(" X  X");
    	System.out.println(" XXX\n");
    }
}
