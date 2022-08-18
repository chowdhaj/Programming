/* Challenge Activity 3 - MET100 grades

In this challenge activity, re-write the MET100 exercise from before to 
use the custom Gradebook class. Provided in this main method is an example of
how to call the constructor and methods of the Gradebook class (object t1).

You must do the following:

1) Complete the methods inside the Gradebook.java class to get this main method
working to display the following:

Student		Total	Average
Test		450		1.000000

2) Re-write the main method to calculate the grades for students Dave and Jane
Dave's scores: 120,130, 135 
Jane's scores: 135,145,140

PROGRAM OUTPUT:

Student	Total	Average
Dave	385	0.855556
Jane	420	0.933333
Test	450	1.000000
 */

package lesson.activities.met100grades;

public class MET100Grades {

    public static void main(String[] args) {
    	
    	// The following lines of code creates a new object of type Gradebook, called: 'dave', 'jane', and 'test', respectively // The arguments are in brackets
        Gradebook dave = new Gradebook("Dave", 120, 130, 135);
        Gradebook jane = new Gradebook("Jane",135, 145, 140);
        Gradebook test = new Gradebook("Test",150,150,150);
          
        // The following lines of code prints out the student's name, total score, and average, to console
        System.out.printf("Student\t\tTotal\t\tAverage\n");
        System.out.println("----------------------------------------"); // Divides the titles from the data
        System.out.printf("%s\t\t%d\t\t%f\n"
        		,dave.studentName(), dave.totalPoints(), dave.finalAverage());
        System.out.printf("%s\t\t%d\t\t%f\n"
        		,jane.studentName(), jane.totalPoints(), jane.finalAverage());
        System.out.printf("%s\t\t%d\t\t%f\n"
                ,test.studentName(), test.totalPoints(), test.finalAverage());
    }
}

/*/ 

/t is used to tab the line

You can even compress all four 'printf's to: 

System.out.printf("Student\t\tTotal\t\tAverage\n%s\t\t%d\t\t%f\n%s\t\t%d\t\t%f\n%s\t\t%d\t\t%f\n", 
        		dave.studentName(), dave.totalPoints(), dave.finalAverage(),
        		jane.studentName(), jane.totalPoints(), jane.finalAverage(),
        		test.studentName(), test.totalPoints(), test.finalAverage());

/*/
