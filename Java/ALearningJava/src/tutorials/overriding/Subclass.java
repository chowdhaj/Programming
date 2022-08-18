package tutorials.overriding;

// Inherits all the variables and methods defined in 'Base'
public class Subclass extends Base {
	
	// This is the main method
	public static void main(String[] args) {
		
		Subclass s = new Subclass(); // Creates a new instance of 'Subclass'
		//s.sayHello(); // Instead of making a constructor you can call the method on the instance 
	}
	public Subclass() {
		sayHello(); // We are calling the 'sayHello()' method defined in 'Base' and it prints 'Hello' to console
	}
	
	@Override // Overriding allows you to define the method that you are inheriting in your subclass and either add to or completely change its functionality
	public void sayHello() {
		// TODO Auto-generated method stub
		super.sayHello(); // Calls the method from our 'Base' class - this is what the keyword 'super' means
		/*/
		 * 'super' refers to the instance of the class that this class extends. In this case, 'super' is an instance of 'Base'. We are calling ...
		 * ... the 'sayHello()' method on the 'Base' instance
		 * If we removed the 'super.sayHello()' the 'syso' line would run (Only "Hi" is printed out)
		/*/
		
		// This is the next line that runs after the one above 
		System.out.println("Hi"); // Prints 'Hi' to console
		// What Java is doing is running the method in our 'Base' class (sayHello()), and then executes the next line which is the 'syso'
	}
}
