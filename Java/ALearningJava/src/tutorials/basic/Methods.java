package tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		
		// Call the method three times
		sayHello(); // Java jumps down to where the method is...
		sayHello(); // And executes the code in that method...
		sayHello(); // Then it jumps back to where it was... 
		// The code after this line is executed next
		
		sayHelloTo("Charlie");
		sayHelloTo("John");
		
		int x = returnNumber();
		System.out.println(x);
		
		//int result = square(returnFive());
		System.out.println(square(returnNumber()));
	}
	
	// This method returns a value and takes in data
	// It takes in 'x' and returns 'x * x'
	static int square(int x) {
		return x * x;
	}
	
	// This method returns an int type with the value 5
	static int returnNumber() {
		return 10;
	}
	
	// This method will say hello to whatever name is passed when called
	// Void means that the function doesn't return anything
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
	// This method is called 'sayHello' and prints "Hello World" to console
	static void sayHello() {
		System.out.println("Hello");
	}
}
