package mikeDaneJavaTutorial.tutorial34;

/**
 * Chinese Chef ADT (Extends Chef ADT)
 * 
 * @author Jatin
 */
public class ChineseChef extends Chef{
	
	@Override
	public void makeSpecialDish() {
		System.out.println("The chef makes orange chicken");
	}
	
	public void makeFriedRice() {
		System.out.println("The chef makes fried rice");
	}
}
