package lesson.examples.basicsortingsearchingdemo;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a - b; // Sorts the data from least to greatest
        //return b - a; // Sorts the data in the other order - in this case it is greatest to least
        //return -(a-b); // Functions identical to the statement above and sorts data from greatest to least
    }    
}

/*
The keyword 'implements' is used to implement a common interface. It is always required when writing a custom comparator.

'IntegerComparator' will implement a common interface of Comparator for Integers. If you were going to make a comparator for students...
... you would say 'Comparator<Students>', like this: public class IntegerComparator implements Comparator<Students> {...}

The comparator needs one method and it is always the same. It is called compare and it returns an int. If it returns a negative value, then...
... 'b' is greater than 'a'. If a zero is returned then a is equal to b. And if a positive value is returned then a is greater than b.

When you implement the 'compare()' method, you must use the '@Override' annotation. This means that you are replacing an existing method with...
your 'compare()' method. 

If you want to order the data in the other way, you should make a new class, or you can modify the current one and switch the parameters. Refer...
... to above; this line: return b - a AND this line: return -(a-b)

This line: return -(a-b) sorts the data from greatest to least because when you open the brackets, you get:
-(a-b) 
= -a-(-b)
= -a+b
= b-a

*/