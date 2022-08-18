package tutorials.basic;

public class TypesAndVariables {
	public static void main(String[] args) {
		
		// Declaring a variable called "myVariable" of type int (integer)
		int myVariable;
		// Assign a value of 5 to myVariable
		myVariable = 5;
		// Print the value of myVariable to console
		System.out.println(myVariable);
		
		myVariable = 10;
		System.out.println(myVariable);
		
		myVariable = myVariable + 1;
		System.out.println(myVariable);
		
		// Declaring and initializing myVar2 in one step
		int myVar2 = 7; 
		System.out.println(myVariable + myVar2);
		
		// Declaring a variable called 'x' of type double
		double x = 2.5;
		System.out.println(x);
		// NOTE: You cannot convert from double to integer, but vice versa is allowed
		 
		// Declare a variable called 'hello' of type String
		String hello = "Hello World";
		System.out.println(hello);
		
		String hi = "Hi";
		String name = "Charlie";
		System.out.println(hi + name); // This is called string concatenation
		
		
		
	}
}
