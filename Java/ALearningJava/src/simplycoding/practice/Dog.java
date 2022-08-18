package simplycoding.practice;

import java.util.Random;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String furColor, double maxHeight, boolean isMale, boolean hasWhiskers) { 
		super(name, furColor, maxHeight, isMale, hasWhiskers);
	}
	
	public void speak() {
		System.out.printf("My name is %s", getName());
		//attack(new Animal());
		//random(0, 5);
	}
	
	@Override
	public void attack(Animal a) {	
		int damage = random(5, 20);
		a.setHealth(a.getHealth() - damage);
		System.out.printf("\n%s inflicted %d damage on %s\n", getName(), damage, a.getName());
	}
	
	@Override
	public Animal breed(Animal a) {
		
		if (this.getGender() ^ a.getGender() && a instanceof Dog) {
			
			Dog pup = new Dog();
			
			switch (random(0,3)) {
				case 0: 
					pup.setFurColor(this.furColor);
					break;
				case 1:
					pup.setFurColor(a.getFurColor());
					break;
				case 2:
					pup.setFurColor(this.furColor + " With " + a.getFurColor() + " Stripes");
					break;
				case 3: 
					pup.setFurColor(a.getFurColor() + " With " + this.furColor + " Stripes");
					break;
			}
			
			pup.setAge(1);
			
			pup.setHeight(0.5);
			
			pup.setMaxHeight((this.getMaxHeight() + a.getMaxHeight()) / 2); 
			
			switch (random(0,1)) {
				case 0 :
					pup.setGender(true);
					break;
				case 1 : 
					pup.setGender(false);
					break;
			}
			
			if (this.getWhiskers() && a.getWhiskers()) {
				pup.setWhiskers(true);
			} else if (this.getWhiskers() || a.getWhiskers()) {
				switch(random(0,1)) {
					case 0: 	
						pup.setWhiskers(true);
						break;
					case 1: 
						pup.setWhiskers(false);
						break;
				}
			} else {
				pup.setWhiskers(false);
			}
	
			return pup;
			
		} else { return null; }
	}
	
	private int random(int min, int max) { 
		return new Random().nextInt(max + 1 - min) + min; 
	}
}
