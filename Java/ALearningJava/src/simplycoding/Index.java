/*

LESSON ONE - STRUCTURE / MAIN METHOD
- A class is just a blueprint for an object
- Java is an object oriented programming language
- All code has to go inside a class [or classes]
- Classes contain behaviors and attributes
- i.e. In a class called 'Dog', behaviors include Bark, Sit, Walk, etc. and attributes include color, legs, whiskers, etc.
- All code pertaining to a class is within the curly braces
- When executed, Java always runs the main method first
- public means that the method can be accessed outside of the class 
- static means that you can use the method without having to create an object out of the class
- void means that the method doesn't return any data
- IMPORTANT: You can call the main method whatever you want as long as you provide the correct arguments and parameters. However...
... it is best to call the main method, the main method because it helps other people read your code
- You can only have one public class per java file
- If you do make your Java class public, then the Java file must be the same name as the class

LESSON TWO - COMPILE & RUN
- In order to use other classes, you need to import them using the 'import' keyword
- All lines end in either a semicolon or a brace
- Not all classes have a main method, most of them will just be used as blueprints

LESSON THREE - VARIABLE RULES / COMMENTS
- A variable is a sequence of word(s) that you can use to store data
- An example of a variable name would be: name, age, firstPet, lastStand, etc.
- There are rules to creating variables: 
1. You cannot have spaces [i.e. first Pet]
2. You can only use numbers [0 - 9] and letters [A - Z] from the alphabet. The only symbols allowed are a dollar sign ($), and underscore (_)
3. Variable naming must follow camel-case [i.e. firstWordIsLowercase]. This allows for readability
4. A single-line comment is just two forward slashes [i.e. // This is a comment]
5. A multi-line comment is achieved by a forward slash, two asterisks, and another forward slash. Comments are to help you and other people understand the code
6. You cannot use words that are reserved by Java [i.e. class, public, static, void, abstract, break, etc.]
Go here for the full list of banned words: http://www.jwrider.com/riderist/java/javaidrs.htm
- However, you can combine these reserved words with other words [i.e. publicOne, staticVar1]

LESSON FOUR - PRIMITIVE DATA TYPES
- There are eight primitive data types: double, float, long, int short, byte, boolean, & char
- double & float can hold rational numbers (numbers with decimals in them)
- long, int, short, & byte can hold integers (positive and negative numbers without any decimals in them)
- boolean holds true and false values
- char holds single characters using single quotes [i.e. char a = 'A';]
- Multiple primitive types exist to conserve memory. The list above is ordered from most memory intensive, to least
- A float can hold decimals, but not as many places as a double can
- When using a float, the letter 'f' must be placed before the semi-colon
- long can hold numbers way past a billion
- int can hold numbers up to 2.147e9
- short can hold numbers from -32768 to 32,767
- byte can hold numbers from -128 to 127
- You use smaller data types to save memory
- Everything in Java is case-sensitive, so don't unnecessarily capitalize things
- You don't need to initialize variables as soon as you create them, you can set them up later

LESSON FIVE - STRINGS
- A string is a non-primitive data type
- Strings are treated as objects and must be instantiated using constructors and the 'new' keyword
- The constructor is the same name as the class name
- Constructors are kind of like methods, and they get called when you use the 'new' keyword, and create a new object
- The String objects class is special and allows you to skip the constructor declaration
- Note: The String is a non-primitive data type
- You can initialize a bunch of String types in one line, just like you can with primitive data types

LESSON SIX - ARITHMETIC OPERATIONS
- Operators include addition(+), subtraction(-), multiplication(*), division(/)
- Since ints can only hold integers, something like 4 / 7 will yield 0 because Java always rounds down
- Java follows BEDMAS, so multiplication and division have priority over addition and subtraction
- When dividing a double by an int [or vice versa], Java will automatically convert the int to a double. This is called casting
- You can convert an int to a double by casting [i.e. double(a) / b]
- The modulus operator is used to find the remainder [i.e. 8 % 3 = 2]
- Modulus is used to check if a number is divisible by another number [i.e. Used to find if a number is even/odd]
- The math class can be used to perform calculations such as power, square root, trigonometry, etc.

LESSON SEVEN - CONCATENATION
- The plus arithmetic operator is used to concatenate strings [i.e. Join them together]
- When concatenating don't forget to add a space if a space is needed
- You can concatenate as many strings as you like, there's no limit to this
- Java code is executed from top to bottom and calculations are done left to right
- "51" + 3 + 2 yields 5132 in the console because String always takes precedence
- 3 + 3 + 4 + "4" + 1 + 1 yields 10411 because the first 3 numbers are ints and get added together before being casted to Strings
- Use parenthesis to perform certain operations before others
- "41" + (3 + 2 + 2) yields 417

LESSON EIGHT - CHANGE VARIABLE VALUES
- The values of variables can be altered using the arithmetic operands
- You can add two variables together, but they must be of the same type [i.e. integer plus integer]
- You cannot subtract a string from an integer [unless you convert the string to an int first]
- Adding between doubles/floats/longs/ints/shorts/bytes are acceptable because Java automatically converts to the higher data type
- Altercation of variables occur in the normal BEDMAS order
- You can modify Strings in the same manner as primitive data types [shortcuts still work]

LESSON NINE - PRE & POST INCREMENT/DECREMENT
- These operators allow you to add or subtract one from the variables
- i.e. a++, b--, etc.
- The operators ( ++ & -- ) can be placed before and after the variable [i.e. a++ or ++a]
- PRE is when the operators are placed before the variable [i.e. ++a, ++b, ++c, etc.]
- In PRE, the operation takes place AFTER
- POST is when the operators are placed after the variable [i.e. a++, b++, c++, etc.]
- In POST, the operation takes place BEFORE

LESSON TEN - CASTING
- Any integer that does not have a specified data type is automatically an int, and all decimal numbers are doubles
- In order to not lose information, Java automatically converts the data type to the bigger one
- For example, in 9.0 / 2, Java converts the 2 to a 2.0 so the .5 in 4.5 isn't lost. This is known as implicit casting
- In the example above, the 9.0 wasn't down-shifted to an int, but the 2 went up to a double
- You can even tell Java to cast the number [i.e. ((double) 9 / 2)]. This is known as explicit casting
- Always be careful when down casting as there as a possibility to lose information/accuracy

LESSON ELEVEN - ESCAPE SEQUENCES
- Escape sequences are special characters that add line breaks, quotations, and other data into your strings
- Examples of escape sequences are: /n, /t, /b, /r, //, /", etc.
- Go here for the full list: http://docs.oracle.com/javase/tutorial/java/data/characters.html
- Java will recognize the special character if it is preceded by a back slash
- If you want to add quotations in your string, you can escape them out by using a back slash

LESSON TWELVE - FORMATTED STRINGS
- Instead of concatenating strings using a plus operator, use printf, instead of println
- Add a specifier (i.e. %s, %d, %d, etc.) to indicate where the variable goes
- %s is used for Strings
- %d is used for digits/integers
- %f is used for doubles/floats
- The default amount of decimals on %f is 6
- Specifiers also have flags that can format the variable. [i.e. %.2f will only keep 2 decimal places, and %.3f will keep 3]
- You can also add a comma to %f and %d, and it'll add commas to the number [i.e. %,.2f]
- Instead of typing out printf, you can also just use format [i.e. System.out.format]
- If you want to place a percent sign [i.e. When describing a test mark], just place two percent signs, consecutively
- In formatted strings, use %n instead of \n. Note that this does not apply to the rest of the escape characters

LESSON THIRTEEN - RELATIONAL OPERATORS
- Relational/conditional operators check for equality
- Examples include: <, >, ==, !=, <=, >=
- You can use relational operators to compare ints, doubles, shorts, etc. [primitive data types only]
- chars can also be compared to check for equality. This is done using the ASCII table
- Go here for the full ASCII table: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
- You can even use chars to create new lines and new tabs by assigning them their respective number on the ASCII chart
- When checking objects [i.e. Strings] you need to use the equals method [i.e. if a.equals(b)]. This is because...
... when Java compares objects, it checks to see if they are stored in the same slot in memory. When Java compares...
... primitive types, it compares the values. This is because Java passes by value, not reference!

LESSON FOURTEEN - LOGICAL OPERATORS
- When you need to compare multiple equalities, you can use the logical operators. These operators are...
... && (AND), || (OR), ^ (e.OR), and ! (NOT).
- The exclusive OR ( ^ ) is requires an opposite relationship. [i.e. True Or False, NOT true or true, NOT false or false]. Think...
... about it this way, one of the conditions must be false, for the statement to execute [i.e. if (true ^ false) {//code} ]
- For the exclusive OR to work, there needs to be an opposite relationship. For example, a == b, but a != c; one of them has to be false...
... If both were true, then it would return false.
- The Logical NOT is used to reverse the equality. [i.e. (!(3 != 3)) will return true]

LESSON FIFTEEN - IF STATEMENTS
- If statements allow you to selectively run code if some condition is true [i.e. If the person's age is above 18, then let them enter]
- If only one line needs to be executed, you can avoid the curly brackets
- An else/else-if statement can be added at the end of the if statement to check for more conditions
- You are allowed to nest if statements to check for conditions, inside a condition, but it would be better to add a logical condition, if possible

LESSON SIXTEEN - WHILE LOOPS
- While/Do loops execute a series of statements while a condition is true
- You can break out of a loop using the 'break' keyword
- In a Do loop, the statements execute at least once because equality is checked at the end

LESSON SEVENTEEN - FOR LOOPS
- There are three parts to a For loop, and they are: counter, condition, and increment
- There is also a For-Each loop used to iterate over a collection/array/list

LESSON EIGHTEEN - COMMAND LINE ARGUMENTS
- Arguments are provided when you run the java file via termina/CMD [i.e. java Test hello 123 string]
- Arrays start at 0, and NOT 1
- If you want to include spaces in your arguments, use quotes [i.e. java Test 123 "Hello World" 321]
- You can iterate the data stored in 'args' using a For-Each loop because it is an array

LESSON NINETEEN - SCANNER CLASS
- Used to get input from the console
- Import the Scanner class [i.e. Import java.util.Scanner;]
- The constructor is always the same name as the class name [i.e. Scanner scan = new Scanner(System.in);]
- A delimiter is used to break up text [i.e. The space in "Hello there"]

LESSON TWENTY - SCANNER CLASS PART 2
- You can use scan.hasNextInt() to check if the user has entered an integer. This is useful for error checking. The...
... same can be applied to doubles [i.e.hasNextDouble()]
- When accepting input from users, it is best to use a while loop, in case they enter invalid data

LESSON TWENTY ONE - SWITCH CASE
- The switch statement is a dumb-down version of the if statement, making it faster in computing time, but has more limitations
- The switch statement only checks against one variable, and it is only going to check if something is equal to it - it will not check...
... stuff like greater than, less than, etc.
- The default case handles every other case not handled. It is kind of like an else statement
- After every case, a break statement is required to prevent the code from falling through. However, the default...
... does not require a break statement because it's already the last check
- Sometimes, not adding a break statement is a good thing because it helps prevent repetitive code [i.e. If several cases...
... yield the same answer, you can remove the break statement and let the code fall through]
- As of Java 7, switch statement can even handle Strings
- The String class has a toLowerCase() && toUpperCase() method

LESSON TWENTY TWO - METHODS
- Methods in Java allow you to store code in a specific area, and then call upon it as many times as you want
- You create methods inside of your class, but outside of the main method - above or below it, it doesn't matter
- public allows the method to be accessible outside of the class
- private restricts the visibility of the method to the class it is in
- The default access modifier [type nothing] makes the class only accessible in the package
- public --> default --> private [In order from least private to most private]
- The static keyword allows you to use the method without having to create an object out of the class / no need to instantiate it
- void means that the method does not return anything
- You can call the method what you want as long as it isn't one of the reserved words. Brackets follow the name
- You can provide methods an argument list [i.e. String name, int age, double height]. Arguments do not need to be of the same type
- Variables called in one method are different [segregated] from variables called in another method

LESSON TWENTY THREE - MORE METHODS
- Variables created in a method are local and are not accessible by any other method, but the method it was created in
- Global/Class variables are accessible from all methods within the class
- The disadvantage of having a class variable is that all your methods can edit it. When coding, you should...
... always try to keep everything as private as possible
- As soon as you return a value, it is going to stop your method. Any code after the return statement is dead code [i.e. Unreachable statement]
- Non-void methods MUST have a return statement

LESSON TWENTY FOUR - OVERLOADING METHODS
- You can overload methods by providing a different parameter list. For instance, the first method won't accept...
... any parameter, but the second method will accept a String, and the third will accept a String and a double
- In order to overload methods, you MUST provide a different parameter list. For example, first method will accept an int, and...
... the second method will accept a String. The two methods cannot have the same type / number of parameters
- You can have methods with the same name, as long as they have different whole signatures [see above for explanation]
- You cannot have two methods that have the same signature
- Even a different return type will yield an error. The only thing that separates methods is the parameter list

LESSON TWENTY FIVE - CALL METHODS FROM METHODS
- You can use one method, to call another method, as many times as you want. In fact, you...
... can even have a method call itself. This is known as recursion
- If you do call a method within itself, make sure you have a way to escape it

LESSON TWENTY SIX - VARIABLE SCOPE
- Global variables/class variables exist within the entire class and other packages if the access modifier is set to public
- Variables created in a method are local and only accessible within that method and not other methods, unless returned or provided as arguments(s)

LESSON TWENTY SEVEN - CLASSES
- You should always strive to make variables/classes as private as possible
- To instantiate a class you need the class name, reference name, 'new', and constructor [i.e. Scanner scan = new Scanner();]
- The 'new' keyword creates an address in memory to store all the data and stuff of the class
- Creating a primitive data type stores the value in the variable, while creating an object creates a reference/address to/in memory
- Making variables private prevents unauthorized modifying of variables
- Making variables final prevents modification of the variable completely. No class can change it
- If variables are final, they can be public because they cannot be altered anyhow

LESSON TWENTY EIGHT - CONSTRUCTOR CLASSES
- When we create a new instance of a class, the constructor is called first
- The job of a constructor is to initialize data fields
- If the class does not have a constructor the compiler will do it for you, and set all variables to null or 0
- Non-primitive data types are set to null, and primitive data types are set to 0, booleans are set to false [false == 0]
- null is a way to initialize a variable without putting anything into it
- A null string is DIFFERENT from an empty string [i.e. (String age;) != (String age = "";)]
- The constructor is just access modifier and name of the class, it does not have a return type
- You can overload constructors in the same manner you overload methods
- The 'this' keyword is used to refer to the global/class name or variable
- If you don't use 'this', make sure your local variables have a different name than your class variables

LESSON TWENTY NINE - GETTER AND SETTER CLASSES
- Global/class variables should be set to private to prevent unauthorized or accidental modification
- Getters/setters are used to get/set the value of the global/class variable
- You should create a private method if no other classes need to use it

LESSON THIRTY - RANDOM CLASS
- You can generate random numbers using the random class [i.e. Import java.util.Random;]
- Instantiate the random class by calling the constructor [i.e. Random rnd = new Random();]
- Generate a random number by calling a method [i.e. rnd.nextInt(20);]. This example code will generate a random...
... number from 0 to 19 (20 is not included)
- You don't even need to instantiate the class, you can just call the constructor [i.e. new Random().nextInt(20);]

LESSON THIRTY ONE - INSTANCE COMMUNICATION
- Java is lenient with how you space your code, so you can have your getters/setters on one line
- You can pass objects as an argument [i.e. Public Dog breed(Dog d)...], and you can return them as well [i.e. Return dog;]
- In methods, you can return null and then perform null-checking to see if the object was created [i.e. if (dog != null)...]
- Null checking is used for objects and must be done, or else Java will throw an exception

LESSON THIRTY TWO - STOPPING VOID METHODS
- You can stop void methods by using the 'return' keyword, and you don't specify anything...
... after 'return' [i.e. if (true) { return; }]
- Functions need to have parenthesis after them, because they are not data fields [i.e. monster.attack();]

LESSON THIRTY THREE - TERNARY OPERATOR
- The ternary operator is like a simple function, mixed in with an if-else statement
- Format is like this: result = condition ? true : false
- If the condition is true, then the statement immediately after the question mark is returned, and...
... if false, then the statement after the colon is returned
- When incrementing in the ternary operator, you should use PRE to change the value before it is checked
- You can even use a ternary operator as a return statement - it is not limited to variable checking
- The ternary operator can return anything you want, a string, int double, boolean, etc.

LESSON THIRTY FOUR - TO STRING METHOD
- The 'toString()' method can be used to retrieve all information about an object, instead of...
... having to retrieve the information one by one
- You don't have to call the 'toString()' method, it is your choice. The compiler automatically searches for it and executes it
- Adding an '@Override' annotation isn't necessary but it does help the compiler [i.e. Faster build times]
- Every single object in Java has a 'toString()' method, and when executed it'll return the address in memory it is stored in
- All objects in Java inherit everything from the Object class [including the 'toString()' method]
- All classes automatically extend the Objects class
- Adding a 'toString()' at the end of the object is redundant as the compiler automatically searches for it

LESSON THIRTY FIVE - STATIC METHODS/VARIABLES
- The 'static' keyword is used when you want something to "stick" to your class
- Classes are just blueprints for objects [contain attributes and behaviors pertaining to an object]
- The attributes and methods inside a class don't mean anything until you create an instance of the class
- The official way to call a static method/variable is by class name  + dot + name of method/variable [i.e. Dog.bark || Dog.name]
- If you don't specify the method, the compiler will assume it is in the current class
- Static things are shared between all instances [i.e. Static variables don't go away, they remain forever]
- Static things are a part of the class, NOT an instance of the class [i.e. Not a part of the objects anymore]
- To retrieve static variables, you need to have static methods. However, Java allows you to get static variables using...
... an instance of the class [i.e. dog.getCount(); will fetch 'count']
- To access a non-static field within the same class you need to instantiate the class [i.e. Main m = new Main(); m.method();]
- Static variables are named using only upper-case [i.e. int COUNTER = 0;]
- When returning static variables/objects, you don't need to use the keyword 'this'

LESSON THIRTY SIX - EXTENDING CLASSES
- Extending allows you access public methods and data fields [variables] of the parent class
- When a child class extends a parent class, the child class gets all the characteristics [public ones only] of the parent class
- Extending classes removes the need for copy-pasting redundant code
- You can call the methods right off the bat, without having to create an instance of specify if its static or not
- 'extends' does not extend constructors, hence you must create your own constructors 
- You can call the constructor of the parent class using 'super()' and supplying arguments if needed
- The class being extended is the parent class or super class or base class
- The class extending is the child class or sub class or derived class
- You can all the methods using super, a dot, and then the method name [i.e. super.hello;]
- Parent classes are "bigger" than the child classes. In other words, the child class is a small box...
... and the parent class is a big box. You can fit a small box in a big box, but NOT vice versa. This is why...
... you can cast from Dog to Animal, but not from Animal to Dog, because it won't fit
- You can only extend one class at a time, similarly you can only have one set of parents
- A class can be both a parent and a child [i.e. It can extend from another class and have another class extend it]
- The child class has access to all the public fields of the parent class and of the grandparent class(es), if any
- Every single class extends the object class in the background. However, this is sort-of no longer true if the class...
... extends another class. For instance, if a Dog class is extending an Animal class, it is no longer extending the...
... object class. However, since nothing is extending the Animal class, it is, by default, extending the object class...
... and the Dog class still has access to the object class. This also explains why an Object can be casted down to...
... anything, because an Object is "bigger" than everything, as everything extends Object in one way or another, and... 
... thus, Objects are the parents or (great ^ x) grand-parents of every class, hence they are "bigger" than them

LESSON THIRTY SEVEN - PRIVATE INHERITANCE
- Private members of the parent class [methods and data fields] are NOT accessible to the child class
- Only public methods and variables are accessible in the child class
- Once you extend a class, your child class has direct access to public methods/variables. To avoid confusion...
... they are not physically put inside the child class
- Note: When a method from the parent class is called, it is ran in the parent class' environment. This explains why...
... a public class in the parent class has access to the private members in the parent class

LESSON THIRTY EIGHT - OVERRIDING METHODS
- You can change the functionality of a public method of a parent class, in the child class. This is...
... known as method overriding. You can do this by copy/pasting the method header from the parent class, into the child class
- Reminder: The only things available in the child class are the public things of the parent class
- Private methods are not overridden because you can't override something that was never present in the first place
- Changing to much of the header will mess up the overriding process [i.e. Changing the return type from void to a data field]
- When overriding methods, you should use the '@Override' annotation to let the compiler know that the method...
... in the child class is supposed to be getting rid of the method in the parent class
- The override annotation is mainly a helper and lets you know if you're not overriding the method correctly
- You cannot override class variables. Use the 'super' keyword if you want to access public parent variables with...
... the same names as the ones in your child class

LESSON THIRTY NINE - ABSTRACT CLASSES
- An abstract method is an incomplete method [denoted by the 'abstract' keyword and absence of body]
- When an abstract class is extended, what you are telling the compiler/Java is that all child classes that...
... extend the parent class, must have this method, and it must be implemented in their own way
- An abstract class is more of an instructional class and not an actual method
- Any class that contains an abstract method, automatically becomes an abstract class [i.e. Must add the 'abstract' keyword]. This...
... lets the compiler know that the abstract method below is not a mistake and was purposefully implemented that way
- Any child class that extends an abstract parent class MUST implement (all) and their own versions of abstract methods
- To check if something/an object is an instance of a class, you use the 'instanceof' keyword [i.e. pit instanceof Dog]
- Abstract classes cannot be instantiated [you cannot create an object out of an abstract class]. This is because...
... some of the methods inside an abstract class don't have a body, and it doesn't make sense as to how they will...
... be used because the methods are not done yet
- Abstract classes are meant to be extended, hence they cannot and should not be instantiated. This is because...
... abstract classes are partial instructions for another class
- Abstract classes are incomplete because there is certain information that we don't have yet in order to complete it, and...
... the job of completing it is left to the child class
- Abstract methods help keep consistency because it forces the child classes to use the same name
- Only one abstract class can be extended at a time, you cannot extend two parent classes onto a child class. Think...
... about it this way: you cannot have two sets of parents

LESSON FORTY - INTERFACE/IMPLEMENTS
- The object class can store any object there is [i.e. Dog, Shoe, Cat, Wallet, Etc.]
- The object class is the Adam & Eve of all classes in Java. All classes in Java extend the object class...
... even though it is not visible or explicitly stated. This explains why the object class can store any object
- An interface is like an abstract class, but everything in it, is just a set of instructions [no abstract keyword required]
- Use the 'implements' keyword in the exact same context as you would with the 'extends' keyword to make the class inherit the fields
- You can use interface with or without extending anything
- You can also use the '@Override' annotation to make sure you have the headers correct
- A class can inherit more than one interface [i.e. public class Store implements Laws, Tax, Policies, Product { //code } ]

LESSON FORTY ONE - INTERFACES
- You can have more than one interface applied to the same class [i.e. public class Store implements Tax, Rules { //code } ]
- Everything (methods and data fields) in interfaces are public, because you never initialize or instantiate them. If...
... something was private you would never be able to use it. However, this only applies to data fields and not...
... methods. In order to use non-static methods you need to instantiate the class [i.e. new MainClass().test(3.3)...]
- Variables/methods are automatically static because you cannot initialize interfaces
- All variables are final because interfaces cannot be initialized, hence variables cannot be altered
- All methods are abstract, and if you want to write it, you can, but it's not necessary
- Note: Attempting to reassign a value to a final variable will throw an error
- Since the variables in an interface are always going to be public, static, and final, you can...
... get rid of the access modifiers [i.e. public static final int TAX = 1.13; --> int TAX = 1.13; ]
- According to Java convention, you should get rid of the excess access modifiers when creating variables in an interface
- You cannot implement another interface, but you can extend it [i.e. interface Store implements tax is NOT allowed...
... but, interface Store extends Tax IS allowed]
- If you want to add another method to your interface without breaking the application, you can use default methods. This...
... is accomplished by using the default keyword and then giving the method a body...
... [i.e. default Object trade(Object item) { return new Object(); } ]. These methods are override-able and you can...
... implement them if you want to. [NOTE: default methods were introduced in Java 8] 
- You can also have static methods in interfaces that cannot be altered or changed in any way. These methods are not...
... override-able and the only way to call them is by the name of the interface, followed by a dot, and then...
... method name [i.e. Tax.test(); ]
- In order to use non-static methods you need to instantiate the class you are in [i.e. new MainClass().testMethod(4.22)...]. This...
... is because when you implement an interface, all the non-static methods and data fields now belong to that class, and in order...
... to access them, you need to instantiate the class. Think about it this way, these imported methods now belong to the class...
... and in order to use them, you must create an object out of the class

LESSON FORTY TWO - ARRAYS
- An array is a place to store a whole bunch of values, while only using one variable to access them all. You can...
... access all the items by their index [i.e. familyMember[0], familyMember[1], etc.]
- Declaring an array is very similar to declaring a variable. The only difference is that you add a set of...
... square brackets [i.e. String[] array = ... OR int array[] = ...]
- All arrays start at an index of 0. So an array with a length of 3, has items at index 0, 1, 2
- You can declare an array in 3 different ways...
... 1) Declare the array and assign indexes later [i.e. String[] arr = new String[1]; arr[0] = "Bob"; arr[1] = "Jim";]
... 2) Declare and initialize the array in one line [i.e. String[] art = new String[1]{"Jim","Bob"};]
... 3) Declare and initialize the array in short-hand notation [i.e. String[] ars = {"Jim", "Bob", "Bill"};]
- Since arrays are very popular, it is common to use a for-each loop to iterate through them...
... [i.e. for (String name: family) { //code } ]. You can still use a regular for loop to iterate the array
- Since an array is an object [just like a string] you can use methods for it, such as family.length, and...
... this will retrieve the length of the array (how many elements it can hold)
- Attempting to access an index that is not in the array will yield an exception (ArrayOutOfBoundsException)

LESSON FORTY THREE - ARRAY OF ARRAYS
- Multidimensional arrays are arrays within arrays [i.e. Recording test scores and pairing them up with students]
- To create a multidimensional array, you add an extra set of square brackets [i.e. int[][] testScores = new int[3][5];]
- Multidimensional arrays hold values similar to regular arrays. You specify the location and store a value [i.e. testScores[0][3] = 99;]
- You can declare and initialize on one line [i.e. int score[][] = new int[][]{ {23, 12}, {45, 65}, {76, 89} };]
- Accessing the index of a multidimensional array is similar to regular arrays [i.e. score[3][4];]
- Multidimensional arrays allow you to create ragged/jagged arrays (when an index is missing, but an error isn't thrown]
- A ragged array is not a perfect square/rectangle [i.e. int score[][] = new int[][]{ {23, 12, 34, 55}, {45}, {76, 89} };]
- Iterating through multidimensional arrays requires two for (each) loops

LESSON FORTY FOUR - TRY/CATCH/THROW
- Runtime errors can be handled using try/catch blocks [i.e. try { // test code } catch (Exception e) { // handle exception }]
- If you want to stop the program, you can throw the error [i.e. throw e;]
- You can catch more than one exception(s) with multiple catch... 
... statements [i.e. try { // test code } catch (Exception1 e) { // handle exception } catch (Exception2 e) { // handle } ]
- You can group exceptions together using a pipe symbol [i.e. try { // test code } catch (Exception1 | Exception 2 e) { // handle } ]
- There are two main types of throwable objects; the exception class and the error class. Errors are very serious...
... and there's a small number of times you want to catch them [i.e. Computer is failing]. Within exceptions, there are two main...
... types of exceptions, unchecked vs. checked. Checked exceptions can be avoided by proper code and structure [i.e. if-statements]
- Compile errors include, but are not limited to: missing semicolons, improper use of braces, incorrect access modifiers, etc. These...
... errors are caught by the IDE and often times won't let you run the program unless the error is fixed
- Runtime errors occur when a program is run. These include, but are not limited to: accessing an element in an array that is...
... not present, dividing by zero, etc. Runtime errors can be fixed with proper code and try/catch statements
- It is good practice to be as specific as possible when catching exceptions
- The exception for dividing by zero is: ArithmeticException
- The exception for accessing an element in an array that does not exist is: ArrayIndexOutOfBounds

LESSON FORTY FIVE - TRY/WITH/FINALLY/THROWS
- Checked exceptions are checked/found at compile time. If Java believes that there is a possibility that the code...
... will throw an exception [i.e.FileNotFoundException], it will make you surround it in a try/catch block
- Unchecked exceptions are not caught during compile time, and occur during run time [i.e. ArithmeticException]
- Any time you open up a large file, it uses a lot of resources [i.e. Memory]
- All streams [i.e. File streams] have a method called 'close' that comes from the interface, close-able, and...
... closes off all connections to the stream so they don't remain in memory and cause a memory leak
- Streams are placed in a try/catch block because there is a possibility that the file doesn't exist, and...
... this must be accounted for in the catch block
- You can ignore checked exceptions using the 'throws' keyword [i.e. void method2() throws FileNotFoundException { //code }], and...
... this pawns off the exception to the previous method, until it reaches the main method where the exception has no where else to go, and...
... this ignores the warning but doesn't get rid of it; the error will still happen
- Throwing unchecked exceptions does not affect the compilation of your code as Java compiles it regardless
- The 'finally' block will happen regardless of the try block succeeding or failing, hence it is good practice to put...
... the close method in the 'finally' block, as the stream will always be closed regardless of how the try block performs
- The close method throws an IOException which must be dealt with 
- You can even perform null checks on streams to make sure they exist before interacting (i.e. Closing) with them
- Using the auto-close-able method is the best practice when dealing with streams, as Java will automatically close the connections
- You can even use more than one resource in the auto-close-able method
- You can import the entire library by using an asterisk/wild-card [i.e. Import java.io.*;]
- If you aren't working with integers, you can use the BufferedReader class. Otherwise use the Scanner class

LESSON FORTY SIX - LOGGING
- Logging is used to save certain events or errors that happen during runtime; this helps with debugging and fixing bugs
- Java has a logger you can use, and you can import it (i.e. import java.util.logging.*;)
- Usually, people name their loggers after the (full) class name (i.e. LogExample.class.getName() )
- For a small project, people tend to use the global logger, which logs everything as global (i.e. Logger.GLOBAL_LOGGER_NAME)
- You can set a custom level cut-off to only log certain events based off of importance 
- The logger scale goes like: SEVERE > WARNING > INFO > CONFIG > FINE > FINER > FINEST
- When a logger has a cut-off level of INFO, this means that only SEVERE, WARNING, AND INFO will be logged out to the console
- Loggers are meant to run in the background and keep track of exceptions by logging them (i.e. Print logs to file or console)
- If writing to a file, the logger will overwrite the contents of the file, unless you use the 'append' method
- The default format for logs is XML, but you can change it (i.e. fh.setFormatter(new SimpleFormatter()); )

LESSON FORTY SEVEN - READ & WRITE TO FILES
- If you're dealing with only characters, then you should use something that reads character by character, such as a Reader
- A string reads things byte by byte, and would be good for stuff like images
- Refer to the Java docs for more info about the read/write interfaces (https://docs.oracle.com/javase/8/docs/api/)
- It's good to use Buffered-Anything when dealing with large files because buffering will store the data in memory, instead...
... of messing with it in the file-system. Accessing things from memory is faster than accessing it from a disc. Hence...
... BufferedReader is faster than a regular Reader (i.e. 3x faster)
- Basic readers such as FileReader or StringReader, will read things one character at a time
- You can convert unicode numbers to characters by casting them to 'char' (Unicode table: http://www.rapidtables.com/code/text/unicode-characters.htm)
- Large files should always be read using BufferedReaders, because they are much faster
- Refer to the Java Docs when using and importing other methods (i.e. Scanner, Random, Etc.)
- Use System Nano-time (10^-9) to see which method computes faster
- 

LESSON FORTY EIGHT - PACKAGES

LESSON FORTY NINE - RECURSION

LESSON FIFTY - ANONYMOUS CLASSES

LESSON FIFTY ONE - LAMBDAS

*/
