package cas.lab3.wt;

public class Fibonacci {

	public static long fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (n == 1) System.out.println("lol");
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// These two are computed in a second or less
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(10));
		
		//System.out.println(fibonacci(100)); // This crashes my laptop
	}
}
