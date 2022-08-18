package mikeDaneJavaTutorial.tutorial30;

/*
 * Student class that contains the specification for
 * what a Student is and what attributes it has. Currently,
 * a Student is defined by name, major, and GPA. 
 */
public class Student {
	
	String name;
	String major;
	double gpa;
	
	/**
	 * Constructor for Student Class
	 * 
	 * @param name The name of the student
	 * @param major What the student is majoring in
	 * @param gpa Current GPA of the student
	 */
	public Student(String name, String major, double gpa) {
		
		this.name  = name;
		this.major = major;
		this.gpa   = gpa;
	}
	
	/**
	 * Determines whether the student is an honors student or not 
	 * 
	 * @return A boolean value indicating if student is on honor roll
	 */
	public boolean isOnHonorRoll() {
		
		// If student's GPA is greater than 3.5
		if (this.gpa >= 3.5) {
			return true; // return true
		}
		
		// Otherwise return false
		return false;
	}
}