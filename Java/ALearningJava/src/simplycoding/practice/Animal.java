package simplycoding.practice;

import java.util.Random;

public abstract class Animal {
	
	private static int COUNT = 0;
	public String name, furColor;	
	private int age, health;
	private double height, maxHeight;
	private boolean isMale, hasWhiskers;
	
	public Animal() {
		this.age = 1;
		this.health = 100;
		this.height = 0.2;
		this.isMale = true;
		this.hasWhiskers = true;
		Animal.COUNT++;
	}
	
	public Animal(String name, String furColor, double maxHeight, boolean isMale, boolean hasWhiskers) {
		this.name = name;
		this.furColor = furColor;
		this.health = 100;
		this.maxHeight = maxHeight;
		this.isMale = isMale;
		this.hasWhiskers = hasWhiskers;
		Animal.COUNT++;
	}
	
	// G E T T E R S 
	public String getName() { return this.name; }
	public String getFurColor() { return this.furColor; }
	public int getAge() { return this.age; }
	public int getHealth() { return this.health; }
	public double getHeight() { return this.height; }
	public double getMaxHeight() { return this.maxHeight; }
	public boolean getGender() { return this.isMale; }
	public boolean getWhiskers() { return this.hasWhiskers; }
	public static int getCount() { return COUNT; }
		
	// S E T T E R S
	public void setName(String name) { this.name = name; }
	public void setFurColor(String furColor) { this.furColor = furColor; }
	public void setAge(int age) { this.age = age; }
	public void setHealth(int health) {this.health = health; }
	public void setHeight(double height) { this.height = height; }
	public void setMaxHeight(double maxHeight) { this.maxHeight = maxHeight; }
	public void setGender(boolean isMale) { this.isMale = isMale; }
	public void setWhiskers(boolean hasWhiskers) { this.hasWhiskers = hasWhiskers; }
	
	// T O O L S
	public void birthday() {
		
		if (isDead()) {
			return;
		}
		
		age++;
		
		if (height < maxHeight) {
			height += 0.25;
		}
		
		if (age >= 15) {
			health -= random(15, 20);
		}
		
		if (health < 0) { 
			health = 0;
		}
	}
	
	public boolean isDead() {
		return this.health == 0;
	}
	
	public abstract Animal breed(Animal a);
	
	private int random(int min, int max) {
		return new Random().nextInt(max + 1 - min) + min;
	}

	public void attack(Animal a) {
		int damage = random(5, 10);
		a.setHealth(a.getHealth() - damage);
		System.out.printf("\n%s inflicted %d damage on %s\n", getName(), damage, a.getName());
	}
	
	@Override
	public String toString() {
		return String.format(
				"\nName: %s, FurColor: %s, Age: %d, Health: %d, Height: %.2f, Max-Height: %.2f, Gender: %s, %s\n", 
				this.name, this.furColor, this.age, this.health, this.height, this.maxHeight, 
				this.isMale ? "Male" : "Female", this.hasWhiskers ? "Has Whiskers" : "Does Not Have Whiskers"
		);
	}	
}