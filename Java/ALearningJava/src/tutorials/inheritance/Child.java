package tutorials.inheritance;

// In order to inherit classes, use the keyword 'extends'
// The child class is inheriting the attributes and methods of the 'Parent' class
public class Child extends Parent {
	public static void main(String[] args) {
		Child c = new Child(); // Creates a new instance of 'Child'
		System.out.println(c.eyeColor); // Outputs the eye color of 'Child' (Brown is printed to console)
		
		/*/
		 * There is no String variable in this entire class that stores any data, yet "Brown" is still printed to console. This occurs ...
		 * ... because 'Child' inherits from the 'Parent' class, so it gets all of its methods and attributes
		/*/
	}
}
