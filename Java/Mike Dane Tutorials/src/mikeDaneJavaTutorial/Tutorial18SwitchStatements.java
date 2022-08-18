/*
 * * * * *
 * NOTES *
 * * * * * 
 * Switch statements are a special type of If-Statements. Both
 *     are used to make decisions, but switch statements are
 *     used when you are trying to compare ONE value to a bunch
 *     of other values really easily
 * Switch statements use cases to compare values
 * After every case in a switch statement, a 'break' statement
 *     is needed because it indicates the end of the case's code
 * The 'default' case covers everything else. It's like the 'else'
 *     statement in an If-Else Statement  
 * Switch statements are more read-able than If-Else statements
 */

// Switch Statements
package mikeDaneJavaTutorial;

public class Tutorial18SwitchStatements {
	
	public static void main(String[] args) {
		
		// Prints day name for the first day
		System.out.println(getDayNameSS(1));
		System.out.println(getDayNameIS(1));
		
		// Prints day name for the fourth day
		System.out.println(getDayNameSS(4));
		System.out.println(getDayNameIS(4));
		
		// Prints day name for the seventh day
		System.out.println(getDayNameSS(7));
		System.out.println(getDayNameIS(7));
	}

	/**
	 * Calculates the day name of the week using a switch statement
	 * 
	 * @param dayNum The number of the day
	 * @return The day name of the week as a String
	 */
	public static String getDayNameSS (int dayNum) {
		
		String dayName = "";
		
		/*
		 * This is a switch ladder that computes the day of the
		 *     week based on a given number
		 */
		switch(dayNum) {
			case 1: dayName = "Sunday"; 
				break;
			case 2: dayName = "Monday";
				break;
			case 3: dayName = "Tuesday";
				break;
			case 4: dayName = "Wednesday";
				break;
			case 5: dayName = "Thursday";
				break;
			case 6: dayName = "Friday";
				break;
			case 7: dayName = "Saturday";
				break;
			default: dayName = "Not A Valid Day";
				break;
		}
		return dayName;
	}
	
	/**
	 * Calculates the day name of the week using If-Statements
	 * 
	 * @param dayNum The number of the day
	 * @return The day name of the week as a String
	 */
	public static String getDayNameIS (int dayNum) {
		
		String dayName = "";
		
		/*
		 * This If-Else ladder calculates the day name of the week
		 *     based on a given number. Comparing this with the 
		 *     Switch ladder above demonstrates how much better it is
		 *     to use a Switch statement due to improved code readability
		 */
		if (dayNum == 1) {
			dayName = "Sunday";
		} else if (dayNum == 2) {
			dayName = "Monday";
		} else if (dayNum == 3) {
			dayName = "Tuesday";
		} else if (dayNum == 4) {
			dayName = "Wednesday";
		} else if (dayNum == 5) {
			dayName = "Thursday";
		} else if (dayNum == 6) {
			dayName = "Friday";
		} else if (dayNum == 7) {
			dayName = "Saturday";
		} else {
			dayName = "Not A Valid Day";
		}
		return dayName;
	}
}
