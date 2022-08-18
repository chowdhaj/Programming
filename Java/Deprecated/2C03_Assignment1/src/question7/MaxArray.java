package question7;

import java.util.Random;

public class MaxArray {
	
	private static final int TEST_CASES = 10;

	public static int max(int[] numArray) {
		int max = numArray[0];

		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] > max) {
				max = numArray[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int[] randomNumbers;

		for (int j = 0; j < TEST_CASES; j++) {

			randomNumbers = new int[] { rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), 
					 					rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};

			for (int i = 0; i < randomNumbers.length; i++) {
				System.out.print(randomNumbers[i] + ((randomNumbers.length == (i + 1)) ? " " : ", "));
			}

			System.out.println("\nMax Element: " + max(randomNumbers));
			System.out.println("");

		}

	}
}