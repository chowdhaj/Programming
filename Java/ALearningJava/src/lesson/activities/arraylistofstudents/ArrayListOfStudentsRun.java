/** Challenge Activity 1 - Array List of Students
 * 
 * This challenge activity will get you familiar with using ArrayLists of Objects,
 * and the methods associated with ArrayLists.
 * 
 * Below you'll find code to create an ArrayList of Students, and then populate 
 * the students object with 4 students. 
 * 
 * Do the following inside the main method?:
 * 
 * 1) Remove Dave... print the list of students.
 * 2) Add Dave back to the end of the list... print the list of students
 * 3) Change Kim's GPA to 2.0... print the list of students 
 * 4) Add Bill with GPA 1.0 after Sally... print the list of students 
 * 5) Make Kim and Sally swap positions... print the list of students 
 * 
 SAMPLE RUN:
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Dave	3.200000
2	Sally	4.000000
3	Kim	3.300000

Removing student Dave...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	3.300000

Adding Dave back to the end...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	3.300000
3	Dave	3.200000

Changing Kim's GPA to 2.0...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	2.000000
3	Dave	3.200000

Adding Bill after Sally...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Bill	1.000000
3	Kim	2.000000
4	Dave	3.200000

Make Kim and Sally swap positions...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Kim	2.000000
2	Bill	1.000000
3	Sally	4.000000
4	Dave	3.200000
 */

package lesson.activities.arraylistofstudents;

import java.util.ArrayList;

public class ArrayListOfStudentsRun {

    public static void main(String[] args) {
    	
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> students = new ArrayList<>();        
        // Adding some students
        students.add(new Student("Bob",2.9));
        students.add(new Student("Dave",3.2));
        students.add(new Student("Sally",4.0));
        students.add(new Student("Kim", 3.3));       
        printStudents(students);              

        // 1) Remove Dave... print the list of students.
        System.out.println("Removing student Dave...");
        students.remove(1); // Removes the 1st element in 'students' // Remove "Dave"
        printStudents(students);

        // 2) Add Dave back to the end of the list... print the list of students
        System.out.println("Adding Dave back to the end...");
        students.add(new Student("Dave", 3.2)); // Adds a new student to the last element in 'students' // Adds "Dave" back
        printStudents(students);

        // 3) Change Kim's GPA to 2.0... print the list of students 
        System.out.println("Changing Kim's GPA to 2.0..."); 
        students.get(2).setGPA(2.0); // Changes Kim's GPA to a 2.0
        printStudents(students);

        // 4) Add Bill with GPA 1.0 after Sally... print the list of students 
        System.out.println("Adding Bill after Sally...");  
        students.add(2, new Student("Bill", 1.0)); // Adds a new Student, "Bill", in the 2nd element in 'students'
        printStudents(students);

        // 5) Make Kim and Sally swap positions... print the list of students 
        System.out.println("Make Kim and Sally swap positions...");      
        Student tmp = students.get(1); // Stores the 1st element in 'students' in a temporary Object called 'tmp' // Stores Kim in 'tmp'
        students.set(1, students.get(3)); // Sets the 1st element in 'students' to the 3rd element // Over writes Kim with Sally
        students.set(3, tmp); // Sets the 3rd element in 'students' to 'tmp' // Over writes Sally with Kim
        printStudents(students);
        
    }
    
    public static void printStudents(ArrayList<Student> al) {
        System.out.printf("#\tStudent\tGPA\n");
        System.out.printf("-\t-------\t-------\n");
        for(int i=0;i< al.size();i++) {
            System.out.printf("%d\t%s\t%f\n", 
                        i, 
                        al.get(i).getName(), 
                        al.get(i).getGPA());
        }
        System.out.println();
    }
}

