package lesson.activities.yournameobjectstyle; // Location of our class file

/**
 * This class implements YourName. 
 * A means to get your name and return it in various formats. 
 */
public class YourName {
	
	private String firstName, lastName, fullName, reverseName; // Initializes 5 private variables of type string
    
    /**
     * Creates a new YourName object with arguments first and last name
     * @param firstName a String representing your first name
     * @param lastName a String representing your last name
     */
    public YourName(String first, String last) { // This is the constructor // It accepts two parameters of type string
    	this.firstName = first;
    	this.lastName = last;    
    }
    
    /**
     * Returns your full name first + last
     * @return your full name as a string
     */
    public String getFullName() { // This method returns the full name of the person
    	fullName = this.firstName + " " + this.lastName;
    	return fullName;
    }
    
    /**
     * Returns your name last, first
     * @return a string of your name last, first
     */
    public String getReverseName() { // This method returns the full name of the person but last name comes first
    	reverseName = this.lastName + ", " + this.firstName;
    	return reverseName;
    }
    
       
}
