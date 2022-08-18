
// This is a package declaration. It goes at the very top of the Java file. Only a comment can precede this
package tutorials.advanced; // This class is inside the 'advanced' package, which is inside the 'tutorials' package
 
//import tutorials.basic.Person; // Imports the class 'Person' from the 'basic' package inside the 'tutorials' package

import javax.swing.JLabel; // Imports the class 'JLabel' from the 'swing' package inside the 'javax' package

public class Packages {
	public static void main(String[] args) {
		
		// This is how you use the fully qualified name. You place the full name before the type and constructor
		tutorials.basic.Person person = new tutorials.basic.Person("");
		
		// We can create a new 'Person' without referring to the 'Person' class in tutorials > basic
		// Person p1 = new Person(); 
		
		JLabel lbl;
	}
}
