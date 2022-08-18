package lesson.examples; // This tells Java where the class file is located. It is located inside the examples package, which is inside the lesson package

public class HelloWorld {

	// This is the main method
    public static void main(String[] args) {
    	
    	// This prints whatever is in the quotes - in this case, it is "Hello, World..."
        System.out.println("Hello, World...");
    }
}


/*/ 					NOTES
 * When executed, Java looks for the main method
 * The main method is the first thing that is executed 
 * 
 * public = Accessible to everything
 * static = Does not need to be instantiated/declared to be used
 * void = Returns nothing
/*/