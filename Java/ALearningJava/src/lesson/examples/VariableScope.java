
package lesson.examples; // Location of our 'VariableScope' class file

public class VariableScope {

    public static void main(String[] args) {
    	
        String name = "Tony"; // Creates a variable of type string called 'name' and stores "Tony" in it
        sayHello("Bob"); // Calls the 'sayHello()' method and passes 'Bob' as an argument
        sayHello(name); // Calls the 'sayHello()' method and passes 'Tony' as an argument because 'String name' stores 'Tony' and Java passes by value, not reference
        name = "Pete"; // Assigns "Pete" to the variable 'name'
        sayHello(name); // Calls the 'sayHello()' method and passes 'Pete' as an argument because Java passes by value, not reference
    }
    
    // This is the 'sayHello()' method // It is private // Does not need to be instantiated // And it takes one parameter of type String
    public static void sayHello (String name) {
        System.out.printf("Hello, %s\n",name); // Prints out "Hello" followed by a name to console
        name="George"; // Assigns the variable 'name', that exists within the 'sayHello()' method, "George"
    }
}

/*
										GENERAL NOTES

The variables in the 'main()' method, only exist within the scope of the 'main method()'. In other ...
... words, the variable 'String name' created in the 'main()' method, is different from the ...
... variable created in the 'sayHello()' method

When you pass an parameter in the 'sayHello()' method (i.e. String name) what you are doing is creating ...
... a new variable of type string, called 'name' that stores the arguments passed from a different method. This ...
... newly created variable only exists within the scope (curly braces) of the 'sayHello()' method

The variable 'name' in the 'sayHello()' method can be called anything [it's arbitrary] because it does not exist ...
... outside the scope of the method. Java creates it so it can store the arguments passed from the other method into ...
... a variable. You can replace 'name' with anything you want. TRY IT!

greetPerson("Bob") // Bob is passed as an ARGUMENT
public static void printName (String firstName, String lastName) // 'firstname' and 'lastName' are passed as PARAMETERS

*/