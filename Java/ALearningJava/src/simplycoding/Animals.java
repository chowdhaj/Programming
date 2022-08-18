package simplycoding;

public class Animals {

	public static void main(String[] args) {

		Dog lab = new Dog("Charlie", "Black", 4, true);
		Dog pit = new Dog("Tango", "White", 3, false);
		Dog dane = new Dog("George", "Brown", 5, true);
		
		lab.setName("Barker");
		pit.setName("Whiskey");
		dane.setName("Spider");
		
		Dog labPit = lab.breed(pit);
		if (labPit != null) {
			System.out.println("A puppy was born");
		} else {
			System.out.println("The two dogs couldn't breed");
		}		
		
		/*
		Dog d = new Dog();

		d.setColor("Black");
		d.setGender(true);
		d.setHeight(12.2);
		d.setLegs(4);
		d.setName("Action Jack Barker");

		System.out.println("His name is " + d.getName() + ".\nHe has " + d.getLegs() + " limbs, " + d.getColor().toLowerCase() + " fur, and is " + d.getHeight() + " inches tall.");

		System.out.println("");

		System.out.printf("His name is %s.\nHe has %d legs, %s fur, and is %.2f inches tall.", 
				d.getName(), d.getLegs(), d.getColor().toLowerCase(), d.getHeight());
		*/
	}
}


