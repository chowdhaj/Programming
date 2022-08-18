package tutorials.basic;

public class Scope {
	
	// Declare methods here to make them accessible by ALL methods [Global/Class variables]
	
	// Because 'y' is declared outside of any method, it is in scope to all methods
	// In other words, any method can access 'y'
	static int y; // Declaring the variable 'y'
	
	public static void main(String[] args) {
		
		int x = 10;
		System.out.println(x); // Print 'x' to console
		int y = 7; // Assigning a value to 'y'
		System.out.println(y);
		doSomething(); // When this method is called, 'y' goes from 7 to 17
		System.out.println(y);
	
	}
	
	static void doSomething() {
		// NOTE: You can't access variables declared within method 'A' in method 'B'
		// x = 10; // This will not run because 'x' is not declared HERE
		
		y = 17;
	}
	
	static void doSomethingLocally() {
		// Because 'z' is declared inside this method, it is local to this method [Local variables]
		// In other words, no other method has access to 'z'
		// After this method has finished executing, it no longer exists
		int z = 120; // Declaring and initializing the variable 'z'
		System.out.println(z); // This statement will not work outside of THIS method
	}
	
}
