package lesson.examples;

public class PrintingPower {
	
	public static void main(String[] args) {
		
        // This entire block of code prints out a huge smiley face
        System.out.println("XXXXXXXXXXX");
        System.out.println("X  _   _  X");
        System.out.println("X  0   0  X");
        System.out.println("X    ^    X");
        System.out.println("X  \\___/  X"); // "\" is the escape character
        System.out.println("X         X");
        System.out.println("XXXXXXXXXXX");
        
    }
}

/*/
 * "\" is the escape character and cannot be printed in a literal string
 * Therefore, you need to add two "\\" in order to complete the smiley face
 * The second "\" tells Java that we need to use the backslash in a literal string
/*/