package mikeDaneJavaTutorial.tutorial35;

/**
 * Bird Object (Implements Animal Class)
 * 
 * @author Jatin
 */
public class Bird implements Animal {

	@Override
	public void speak() {
		
		System.out.println("Tweet Tweet");
	}

	@Override
	public void eat() {
		
		System.out.println("Eats a worm");
	}
}