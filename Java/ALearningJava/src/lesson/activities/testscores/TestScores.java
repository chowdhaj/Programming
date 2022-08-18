
package lesson.activities.testscores;

/**
 * This java class stores a series of test scores
 * @author mafudge
 */
public class TestScores {
    
    private int[] scores;
    
    /**
     * Constructor required an array of scores
     * @param scores an array of test scores
     */
    public TestScores(int scores[]) { // Added '[]' at the end of scores
        this.scores = scores;
    }
    
    /**
     * Getter for scores
     * @return the array of scores
     */
    public int[] getScores() {
        return this.scores;
    }
    
    /**
     * Setter for scores
     * @param newScores the array of the new set of scores
     * @return the new set of scores
     */
    public int[] setScores(int[] newScores) {
        return (this.scores = newScores);
    }
    
    /**
     * get the lowest score in the set of test scores
     * @return the lowest test score
     */
    public int Lowest() { 
        int lowest = scores[0]; // Changed initial value to 'scores[0]'
        for (int i = 0; i < this.scores.length; i++) { // Replaced ',' with a ';' // Removed the '=' sign
            lowest = scores[i] < lowest ? scores[i] : lowest; // Removed '[i]' from 'lowest'
        }
        return lowest;
    }
    
    /**
     * get the highest score in the set of test scores
     * @return the highest score
     */
    public int Highest() {
        int highest = scores[0]; // Changed starting value
        for (int s : this.scores) {
            highest = s < highest ?  highest : s; // Reversed operand
        }
        return highest;
    }
    
    /**
     * Calculates the average score in the set of test scores
     * @return  the average number of scores
     */
    public double Average() {
        double sum = 0.0;
        for (int s : this.scores) { // Replaced ';' with a ':'
            sum += s; // Added a '+' before the '='
        }
        return sum/this.scores.length;
    }
    
}

/*
			ORIGINAL CODE

package lesson.activities.testscores;

public class TestScores {
    
    private int[] scores;
    
    public TestScores(int scores[]) { // Added '[]' at the end of scores
        this.scores = scores;
    }
    
    public int[] getScores() {
        return this.scores;
    }
    
    public int[] setScores(int[] newScores) {
        return (this.scores = newScores);
    }
    
    public int Lowest() {
        int lowest = 0;
        for (int i=0, i<= this.scores.length;i++) {
            lowest = scores[i] < lowest[i] ? scores[i] : lowest;
        }
        return lowest;
    }
    
    public int Highest() {
        int highest = -1;
        for (int s : this.scores) {
            highest = s > highest ?  highest : s;
        }
    }
   
    public double Average() {
        double sum = 0.0;
        for (int s ; this.scores) {
            sum = s;
        }
        return sum/this.scores.length;
    }   
}

*/