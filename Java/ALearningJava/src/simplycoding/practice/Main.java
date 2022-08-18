package simplycoding.practice;

public class Main implements Store {
	
	public static void main(String[] args) {
		
		Dog pome = new Dog("Billy", "Black", 3.2, true, false);
		Dog pit = new Dog("Andre", "Brown", 2.7, false, true);
		Dog lab = new Dog("Phil", "White", 1.5, false, true);
		
		Dog lab2 = (Dog) lab;
		
		pit.speak();
		
		Animal kitty = lab.breed(pome);
		
		if (kitty != null) {
			System.out.printf("\n\nA Kitten Is Born\nColor: %s\nAge: %d\nHeight: %.2f\nMax Height: %.2f\nGender: %s\nHas Whiskers: %s", 
					kitty.getFurColor(), kitty.getAge(), kitty.getHeight() ,kitty.getMaxHeight(), 
					kitty.getGender() ? "male" : "female", kitty.getWhiskers());
		} else {
			System.out.println("Not possible - genders must be different.\nP.S. There are only two genders");
		}
		
		//while (!kitty.isDead()) {
		while (kitty.isDead()) {
			kitty.birthday();
			System.out.printf("\nAge: %d, Health: %d", kitty.getAge(), kitty.getHealth());
		}
		
		System.out.printf("\n\nAge: %d, Health: %d", kitty.getAge(), kitty.getHealth());
		pome.attack(kitty);
		System.out.printf("Age: %d, Health: %d", kitty.getAge(), kitty.getHealth());
		
		kitty.setName("Pussy");
		
		System.out.printf("\nAnimal count: %s", Animal.getCount());
		
		Tax.test();
		
		System.out.println("Tax On $120 is " + new Main().applyTax(120));
	}
	
	@Override
	public Object buy(double cost) {
		return null;
	}
	
	@Override
	public double sell(Object item) {
		return 0.0;
	}
	
	@Override
	public double buy(Object item) {
		return 0.0;
	}
	
	@Override
	public double applyTax(double price) {
		return price * TAX_RATE;
	}
	
	@Override
	public Object trade(Object item) {
		if (item instanceof Dog) {
			return new Dog();
		} else if (item instanceof Cat) {
			return new Cat();
		} else {
			System.out.println("This item is not trade-able");
			return item;
		}
	}
}
