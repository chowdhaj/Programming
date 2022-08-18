/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.
 * When you get it working, it should display exactly this:
 * 
 * 
 * PROGRAM OUTPUT
 * 
 *  What the F-*bleep*, Java?
 *  Oops, my bad.
 *  Java, for the win!
 */
package lesson.activities;

public class JavaWTF {

    public static void main(String[] args) {
        System.out.println ("What the F-*bleep*, Java?"); // Missing brackets around String
        System.out.print("Oops, "); // Needs to be a space after the comma
        System.out.println("my bad."); // 'println', and NOT 'printf'
        System.out.println("Java, for the win!"); // Missing the 'out' keywords
    }
}

/*
			ORIGINAL CODE

System.out.println "What the F-*bleep*, Java?";	
System.out.print("Oops,")
System.out.printf("my bad.");
System.println("Java, for the win!");

*/

// REFER TO COMMENTS ABOVE TO SEE WHAT IS WRONG WITH IT