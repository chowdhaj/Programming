/*
 * * * * * 
 * NOTES *
 * * * * * 
 * Access modifiers are keywords we give to our Java program's
 *     classes, variables, etc., which indicates the level of
 *     control other entities have on accessing them
 * There are three keywords:
 *     public    : Anything can access it
 *     private   : Can only be accessed inside the class
 *     protected : Only accessed within the same package
 * A package is a folder where all the Java files are stored
 */

// Access Modifiers
package mikeDaneJavaTutorial;

public class Tutorial36AccessModifiers {
	
	public static String easyAccess = "Anyone can see this";
	protected static String strictAccess = "Only same package classes";
	private static String superStrictAccess = "Only this class";
	
	public static void main(String[] args) {
		
		System.out.println(easyAccess);
		System.out.println(strictAccess);
		System.out.println(superStrictAccess);
		
	}
}