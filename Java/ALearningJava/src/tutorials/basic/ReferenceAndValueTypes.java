package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		/*/
		 *  Primitive/Value types are: byte, long, int (integer), long, float, double, boolean, and char
		 *  Any time you are using one of the above, you are using a value type. And any time you are using a...
		 *  ... String, JLabel, JFrame, etc. you are using a reference type. Java passes by value, NOT reference
		 *  The example below demonstrates this. The method 'addOneTo()' adds 1 to 5, NOT 'int x'. So when you print... 
		 *  ... 'int x' to console, you get 5, and NOT 6. The method 'celebrateBirthday(Person playerOne)' demonstrates...
		 *  ... how Java passes by reference. When 1 is added to 'playerOne's' age, it refers back to the space in MEMORY
		/*/
		
		int x = 5; // Declare and initialize a variable of type int named 'x' and assign a value of 5 to it
		addOneTo(x); // Passes a value type, so it passes the VALUE of 'x', which is 5, to the method 'addOneTo()', NOT 'int x' itself
		System.out.println(x); // Outputs 5 to the console because 'x' is unchanged
		
		Person playerOne;
		playerOne = new Person("John"); // Creating a new person object and assigning 'playerOne' to refer to it
		playerOne.setAge(20); // Set 'playerOne's' age to 20 
		celebrateBirthday(playerOne); // We're passing that reference to a method, so that method can use that reference to manipulate the object 
		System.out.println(playerOne.getAge()); // Prints out age of 'playerOne' to console [21]
	}
	
	private static void celebrateBirthday(Person playerOne) {
		// Setting Player One's age to his current age plus one [20 + 1 = 21]
		playerOne.setAge(playerOne.getAge() + 1);
		
		// playerOne.setAge(playerOne.getAge() + 1); // This will increment age by 1 to 22
		// playerOne.setAge(21); This works as will and will set 'playerOne's' age to 21
	}

	// This method manipulates a copy of the value passed
	static void addOneTo(int number) {
		number++; // Increments the variable, 'number' by one. So 5 + 1 = 6
		System.out.println(number); // Outputs the variable 'number' to the console which holds a value of 6
	}
}
