package lesson.examples.sortingsearchstudentsusingcomparator;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
            return (int)(1000*(-(s1.getGPA() - s2.getGPA())));
    }    
}

/*

In this method we are returning an integer, however, GPA's are doubles. To get by this, multiply the GPA's by 1000 and then cast...
... them to ints to prevent loss of accuracy. 

A negative was added to sort by highest GPA first. Remove the negative to sort by lowest GPA first.

*/