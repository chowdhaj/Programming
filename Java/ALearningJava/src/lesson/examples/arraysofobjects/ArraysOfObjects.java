package lesson.examples.arraysofobjects; // Location of our class file

import java.util.Scanner; // Imports the Scanner

public class ArraysOfObjects {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner
        String name; // Initializes a String called 'name'
        int grade; // Initializes an int called 'grade'
        Student[] students = new Student[4]; // Creates a new array of type Student and it holds 4 elements
        
        for(int i = 0; i < students.length; i++) { // Iterates over the 'student'
            System.out.printf("Enter GRADE then NAME for student #%d ==> ", i); // Prints text to console
            grade = input.nextInt(); // 'grade' gets input from user
            name = input.nextLine(); // 'name' gets input from user
            students[i] = new Student(name, grade); // Adds 'grade' and 'name to the 'students' array
        }
        
        System.out.printf("#\tStudent\tGrade\n"); // Prints text to console
        System.out.printf("-\t-------\t-----\n"); // Prints text to console

        for(int i = 0; i < students.length; i++) { // Iterates over the 'student' array
            System.out.printf("%d\t%s\t%d\n", i, students[i].Name(), students[i].Grade()); // Outputs elements from 'students' to console
        }
    }
}
