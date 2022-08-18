package lesson.activities.asciibarchartv2;

/**
 * A Class to store the data points for our bar chart
 * @author mafudge
 */
public class DataPoint {
    
    private String label;
    private int value;
    
    /**
     * Constructor makes a new data point
     * @param label the data label for the point
     * @param value the data value for the point
     */
    public DataPoint(String name, int value) {
        this.label = name;
        this.value = value;
    }
    
    /**
     * getter for the label
     * @return the name of the label
     */
    public String getLabel() {
        return this.label;
    }
    
    /**
     * getter for the value
     * @return the name of the value
     */
    public int getValue() {
        return this.value;
    }
    
    /**
     * Draws the data point to System.out
     */
    public void plot() {
    	System.out.printf("%10s : [", this.label); // Prints 'name' followed by a '[' to console
    	for (int i = 0; i < this.value; i++) { // Loop continues to execute as long as 'i' is less than 'this.value'
    		System.out.print("#"); // Prints '#' to console
    	}
    	System.out.print("]\n"); // Prints a ']' and goes to the next line
    }
}



/*

Use %10s to format the string and add spaces in them

*/