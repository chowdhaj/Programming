package tutorials.basic;
import javax.swing.JLabel;

public class ClassesAndObjects {
	public static void main(String[] args) {
		
		/*
		 * The class is JLabel and we're creating an instance of the class by using the 'new' keyword and calling what is called a constructor...
		 * ... and assigning the object that has returned into our label variable
		 * So when the line below executes, our label variable will refer to an instance of the JLabel class
		 * A class is kind of like a blueprint for an object. You only need one blueprint to build a house, but using the same blueprint...
		 * ... you can build many similar houses. This idea is what java is based on. Once you have created your class, you can instantiate...
		 * as many objects as you want from the class; and each object will be independent from the others. Each object is able to have it its own...
		 * ... variables and methods, so changing one object will not affect the others. 
		 * When we create an object, we do so by calling the constructor for the class. And we do this by using the word 'new' followed by...
		 * ... the name of the class and brackets. This part is called the constructor. 
		 */
		JLabel label = new JLabel();
		
		Person john = new Person("John");
		john.setAge(20);
		john.setHeight(177.5);
		Person bob = new Person("Bob");
		bob.setAge(25);
		bob.setHeight(175.5);
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old");
		System.out.println(john.getName() + " is " + john.getHeight() + "cm tall");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old");
		System.out.println(bob.getName() + " is " + bob.getHeight() + "cm tall");
		
	}
}
 