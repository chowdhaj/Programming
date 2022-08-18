package lesson.activities.understandingcomparators;

import java.util.Comparator;

public class StudentGpaDescendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (int)(-1000 * (s1.getGPA() - s2.getGPA()));
    }    
}

// This method sorts by GPA from highest to lowest. This is possible because the 1000 is negative