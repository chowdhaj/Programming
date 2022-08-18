package lesson.activities.atm;

/**
 * For selecting items from the ATM menu.
 * @author mafudge
 */

public enum  ATMMenu {
    
	// These are all the options [data types] that belong to the 'ATMMenu' Enum
    Deposit("d"), Withdrawl("w"), Balance("b"), Quit("q"), ERROR("x");
     
    private final String choice; // Creates a new variable of type string called 'choice' // It is final
    
    // This is the constructor
    ATMMenu(String choice) {
        this.choice = choice;
    }
    
    /**
     * Get the ATM menu value. 
     * @return 
     */
    public String Value() { return this.choice; } // Gets the value of the ATM Menu

    
}

