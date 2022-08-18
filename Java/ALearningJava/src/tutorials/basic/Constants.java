package tutorials.basic;

public class Constants {
	
	/*/
	 *  You can use the 'static final' keyword to make a variable CONSTANT
	 *  There will only be one instance of WIDTH & HEIGHT in memory (due to the 'static' keyword)
	 *  You can make CONSTANTS public because there values will never change so there is no harm
	/*/
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	/*/
	 *  The P1 variable is a final reference. The VALUE in P1, which is a reference, is FINAL. This means that you can ...
	 *  ... never say that P1 equals a different person, but you can access and change the data of the P1 object it refers to. All that ...
	 *  ... is final is the reference itself, not necessarily the data inside the object the reference points to
	/*/
	public static final Person P1 = new Person("John");
	
	// Use an underscore for naming constants with two words
	public static final int NUM_ENEMIES = 5;
	
	public static void main(String[] args) {
		
		/*/
		 * A constant is a piece of data that will NEVER change once assigned. They are usually static and by...
		 * ... convention, CONSTANTS are UPPERCASE. You can declare constants by using the 'final' modifier. Also, you can make
		 * ... CONSTANTS public because there is no harm in accessing variables directly if you can't alter it. And because constants ...
		 * ... are static, you should access them through the class name directly, not through an instance of the class
		/*/

		System.out.println(Math.PI); // An example of constants is 'PI' from the math class
		System.out.println(Constants.WIDTH); // Prints 'WIDTH' to console
		System.out.println(HEIGHT); // Prints 'HEIGHT' to console. Note: Since we are inside the 'Constants' class itself, we don't need to add 'Constants' like above.
	}
}
