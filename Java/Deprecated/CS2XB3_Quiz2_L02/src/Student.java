// Add student name and number here with JavaDoc tag of @author
// The coded segments should remain unchanged. Only update the comments section as indicated by the quiz handout

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	// declare instance variables
    // _ _ name
	String name;
	int labAttendance;
	double grade;
    // _ _ labAttendance
    // _ _ grade

    public Student(String name, int labAttendance, double grade) {
    	// your implementation here
    	// _ = name;
    	this.name = name;
        // _ = labAttendance;
    	this.labAttendance = labAttendance;
        // _ = grade;
    	this.grade = grade;
    }

    private static List<Student> selectionSort(List<Student> students) {
    	int n = students.size();
        for (int j = 0; j < n; j++) {
            int min = j; // changed max to min
             for (int i = j + 1; i < n; i++) {
                // complete this missing segment of code
            	 if (students.get(j).compareTo(students.get(i)) == -1) {
            		 Collections.swap(students, i, j);
            	 }
            }
        	// Collections.swap(students, _ , _ );
        }
        return new ArrayList<Student>(students);
    }

    public static List<Student> sortStudents(List<Student> students) {
    	return selectionSort(students);
    }

    public static Student getNextBestStudent(List<Student> students, Student previousStudent) {
    	// your implementation here
//    	int n = students.size();
//    	int nbsIndex = 0;
//    	
//    	for(int i = 0; i < n; i++) {
//    		if (students.get(i).equals(previousStudent)) {
//    			nbsIndex = i + 1;
//    		}
//    	}
        List<Student> sortedStudents = selectionSort(students);
        int n = sortedStudents.indexOf(previousStudent);
		return sortedStudents.get(n + 1);
    }
    
    public static List<Student> sortedStudents(List<Student> students) {
    	return selectionSort(students); 
    }

	/*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * Return 1 for THIS student
     * Return -1 for THAT student
     * barry.compareTo(carrie)
     * barry = 1
     * carrie = -1
     */
    public int compareTo(Student that) {
    	// your implementation here
    	if (this.labAttendance > that.labAttendance) {
    		return 1; // return 1 if [THIS] student's attendance is better than [THAT] 
    	} else if (this.labAttendance < that.labAttendance) {
    		return -1; // return -1 if [THAT] student's attendance is better than [THIS]
    	} else {
    		if (this.labAttendance == that.labAttendance) { // if attendance is same compare grades 
    			if (this.grade > that.grade) {
    				return 1; // if [THIS] grade is better than [THAT]
    			} else if (this.grade < that.grade) {
    				return -1; // if [THAT] grade is better than [THIS]
    			} else {
    				if (this.grade == that.grade) { // if grade is same compare names
    					//System.out.println(this.name + " | " + that.name);
    					//System.out.println(this.name.charAt(0));
    					//System.out.println(that.name.charAt(0));
    					if (this.name.charAt(0) < that.name.charAt(0)) {
    						//System.out.println("##1");
    						//System.out.println(this.name + " | " + that.name);
    						return 1; 
    					} else if (this.name.charAt(0) > that.name.charAt(0)) {
    						//System.out.println("##-1");
    						return -1;
    					} else {
    						return 1; // if all stats are same just return THIS
    					}
    				} else {
    					return 0; // something went wrong
    				}
    			}
    		} else {
    			return 0; // something went wrong
    		}
    	}
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Student a = new Student("Anna", 9, 99.0);
        Student b = new Student("Barry", 10, 50);
        Student c = new Student("Carrie", 10, 50);
        Student d = new Student("David", 8, 75);
        Student e = new Student("Edward", 9, 75);
        Student f = new Student("Frank", 10, 50);
        Student g = new Student("Alice", 9, 99.0);
        Student h = new Student("Barry", 10, 50);
        Student m = new Student("Mary", 8, 50);
        Student n = new Student("Nancy", 7, 99.0);
        
        Student[] arr = {a, b, c, d, e, f, g, h, m, n};
        List<Student> students = new ArrayList<Student>();
        for(int i = 0; i < 10; i++) {
        	students.add(arr[i]); 
        }
        // TEST CASES FOR COMPARETO //
        //System.out.println(a.compareTo(b));
        //System.out.println(b.compareTo(c));
        //System.out.println(g.compareTo(n));
        
        //System.out.println(Student.selectionSort(students));
        System.out.println(Student.sortStudents(students));
        //System.out.println(Student.getNextBestStudent(students, _ ));
        System.out.println(Student.getNextBestStudent(students, a));
        System.out.println(Student.getNextBestStudent(students, b));
        System.out.println(Student.getNextBestStudent(students, c));
        System.out.println(Student.getNextBestStudent(students, d));
    }
}
