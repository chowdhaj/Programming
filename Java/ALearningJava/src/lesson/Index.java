package lesson;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * //
// 		The package lesson contains code from Meekly Judge, divided into activities and examples 		 //
// 		Examples = Learn from them, and study them thoroughly before doing the activities 				 //
// 		Activities =  Do these by yourself as practice before moving on to the next lesson 				 //
// 		Everything is in sequential order - look at list below and refer to packages on left side 		 //
// 		Detailed notes are below are at the bottom of this page - organized by lesson - scroll down 	 //
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * //

/*/   
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * EXAMPLES										ACTIVITIES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 1. HelloWorld									HelloYourName2Ways
 * 2. InteractiveHello								DrawTickTacToeBoard
 * 3. PrintingPower									BigInitials
 * 4. SayHello										JavaWTF [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 5. BasicOperators								AreaAndPerimeterOfARectangle
 * 6. CommonDataTypes								FinalGradeInMET100
 * 7. InteractiveCommonDataTypes					BasketballPlayer
 * 8. --------------------------					UnitConversionFtToIn [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 09. OnePlusTwoEqualsTwelve						AreaOfATriangle
 * 10. RelationalEqualityConditionalOperators		DegreesOfATriangle
 * 11. UnderstandingTypeCasting						BasketballPlayerStats
 * 12. --------------------------					OddOrEven [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 13. MathExample									PlayingCards
 * 14. RandomExample								PalindromeDetector
 * 15. StringBuilderExample							RolePlayingGame
 * 16. --------------------------					GuessMyNumber [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 17. Factorial									BigLetters
 * 18. MethodBasics									RollTheDice
 * 19. VariableScope								RightTriangle
 * 20. --------------------------					Circles [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 21. NSidedDice									CircleClass									
 * 22. --------------------------					MET100Grades
 * 23. --------------------------					YourNameObjectStyle
 * 24. --------------------------					EZTipCalc [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 25. PlayingCardsExample							UnitTestBasics					
 * 26. --------------------------					RectangleClassTests
 * 27. --------------------------					PlayingCardsExample
 * 28. --------------------------					RectangleClass [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 29. DungeonHack									LegalDrinkingAge				
 * 30. IfElseStatement								PlayingCardsComparison
 * 31. --------------------------					DungeonHackMonsterTurn
 * 32. --------------------------					DungeonHackCriticalHit [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 33. Enumerations									LetterGradeRun						
 * 34. SwitchStatementAndIfElseLadder				LetterGradeEnums
 * 35. --------------------------					ATM
 * 36. --------------------------					SalesTaxCalculations [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 37. BottlesOfBeerRun								CountingWithFor					
 * 38. ForLoopBasics								PrintBarChart
 * 39. MultiplesOfN									RPGAbilityScores
 * 40. NestedForLoops								MultiplicationTable [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 41. MidTestLoop									ATMPin									
 * 42. PostTestLoop									QuizAverageDropLowest
 * 43. PreTestLoop									DungeonHackCombat
 * 44. WhileLoopBasics								QuizAverage [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 45. ArrayBasics									MinAndMax					
 * 46. ArraysOfObjects								ASCIIBarChartv2
 * 47. --------------------------					English2Yoda
 * 48. --------------------------					TestScores [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 49. ImplementingTickTacToe						TicTacToeBoardWinner		  
 * 50. MultiDimensionalArraysExample				TicTacToeFullGame
 * 51. --------------------------					DrawTicTacToeBoard [DEBUG]
 * 52. --------------------------					--------------------------
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 53. ArrayListBasics								ArrayListOfStudents				
 * 54. ArrayListExample								DeckOfPlayingCards
 * 55. ArrayListExampleAddRemoveSwap				PlayingCardsHand
 * 56. --------------------------					PlayingCardsCountTheAces [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 57. BasicSortingSearchingDemo					UnderstandingComparators			
 * 58. SortingSearchingStudentsUsingComparator		FindCard
 * 59. --------------------------					SortingHands
 * 60. --------------------------					ImplementingCardComparator [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 61. ExampleTryCatchFinally						HourlyWage							
 * 62. ExceptionBasics								CardExceptions
 * 63. --------------------------					TicTacToeFullGameSanitizedInput
 * 64. --------------------------					InputUntilValid [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 65. BasicFileIO									ThePassword					
 * 66. ObjectSerialization							GradeProcessing
 * 67. --------------------------					StudentFileIO
 * 68. --------------------------					WordCount [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 69. DemoSwingsControls							HelloSwing						
 * 70. EverythingsAString							TemperatureConversion
 * 71. --------------------------					MathFlashCard
 * 72. --------------------------					StudentGUI
 * 73. --------------------------					EZTipCalcGUI [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 74. CashRegisterDrawer							ProductCatalogDemo
 * 75. ProductCatalogDemo							StudentGradeStrategy
 * 76. --------------------------					SubclassMania [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 77. EarthquakeFeedSample							ChuckNorrisFactGUI
 * 78. TEMP											RandomOrgApiDemo
 * 79. --------------------------					ChuckNorrisFact [DEBUG]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/*/ //DON'T FORGET TO REDO ALL [DEBUG] EXCERCISES // maybe redo 16 & 17 ... redo 18 & 20 in eclipse... 

// ############################################################################# //

/*/
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON ONE - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * '.java' = Source Code
 * '.jar' = Compiled Code AKA Java Byte Code 
 * Jar files are created from Java files
 * Comments are ignored by the Java compiler
 * There are two types of comments: single line and multi-line comments
 * The name of the class should match the name of the file and package
 * Use the 'refactor' option to rename classes
 * Java is Object-Oriented [OOP]
 * Objects can be anything from types of people or real people or physical objects
 * The class defines the behavior and characteristics of objects
 * 'public' is accessible by anywhere, and private is only accessible by the method itself
 * Java code is found within blocks {curly braces}
 * Java always looks for the main method
 * 'static' means that we don't have to create an object to use it
 * 'void' means that it returns nothing
 * By convention, you put one statement per line
 * Every statement must end in a semicolon; it marks the end of the statement
 * The blocks do not need a semicolon
 * Strings are sequences of characters (i.e. "Hello")
 * Quotes represent a literal string - remove quotes to represent a variable
 * Variables are stored in memory
 * You can import existing methods in the java library (i.e. import java.util.Scanner;)
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON TWO - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Variables are named locations in memory which store data of a certain type 
 * The shape of the variable (i.e. int, string, etc.) determines what can go in it
 * Examples of ints are 1, 2, 3, -99, -120, etc.
 * Examples of char: 'a', 's', 't', 'g', etc.
 * Examples of strings: "hello", "mike is gay", "harvey", etc.
 * Examples of doubles: 12.111112, 34.42, 72.511116, etc.
 * A boolean only holds two values, and they are: true OR false
 * The assignment statement takes a value and places it in a variable
 * You can and should declare and initialize a variable on the same line
 * Format specifiers are [%s] = String, [%d] = int, and [%f] = double AKA floating point value
 * Round doubles: "%4.3f" - this means that there will be 4 digits, 3 to the right of the decimal
 * Use the Scanner class to accept input from the user
 * 'nextLine()' = Strings | 'nextDouble()' = Floating point values | 'nextInt()' = Ints
 * Use exception handlers to prevent programming from cashing unexpectedly
 * A watch allows you to inspect a variable or condition while the program executes
 * Set breakpoints and watches to help with debugging and solving problems
 * Arithmetic operators are: addition, subtraction, multiplication, division, and modulo/remainder
 * The ternary operator [AKA Immediate If] allows you to  evaluate a true/false [boolean] expression 
 * You can declare multiple variables in one line (i.e. int age = 41, height = 70, weight = 50;)
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *								LESSON THREE - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Syntax error = Prevents Java from converting the source code into byte code (AKA compilation error)
 * Most of the syntax errors will show up interactively as you type in your IDE
 * String concatenation is when you combine two or more strings using the plus operator ( + )
 * Semantic error: A disconnect between a program's intent and action [harder bugs to catch]
 * You cannot assign a string to an int OR a double to an int because they are incompatible types
 * Use 'Integer.parseInt()' to convert from string to int (i.e. int i = Integer.parseInt(string);)
 * Use 'Double.parseDouble()' to convert from string to double (i.e. Same as above; replace with double)
 * Casting: Forces a type over an operator (i.e. Forces a string to add with an int/double)
 * When using 'ints', Java ALWAYS rounds down (i.e. 20/15 = 1.333333, but Java will output 1)
 * Java arithmetic operators have "Type Consistency" (i.e. 'int' divided by 'int equals 'int')
 * Type promotion is when the variable gets upgraded to the superior type (i.e. int --> double)
 * Implicit cast: You don't tell Java to promote types, it does it automatically (i.e. int / 1.0)
 * Explicit cast: When you tell Java to convert types (i.e. double d = x / (double) y;)
 * You cannot cast from a higher type (i.e. double) to a lower type (i.e. int), because loss of precision
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *								LESSON FOUR - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Objects are custom variables which contain state and behavior/actions associated with object
 * i.e. A bike is an object - it has wheels, gears, pedals, etc. [these are all parts]
 * The bike will have behaviors such as shifting from one gear to the next OR applying brakes
 * In Java, state is represented as properties and behavior as methods 
 * Methods refer to behavior on an object, AND, properties refers to characteristics of an object
 * Classes defines the blueprint for an object - contain all the code
 * Think of a class as a custom data type and the object is the variable you declare from it
 * An example of an object is a dog. All dogs have these characteristics (states and behaviors): 
 * i.e. States: furColor, furLength, shedsFur, numberOfTeeth, hasWhiskers, teethSharpness, etc. 
 * i.e. Behaviors: Bark(); Eat(food); WagTail(rate); Walk(); Run(speed); Scratch(back); etc.
 * The base class defines all the states and behaviors but the specifics is left to the object (dog)
 * Scanner input = new Scanner(System.in); [Below is an example of how objects and classes relate together]
 * [Scanner] is the CLASS, which is the template for the object 
 * [input] is the NAME of the object - can be altered. [input] inherits all objects and classes of the Scanner class
 * [ = ] is the ASSIGNMENT operator. It assigns a value to a variable/object. 
 * [new Scanner(System.in)] is the OBJECT CONSTRUCTOR. It's constructed with the 'new' keyword, followed by the class of the object
 * [System.in] is a CONSTRUCTOR ARGUMENT. This defines how the object should be created from the class 
 * Advantage of OOP: You can reuse other people's code without having to start from scratch all over again
 * You only need to use the 'new' keyword when you create a new object of that class
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON FIVE - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Objects consist of state and behavior [states are represented as properties and behaviors are represented through methods]
 * When you create your own class, you need to create your own methods to define behaviors of the objects created
 * A method is a section of code that can be reused and ran as many times as needed; running a method is called a 'call'
 * You cannot create a method unless it is a member of a class - all methods are part of classes
 * Static methods can be called without declaring an object of the class first. You don't need to do this: Object obj = new Object();
 * public static int Square (int number) { [The meanings of this line are dissected below]
 * 'public' is the access modifier of the method [methods are either public or private]
 * A public method is accessible through the object, and private methods are only available inside the class itself
 * 'static' is a declaration - you can include it or not - but it means that you can use the method without creating an object of the class
 * Using 'static' means that you DO NOT need to create an object (i.e. Random gen = new Random();)
 * The return type of the method is always next to the method name (i.e. int Square() {)
 * After the name of the method, in parenthesis, we put one or more parameters that act as 'contracts' in order to satisfy the method
 * Parameters look like variable declarations (i.e. int number) but in fact they are present so the method gets a variable(s) passed to it
 * The entire method/class is enclose by and opening brace and a closing brace (i.e. static void method() {...})
 * Every method that has a return type (i.e. Has parameters) needs a return statement (i.e. return result;)
 * The return statement is usually the last statement in the method as it returns the calculations
 * 'void' means that the method returns nothing (i.e. Has NO parameters passed to it)
 * The 'main' method is the entry point for every Java program - the 'main' method is the first method that gets executed 
 * You should name your method parameters in a meaningful way so the user/caller of your method understands your expectations
 * When you define the method, you pass parameters, and when you call the method, you pass arguments
 * Unit Testing: You write code to verify the method that you wrote is working correctly and has no semantic errors
 * Anything that is not inside the class file needs to be imported and instantiated as an object [refer to MethodBasics]
 * When you define a variable, that variable only exists within the method it was defined in [within the {}]
 * The variable, type = String, 'name' in 'main()' is different from the variable 'name' in 'anotherMethod()'
 * Variables are not arguments to the function, only values are passed in as arguments [when you pass int x, you pass the value of 'x'] 
 * In other words, Java passes by value, not reference [refer to VariableScope for more information]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON SIX - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Every class that you create goes in its own '.java' file and can be placed in different packages
 * You can create as many classes and packages as you want or need 
 * Every class should have a CONSTRUCTOR: A special method called when an object of the class is created
 * The constructor method is called when you create a new object of the the class (i.e. Die d1 = new Die();)
 * Public and private access modifiers are used to control access to the variable or method
 * 'public' makes the variable/method accessible outside of the class
 * 'private' makes the variable/method accessible from within the class only
 * Make variables private to prevent exposing them to the user and increase security
 * Variables are marked private so that a user of the class cannot access these values directly
 * Use the keyword 'this' to reference the current class that you are in (i.e. this.sides = sides;)
 * They keyword 'this' is used to reference the private members of the class without having to name variables differently
 * Method Overloading: The same method with different parameters (or more parameters)
 * It is acceptable to have two methods with the same name but a different argument list
 * When you build classes, you should encapsulate them [Hide the implementation details from the user]
 * Use Getters and Setters to hide the details and variables of the class from the user
 * Encapsulation allows you to control the private members of the class [Prevent manipulation of variables]
 * All classes need states - they are stored in private variables, and all classes should have constructors and they should initialize the variables
 * Any properties you want to expose to the user, you can do that through Getters and Setters
 * To write good code, you should follow the following conventions:
 * 1. Every class should have a constructor
 * 2. Declare variables used by the class as private [NOT public]
 * 3. You should initialize all private variables within your constructor
 * 4. If you accept parameters in your constructor, use the 'this' keyword to disambiguate method parameters from private members
 * 5. Use get/set methods to control access to private variables/members [Don't implement a set method if you don't want users to change the variables]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON SEVEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Use the 'static' and 'final' keyword to make variables constant and immutable
 * When you create a constant variable, by convention, the name must be in UPPERCASE
 * If you start a comment like this '/**' and press enter, it'll automatically generate the stub for a JavaDoc
 * The first line [after the '/**'] of the JavaDoc describes what the method does 
 * Use the wild-card/asterisk ( * ) to import all classes from a package instead of importing classes line by line
 * Write your own methods and have them override the default using the '@Override' keyword
 * Unit Testing: Test the rigidity of your code and reduce the probability of semantic errors
 * In Java, we use JUnit to perform the above test [to verify our class methods work]
 * In Unit Testing Terminology: 'assertEquals()' means 'Verify these are equal'
 * Unit Testing is good to check if your code isn't broken after modifying it
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON EIGHT - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * The 'if-else' statement allows you to branch your code based on a boolean expression [Boolean means true / false]
 * When the boolean expression is true, the statements under the 'if' are executed
 * If the boolean expression is false, the statements in the 'else' block are executed
 * The three logical operators are: AND ( && ), OR ( || ), and NOT ( ! )
 * AND - True when both operands are true; false otherwise (i.e. x >= 1 && x <= 5 )
 * OR - True when one operand is true, and false when both are false (i.e. Dead() || Quit())
 * ! - This is logical NOT, and negates the true/false condition - the operand true becomes false, and vice versa (i.e. !happy) 
 * Logical AND is used when both operands need to evaluate to true (i.e. Checking when a number fits within a range)
 * The 'if-else' statement is basically a complex boolean expression (The conditions simplify to a true or false)
 * Pseudo-code: Writing code in plain English before coding it in the programming language
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON NINE - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Nested If-Else is used when you need to branch based on a series of Boolean expressions
 * Switch Statement branches based on the value (integer/strings/doubles/etc.) of an expression
 * In a Switch Statement, you need to put they word 'break' after each case so it doesn't 'fall through'
 * A 'break' is good to add because it prevents Java from running unnecessary code
 * Once the If-Else ladder finds the correct condition, it jumps out of the block - doesn't test the other conditions
 * An enumeration is a custom data type that enables a variable to be a set of predefined constants of specific value
 * Enums are declared like a class (i.e. public enum Suits { Clubs (0), Diamonds (1), Hearts (2), Spades (3) })
 * Enums allow you to establish your own data types and specify values for your type and increase the legibility of your code
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON TEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Increment: Advancing the value of a variable by 1 (i.e. x = x + 1; x += 1; x++;)
 * Decrement: Decreasing the value of a variable by 1 (i.e. x = x - 1; x -= 1; x--;)
 * Iterative structures repeat a series of statements until a boolean expression is false
 * The boolean expression tells Java when the loop should stop/ends
 * A 'for loop' consists of the initializer, exit condition, and incremental - they are all at the top
 * Iterative structures are useful for executing repetitive tasks over and over again
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON ELEVEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Iterative programming constructs repeat a series of statements until a Boolean expression is no longer true
 * We call the boolean expression the exit condition because when it's false, the loop is no longer executed
 * Statements inside the loop must change variables tested in the exit condition, or else the loop will run forever
 * The 'for loop' has the initializer, exit condition, and increment all contained with the construct of the 'for'
 * In a 'while loop', you are responsible for the initializer and increment - these occur at your choosing
 * The 'while loop' is really flexible because you can check the boolean expression, mid, post, and pre-test
 * A 'do while' loop (AKA post test loop) while execute at least once, regardless of the boolean expression
 * The post test loop is good because you don't have to set your condition because the loop will run once, regardless
 * A mid test loop allows you to test one or more cases without having multiple booleans because 'break' will exit the loop
 * The 'break' keyword is used to exit the loop and move on to the next line
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON TWELVE - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * An array is a container that holds a fixed number of values of the same type
 * An array is like a variable, but it holds multiple variables of the same type
 * Each item in the array is an element and is accessed by a numerical index
 * An array of size 10 has 10 elements in the array, indexed from 0 - 9, inclusive
 * An array starts at 0 and ends at the size subtract 1 (i.e. An array of size 10 goes from 0 - 9]
 * Declaring an array is similar to declaring a variable, but there are brackets after the data type
 * "String [] names;" Tells Java that you are not talking about one string, but an array of strings
 * A parallel array is one that holds variables of the same type, and an object array holds objects
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON THIRTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Multidimensional arrays are just like arrays, however, there are more than one set of indices
 * Multidimensional arrays are useful for representing 2-D and 3-D structures like maps, matrices, cubes, etc.
 * This is how you declare a 3 dimensional array: ( int[][][]cube = new int[3][3][3]; )
 * All arrays in Java are zero based arrays - meaning they start at zero
 * The purpose of a constructor is to initialize the private members of the the class [i.e. Make them accessible]
 * Iterating over a multi-dimensional array requires two 'for loops' (one for rows, and one for columns)
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON FOURTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Collections are similar to arrays in that they are groups of objects with multiple elements into a single unit
 * The ArrayList class is an example of a specific implementation of a collection - it is also the most popular
 * Collections contain special methods for managing objects (i.e. Adding/removing/finding objects and indexing a specific value)
 * An example of a collection is an Email Inbox - the Inbox is a collection of emails [Emails are added and delete constantly)]
 * An array is of a fixed size and a collection can be of a variable size [collection can be manipulated]
 * Arrays use primitive types (i.e. ints, doubles, strings, etc.), collections use objects (i.e. cards, hand, email, etc.)
 * This is how you declare an ArrayList of type 'Card' called 'hand': ArrayList<Card> hand = new ArrayList<>();
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON FIFTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Sorting is the act of arranging a collection in an order in a specific sequence (i.e. Least to greatest)
 * Searching is finding a specific value in a collection (i.e. Find 5, 8, etc.)
 * In the Collections method you can sort using: Collections.sort() and search using: Collections.binarySearch()
 * Doing a binary search requires the data to be sorted already [but you can write your own methods]
 * Before searching and sorting, you need to implement a comparator - a special class which returns an integer comparison of two objects
 * If a is less than b then the comparator returns a -1; if a equals b then it returns a 0; if a is greater than b, +1 is returned
 * A linear search goes through the entire collection, one by one, to find the item in question 
 * Use the 'implements' keyword to implement the Comparator in your class's methods
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON SIXTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Exceptions are designed to handle errors (i.e. User Errors [Bad Input] & Programmer Error [Bugs])
 * Errors are conditions which cause our program to stop running or terminate (i.e. Bad Input)
 * Exceptions detect errors, handle the error condition, continue running the program
 * There are two types of errors that occur: User Error & Programmer Error
 * User Error is Bad Input or Action [i.e. Entering a String when an int or double is expected]
 * Programmer Error is caused due to bugs in the program [i.e. Referencing a value outside an array index]
 * Errors can be handled using the try-catch-finally block (i.e. try {...} catch (Exception e) {...} finally {...})
 * Code that can possibly generate an error is surrounded by the 'try' block
 * If a program has a chance of causing an error, Java will raise an exception - an exception is a variable of type exception
 * Instead of terminating, Java jumps down to the 'catch' block and executes the code in there
 * Regardless of what happens, the code in the 'finally' block always executes [it is the clean up code]
 * If you do not want your program to terminate, you should use a 'try/catch' block to gracefully handle it
 * You should log errors so you know the types of errors that happen in your code (i.e. Print to console or write to file)
 * Any time you accept input from the user, you should check for errors because you can't control user input
 * Reading or writing to a file should be placed in a 'try/catch' block because the disk/file might not be available 
 * Use a 'try/catch' block when accessing resources outside your control [i.e. Check to see if mouse is plugged in]
 * The object dependencies should be enclose within the 'try/catch' block because of variable/object scope
 * You can catch more than one exception using a single 'try' block, with multiple catches [i.e. InputMismatchException & IntegerOutOfRangeExeption]
 * The 'finally' block always executes whenever the 'try' or 'catch' block executes, making it useful for clean-up code 
 * You can make your own exceptions by making a new class and using the keyword 'extends' on the system 'Exception' class
 * You can also print out the exception itself by calling the name of the exception and printing it to console
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON SEVENTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * System.in is an input of text [i.e. Console] and System.out is an output of text [i.e. Text file]
 * File() - A java representation of a file [i.e. Text file]
 * PrintWriter() - Used to write to a file, in the same way you write to System.out
 * Scanner() - Used to read from a file, in the same way you use it to read from System.in
 * Always remember to close the file when you are done using/writing to it
 * You need to surround your code around a 'try/catch' statement because the file may not exist 
 * To read a file you need to use the Scanner class and surround it with a 'try/catch' block
 * Reading and writing to a file is not much different from reading and writing to the console
 * Object serialization is the process of converting an object into a series of bytes so they can be written to disk
 * Object serialization is useful for saving data that can be accessed at a later date [i.e. Settings]
 * Object to Disk --> Serialization // Disk to Object --> Deserialization
 * To make an object serializable, use the keyword 'implements' followed by Serializable
 * FileInputStream/FileOutputSteam - Used to read/write to a file, treating it as bytes instead of text
 * ObjectInputStream/ObjectOutputStream - Used to deserialize/serialize a data input stream back into an object
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON EIGHTEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Everything you do [in a GUI], when you type input is a string and must be converted to other types like ints, doubles, booleans, etc.
 * Java Swing GUI works by responding to a user event [i.e. Clicking a button, typing text, etc.]
 * The Java Swing GUI has a main event loop and waits for a response from the user before executing code
 * The following list consists of some common classes available to you, the developer:
 * 	- JFrame: Makes a window
 * 	- JLabel: Displays text
 * 	- JButton: Used for clicking
 *  - JTextField: Accepts text input
 *  - JCheckBox: Yes/No Input
 *  - JComboBox: Select items from a list
 * And methods to complement the above classes are:
 * 	- getText() - Gets text value of the control
 * 	- setText() - Sets the text value of the control
 * 	- isSelected() - Determines if a control is selected [Used in conjunction with JCheckBox/JComboBox]
 * Working with Swing is very different from working in the console
 * Buttons/CheckBoxes/Labels have various properties such as color, size, etc. and they can be modified
 * Everything entered by the user is a string and must be converted [i.e. Integer.ParseInt] in order to be used 
 * When setting text-fields, the input must be converted to a String [i.e. String.format("%f"), var_name))]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON NINETEEN - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Java interfaces allow us to define a common behavior among classes
 * Any class which implements the interface must implement the behaviors defined in the interface
 * This means that we can have more than one implementation of the same thing - valuable in programming a demo version of hardware
 * For example, imagine you are in charge of writing a software responsible for handling the cash register. The only...
 * ... problem is that you don't have the actual cash register to program to. To solve this, you program to an...
 * ... interface. This interface will implement the behaviors of a cash register drawer. Then, you'll program...
 * ... a mock up that simulates how a real drawer would work. Finally, when the hardware arrives, you code the...
 * ... interface to the drawer, and continue writing the software, without having to rewrite anything.
 * The purpose of interfaces is to design a program without the necessary hardware components
 * An interface defines a specification, not an implementation
 * The purpose of an interface is to have multiple classes that exhibit the exact same characteristics
 * The purpose of inheritance is to extend the existing functionality of a class that is already present
 * The new class extends the base class automatically and inherits the behaviors of the base class, and then you...
 * ... can extend or override some of the behaviors of the base class, if need be
 * Inheritance is good for representing a wide variety of products with different characteristics [i.e. Products: Books, Pants, CDs, etc.]
 * All products have a price, but some products have more info than others [i.e. Books have ISBN, and clothes have size]
 * Use the '@Override' keyword to replace a method's functionality with something else [i.e. toString()]
 * The keyword 'super' is used to call the parent constructor of the base class 
 * There is an 'is a' relationship between the parent/super class and the child/sub class [i.e. A child is a parent]
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *								LESSON TWENTY - NOTES
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Many websites expose their services through APIs [Application Programming Services]
 * You can use these APIs to build applications around these services [i.e. Google maps, Yelp, Yahoo Finance, etc.]
 * It's not good practice to catch a generic exception because if the program crashes, you won't know why
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Source: https://www.youtube.com/playlist?list=PLyRiRUsTyUXhUXoOPEdMZWhGpGeSQFZgH
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * 
/*/