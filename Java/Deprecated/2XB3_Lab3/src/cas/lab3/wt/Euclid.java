package cas.lab3.wt;

public class Euclid {

	public static int gcd(int a, int b) {

		// recursively find gcd
		if (a % b == 0) {
			return b;
		} else {
			return gcd (b, a % b);
		}				
	}
	// System.out.println(1071 & 2); explain this

	public static int gcd2(int a, int b) {

		// non recursively find gcd

		int c;
		while (!(a % b == 0)) {
			c = a % b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		int d = gcd(p, q);
		int d2 = gcd2(p, q);

		System.out.println("gcd(" + p + ", " + q + ") = " + d);
		System.out.println("gcd(" + p + ", " + q + ") = " + d2);

	}
}
