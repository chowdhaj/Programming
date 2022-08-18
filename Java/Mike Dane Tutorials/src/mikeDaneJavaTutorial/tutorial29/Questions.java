package mikeDaneJavaTutorial.tutorial29;

/*
 * Class that models questions on a test. There are two attributes to a
 * question; the question itself, and the answer.
 */
public class Questions {
	
	String question;
	String answer;
	
	// Constructor for the Questions class
	public Questions(String question, String answer) {
		
		// Assigns constructor arguments to Object's attributes
		this.question = question;
		this.answer = answer;
	}
}