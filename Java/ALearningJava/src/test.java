import java.util.Scanner;
import java.util.Random;

public class test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b1, c1, c2, d1, d2, e1, x1, x2, x3, x4;

		System.out.println(6789 % 100);
		
		System.out.print("Enter a 4-digit binary number: ");
		a = input.nextInt();
		
		if (a >= 1000 || a <= 9999) {

			b1 = a % 10;

			c1 = a % 100;
			c2 = c1 / 10;

			d1 = a % 1000;
			d2 = d1 / 100;

			e1 = a / 1000;
			
			x1 = ((e1 + 7) % 10);
			x2 = ((d2 + 7) % 10);
			x3 = ((c2 + 7) % 10);
			x4 = ((b1 + 7) % 10);
			
			System.out.println("The encryption of " + a + " is " + x3 + x4 + x1 + x2  + ".");
		}
		else {
			System.out.println("Encryption error! Number entered either negative, larger or smaller than 4 digits!");
		}
	}
	
	/*
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b1, c1, c2, d1, d2, e1, x1, x2, x3, x4;

		System.out.print("Enter a 4-digit number: ");
		a = input.nextInt();

		if (a >= 1000 || a <= 9999) {

			b1 = a % 10;

			c1 = a % 100;
			c2 = c1 / 10;

			d1 = a % 1000;
			d2 = d1 / 100;

			e1 = a / 1000;
			
			x1 = ((e1 + 10) - 7);
			if (x1 >= 10) {
				x1 = x1 - 10;
			}
			
			x2 = ((d2 + 10) - 7);
			if (x2 >= 10) {
				x2 = x2 - 10;
			}
			
			x3 = ((c2 + 10) - 7);
			if (x3 >= 10) {
				x3 = x3 - 10;
			}
			
			x4 = ((b1 + 10) - 7);
			if (x4 >= 10) {
				x4 = x4 - 10;
			}
			
			System.out.println("The decryption of " + a + " is " + x3 + x4 + x1 + x2  + ".");
		} 
		else {
			System.out.println("Decryption error! Number entered either negative, larger or smaller than 4 digits!");
		}
	}
	*/
}

// 4.38

/*
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] z = new int[5];
		
		int x = 0;
		while (x++ < 5) {
			System.out.print("Please enter #" + x + " ==> ");
			z[x-1] = sc.nextInt();
		}
		
		x = 1;
		int h = z[x-1];
		
		while (x++ < z.length) {
			if (h < z[x-1]) h = z[x-1];
		}
		
		System.out.println("Largest number: " + h);
}
*/

/*
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int i = sc.nextInt();
		
		if (i == 1) {
			System.out.println("*");
			return;
		}
		
		printTopBottom(i);
		System.out.println("");
		for (int a = 0; a < (i-2); a++) {
			printMiddle(i);
			System.out.println("");
		}
		printTopBottom(i);		
	}
	
	static void printTopBottom(int x) {
		int z = 0;
		while (z < x) {
			System.out.print("* ");
			z++;
		}
	}
	
	static void printMiddle(int x) {
		System.out.print("*");
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		if (x > 3) {
			for (int i = 0; i < (x-3); i++) {
				System.out.print(" ");
			}
		}
		System.out.print("*");
	}
*/

/*
public static void main(String[] args) {
		
		for(int i = 1; i < 8; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int x = 1; x < 16; x++) {
				if (x % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
*/

/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Factorial? ==> ");
		int f = sc.nextInt();
		System.out.printf("%d! = %.2f", f, fact(f));
		System.out.printf("\ne is %.5f",calc(f));
		System.out.print("\nPrecision? ==> ");
		int e = sc.nextInt();
		System.out.printf("e^%d is %f", e, prec(f, e));
	}
	
	static double fact(double x) {
		double fact = 1;
		for (int i = 1; i <= x; i++) fact = fact * i;
		return fact;
	}
	
	static double calc(int x) {
		double e = 0;
		while (x >= 1) e += Math.pow(fact(x--), -1);
		return 1 + e;
	}
	
	static double prec(int x, int y) {
		double e = 0;
		int c = 1;
		for (int i = 1; i < y; i++) {
			e += Math.pow(x, i) / fact(i);
		}
		return 1 + e;
	}	
*/