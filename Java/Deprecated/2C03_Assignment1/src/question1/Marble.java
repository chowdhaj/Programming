package question1;

import java.util.Random;

public class Marble {

	private final String marbleName;
	private final String marbleColor;
	private final double marbleWeight;
	private final Random rand = new Random();
	private final String [] COLORS = {"white", "black", "pink", "red", "blue"};

	public Marble(String name) {
		this.marbleName = name;
		this.marbleColor = COLORS[rand.nextInt(5)];
		this.marbleWeight = Math.round(rand.nextDouble() * 1000.0 + 10) / 10.0;
	}
	
	public Marble(String name, String color, double weight){
		this.marbleName = name;
		this.marbleColor = color;
		this.marbleWeight = weight;
	}
	
	public String getName() {
		return this.marbleName;
	}

	public String getColor() {
		return this.marbleColor;
	}

	public double getWeight() {
		return this.marbleWeight;
	}

	public String toString() {
		return getName() + " is a " + getColor() + " marble that weighs " + getWeight() + " grams.";
	}

	public static void main(String[] args) {
		
		//Marble m = new Marble("m1", "blue", 30.21);
		//Marble n = new Marble("m2", "red", 10.77);
		//Marble o = new Marble("m3", "black", 14.56);
		//Marble p = new Marble("m4", "white", 23.94);
		
		Marble m = new Marble("m1");
		Marble n = new Marble("m2");
		Marble o = new Marble("m3");
		Marble p = new Marble("m4");
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	}

}
