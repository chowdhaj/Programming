package simplycoding.practice;

interface Tax {

	double TAX_RATE = 1.13;
	double applyTax(double price);
	
	static void test() {
		System.out.println("\nTesting 1, 2, 3...");
	}
}
