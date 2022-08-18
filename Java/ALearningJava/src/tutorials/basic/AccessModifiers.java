package tutorials.basic;

public class AccessModifiers {
	
	private int x; // You can also use protected and default, which would make these two variables... 
	public int y; // ... only accessible from the 'basic' package
	
	public static void main(String[] args) {
		
		/*/
		 * Access modifiers put restrictions on how parts of the code can be accessed, if at all
		 * Examples include: public, private, protected, default
		 * Private is the most restrictive, then default, then protected, and public is not restrictive at all
		 * These can also be applied to variables (i.e. private int x, public int y, etc.)
		 * Generally speaking, you want to keep everything as private as possible (Don't use public). This helps make the program...
		 * ... more secure and simplifies the interface as much as possible
		 * Getters and setters can be used to get and change values of variables
		/*/
	}
	
	// public access modifier
	public void doSomethingPublic() {
		// Can be accessed anywhere from our program, as long as we have an instance of this class to call it from
	}
	
	// private access modifier
	private void doSomethingPrivate() {
		// This method cannot be accessed, anywhere other than inside of this class
	}
	
	// protected access modifier
	protected void doSomethingProtected() {
		// Can only be accessed inside of this package and from subclasses of this class
	}
	
	// To use the default access modifier, do not specify anything and Java will automatically understand
	// default access modifier
	void doSomething() {
		// This method can only be accessed inside of this package. Default is similar to protected but protected allows...
		// ... the method to be accessed from subclasses, as well 
	}
	
}
