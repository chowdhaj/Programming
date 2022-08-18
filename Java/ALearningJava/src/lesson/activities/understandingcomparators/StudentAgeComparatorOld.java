package lesson.activities.understandingcomparators;

import java.util.Comparator;

public class StudentAgeComparatorOld implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return (b.getAge() - a.getAge());
	}
}

// This method sorts by age from oldest to youngest. This is because instead of [a - b], it is [b - a]
