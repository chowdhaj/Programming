package lesson.examples.sortingsearchstudentsusingcomparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}

/*

Every comparator needs to implement the comparator interface

The 'compareToIgnoreCase' is used to compare strings and it returns an integer. If 's1' is greater than 's2' is returns...
... a positive value, zero when they are the same, and a negative value when 's1' is less. 

*/