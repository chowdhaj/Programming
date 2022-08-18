package cas.lab2.wt.questions;

public class SpringSeason {
	
	public static void main(String[] args) {
		
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		// testing for:
		// march, april, may, and june
		
		// march = 3 && has 31 days
		// april = 4 && has 30 days
		// may = 5 && has 31 days
		// june = 6 && has 30 days
		
		if ((m == 3) || (m == 5)) {
			if ((d < 1) || (d > 31)) {
				System.out.println("False");
			} else {
				System.out.println("True");
			}
		} else if ((m == 4) || (m == 6)) {
			if ((d < 1) || (d > 30)) {
				System.out.println("False");
			} else {
				System.out.println("True");
			}
		} else {
			System.out.println("False");
		}
		
	}

}
