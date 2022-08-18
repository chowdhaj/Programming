package cas.lab3.wt;

public class Harmonic {

	public static double harmonic(int n) {
		double sum = 0.0;
		
		for (int i = 1; i <= n; i++) {
			sum += (1 / (double) (i));
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < args.length; i++) {
			int arg = Integer.parseInt(args[i]);
			double value = harmonic(arg);
			System.out.println(value);
		}

	}

}
