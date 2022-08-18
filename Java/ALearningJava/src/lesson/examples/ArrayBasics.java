package lesson.examples;

public class ArrayBasics {

    /**
     * Arrays contain a fixed number of variables of the same type
     * they are referenced by name and index
     * 
     *  Index -->     0    1    2    4
     *              +----+----+----+----+
     *  Grades      | 77 | 84 | 80 | 96 |
     *              +----+----+----+----+
     *  Students    |Tom |Ed  |Joe |Bob |
     *              +----+----+----+----+
     */    
	
    public static void main(String[] args) {      
    	
        int[] grades = new int[4]; // Declare an array of ints called 'grades' and 
        grades[0] = 77; // Assign a value of 77 to the 0th index of 'grades'
        grades[1] = 84; // Assign a value of 84 to the 1st index of 'grades'
        grades[2] = 80; // Assign a value of 80 to the 2nd index of 'grades'
        grades[3] = 96; // Assign a value of 96 to the 3rd index of 'grades'
        
        String[] students = { "Tom", "Ed", "Joe", "Bob"}; // Declare an array
        
        System.out.printf("#\tStudent\tGrade\n"); // Prints text to console
        System.out.printf("-\t-------\t-----\n"); // Prints text to console
        
        for (int i=0;i<grades.length;i++) { // This 'for loop' enumerates the array 'grades' // If 'i' is less than the length of array 'grades', then:
            System.out.printf("%d\t%s\t%d\n",i, students[i], grades[i]); // Prints out the 'i' entry of the arrays
        }        
    }
}
