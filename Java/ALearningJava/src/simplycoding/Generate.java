package simplycoding;

import java.util.Random;

public class Generate {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			System.out.printf(randomRangeInt(1,10) + ", ");
		}	
		
		System.out.println("\n\n------ D I V I D E R ------\n");
		
		for (int i = 0; i < 50; i++) {
			System.out.println(roundIt(new Random().nextDouble() + randomRangeInt(1,10)));
		}	
	}
	
	/**
	 * 
	 * @param d Number to be rounded
	 * @return The rounded number to 4 decimal places
	 */
	private static String roundIt(double d) {
		return String.format("%.4f", d);
	}

	/**
	 * Generate a random number between the two values provided, inclusive
	 * @param min The min threshold
	 * @param max The max threshold
	 * @return A value between min and max, inclusive
	 */
	public static int randomRangeInt(int min, int max) { return new Random().nextInt(max + 1 - min) + min; }
	
	/**
	 * 
	 * @param max The maximum number
	 * @return A random number between 0 and max
	 */
	public static int randomInt(int max) {
		return randomRangeInt(0, max);
	}
}
