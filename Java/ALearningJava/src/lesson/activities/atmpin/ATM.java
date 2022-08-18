/* Challenge Activity 1 - ATM PIN

Let's re-write the ATM example to first prompt for a pin before it shows the menu.
It should loop until you enter a valid pin or you've attempted to use the pin 3 times.

Here's the pseudocode

make a new BankAccount object with pin "1234" and an opening balance of 500
attempts = 0 
loop    
    prompt to enter pin
    accept input for pin
    add one to attempts
    if pin was entered is the same as BankAccount pin then
        exit loop with success
    if attempts >=3 then 
        exit loop with failure
end loop
if success
    show main atm menu
else
    show error message "too many invalid pins"


NOTE: be sure to use proper blocking while writing your code. neatness counts!

SAMPLE RUN (Successful pin)

*********************************
*** Welcome to FudgeBank ATM! ***
*********************************

Enter PIN # ==> 1234
*********************************
***         Main Menu         ***
*********************************

[d=Deposit,w=Withdrawl,b=Balance,q=Quit] ? q
You selected: Quit

SAMPLE RUN (three invalid attempts)

*********************************
*** Welcome to FudgeBank ATM! ***
*********************************

Enter PIN # ==> 1112
Enter PIN # ==> 3313
Enter PIN # ==> 0023
You entered an invalid pin 3 times!

 */
package lesson.activities.atmpin;

import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {    
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner class
        BankAccount newAccount = new BankAccount("1234", 500.0); // Creates a new object of type BankAccount called 'newAccount' and passes "1234" and 500.0 as parameters
        
        // Prints out text to console
        System.out.printf("*********************************\n");
        System.out.printf("*** Welcome to FudgeBank ATM! ***\n");
        System.out.printf("*********************************\n\n");
        
        final String pinNumber = "1234"; // Creates a variable of type String, calls it 'pinNumber' and assigns it a final value of 1234
        int attemptNumber = 0; // An int named 'attemptNumber' gets 0
        System.out.print("Please Enter Your Pin # ===> "); // Prints text to console
        String pinGuess = input.nextLine(); // Input from user is assigned to 'pinGuess'
        System.out.println(""); // Functions as '\n'
        
        while (!(pinGuess.equals(pinNumber))) { // While 'pinGuess' does not equal 'pinNumber', do the following:
        	System.out.print("Sorry that is incorrect. Try again: "); // Print text to console
        	pinGuess = input.nextLine(); // Assign user input to 'pinGuess'
        	attemptNumber++; // Increment 'attemptNumber' by 1 
        	if (attemptNumber == 3) { // If 'attemptNumber' equals 3 then: 
        		System.out.println("\nTo many incorrect entries!\nYour account has been locked!"); // Print text to console
        		break; // Break out of the loop
        	}
        }
        
        if (pinGuess.equals(pinNumber)) { // If 'pinGuess' equals 'pinNumber' then: 
        	System.out.println("\nThat is correct! Welcome Sir!\nWhat would you like to do today?\n"); // Print text to console
        	menu(); // Calls the 'menu()' method and runs it
        }    
    }

    public static void menu() {

    	Scanner input = new Scanner(System.in);
        ATMMenu option;
        
        System.out.printf("*********************************\n");
        System.out.printf("***         Main Menu         ***\n");
        System.out.printf("*********************************\n\n");
        System.out.printf("[%s=%s,%s=%s,%s=%s,%s=%s] ? ", 
                    ATMMenu.Deposit.Value(),ATMMenu.Deposit,
                    ATMMenu.Withdrawl.Value(),ATMMenu.Withdrawl,
                    ATMMenu.Balance.Value(),ATMMenu.Balance,
                    ATMMenu.Quit.Value(),ATMMenu.Quit
                    );
        
        String choice = input.nextLine();
        switch (choice) {
            case "d":
                option = ATMMenu.Deposit;
                break;
            case "w":
                option = ATMMenu.Withdrawl;
                break;          
            case "b":
                option = ATMMenu.Balance;
                break;          
            case "q":
                option = ATMMenu.Quit;
                break;          
            default:
                option = ATMMenu.Quit;
                break;          
        	}
        	
        System.out.printf("You selected: %s\n", option);
        System.out.println("\nThank you for choosing FudgeBank.\nHave a great day!");
    }
    
}
