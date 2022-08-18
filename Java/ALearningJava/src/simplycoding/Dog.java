package simplycoding;

import java.util.Random;

public class Dog {
	
	private String name, color; 
	private int age;
	private double height, maxHeight;
	private Boolean isMale;
	
	/**
	 * Creates a dog using default parameters
	 */
	public Dog() {
		this.name = "";
		this.color = "";
		this.age = 1;
		this.height = 0.5;
		this.maxHeight = 2;
		this.isMale = true;
	}
	
	/**
	 * Creates a dog and gives it basic attributes (see below)
	 * 
	 * @param name name of the dog
	 * @param legs how many legs it has
	 * @param height how tall is it
	 * @param color what color is its fur
	 * @param isMale Is the dog a male
	 */
	public Dog(String name, String color, double maxHeight, Boolean isMale) {
		this.name = name;
		this.color = color;
		this.age = 1;
		this.height = 0.5;
		this.maxHeight = maxHeight;
		this.isMale = isMale;
	}
	
	// G E T T E R S //
	public String getName() { return this.name; }
	
	public int getLegs() { return this.age; }
	
	public double getHeight() { return this.height; }

	public double getMaxHeight() { return this.maxHeight; }

	public String getColor() { return this.color; }

	public boolean getGender() { return this.isMale; }
	
	// S E T T E R S //
	public void setName(String name) { this.name = name; }
	
	public void setLegs(int legs) { this.age = legs; }

	public void setHeight(double height) { this.height = height; }

	public void setMaxHeight(double height) { this.height = height; }
	
	public void setColor(String color) { this.color = color; }
	
	public void setGender(boolean isMale) { this.isMale = isMale; }
	
	// T O O L S //
	public void birthday() {
		age++;
		if (height < maxHeight) {
			height += 0.7;
		}
	}
	
	public int random(int min, int max) { 
		return new Random().nextInt(max + 1 - min) + min; 
	}
	
	public Dog breed(Dog d) {
		if (this.isMale ^ d.getGender()) {
			Dog pup = new Dog();
			
			switch(random(1,3)) {
			case 1: 
				pup.setColor(this.color);
				break;
			case 2:
				pup.setColor(d.getColor());
				break;
			case 3:
				pup.setColor(this.color + " & " + d.getColor());
				break;
			}
			
			pup.setMaxHeight((this.maxHeight + d.getMaxHeight()) / 2);
			
			switch(random(0,1)) {
			case 0:
				pup.setGender(true);
				break;
			case 1:
				pup.setGender(false);
				break;
			}
			return pup;
		} else {
			return null;
		}
	}
}
