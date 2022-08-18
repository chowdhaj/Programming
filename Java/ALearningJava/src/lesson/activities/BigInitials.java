
/* 

Challenge Activity 3

Write a java program to print your initials in "large letters"

For example:

M     M  FFFFFF
M M M M  F
M  M  M  FFFF
M     M  F
M     M  F

*/

package lesson.activities;

public class BigInitials {

    public static void main(String[] args) {

    	// When executed this program will output BIG initials (JC)
    	System.out.println("J J J J J	C C C C C");
    	System.out.println("    J	 	C		 ");
    	System.out.println("    J	 	C		 ");
    	System.out.println("J   J	  	C		 ");
    	System.out.println("J J J 	  	C C C C C");
    	
    	System.out.println("\n"); // This adds 1 line between our initials 'JC' and 'MF'
    	
    	// This will output 'MF' in large initials
    	System.out.println("M     M		FFFFFF");
    	System.out.println("M M M M		F");
    	System.out.println("M  M  M 	FFFF");
    	System.out.println("M     M		F");
    	System.out.println("M     M		F");

    	System.out.println("\n"); // This helps divide and separate the initials
    	
    	// This outputs the initials 'JC' to console
    	System.out.println("JJJJJJJJ   CCCCCCC");
    	System.out.println("    J	   C");
    	System.out.println("    J	   C");
    	System.out.println("J   J	   C");
    	System.out.println("JJJJJ 	   CCCCCCC");
    }
}
