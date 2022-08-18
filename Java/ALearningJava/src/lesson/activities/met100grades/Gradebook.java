package lesson.activities.met100grades; // Location of our class file

/**
 * This class implements a gradebook for the MET100 course.
 * @author mafudge
 */
public class Gradebook {

    public static final double MAX_POINTS = 450.0; // Creates a public variable of type double called 'maxPoints' and makes it static and final so it can never be manipulated
    private int exam1, exam2, exam3; // Initializes 3 private variables of type int
    private String studentName; // Creates a private String variable called 'studentName'
    
    /**
     * Creates a new gradebook object with exam scores
     * @param name the String name of the student 
     * @param exam1 the score on exam1
     * @param exam2 the score on exam2
     * @param exam3 the score on exam3
     */
    public Gradebook(String name, int exam1, int exam2, int exam3 ) { 
    	// The following lines of code sets the exam scores and student's name to the values passed as arguments when the constructor is called
    	this.exam1 = exam1; 
    	this.exam2 = exam2;
    	this.exam3 = exam3;
    	this.studentName = name;
    }
    
    /**
     * Gets the name of the student in this gradebook entry
     * @return name of student as String.
     */
    public String studentName() { return studentName; } // This method returns the student's name
    
    /**
     * Return the total number of points for this gradebook entry
     * @return total points as integer
     */
    public int totalPoints() { return exam1 + exam2 + exam3; } // This method returns the sum of points of all exams
    
    /**
     * Calculate the final average for the gradebook entry. Represented as
     * the total points divided by the maximum amount of points.
     * @return 
     */
    public double finalAverage() { return (exam1 + exam2 + exam3) / MAX_POINTS; } // This method returns the final average by dividing the sum by max points possible
}
