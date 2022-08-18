package cas.lab3.wt;

public class Hyperbolic {

	public static double cosh(double x) {

		// cosh(x)= (e^x + e^−x) / 2
		double e = (Math.exp(x) + Math.exp(-x));
		return (e / 2);
	}
	
	public static double sech(double x) { return (1 / cosh(x)); }

	public static double sinh(double x) {
	
		// sinh(x)=(e^x − e^-x)/2 
		double e = (Math.exp(x) - Math.exp(-x));
		return (e / 2);
	}
	
	public static double csch(double x) { return (1 / sinh(x)); }

	public static double tanh(double x) { return ((sinh(x))/(cosh(x))); }
	
	public static double coth(double x) { return (1 / tanh(x)); }

	public static void main(String[] args) {

		double x = Double.parseDouble(args[0]);
		System.out.printf("sinh(%f) = %f\n", x, sinh(x));
		System.out.printf("cosh(%f) = %f\n", x, cosh(x));
		System.out.printf("tanh(%f) = %f\n", x, tanh(x));
	}

}