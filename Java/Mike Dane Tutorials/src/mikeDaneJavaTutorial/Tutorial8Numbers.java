/*
 * * * * * 
 * NOTES *
 * * * * *
 * Java supports all basic math operands
 * Numbers are either Integers or Floating Points
 *     1. Integers are whole numbers
 *     2. Floating Points are decimal numbers
 * If you try to add an Integer with a Floating Point, the result is a decimal number
 * Java will convert Integers to Floating Points when needed. This is known as casting. There are two types of casting.
 *     1. Implicit Casting : Java automatically converts between types  
 *     2. Explicit Casting : You explicitly tell Java to convert the data type
 * Java has a math class that can be used to perform complex calculations
 * The math class consists of methods we can use. For example:
 *     abs : Absolute value
 *     pow : Exponents
 */

// MATH & NUMBERS //
package mikeDaneJavaTutorial;

public class Tutorial8Numbers {
	
	public static void main(String[] args) {
		
		// Addition
		System.out.println(3 + 4); // Prints 7
		
		// Subtraction
		System.out.println(3 - 4); // Prints -1
		
		// Multiplication
		System.out.println(3 * 4); // Prints 12
		
		// Division On Integers
		System.out.println(3 / 4); // Prints 0
		// 0 is printed because 3/4 is 0.75, but Integers cannot have decimal values, 
		// so everything after the decimal is removed
		
		// Division On Doubles
		System.out.println(3.0 / 4); // Prints 0.75
		// 3.0 is a double and 4 is an int. The resulting value is a double
		
		// Modulus 
		System.out.println(10 % 3); // Prints 1
		// The Modulus operator is the remainder of a division. For example:
		// 10 / 3 = 3 with 1 remainder
		// So 10 % 3 = 1
		
		// Create an int called 'myInt' and it stores 3
		int myInt = 3;
		
		// Create a double called 'myDouble' and it stores 5.5
		double myDouble = 5.5;
		
		// Adds 5 to 'myInt'
		System.out.println(5 + myInt); // Prints 8 
		
		// Adds 'myInt' and 'myDouble'
		System.out.println(myInt + myDouble); // Prints 8.5
	
		// abs : absolute value
		System.out.println(Math.abs(-4.2)); // Prints 4.2
		
		// pow : exponent function
		System.out.println(Math.pow(3, 3)); // Prints 27.0
		
		// sqrt : square root
		System.out.println(Math.sqrt(36)); // Prints 6.0
		
		// min : Returns the minimum of two numbers
		System.out.println(Math.min(2, 6)); // Prints 2
		
		// max : Returns the maximum of two numbers
		System.out.println(Math.max(2, 6)); // Prints 6
		
		// round : Rounds to the nearest whole number
		System.out.println(Math.round(9.87)); // Prints 10
		
		// random : Returns a random number that is greater than or equal to 0.0 and less than 1.0
		System.out.println(Math.random());
		
	}
}
