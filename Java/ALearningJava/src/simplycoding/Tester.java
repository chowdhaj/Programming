package simplycoding;

import static java.lang.System.out;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;


public class Tester {
	
	public static int x = 10;
		
	public static void main(String[] args) throws Exception {
			
		/*
		System.out.println("haro der");
		
		double num1 = 123.456789098765;
		float num2 = 123.456f;
		
		long num3 = 987654321;
		int num4 = 1234567;
		short num5 = 3513;
		byte num6 = 65;
		
		String greet = new String("new");
		String greet2 = "Hi";
		
		System.out.println((double) 4 / 7);
		System.out.println(Math.sqrt(25));
		
		System.out.println("41" + 2 + 3 + 4);
		System.out.println(3 + 3 + 4 + "51" + 1 + 1 +2);
		
		int n = 30;
		
		n = n + 5;
		System.out.println(n);
		
		n = n * 5;
		System.out.println(n);
		
		n = n / 5;
		System.out.println(n);
		
		n = 1 + 2 + n + 5 * 2;
		System.out.println(n);
		
		n += 5; // Same as n = n + 5
		System.out.println(n);
		
		n /= 5; // Akin to n = n / 5
		System.out.println(n);
		
		// n = n + 1;
		// n += 1;
		// n++;
		
		int a = 5;
		int b = 0;
		
		b = ++a; // 1 is added to 'a' before it is assigned to 'b' // a = 6, b = 6
		
		a = 5; b = 0;
		b = a++; // 1 is added to 'b' after it is assigned to 'a' // a = 5, b = 6;
		
		System.out.println( (short) 9 / (byte) 2 ); // The byte gets converted into a short to prevent loss of accuracy
		
		System.out.println("And Trump said: \"Women don't deserve any rights\"");
		
		System.out.println("C:\\Users\\Desktop\\Folder");
		
		System.out.printf("The numbers are %d and %d", a, b);
		
		double f = 253324.99323;
		
		System.out.printf("This costs $%,.2f", f);
		
		String word = String.format("\n%s sold his G-Wagon for $%,.2f", "Mike", f/3);
		
		System.out.println(word);
		
		out.print("lol\n");
		
		char lf = 10;
		
		out.println("hi there" + lf + "name's bob");
		
		String ab = "Hell";
		String bb = "Hell";
		out.println(ab.equals(bb));
		
		int x = 3;
		int y = 5;
		int z = 3;
		
		out.println(x == y ^ x == z); // Returns true
		out.println(x == 3 ^ x == z); // Returns false
		
		int items = 12;
		
		if (items == 12) {
			out.println("Yup"); 
		} else if (items < 12 && items >= 0) {
			out.println("no"); 
		} else if (items > 12) {
			out.println("Extra");
		} else {
			out.println("err");
		}
		
		int zee = 1;
		
		while (zee < 10) {
			System.out.printf("\nLoop #%d", zee++);
		}
		
		System.out.println();
		
		for (int i = 10; i != 0; i--) {
			System.out.println(i);
		}
		
		System.out.printf("Length of args: %s", args.length);
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		Scanner sc = new Scanner(System.in);
		*/
		/*
		System.out.print("\nWhat is ya age? ==> ");
		int age = sc.nextInt();
		System.out.println("You are: " + age + " years old!");
		
		System.out.print("How tall are you in cm? ==> ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Try again: ");
		}
		
		double height = sc.nextDouble();
		System.out.println("Nice! You are: " + height + "cm tall");
		
		sc.close();
		*/
		/*
		System.out.print("\nPick a month [1-12]: ");
		
		//int mon = sc.nextInt();
		int mon = 2;
		
		switch (mon) {
		case 1: case 2: case 12: 
			System.out.println("Winter");
			break;
		case 3: case 4: case 5: 
			System.out.println("Spring");
			break;
		case 6: case 7: case 8: 
			System.out.println("Summer");
			break;
		case 9: case 10: case 11:
			System.out.println("Fall");
			break;
		default: 
			System.out.println("Invalid...");
		}
		
		dos("Jake");
		dos("Henry");
		dos("Lucas");
		
		int chk = 1234*12;
		System.out.printf("Is %d an even number? %s", chk, status(chk));
		
		System.out.printf("\n%s\n", greeting("Bob"));
		System.out.printf("%s\n", greeting());
		System.out.printf("%s\n", greeting("Jake Ryan"));
		
		System.out.printf(greet("Walter", "Gillis"));
		
		int item1 = 12, item2 = 145;
		
		int cheap = (item1 < item2) ? item1 += 10 + item2 : item2;
		System.out.println("\n" + item1 + "\n" + item2 + "\n" + cheap );
		
		new Tester().hello();
		
		Tester ts = new Tester();
		ts.hello();
		
		System.out.println(Tester.x + 1);
		*/
		
		// ARRAYS //
		
		String[] duggarFamily = {"Jim", "Michelle", "Josh", "Anna", "Jinger", "Jedidiah", "Joe"};
		String[] arr = new String[3];
		arr[0] = "LOL";
		arr[1] = "HELLO";
		arr[2] = "ROFL";
		String[] greeting = new String[]{"Hello", "Goodbye", "Hey"};

		for (String name : duggarFamily) {
			System.out.print(name + " Duggar, ");
		}
		
		System.out.print("Too many Duggars");

		String cool = " " + arr[2];
		System.out.println(cool);
		
		for (int i = 0; i < greeting.length; i++) {
			System.out.println("Greeting #" + i + ": " + greeting[i]);
		}
		
		int aro = 3;
		String[] namez = new String[aro];
		System.out.println(namez.length);
		
		// MULTI DIMENSIONAL ARRAYS //
		
		int scores[][] = new int[2][3];
		
		scores[0][0] = 77;
		scores[0][1] = 88;
		scores[0][2] = 99;

		scores[1][0] = 67;
		scores[1][1] = 78;
		scores[1][2] = 85;
		
		//System.out.println(scores[0][1]); // This is how you access an index in a multi array
		
		System.out.println("\n---------------\n");
		
		// ITERATING USING A FOR EACH LOOP
		int totalz = 0;
		int xss = 0;
		for (int[] a : scores) {
			xss = 0;
			totalz = 0;
			for (int b: a) {
				totalz += b;
				System.out.printf("%d", b);
				if (xss < a.length - 1) System.out.printf(" + ");
				xss++;
			}
			System.out.printf(" = %d  |  Average = %.2f  |  Grade = %s\n", totalz, (double)totalz / 3, calculateGrade((double)totalz / 3));
		}
		System.out.println("\n---------------\n");
		
		int testScores[][] = new int[][] {
			{6, 66, 666, 6666, 66666}, 
			{7, 77, 777, 7777, 77777},
			{8, 88, 888, 8888, 88888}
		};
				
		System.out.print("" + toString(testScores) + "\n");
		System.out.println("Sum: " + sumOfArray(testScores) + "\n");
		// ITERATING USING A FOR LOOP
		
		for (int i = 0; i < testScores.length; i++) {
			for (int j = 0; j < testScores[i].length; j++) {
				System.out.println(testScores[i][j]);
			}
			System.out.println("");
		}
	
		System.out.printf("%s", divideNumbers(20, 0));
		
		int[] arsa = new int[]{0, 1, 2, 3, 4, 5, 6};
		
		try {
			System.out.printf("\n%.2f", divideMe(123, arsa[8]));
		} catch (Exception ArrayOutOfBoundsException) {
			System.out.printf("\nArray Out Of Bounds; %s is not an element in the array\n", ArrayOutOfBoundsException.getMessage());
			ArrayOutOfBoundsException.printStackTrace();
		}
		
		try {
			System.out.println( 8 / Integer.parseInt("asf"));
		} catch (Exception NumberFormatException) {
			System.out.println("That's not a number!");
			NumberFormatException.printStackTrace();
			System.out.println(NumberFormatException.getMessage());
		}
	}
	
	static double divideMe(int x, int y) {
		return (double) x / y;
	}
	
	static String divideNumbers(int x, int y) {
		
		if (y == 0) {
			return "Cannot Divide By Zero";
		} else {
			return String.format("%.2f", (double) x / y);
		}
	}
	
	static int sumOfArray(int[][] t) {
		int sum = 0;
		for (int[] i : t) {
			for (int j : i) {
				sum += j;
			}
		}
		return sum;
	}
	
	static String toString(int[][] t) {
		String string = "";
		for (int[] i : t) {
			for (int j : i) {
				string += j + ", ";
			}
		}
		return string;
	}
	
	public static String calculateGrade(double x) {
		if (x > 90 && x <= 100) {
			return "A+";
		} else if (x > 85 && x <= 89) {
			return "A";
		} else if (x > 80 && x <= 84) {
			return "A";
		} else {
			return "F";
		}
	}
	
	static void hello() {
		System.out.println("HELLLOOOO");
	}
	
	static String greet(String first, String last) {
		return String.format("\n------------------------------\n"
				+ "Hello, %s %s. How are you doing today?"
				+ "\n------------------------------", 
				first, last);
	}
	
	static String greet(String first) {
		return greet(first, "");
	}
	
	static String greet() {
		return greet("User", "");
	}
	
	static String greeting() {
		return "Hello & Welcome";
	}
	
	static String greeting(String name) {
		return "Hello " + name + ". Welcome";
	}
	
	static boolean status(int num) {
		if (num % 2 == 0) return true;
		return false; 
	}
	
	static void dos(String name) {
		System.out.printf("Wuzz up %s\n", name);
	}
}