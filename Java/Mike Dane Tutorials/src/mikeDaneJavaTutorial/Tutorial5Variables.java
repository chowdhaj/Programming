/*
 * * * * *
 * NOTES *
 * * * * *
 * Variables are containers that store specific values or pieces of data
 *     Pieces of data = Numbers, text, strings, etc.
 * A String is a variable that stores textual information. i.e.:
 *     String name = "Tom";
 * The Integer is a variable type that stores numbers. i.e.:
 *     int age = 20; 
 * The benefit of using variables is that you can use them many times, and
 *     you can easily change them. For instance, the character's age can be
 *     changed from 20 to 21.
 * Adding an integer to a string using the '+' is called concatenation.
 */

// VARIABLES // 
package mikeDaneJavaTutorial;

public class Tutorial5Variables {
	
	public static void main(String[] args) {	
		
		String name = "Tom";
		int age = 60;
		
		System.out.println("There once was a man named " + name);
		System.out.println("He was " + age + " years old");
		System.out.println("He really liked the name " + name);
		System.out.println("But didn't like being " + age);
		System.out.println("Most of his friends were also " + age + ", and one");
		System.out.println("of them was also named " + name + ".");
	}
}
