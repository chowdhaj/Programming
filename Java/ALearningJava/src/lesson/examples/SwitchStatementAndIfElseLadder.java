package lesson.examples; // Location of class file

import java.util.Scanner; // Imports Scanner class

public class SwitchStatementAndIfElseLadder {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates Scanner
        System.out.print("Enter Month [1-12] : "); // Asks to enter a month
        int month = input.nextInt(); // Assigns 'input' to 'month'
        System.out.print("Enter Day of Month [1-31] : "); // Asks for a day of the month
        int day = input.nextInt(); // Assigns 'input' to 'day'
        System.out.printf("That's the %s of %s\n" // Prints out the day and month
                ,getDayName(day),getMonthName(month)); 
    }
    
    // This method gets the name of the month using a switch statement
    public static String getMonthName(int month) {
    	
        String result = "Unknown"; // Creates a new variable of type string called 'result' and it gets "Unknown"
        
        // This switch statement gets the name of the month based on 'input' // If 'input' == 9, then it returns 'September'
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11: 
            	result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result; // Returns 'result' which is the month
    }
    
    // This method gets the day name (i.e. First day of the month = 1st)
    public static String getDayName(int day) {
    	
        String result; // Initializes a variable of type string called 'result'
        
        // Assigns the correct name depending on the day name
        if (day != 11 && day % 10 == 1) { // If the day is not 11 and the remainder is one then it's a 'st'
            result = day + "st";
        } else if (day !=12 && day % 10 == 2) { // If the day is not 12 and the remainder is two then it's a 'nd'
            result = day + "nd";
        } else if (day != 13 && day % 10 == 3) { // If the day is not 13 and the remainder is three then it's a 'rd'
            result = day + "rd";
        } else { // If none of the above are true then it's a 'th'
            result = day + "th";
        }
        return result; // Return 'result'
    }
    
    // Think about it- how would you test the two above methods?
    // How can you ensure they're "correct for all cases"?
}
