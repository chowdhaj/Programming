package tutorials.inheritance;

/*/
 * Parent doesn't extend anything - but this is not true because every class in Java automatically inherits the class called 'Object'. Press ...
 * ... CTRL + SPACE to view template proposals to understand this 
/*/
public class Parent {
	String eyeColor = "Brown"; // Declared and initialized a variable of type String called 'eyeColor' and "Brown" is stored in it
}

/*/
 * Inheritance in Object-Oriented-Programming is somewhat similar to thinking about inheritance between a parent and a child. For example ...
 * ... the child might inherit their eye color from their parent. The general idea is that the child can inherit characteristics from their ...
 * ... parent. In Java, the Child class (AKA subclass), inherits all methods and attributes from the Parent class (AKA superclass) - and you can ...
 * ... also define additional methods and attributes inside the Child class. 
 *  For all intensive purposes, you can treat a 'Child' as if it were a 'Parent'. This forms a 'is-a' relationship; the 'Child' is also a 'Parent'. For ...
 *  ... example, think of the superclass as 'Mammal' and subclass as 'Dog'. We can say that all dogs are mammals, but NOT all mammals are dogs - the ...
 *  ... relationship is one-way.  
 *  Parent class = Superclass = Base class
 *  Child class = Subclass = Derived class
 *  
/*/