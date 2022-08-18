/* Challenge Activity 3 - ATM

    Let's use the ATMMenu enum and switch statement to a main menu for an ATM.
    1) Print the ATM menu
    2) Prompt for a menu choice: d = deposit, w = withdrawl, b = balance and q = quit.
    3) use the switch statement to determine the choice 
    4) print the output back to the user

SAMPLE EXECUTION:

*********************************
*** Welcome to FudgeBank ATM! ***
***         Main Menu         ***
*********************************

[d=Deposit,w=Withdrawl,b=Balance,q=Quit] ? w
You selected: Withdrawl

 */
package lesson.activities.atm;

import java.util.Scanner; // Imports Scanner class
import lesson.activities.atm.ATMMenu; // Imports the class containing our Enums

public class ATM {

    public static void main(String[] args) {

    	// Prints out the ATM menu
    	System.out.println("*********************************");
    	System.out.println("*** Welcome To Some Bank ATM! ***");
    	System.out.println("***         Main Menu         ***");
    	System.out.println("*********************************");
    	System.out.println("What would you like to do today?");
    	System.out.printf("\n[%s=%s, %s=%s, %s=%s, %s=%s]", // Prints out all options using the enums
    			ATMMenu.Deposit.Value(), ATMMenu.Deposit, 
    			ATMMenu.Withdrawl.Value(), ATMMenu.Withdrawl, 
    			ATMMenu.Balance.Value(), ATMMenu.Balance, 
    			ATMMenu.Quit.Value(), ATMMenu.Quit);
    	
    	Scanner input = new Scanner(System.in); // Instantiates Scanner
    	System.out.print("\nPlease indicate here ===> "); // Prints text to console
    	String userInput = input.next(); // Input from user is assigned to a string variable called 'userInput'
    	ATMMenu convertLetter; // Creates a new Enum of type 'ATMMenu' and calls it convertLetter
    	
    	// This is the switch statement that decides what is selected
    	switch (userInput) {
    	
    	case "d":
    		convertLetter = ATMMenu.Deposit;
    		break;
    		
    	case "w":
    		convertLetter = ATMMenu.Withdrawl;
    		break;
    	
    	case "b":
    		convertLetter = ATMMenu.Balance;
    		break;
    	
    	case "q":
    		convertLetter = ATMMenu.Quit;
    		break;
    	default:
    		convertLetter = ATMMenu.ERROR;
    	}
    	
    	System.out.printf("You selected: %s", convertLetter); // Prints out option selected to console

    }   
}
