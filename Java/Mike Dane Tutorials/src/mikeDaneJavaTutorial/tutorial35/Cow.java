package mikeDaneJavaTutorial.tutorial35;

/**
 * Cow Object (Implements Animal Class)
 * 
 * @author Jatin
 */
public class Cow implements Animal {

	@Override
	public void speak() {
		
		System.out.println("Moo Moo");
	}

	@Override
	public void eat() {
		
		System.out.println("Eats Grass");
	}	
}