package tutorials.basic;

public class Loops {
	public static void main(String[] args) {

		//whileLoop();
		doWhileLoop();
		forLoop();
	}
	
	// While Loops
	static void whileLoop() {
		int counter = 0;
		while (counter < 10) {
			counter = counter + 1;
			System.out.println(counter);
		}
	}
	
	// In a "Do While Loop" the code WILL run at least once, even if the condition is false
	static void doWhileLoop() {
		int counter = 10;
		do {
			counter++;
			System.out.println(counter);
		} while (true);
	}
	
	static void forLoop() {
		// for (initialize counter; condition to see if we should run the loop; change counter variable)
		for (int counter = 0; counter > 10; counter = counter + 1) {
			System.out.println(counter);
			// In 'for loops' the counter is incremented at the END
			// That's why this loop prints numbers from 0 to 9 while the other loops print 1 to 10
		}
	}
}
