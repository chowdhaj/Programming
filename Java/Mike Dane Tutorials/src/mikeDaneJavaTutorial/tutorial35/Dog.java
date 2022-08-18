package mikeDaneJavaTutorial.tutorial35;

/**
 * Dog Object (Implements Animal Class)
 * 
 * @author Jatin
 */
public class Dog implements Animal {

	@Override
	public void speak() {

		System.out.println("Woof Woof");
	}

	@Override
	public void eat() {
		
		System.out.println("Eats some pedigree treats");
	}
}