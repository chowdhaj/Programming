package mikeDaneJavaTutorial.tutorial34;

/**
 * Italian Chef ADT (Extends Chef ADT)
 * 
 * @author Jatin
 */
public class ItalianChef extends Chef {
	
	@Override
	public void makeSpecialDish() {
		System.out.println("The chef makes spaghetti tacos");
	}
	
	public void makePasta() {
		System.out.println("The chef makes cheesy pasta");
	}
}
