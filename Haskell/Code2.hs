-- Haskell Tutorials By Lazy Cast [Practice]
-- https://www.youtube.com/watch?v=5XLTRuKoOtM

{- 

-------------------------------------------
EPISODE ONE => GHCi & Function Introduction
-------------------------------------------

- GHCi allows you to run Haskell commands without having to run anything. 

- You can do basic things like combining or extracting numbers:
Prelude> 1 + 2 + 3
6

- You can write functions as let expressions:
Prelude> let square x = x * x
Prelude> square 10
100

- You can define a function using this general formula: (let) + (functionName) + (argument(s)) + (=) + (operation(s))

- GHCi is great for testing snippets of code; code that is uncompiled. The only downside is that...
... once a session is terminated, all data is lost.

- It's best to use an IDE or text-editor for creating Haskell functions. This allows you to...
... save code and continue between sessions

- Note: Haskell files are saved as .hs (i.e. Practice.hs, Function.hs, Etc.)

- When writing functions inside a text-editor, you don't need to write "let" before the function name. 

- The general formula is: (functionName) + (argument(s)) + (=) + (operation(s))

- This could look something like:
addOneTo x = x + 1
double x = x + x
addTwoNumbers x y = x + y

- Furthermore, function names should follow these rules:
1. First character should always be a lowercase LETTER
2. A function can contain letters, numbers, and quotes. This applies to arguments as well

- For example, these are all CORRECT:

function123
functionName
function'

- But these are INCORRECT:

123function
FunctionName
'functions

- There are two main functions in Haskell, Infix functions, and Prefix functions

- INFIX functions are binary and take two arguments. For example:
a + b
a - b
a * b
a / b
a == b
a /= b
elem 4 [1,2,3] --> Can also be written like this --> 4 `elem` [1,2,3] --> Where ` is a grave accent


- Note: Equality checks in Haskell are done using /=, as compared to != in other...
... languages. However, == remains constant across all languages

- PREFIX Functions are all other functions. For example:
length [1, 2, 33]
reverse [1, 2, 3]
repeat 3

- Note: Infix functions can also be classified as Prefix functions. Prefix is "bigger" than Infix

- You can even define your own infix functions. For example:
a != b = a/= b

- Check out Haskell.org/Hoogle to some useful packages/functions

-------------------------------------------
EPISODE ONE => GHCi & Function Introduction
-------------------------------------------

-}

-- Adds one to the supplied number
addOneTo i = i + 1

-- If the number supplied is odd, then 1 is added to it and returned
alwaysEven x = if even x then x else x - 1

-- This function takes two numbers, x and y. If either of them are odd, one is added to them...
-- ... to make them even. The result is returned in a tuple
letEven x y = let 
    isEven x =  if even x then x else x - 1
  in (isEven x, isEven y) 
-- Note: isEven can only be called inside letEven. If you try to call isEven, you'll get...
-- get a variable out of scope error. Also, isEven is a nested function.

-- You can also define functions using 'where' instead of 'let'. For example:
whereEven x y = (isEven x, isEven y)
    where isEven x = if even x then x else x - 1
-- 'whereEven' is totally different from 'letEven' because 'isEven' is called before it is defined
-- This is becasuse anything written inside of a 'where' function can be used anywhere inside...
-- ... of the parent function. Even if you had nested 'where' statements, the parent function...
-- ... will always be 'whereEven'

-- Both 'where' and 'let' have access to:
-- 1. The parent function's arguments
-- 2. Other naked arguments (i.e. addOneTo, double, etc.)
-- 3. Other 'where' functions

-- However, if a value is defined inside the parent function, only 'let' can access it, NOT 'where'

{-

----------------------------------------
EPISODE TWO => Lists, Tuples, & Laziness
----------------------------------------

- Lists and Tuples are used to store multiple items in a single wrapped value. However, they are...
... both extremely different

- A list can only store values of the same type. For example:
List of Characters --> ['a', 'b', 'c', 'd'] --> Denoted as [Char]
List of Numbers --> [1, 2, 3, 4] --> Denoted as [Int]
List of Strings --> ["hello", "hello", "hello"] --> Denoted as [[Char]]

- Note: A string is just a list of characters. "hel" is just syntactic sugar...
... for ['h','e','l']. You can prove this by typing the following into GHCi:
Prelude> "hel" == ['h','e','l']
True

- Main gives you many pre-defined functions such as:

head: Returns the first item in a list
head [1,2,3,4] --> 1

tail: Drops the first item in a list
tail [1,2,3,4] --> [2,3,4]

last: Returns the last item in a list
last [1,2,3,4] --> 4

init: Drops the last item in a list
init [1,2,3,4] --> [1,2,3]

!!: Returns the n'th element in a list
[1,2,3,4] !! 2 --> 3

- Note: Counting starts at 0, so [1,2,3,4] is indexed like this:
[1, 2, 3, 4,...,10]
 0  1  2  3     9

- You can even have nested lists --> [[1,2,3],[4,5,6]] --> And each list is seen as a single...
... value, so calling head on the list above returns [1,2,3]

- In Haskell, you can't mutate anything. So if num = 5, then num will ALWAYS equal to 5, no...
... matter what. Even if you did num + 1, you'd get 6, but the value of num will continue...
... to be 5, and calling num will return 5, all the time. When you add something to a...
... variable/function, Haskell creates a new temporary variable and applies the mutations...
... to it, and then discards it once it's done using it. However, there are libraries where...
... you can mutate values, but it's best to avoid those as much as possible

- There are two values we can use to add values to a list. They are:
1. Colons (aka Cons) --> :
2. PlusPlus Operator --> ++

- Colon takes a SINGLE VALUE on the left, and a list on the right. For example:
4:[5,6] --> [4,5,6]
3:[3]   --> [3,3]
69:[]   --> [69]

'a':['b','c'] --> ['a','b','c']
'z':['x']     --> ['z','x']
"hello":[]    --> ["hello"]

- PlusPlus appends TWO LISTS of the same type. For example:
[6,7] ++ [8,9]  --> [6,7,8,9]
[6,7] ++ [420]  --> [6,7,420]
[69.420] ++ []  --> [69.42]

['a','b'] ++ ['c','d'] --> ['a','b','c','d']
['e','f','g'] ++ ['h'] --> ['e','f','g','h']
"Lazy.Haskell" ++ [] --> ["Lazy.Haskell"]

- When dealing with the Colon and PlusPlus operators, there are 3 things you need to be aware of:
1. Both Colon/Cons & PlusPlus require the lists/values to be of the SAME type. You...
... cannot append/add a 'char' to a list of 'Ints'
2. Colon/Cons adds the value to the FRONT of the list, while PlusPlus adds the...
... second list to the BACK of the first list
3. PlusPlus is very slow for large lists, because Haskell needs to go through the entire list...
... in order to append the lists. This is because Haskell only knows the front of the list...
... not the end of the list
 
- Haskell is lazy. This means that it won't do anything until it's really asked to show you...
... something. If you ask Haskell for the first value of a list, it will only evaluate...
... the first value, and ignore the rest of the list. This helps with performance, and...
... helps create interesting algorithms. Consider the following:

lazyList = [1,2,3, error "LAZY.AF", 4,5,6]

- If you ask Haskell to return 'lazyList', it'll look a little something like this: 

Main> lazyList
[1,2,3,*** Exception: LAZY.AF ... [The ellipsis represents additional unimportant text]

- The error in the middle prevented 5,6,7 to be evaluted; Haskell didn't return them

- Now let's see what happens when you only deal with the first 3 items of 'lazyList'

Main> take 3 lazyList
[1,2,3]

- How interesting! No error occured this time because Haskell didn't need the 4th item...
... in the list - which would throw an error

- If Haskell doesn't need to evaluate something, it won't bother with it. For example:

Main> drop 4 lazyList
[5,6,7]

- Once again no error occured because Haskell doesn't bother evaluating the error. If you do...
... ask Haskell to evaluate the error, only then will Haskell throw an Exception. For example:

Main> drop 3 lazyList
[*** Exception: LAZY.AF ... [The ellipsis represents additional unimportant text]

Main> take 4 lazyList
[1,2,3,*** Exception: LAZY.AF ... [The ellipsis represents additional unimportant text]

- Because Haskell is lazy, it has ranges, which allows you to create lists within a...
... specific range. For example:

Prelude> [1..10]
[1,2,3,4,5,6,7,8,9,10]

- You can even specify the step/increment. For example:

Prelude> [0,2..10]
[0,2,4,6,8,,10]

- However, you can only use two numbers to specify the pattern; anymore will throw an error. For example:
Prelude> 0,2,6..10]
<interactive>:55:7: error: parse error on input ‘..’

- Because Haskell is lazy, we can generate infinite lists like this [1..]. This is useful...
... because we can do things like this:

Prelude> take 3 [1..]
[1,2,3]

Prelude> take 4 $ drop 5 [1..]
[6,7,8,9]

-- This tells Haskell to create an infinite list, drop the first 5 items, and then...
... take the first 3 items

- Note: The dollar sign symbolizes that the following argument is placed inside brackets. So...
... take 4 $ drop 5 [1..] --> Looks Like ---> take 4 (drop 5 [1..])

- Tuples can carry multiple different types, where as lists can only store similar types. For example:

Prelude> let t = ("John", 34)
Prelude> t
("John", 34)

- You can use fst and snd to return the first and second value in a tuple. For example:

Prelude> fst t
"John"

Prelude> snd t
34

- However, fst and snd will ONLY work on Tuples that store two values. If a tuple stores...
... more than 2 values, then fst and snd will not work. Also, Tuples can be as large...
... as 15 values. To circumvent this, you can create a list of tuples, and then...
... use the lookup function. For example:

Prelude> let ts = [("John", 34),("Billy", 44),("Bob", 24)]
Prelude> lookup "John" ts
Just 34

Prelude> lookup "Bob" ts
Just 24

- Note: The resulting answer is wrapped in the Maybe type. The maybe type is used...
... in situations where you might not get a value at all. If you try searching for...
... a non-existant value in the list of tuples above, "Nothing" will be returned. Also, in...
... other languages, Nothing is Null or Nil. For example:

Prelude> lookup "David" ts
Nothing

- The zip function takes two lists, and combines them to form a list of tuples. For example

Prelude> zip [1..3] ['a'..'c']
[(1,'a'),(2,'b'),(3,'c')]

- Because the zip function is a binary function - only takes two arguments - you can also write...
... it as an infix function. For example:

Prelude [1..3] `zip` ['a'..'c']
[(1,'a'),(2,'b'),(3,'c')]

- Furthermore, when you create a list of tuples, every tuple must contain the same type...
... or else it won't work. Differently constructed tuples are seen as different types. For example:

[("Jim",1),("Bob",2)] --> [("String",Int)] --> The tuples' types are uniform throughout
[(1,'a'),(2,'b'),(3,'c')] --> Each tuple is of type: [(Char),(Int)] --> Tuples' types are uniform

[("Jim",1),("21,Bob")] --> Types are not uniform throughout; will throw error
[("Jim","Bob"),(1,23)] --> [("String","String"),(Int,Int)] --> Different Types = Error

----------------------------------------
EPISODE TWO => Lists, Tuples, & Laziness
----------------------------------------

-}

listOfNumbers = [1,2,3,4,5,6,7,8,9] -- Creates a list of numbers from 1 to 9
listOfChars = ['a','b','c','d','e','f','g'] -- Creates a list of chars from 'a' to 'g'
syntacticSugar = "hello" == ['h','e','l','l','o'] -- Proves that all Strings are just [Char]

head' = head listOfNumbers -- Returns the first element in listOfNumbers --> 1
tail' = tail listOfNumbers -- Returns every element but the first one --> [2,3,4,5,6,7,8,9]

last' = last listOfChars -- Returns the last element in listOfChars --> 'g'
init' = init listOfChars -- Drops the last item and returns the list --> ['a','b','c','d','e','f']
-- There are many more functions that can work with lists. Visit the Haskell Wiki or Documentation for more

thirdElement = listOfNumbers !! 2 -- Returns the 2nd 'CS' element in listOfNumbers --> 3
fourthElement = listOfChars !! 3 -- Returns the 3rd 'CS' element in listOfChars --> 'd'
-- Note: Counting in CS starts at 0. Hence asking for the 2nd element, returns the 3rd 

nestedList = [[1,2,3],[4,5,6],[7,8,9]] -- Creates a nested list of Ints --> Type: [[Integer]]
nestHead = head nestedList -- Returns the first element (list) in nestedList --> [1,2,3]
nestTail = tail nestedList -- Drops the first element (list) and returns the rest --> [[4,5,6],[7,8,9]]

five = 5 -- Creates a function called 'five' and assigns a value of 5 to it
addOne = succ five -- Adds one to the function 'five' --> Returns 6
-- However, if you were to call the 'five' function, it would return 5, and not 6
-- Note: The 'succ' function adds one to any number

list1 = [1,2,3] -- Creates a function called 'list1' and returns [1,2,3]
list2 = [4,5,6] -- Creates a list of Ints
consOperator = 0:list1 -- The Colon/Cons operator takes a SINGLE value and adds it to the beginning
plusOperator = list1 ++ list2 -- The PlusPlus operator adds a list to the END of another list
-- Note: Both operators require the lists to be of the same type

lazyList = [1,2,3, error "LAZY.AF", 4,5,6]
headLazy = head lazyList -- Returns the first item in lazyList
dropLazy = drop 4 lazyList -- Drops the first 4 items and returns the rest of the list
takeLazy = take 5 lazyList -- Takes the first 5 elements, but throws an error at the 4th element
-- Haskell only gives/shows you what is needed and nothing more. This allows us to create...
-- ... ranges and infinite lists because we only evaluate what we need

numberRange = [1..100] -- Creates a list from 1 to 100
charRange = ['a','z'] -- Creates a list from 'a' to 'z'

lazyIntList = take 10 [1..] -- Takes the first 10 items from the Int infinite list
lazyCharList = take 50 ['a'..] -- Takes the first 50 items from the Char infinite list

tupleTest = (24,"John") -- Creates a tuple of type (Int,"String")
firstItem = fst tupleTest -- Returns the first item from tupleTest --> 24
secondItem = snd tupleTest -- Returns the second item from tupleTest --> John
-- Note: Functions applied on lists cannot be used by tuples, and vice versa

tupleList = [(24,"John"),(34,"Bob"),(16,"Jack")] -- Creates a list of tuples [(Int,"String")]
lookUpJohn = lookup 24 tupleList -- Finds 24 in tupleList and returns 'John'
lookUpJack = lookup 44 tupleList -- Tries to find 44 in tupleList and returns Nothing

-- The zip function takes two lists and returns a list of tuples by pairing their corresponding elements
zipLetters = [1..3] `zip` ['a'..'c'] -- Returns [(1,'a'),(2,'b'),(3,'c')]

{-

------------------------------------------------------
EPISODE THREE => Pattern Matching, Recursion, & Guards
------------------------------------------------------

- Pattern Matching allows you to code functions to handle specific cases and all other cases. For example:

pm 1 = "One"
pm 2 = "Two"

- Typing 'pm 1' will return "One", and 'pm 2' will return "Two". If you type anything else...
... like 'pm 3' or 'pm 4' GHCi will throw a Non-exhaustive pattern exception. This means that...
... you did not define the case for 'pm 3' or 'pm 4'. To handle these exceptions, you can use a...
... a wildcard/underscore. For example:

pms 1 = "One"
pms 2 = "Two"
pms _ = "Not 1 or 2"

- And now, passing any number except 1 or 2 in pms will always return "Not 1 or 2". The underscore...
... means that you don't care what number gets passed as an argument to 'pms' - i.e. 100, 20, ...
... 3, 4, 400, etc. - as long as it's not 1 or 2, it will always return "Not 1 or 2". In essence...
... the wildcard tells Haskell that you don't care what the value is, because you're not gonna use it.
... In essence, you're expecting an argument, but you are not going to use that variable.

- Pattern matching can even solve the problem of dealing with multiple value tuples. The following...
... function takes a three-value tuple and returns the final value:

trip (_,_,a) = a

- Note: Two length tuples are different from three length tuples, which are different from...
... four length tuples, and so on and so forth. Tuples of different lengths are of different...
... types. This explains why the Prelude functions 'fst' and 'snd' ONLY work on tuples of 2...
... lengths

- Furthermore, tuples that contain different ordering of types are different. For example:
tuple1 = ('a',1) --> IS NOT THE SAME AS --> tuple11 (1,'a')

- However, these two tuples are of the same type:
tuple2 = (1,2,'a') --> IS THE SAME AS --> tuple22 = (3,4,'z')

- Recursion is when a function uses itself as a return value. It will keep looping until it reaches...
... reaches a certain point and then it'll return the final result. An example of a recursive...
... function is 'dropWhile'. This function takes a boolean argument a list of values, and returns...
... a modified list based on the argument. For instance, dropWhile (==1) [1,2,3] will return...
... [2,3]. In this case, all 1's have been dropped from the list.

- Recursion in functional programming langugages can be thought of as loops in imperative languages

- With recursion, we can define the dropWhile function. For example:

dropWhail _ []         = []
dropWhail f xxs@(x:xs) = if f x then dropWhail f xs else xxs

- The first line says that if an empty list is passed as an argument, then an empty list will be...
... returned. The underscore beside it means that we don't care what the value is, it just has to...
... be a value, and we're not gonna use it

- The second line is where the magic happens. The 'if statement' checks to see if the Boolean...
... argument has been satisfied. If it has, then recursively call the function, and if it has not...
... then return the list

- Pattern matching allows us to spilt up the list by head and tail by using (x:xs). The 'x' is the...
... first item in the list (head), and 'xs' is the rest of the list (tail). You can even do something...
... like (x:y:xs), where 'x' is the first item, 'y' is the second item, and 'xs' is the rest of the...
... list. Notice the colon between the items. The colon indicates that 'y' needs to be prepended to...
... the front of 'xs' and 'x' needs to be prepended to the front of (y:xs). Think about it like this:

x:[2] --> 1:[] --> [1,2
x:y:[3] --> 1:2:[] --> [1,2,3]

- Remember, the second argument of the colon operator must always be a list, and of the same type...
... as the first argument. Thus, you cannot append a char to a list of nums

- With pattern matching, you can name the variables whatever you want, but 'x' and 'xs' are...
... the norm and considered good coding practice. Also, you can use the '@' to make the pattern...
... matching even nicer and cleaner. Doing so tells GHCi that you want 'xxs' to be another way...
... of representing (x:xs). Using this technique is good because it lessens the typing burden

- Recursion and pattern matching can be used to define the map function. The map function takes a...
... function and a list, and applies the function to every element in the list. For instance, calling...
... map (+2) [1,2] will return [3,4]. Here's how to define the map function:

maps _ [] = []
maps f (x:xs) = f x : maps f xs

- The first line is our edge condition. Once the list has been exhausted, Haskell will return an...
... empty list. When using recursion, you need to have a base case OR edge condition. This is because...
... it tells Haskell when to stop. For instance, calling maps (+1) [1,2,3] looks a little something like:

(1 + 1) : maps (+1) [2,3]
(1 + 1) : (2 + 1) : maps (+1) [3]
(1 + 1) : (2 + 1) : (3 + 1) : maps (+1) []
(1 + 1) : (2 + 1) : (3 + 1) : []
2:3:4:[] --> [2,3,4]

- If we didn't have the an edge condition, how will Haskell be able to stop. It won't be able to append...
... anything to the list. Try typing the following lines of code into GHCi:

1:2:3:4:[]
1:2:3:4

- Guards in Haskell are syntactically sugared 'if-else' statements. You can have as many lines as you want...
... and they all check for some form of equality or ordering. Here's the syntax:

functionName arg1 arg2
    | arg1 > arg2 = arg1
    | arg1 < arg2 = arg2
    | otherwise   = error "Same"

- The following function uses pattern matching and guards to return the last 5 items in a list:

last5 [] = []
last5 xxs@(x:xs)
    | length xxs <=5 = xxs
    | otherwise = last5 xs

------------------------------------------------------
EPISODE THREE => Pattern Matching, Recursion, & Guards
------------------------------------------------------

-}

pm 1 = "One"
pm 2 = "Two"
pm 3 = "Three"
pm 4 = "Four"

pms 1 = "Two"
pms 2 = "One"
pms _ = "Not 1 OR 2"

-- A more practical example of pattern matching involves classifying the months of the year. The...
-- ... first month is January, second is February, third is March, and so on and so forth
month 1  = "Jan"
month 2  = "Feb"
month 3  = "March"
month 4  = "April"
month 5  = "May"
month 6  = "June"
month 7  = "July"
month 8  = "Aug"
month 9  = "Sept"
month 10 = "Oct"
month 11 = "Nov"
month 12 = "Dec"

-- The wildcard can be used to handle all cases outside of 1 to 12. With the help of the wildcard...
-- ... it doesn't matter what number you throw at the 'months' function, it will handle it. You...
-- ... will always get "This is not a valid month of the year" when any number not between 1 to 12...
-- ... is passed as an argument. This is what makes the wildcard extremely powerful
months 1  = "Jan"
months 2  = "Feb"
months 3  = "March"
months 4  = "April"
months 5  = "May"
months 6  = "June"
months 7  = "July"
months 8  = "Aug"
months 9  = "Sept"
months 10 = "Oct"
months 11 = "Nov"
months 12 = "Dec"
months _  = "This is not a valid month of the year"

-- With the help of the wildcard, we can define our own functions like 'fst' and 'snd' for three, four, etc. value tuples. For..
-- ... example: This is how you define 'fst' and 'snd' for 3-value tuples
fst3 (a,_,_) = a
mid3 (_,b,_) = b
lst3 (_,_,c) = c

-- And you can do the same for 4-length tuples. For example: 
fst4 (a,_,_,_) = a
midl (_,b,_,_) = b
midr (_,_,c,_) = c
lst4 (_,_,_,d) = d

-- The following function drops all instances of item 'X' from a list of X's, using guarded statements
dropItem _ [] = []
dropItem y (x:xs)
    | y == x = dropItem y xs
    | otherwise = x : dropItem y xs

-- This function is an enhanced version of dropWhile. It drops all numbers that do not satisfy...
-- ... the Boolean argument
dropAll _ []     = []
dropAll f (x:xs) = if f x then dropAll f xs else x : dropAll f xs

-- The following function returns how many times an item occurs in a particular list using an...
-- ... 'if-else' statement
countIF _ []     = 0
countIF y (x:xs) = if y == x then 1 + countIF y xs else countIF y xs

-- This function does the same as the one above, but uses guards instead of 'if-else' statements
countGuard _ [] = 0
countGuard y (x:xs)
    | y == x = 1 + countGuard y xs
    | otherwise = countGuard y xs

-- This function is exactly the same as the one above, but it doesn't use an 'otherwise' statement
countGuardNoOtherWise _ [] = 0
countGuardNoOtherWise y (x:xs)
    | y == x = 1 + countGuardNoOtherWise y xs
    | y /= x = countGuardNoOtherWise y xs

-- Notice how the last three functions have had different edge conditions, than the first...
-- ... two functions. This is because of the return type of the function. The return type of the...
-- ... function needs to be the IDENTITY of the type. For instance, the identity of addition/subtraction...
-- ... is 0 because 'X' plus 0 will always be 'X' && 'X' minus 0 will always be 'X'. The identity of...
-- ... multiplication and division is 1 because 'X' mulitplied OR divided by 1, will always return...
-- ... 'X'. The identity of a list (any list) is the empty list because any list appended to the...
-- ... empty list (or vice versa) will always return the list. Try it out for youself, by typing...
-- ... [1,1] ++ [] in GHCi - it'll return [1,1]. "Anything" plus the empty list is "anything".

emptyMe = [1,1] ++ [] -- Returns [1,1]
emptyList x = x ++ [] -- Returns 'x', where 'x' is whatever you supply as an argument

-- This function is the map function. It takes a function and applies the function to every...
-- ... item in the list
fap _ []     = []
fap f (x:xs) = f x : fap f xs 

-- The following function returns the last 'X' number of items from a list using Guards
takeX _ [] = []
takeX y xxs@(x:xs)
    | y >= length xxs = xxs
    | otherwise       = takeX y xs 

-- This function is identical to 'takeX', but instead of Guards, it uses an 'if' statement
takeIF _ []         = []
takeIF y xxs@(x:xs) = if y >= length xxs then xxs else takeX y xs 

{-

---------------------------------------
EPISODE FOUR => Types & Type Signatures
---------------------------------------

- A few basic types in Haskell are Char, Bool, Int, Integer, Float, Double, Tuples, and...
... String, which is just a list of Char. For example:

Char    -->  'a' |  'b'  | 'c'
Bool    --> True | False |
Int     -->   1  |   2   |  3
Float   -->  1.0 |  2.2  | 3.33
String  --> "Hi" | "LOL" | "GAY"
Tuples  --> ('a',1,'b',2,'c',3)

- Note: Integers are identical to Ints, but they can contain more numbers/place-values. Floats are...
... similar to Doubles, but Doubles carry more decimal places, and are more precise

- You can find the type of the variable or function by typing in ':t' followed by the name of the...
... variable/function. For example:

Prelude> :t 'a'
'a' :: Char

Prelude :t True
True :: Bool

Prelude> :t head
head :: [a] -> a

- The 'head' function has two items in its type definition, [a] and a, a list of 'a' and 'a'. This...
... makes sense because the head function takes a list and returns an element from the list. For example:

head [1,2,3] == 1
head ['a','b'] == 'a'

- You can define your own head function like this:

headr :: [a] -> a
headr []    = error "Empty"
headr (x:_) = x

- In the example above, the first type represents the argument of the function, a list of...
... type 'a', and the second argument represents the return type, 'a'. It's type is the same as the...
... list of 'a', but it's not wrapped in a list. Since 'a' is polymorphic, it can be of any...
... type; Ints, Chars, etc., and even other lists. Since 'a' is abstract, the head function can...
... also be defined like this:

heads :: [abc] -> abc
heads []    = error "Empty List"
heads (x:_) = x

- You can also create a head function that will only take a list of Ints, where passing a list of...
... Chars will yield an error, because the types do not match up. For example:

heade :: [Int] -> Int
heade []    = error "Empty"
heade (x:_) = x

- And calling heade "test" will yield a 'Couldn't match type' error
 
- Writing the type signature to your function(s) is very important because it tells you, the compiler, and...
... other people what type(s) of arguments the function takes, and what type(s) of argument it...
... returns. This allows everyone to reason about the functionality of the function, and avoids...
... type check errors at compile time

- Pro Tip: If you don't know the type of your function, type :t nameOfFunction in GHCi and Haskell...
... will tell you the type of the function

- In Haskell, everything has a type. Variables, functions, and even operators such as...
... +, *, <, ==, etc. And when you use these operators, you must tell Haskell in the type...
... signature. For example, let's take a look at the 'max' function, which takes two variables, and...
... returns the larger variable:

Prelude> max 4 5
5

Prelude> max 'a' 'z'
'z'

Prelude> max True False
True

- Defining the max variable looks like this:

maxi a b = if a > b then a else b

- And the type signature is supposed to be:

maxi :: a -> a -> a

- However, this will yield an error at compile time, because the function is using '>' which has its...
... own type. If you type :t (>) in GHCi, you get:

(>) :: Ord a => a -> a -> Bool

- The key thing here is 'Ord'. The greater than operator is an instance of the Ord class, and any...
... function that makes use of (>) or (<) is also an instance of the Ord class. Thus, we can...
... redefine the max function like so:

maxi :: (Ord a) => a -> a-> a
maxi a b = if a > b then a else b

- This means that 'maxi' takes an 'a' and another 'a' and returns 'a', where 'a' is an instance of...
... the 'Ord' class. Furthermore, if you use other operators like +, *, ^, ==, etc. then you need to...
... specify it in the type signature of the function. Here's another example:

sameNumber :: (Eq a) => a -> a-> Bool
sameNumber a b = if a == b then True else False

- The 'sameNumber' function compares two numbers and if they are the same, it returns True, otherwise...
... False. In order to compares two numbers, 'sameNumber' makes use of the equality operator (==). Thus,...
... we need to specify this in the type signature of 'sameNumber'. This is where the (Eq a) comes in. It...
... tells Haskell that 'sameNumber' is going to use the equality operator to do something

---------------------------------------
EPISODE FOUR => Types & Type Signatures
---------------------------------------

-}

-- This is a Char
char :: Char
char = 'a' 

-- This is a Bool
bool :: Bool
bool = True

-- This is a list of Char, or String
listOfChar :: [Char]
listOfChar = "Hello"

-- When defining the type signature of a tuple, all values must be defined
someTuple :: (Char, Int, Char, Int, Char, Int)
someTuple = ('a',1,'b',2,'c',3)

-- This is the 'tail' function. It takes a list, drops the first element, and returns the rest of the list
tails :: [a] -> [a] -- Type: Takes a list of 'a', and returns a list of 'a'
tails []     = [] -- This is the base case
tails (x:xs) = xs -- Drops the first element in a list and returns the remaining list

-- This is the 'min' function. It two takes two values and returns the smaller one
mins :: (Ord a) => a -> a -> a -- Type: Takes an 'a', another 'a', and returns an 'a', where 'a' is an instance of Ord
mins a b = if a > b then b else a -- Returns the smaller value

-- This is the 'max' function but it accounts for identical arguments by throwing an error
-- Type: Takes an 'a', another 'a', and returns an 'a', where 'a' is an instance of Eq, and Ord
safeMax :: (Eq a, Ord a) => a -> a -> a
safeMax a b
    | a > b     = a
    | b > a     = b
    | a == b    = error "Same Value"
    | otherwise = error "Not Valid"

-- This is the 'min' function but it accounts for identical arguments by throwing an error
-- Type: Takes an 'a', another 'a', and returns an 'a', where 'a' is an instance of Eq, and Ord
safeMin :: (Eq a, Ord a) => a -> a -> a
safeMin a b
    | a > b     = b
    | b > a     = a
    | a == b    = error "Same Value" 
    | otherwise = error "Not Valid"

{-

-------------------------------------
EPISODE FIVE => Type, Newtype, & Data
-------------------------------------

- String and [Char] are considered to be the same type. This is because Haskell defines it like this:

type String = [Char]

- The type statement is used to make String represent a list of Chars. Even though they are the exact...
... same thing, understanding String is much easier than [Char] when reading and writing code. You can...
... find the real type of String by typing :i String in GHCi, and it will return:

type String = [Char] 	-- Defined in ‘GHC.Base’

- Obviously, this means that Haskell has already defined String to be of type [Char] in its code

- Just like String, you can create your own types. The next example creates a tuple of...
... Username & ID, instead of using String and Int

type Username = [Char]
type Id = Int

user :: Username -> Id -> (Username, Id)
user u i = (u,i)

- You can also simplify the above code to this:

type Username = [Char]
type Id = Int
type User = (Username, Id)

user :: Username -> Id -> User
user u i = (u,i)

- The type statements help simplify a lot of things. It makes the code more easy to read. The above...
... code is easy to understand. The function 'user' creates User when supplied with a 'Username', and...
... 'Id'. You can even create shortened type signatures. For example:

type Head a = [a] -> a

head' :: Head a
head' (x:_) = x

headInt :: Head Int
headInt (x:_) = x

- Types make code easier to read and it help simplify long types. In the example above, the Head function...
... was shortened to one word and a letter. Also, when using types, you are not making any original...
... types. You are utilizing the basic types in Haskell to define your own types

- The newtype statement is a lot like types, but with some differences. When you create a...
... newtype, Haskell will see it as a separate entity. The following example creates a custom...
... version of Int and wraps it up in an Id newtype. For example:

newtype MyId = Id { getId :: Int } deriving (Show)

- The syntax for this is quite different. 'Id' is a constructor and wraps an Int into the...
... 'MyId' type. And if you want to extract the Int, you can use the getId function defined inside...
... of the newtype. Also, in order to print values of created types, they must derive from the...
... Show class, hence the 'deriving (Show)' at the end of the newtype line. This means that 'MyId' is...
... an instance of the Show class, which will be explained later. But just know that you need to...
... always derive your newtypes from Show if you intend to print them on the screen/console

- Putting all of the code together looks like this:

type Username = [Char]
type Id = Int
type User = (Username, MyId)

newtype MyId = Id { getId :: Int } deriving (Show)

user :: Username -> MyId -> User
user u i = (u,i)

- In order to create a user, we can no longer pass an Int as the second argument. We need to pass...
... an Int of the MyId type. So, instead of:

user "Joe" 23

- We need to type:

user "Joe" (Id 23)

- You can use a let statement to define Id 23 and then pass that as an argument. For instance:

let nums = Id 23

- And then you can create a user using 'the'

user "Joe" nums

- This helps with finding type errors at compile time. If you supply an Int, instead of an Id, the...
... program won't even compile, until you fix it. This greatly reduces runtime errors.

- The newtype can also be defined like this:

newtype MyEd = Id Int deriving (Show)

- But with this way, you need to create a pattern matching function it. For example:

getId (Id a) = a

- Since newtype can only construct a single type, you can use Data to hold multiple values. The following...
... example creates a User type that holds multiple related attributes. For example:

data User = User { userId :: Int 
                 , userName :: String
                 , userPassword :: String
                 } deriving (Show) 

- This works exactly the same as newtype, except that there is more than one type inside of a...
... constructor. You can also create a Data constructor like this:

data User = User Int String String

- However, with this way, you need to pattern match every single type in order to access them

- Furthermore, data can also hold multiple constructors. For example:

data User = Users
    | User { userId :: Int 
            , userName :: String
            , userPassword :: String
            } deriving (Show) 

- With this, you can either use the empty Users constructor or create a User with attributes using...
... the User constructor. For example

Users -- This is an empty user
User 1 "Joe" "Password" -- This is a user with attributes

- When constructing the data type, you must always supply the right amount of arguments, or else...
... Haskell will throw a "No instance for" error

- Data and newtype look similar, but are different at their core. Data offers more types and empty...
... constructors. Even though Data offers more types, newtypes has better performance. If you are...
... creating a type with only one field, newtype is a better option than Data. 

-------------------------------------
EPISODE FIVE => Type, Newtype, & Data
-------------------------------------

-}

type Numbers = [Int] -- This is a custom type, much like String. This defines a list of Ints to be...
-- ... 'Numbers'. The point of defining [Int] as 'Numbers' allows other people to easily read our...
-- ... code, and enables faster typing. So instead of writing [Int] in the type signature, when...
-- ... we want to represent a list of numbers, we can just write Numbers. For example:

numFun :: Numbers -> Numbers -- Type: Accepts a 'Numbers' and returns a 'Numbers'
numFun x = x
-- Upon reading the type signature for 'numFun', we immediately know that it accepts a bunch of numbers, and...
-- ... returns a bunch of numbers

-- This function is identical to the function above; both take a list of Ints as arguments and return a list...
-- ... of Ints. However, the type signature is slightly different, but still similar:
numFun' :: [Int] -> [Int]
numFun' x = x

type Name = String -- Creates a new type called 'Name' that holds a String
type Age = Int -- Creates a new type called 'Age' that holds an Int
type Person = (Name,Age) -- Creates a type called 'Person' that stores 'Name' and 'Age' in a tuple

-- This function creates a newPerson using the types Name, Age, and Person
newPerson :: Name -> Age -> Person -- Accepts a Name, Age, and returns a Person
newPerson n a = (n,a)

-- We can even use types to simplify other type signatures. The type 'Tail' takes a list of 'a' and returns
-- ... a list of 'a', and 'a' is abstract and can be defined to be anything (i.e. Int, Char, Etc.)
type Tail a = [a] -> [a]

-- This is the tail function from Prelude
tails' :: Tail a -- Type: Accepts a Tail
tails' (_:xs) = xs -- Drops the first element in a list and returns the rest of the list

-- This tail function is similar to above but has been modified to only accept Ints
tailNumber :: Tail Int -- Type: Accepts a Tail, but the arguments can only be Ints
tailNumber (_:xs) = xs -- Drops the first Int in a list of Ints and returns the rest of the list

type Take a = Int -> [a] -> [a] -- Defines the type 'Take'

takeItems :: Take a -- Type is Take, where 'a' can be of any type
--takeItems :: Take Int -- This is how you would limit the arguments of this function to be Int only
--takeItems :: Take Char -- And this limits the arguments to be Char only
takeItems _ [] = [] -- Returns the empty list if the empty list is an argument
takeItems 0 _  = [] -- Returns the empty list when 'n' equals 0
takeItems n xxs@(x:xs) = x : takeItems (n-1) xs -- Recursively calls 'takeItems' until 'n' equals 0

-- This function is identical to the one above but it uses guards to sanitize the input 'n'. If 'n' is a...
-- ... very large number, then the entire list is returned, and if it is negative, the list is returned as is
takeGuard :: Take a
takeGuard _ [] = []
takeGuard 0 xs  = xs
takeGuard n xxs@(x:xs) 
    | n <= 0    = xxs
    | otherwise = takeMeAway n xxs
    where takeMeAway n xxs@(x:xs)
            | n == 0         = []
            | n > length xxs = xxs
            | otherwise      = x : takeMeAway (n-1) xs

type Drop a = Int -> [a] -> [a] -- Defines the type 'Drop'

dropItems :: Drop a -- Type is Drop, where 'a' can be of any type
--dropItems :: Drop Int -- This limits the arguments to be Int only
--dropItems :: Drop Char -- And this limits the arguments to Char
dropItems _ [] = [] -- Returns [] when [] is an argument
dropItems 0 xs = xs -- Returns the list when 'n' equals 0
dropItems n xxs@(x:xs) = drop (n-1) xs -- Recursively calls 'dropItems' until 'n' equals 0

-- This function is identical to the one above but it uses guards to sanitize the input 'n'. If 'n' is a...
-- ... negative then it will return the list as is
dropGuard :: Drop a
dropGuard _ [] = []
dropGuard n xxs@(x:xs)
    | n <= 0    = xxs
    | n /= 0    = dropGuard (n-1) xs
    | otherwise = xxs

-- Using Types helps simplify type signatures. We can define them once and use them everywhere, and then...
-- ... limit them to only accept a basic type (i.e. Int, Char, Etc.) very quickly. When you use Types...
-- ... you are utilizing Haskell's basic types, not creating your own

type Id = Int
type User = (Name, MyId)

-- This is how you create a newtype. 'Id' is a constructor and wraps an Int into 'MyId'
newtype MyId = Id {getId :: Int} deriving (Show) -- The 'getId' function is used to extract the Int
-- Always make your types an instance of Show if you intend on printing them

employee :: Name -> MyId -> User -- Type: Takes a 'Name' and 'MyId' and returns a 'User'
employee u i = (u,i)
-- To create an employee you need to wrap 'i'. For instance: "Joe" (Id 23) is how you'd create an employee

-- The Data type can be used to hold multiple values. It works similar to newtype, except that there is...
-- more than one type inside of a constructor. For example:

data Player = Player
    | Players { playerID   :: Int 
              , playerName :: String
              , playerRank :: Int
              } deriving (Show)

-- With this, you can use either an empty Player Constructor or an attribute Player Constructor. For example:
-- Player --> This is an empty Player
-- Players 1 "xXxPredatorxXx" 55 -- This is a Player with attributes
-- Always supply the right number of arguments or else your program won't compile

data Student = Student
    | Students { studentNumber  :: Int
               , studentAverage :: Double
               , studentName    :: String
               , studentProgram :: String
               , studentIsMale  :: Bool
               , studentHeight  :: Double
               , studentWeight  :: Double
               , studentsAge    :: Int
               } deriving (Show)

-- Typing something like Students 1 3.6 "John" "Life Sci" True 72 134 22, will return:
{-
Students {studentNumber = 1, studentAverage = 3.6, studentName = "John", studentProgram = "Life Sci", 
studentIsMale = True, studentHeight = 72.0, studentWeight = 134.0, studentsAge = 22}
-}

-- Final Note: When dealing with one constructor, use newtype rather than Data, because newtype is faster

{-

---------------------------------
EPISODE SIX => Basic Type Classes
---------------------------------

- Type classes in Haskell and classes in Imperative languages are not the same, but they do share some similar...
... features. Haskell doesn't focus on objects, it focuses on types, which is exactly what type classes do. They...
... hold special functions which only instances of that class can access, and they can also group typess together.

- When a type derives from a class, it also becomes an instance of that class, allowing us to access the...
... class' functions. For instance, making 'data Student' derive from Show allows us to print it to the screen.

- Here are a few type classes:

- Show: Enables printing of type classes to the screen/console by converting them to Strings
i.e. show 1 -> "1", where the type of 'show 1' is a String --> show 1 :: String

- Read: Transforms a string into a different type
i.e. read "1" :: Int --> 1 

- Eq: Allows comparing of types to check equality (==) and inequality (/=)
i.e. 1 == 2 --> False

- Ord: Checks the ordering of types to see which one is greater than (> OR >=) or less than (< OR <=)
i.e. 2 > 1 --> True

- Enum: Gives an index of the type (succ OR pred)
i.e. succ 1 --> 2

- Bounded: Shows the lowest (minBound) and highest (maxBound) value of the type
i.e. maxBound :: Int --> 9223372036854775807

- Inside of GHCi, type classes can be examined to see what functions they contain, and all the types that are an...
... instance of this class. For example:
:i Show 
:i Read 
:i Eq
:i Ord
:i Enum

- Calling ':i Show' tells us that Float and Double are an instance of Show
- Calling ':i Enum' tells us that it contains a function called enumFromThenTo

- Consider the following data structure:

data MyData = FirstData
            | SecondData
            | LastData
              deriving (Show, Eq, Bounded, Ord, Read, Enum)

- Calling the show on one of the constructors will turn it into a String. For example:

*Main> show FirstData
"FirstData"

- Because 'MyData' derivces from the 'Eq' class, we can compare constructors like so:

*Main> FirstData == LastData 
False

*Main> FirstData == FirstData
True

- Bounded shows the smallest and largest value, where the first constructor is the smallest value, and the...
... last constructor is the largest value

*Main> minBound :: MyData
FirstData

*Main> maxBound :: MyData
LastData

- Ord allows comparing types to see which one is greater or lesser. Ord contains six functions, and they are... 
... compare, less than (<), greater than (>), less than or equal to (<=), greater than or equal to (>=), and...
... min/max. Min and max take two values, and return the minimum or maximum, respectively. Compare takes two...
... values and determines the relation between the first value and second value.

*Main> FirstData `compare` LastData
LT
(LT = Less Than)

*Main> LastData `compare` FirstData
GT
(GT = Greater Than)

*Main> FirstData `compare` FirstData
EQ
(EQ = Equals)
 
- Read is like the opposite of show. It takes a String and converts it to the specified type. This is useful...
... when you read a plain text file and want to convert the contents to an actual type. For example:

*Main> read "FirstData" :: MyData
FirstData

*Main> read "LastData" :: MyData
LastData

- Enum allows us to move through our constructors in order. Enum has 8 functions inside it. They are:

1) succ: Returns the next constructor

*Main> succ FirstData
SecondData

2) pred: Returns the previous constructor

*Main> pred secondData
FirstData

3) toEnum: Supply a number and get the constructor by index

*Main> toEnum 1 :: MyData
SecondData

4) fromEnum: Supply a constructor and it will return its index

*Main> fromEnum LastData
2

5) enumFrom: Create a list from the selected constructor to the end

*Main> enumFrom SecondData
[SecondData,LastData]

6) enumFromThen: Same as 'enumFrom' but you can supply a step

*Main> enumFromThen FirstData LastData
[FirstData,LastData]

7) enumFromTo: Create a list from the first argument to the second argument

*Main> enumFromTo 1 10
[1,2,3,4,5,6,7,8,9,10]

8) enumFromThenTo: Same as 'enumFromTo' but you can supply a step

*Main> enumFromThenTo 0 10 100
[0,10,20,30,40,50,60,70,80,90,100]

- You can even write your own implementation of show for your data types. For instance, newtype returns...
... the entire constructor when asked to print to screen. This isn't appealing or intuitive. We can modify...
... the Show implementation for it. For example

newtype MyId = Id {getId :: Int} -- Remove deriving (Show)

instance Show MyId where
    show a = show (getId a)

- Doing so will result in: 

*Main> Idd 23
23

*Main> Idd 5
5

- Furthermore, let's assume you want FirstData && SecondData to be equal. You would do:

instance Eq MyData where
    FirstData  == FirstData  = True
    FirstData  == SecondData = True
    SecondData == SecondData = True
    LastData   == LastData   = True
             _ == _          = False

- This shows that FirstData and SecondData are equal to each other, each constructor is equal to itself, and...
... anything else is False. For example:

*Main> FirstData == FirstData
True

*Main> FirstData == SecondData
True

*Main> FirstData == LastData
False

*Main> SecondData == LastData
False

---------------------------------
EPISODE SIX => Basic Type Classes
---------------------------------

-}

-- A perfect example of 'data' is to map the items in OSRS. For example:

data Range = Leather 
           | Hardleather
           | Studded_leather
           | Frog_leather
           | Snakeskin
           | Green_Dragonhide 
           | Green_Dragonhide_Trimmed 
           | Green_Dragonhide_Gold_Trimmed
           | Blue_Dragonhide  
           | Blue_Dragonhide_Trimmed  
           | Blue_Dragonhide_Gold_Trimmed
           | Red_Dragonhide   
           | Red_Dragonhide_Trimmed   
           | Red_Dragonhide_Gold_Trimmed
           | Black_Dragonhide 
           | Black_Dragonhide_Trimmed 
           | Black_Dragonhide_Gold_Trimmed
             deriving (Show, Ord, Bounded, Read, Enum)

-- And because regular dragonhide is the same as trimmed and gold, in terms of stats, they are equal to...
-- ... to each other. Hence, we can define our own instance of 'Eq' to represent this. For example:

instance Eq Range where
    Leather                       == Leather                       = True
    Hardleather                   == Hardleather                   = True
    Studded_leather               == Studded_leather               = True
    Frog_leather                  == Frog_leather                  = True
    Snakeskin                     == Snakeskin                     = True
    Green_Dragonhide              == Green_Dragonhide              = True
    Green_Dragonhide_Trimmed      == Green_Dragonhide_Trimmed      = True
    Green_Dragonhide_Gold_Trimmed == Green_Dragonhide_Gold_Trimmed = True
    Blue_Dragonhide               == Blue_Dragonhide               = True
    Blue_Dragonhide_Trimmed       == Blue_Dragonhide_Trimmed       = True
    Blue_Dragonhide_Gold_Trimmed  == Blue_Dragonhide_Gold_Trimmed  = True
    Red_Dragonhide                == Red_Dragonhide                = True
    Red_Dragonhide_Trimmed        == Red_Dragonhide_Trimmed        = True
    Red_Dragonhide_Gold_Trimmed   == Red_Dragonhide_Gold_Trimmed   = True
    Black_Dragonhide              == Black_Dragonhide              = True
    Black_Dragonhide_Trimmed      == Black_Dragonhide_Trimmed      = True 
    Black_Dragonhide_Gold_Trimmed == Black_Dragonhide_Gold_Trimmed = True

    Green_Dragonhide              == Green_Dragonhide_Trimmed      = True
    Green_Dragonhide              == Green_Dragonhide_Gold_Trimmed = True
    Green_Dragonhide_Trimmed      == Green_Dragonhide              = True
    Green_Dragonhide_Trimmed      == Green_Dragonhide_Gold_Trimmed = True
    Green_Dragonhide_Gold_Trimmed == Green_Dragonhide              = True
    Green_Dragonhide_Gold_Trimmed == Green_Dragonhide_Trimmed      = True

    Blue_Dragonhide               == Blue_Dragonhide_Trimmed       = True
    Blue_Dragonhide               == Blue_Dragonhide_Gold_Trimmed  = True
    Blue_Dragonhide_Trimmed       == Blue_Dragonhide               = True
    Blue_Dragonhide_Trimmed       == Blue_Dragonhide_Gold_Trimmed  = True
    Blue_Dragonhide_Gold_Trimmed  == Blue_Dragonhide               = True
    Blue_Dragonhide_Gold_Trimmed  == Blue_Dragonhide_Trimmed       = True

    Red_Dragonhide                == Red_Dragonhide_Trimmed        = True
    Red_Dragonhide                == Red_Dragonhide_Gold_Trimmed   = True
    Red_Dragonhide_Trimmed        == Red_Dragonhide                = True
    Red_Dragonhide_Trimmed        == Red_Dragonhide_Gold_Trimmed   = True
    Red_Dragonhide_Gold_Trimmed   == Red_Dragonhide                = True
    Red_Dragonhide_Gold_Trimmed   == Red_Dragonhide_Trimmed        = True

    Black_Dragonhide              == Black_Dragonhide_Trimmed      = True
    Black_Dragonhide              == Black_Dragonhide_Gold_Trimmed = True
    Black_Dragonhide_Trimmed      == Black_Dragonhide              = True
    Black_Dragonhide_Trimmed      == Black_Dragonhide_Gold_Trimmed = True
    Black_Dragonhide_Gold_Trimmed == Black_Dragonhide              = True
    Black_Dragonhide_Gold_Trimmed == Black_Dragonhide_Trimmed      = True
    _ == _                                                         = False

-- We can also create functions to see what's the next best armor, and stuff like that. For example

betterThanLeather :: Range
betterThanLeather = succ Leather

worseThanGreenHide :: Range
worseThanGreenHide = pred Green_Dragonhide

bestRangeArmor :: Range
bestRangeArmor = maxBound :: Range

worstRangeArmor :: Range
worstRangeArmor = minBound :: Range

allGreenHideArmor :: [Range]
allGreenHideArmor = enumFromTo Green_Dragonhide Green_Dragonhide_Gold_Trimmed

allBlueHideArmor :: [Range]
allBlueHideArmor = enumFromTo Blue_Dragonhide Blue_Dragonhide_Gold_Trimmed

allRedHideArmor :: [Range]
allRedHideArmor = enumFromTo Red_Dragonhide Red_Dragonhide_Gold_Trimmed

allBlackHideArmor :: [Range]
allBlackHideArmor = enumFromTo Black_Dragonhide Black_Dragonhide_Gold_Trimmed

listAllRangeArmor :: [Range]
listAllRangeArmor = enumFrom (minBound :: Range)

-- We can also compare range armor to see which one is better, worse, or the same. For example:

{-
Leather > Snakeskin --> False
Studded_leather > Leather --> True
Black_Dragonhide > Green_Dragonhide --> True
Green_Dragonhide == Green_Dragonhide_Trimmed --> True
Green_Dragonhide == Green_Dragonhide_Gold_Trimmed --> True
Red_Dragonhide > Blue_Dragonhide --> True
Blue_Dragonhide > Black_Dragonhide --> False

					OR

min Leather Studded_leather --> Leather
max Black_Dragonhide Green_Dragonhide  --> Black_Dragonhide
min Snakeskin Hardleather --> Hardleather
max Blue_Dragonhide Red_Dragonhide --> Red_Dragonhide
-}

-- The same can be said for free-to-play armor and weapons. Bronze is the worst, and Rune is the best. Thus, we...
-- ... can make our own data type to classify this. For example:

data Armor = Bronze
           | Iron
           | Steel
           | Black
           | Mithril
           | Adamant
           | Rune
             deriving (Show, Eq, Bounded, Ord, Read, Enum)

-- We can create functions to see what's the next best armor, and stuff like that. For example

betterThanBronze :: Armor
betterThanBronze = succ Bronze

betterThanMithril :: Armor
betterThanMithril = succ Mithril

worseThanBlack :: Armor
worseThanBlack = pred Black

worseThanRune :: Armor
worseThanRune = succ Rune

bestF2PArmor :: Armor
bestF2PArmor = maxBound :: Armor

worstF2PArmor :: Armor
worstF2PArmor = minBound :: Armor

allF2PArmor :: [Armor]
allF2PArmor = enumFrom (minBound :: Armor)

-- We can compare different armor types to see which one is better, or worse. For example:

{-
Bronze > Iron --> False
Rune > Adamant --> True
Mithril > Black --> True
Black > Adamant --> False

          OR

min Bronze Steel --> Bronze
max Adamant Rune --> Rune
min Mithril Iron --> Iron
max Bronze Black --> Black
-}

-- Using data types are really powerful. If Jagex were to release a new type of armor, we can effortlessly modify...
-- ... the data constructors and everything will work like magic. Plus, we can create our own instances of classes...
-- ... and have our custom data types derive them for even more functionality; we aren't limited to Prelude functions/classes

-- The newtype can be used for skills. For example, Strength and Attack: 

newtype Strength_Lvl = StrengthLevel {getStrengthLevel :: Int}
instance Show Strength_Lvl where
    show a = show (getStrengthLevel a)

newtype Attack_Lvl = AttackLevel {getAttackLevel :: Int} 
instance Show Attack_Lvl where
    show a = show (getAttackLevel a)

{-

-------------------------------
EPISODE SEVEN => The Maybe Type
-------------------------------

- Almost every language has a null value when you want to return nothing. For instance, let's assume that you...
... want to read a file and return its context as plain text, you'll want to return null if the file doesn't exist.

- In Haskell, everything has a type. Since everything in Haskell is typed checked, a function cannot return...
... different types, hence we cannot return Null or anything else. For example, this is wrong:

divide :: (Fractional a, Eq a) => a -> a -> a
divide _ 0 = "Cannot Divide By Zero" <-------- This is the problematic line
divide 0 _ = 0.0
divide a b = a / b

-  The 'Maybe' type is used to combat this. It has two constructors, "Nothing" and "Just a", where 'a' can be...
... any type. For instance:

data Maybe a = Nothing | Just a

- Note: You don't need to write this in your code because GHC already has it in its "base code". This is...
... similar to how you don't need to write { type String = [Char] } because it's already defined in Prelude

- The following function takes a number, and if it's less than 10 and greater than or equal to 0, then it will...
... wrap it in the "Just" constructor and return it. Otherwise, it'll return "Nothing". For example:

underTen :: (Num a, Ord a) => a -> Maybe a
underTen a
    | a < 10 && a >= 0 = Just a
    | otherwise        = Nothing

- We need to wrap up our types to be type safe. This makes our code more readable, understandable, and greatly...
... reduces errors. In Imperative languages, methods/functions will return Null, without any clue or indication...
... on what went wrong. On the other hand, if a type is checked through the Maybe type, you'll know exactly where...
... things went wrong. Also, 'Maybe' is a functor and a Monad, which will be explained later. 

- The first way to take a value out of a 'Just' constructor is through pattern matching. For example

fromJust :: Maybe a -> a
fromJust Nothing  = error "Nothing Returned"
fromJust (Just a) = a

- However, this function is not reliable because it will throw a runtime error at the 'Nothing' constructor. It...
... only works when the type is wrapped in the 'Just' constructor. For example:

fromJust (Just 69) --> 69
fromJust (Just "Hi") --> Hi
fromJust Nothing --> ERROR 

- A better approach to extracting the value from the 'Just' constructor looks like:

fromMaybe :: Maybe a -> a -> a
fromMaybe Nothing a  = a
fromMaybe (Just a) _ = a

- 'fromMaybe' works the same way as 'fromJust' with one exception. It takes TWO arguments instead of ONE. The...
... first argument is either Nothing or Just a, and the second argument is an arbitrary number. If 'Nothing'...
... is being pattern matched, then the arbitrary number will be returned, otherwise, 'a' will be returned. For example:

fromMaybe 0 Nothing --> 0
fromMaybe 0 (Just 69) --> 69

fromMaybe 1 Nothing --> 1
fromMaybe 1 (Just 420) --> 420

- These are a simple way of extracting value(s) from the 'Just' constructor. Better methods exist with...
... functors and monads

-------------------------------
EPISODE SEVEN => The Maybe Type
-------------------------------

-}

-- We can construct our own Maybe type. The following example is called the 'Prolly' type. It has two...
-- ... constructors, 'Null' and 'Only a'. These are akin to Nothing and Just a, respectively. Also, another...
-- ... important thing to remember is that if you want to print your data type to the screen, it must...
-- ... derive the Show class. In fact, everything that gets printed to the screen is an instance of Show.

data Prolly a = Null | Only a 
                deriving (Show)

-- This function takes a number and returns 'Only a' if the number is less than or equal to 100, and...
-- ... 'Null' if the number does not fall inside the specified range
underHunnit :: (Num a, Ord a) => a -> Prolly a -- Type: Takes an 'a' and returns a 'Only a' where 'a' is an instance of Ord & Eq
underHunnit a
    | a <= 100  = Only a -- If 'a' is less than or equal to 100, then return 'Only a'
    | otherwise = Null -- Otherwise, return the 'Null' constructor

-- We can even use the Maybe OR Prolly type to safely define functions from Prelude. For example (head and tail): 

-- This function is a safe way of doing the head function from Prelude
safeHead :: [a] -> Prolly a -- Type: Takes a list of 'a' and returns 'a' wrapped in the Polly data type
safeHead []     = Null -- Returns 'Null' if an empty list is supplied
safeHead (x:xs) = Only x -- Returns the first element in the list and wraps it in the 'Only' constructor

-- Testing this out will yield:
-- safeHead [] --> Null
-- safeHead [1,2,3] --> Only 1

-- This function is a safe way of implementing the tail function from Prelude
safeTail :: [a] -> Prolly [a] -- Takes a list of 'a' and returns a list of 'a' wrapped in the 'Prolly' data type
safeTail []     = Null -- Returns the 'Null' constructor from 'Prolly' if the empty list is supplied
safeTail (x:xs) = Only xs -- Returns the tail of a list and wraps it in the 'Only' constructor

-- And now, we can implement our own functions to extract the 'a' from 'Only a' 

-- This function takes 'Prolly a' and returns 'a'. This is done through pattern matching
fromOnly :: Prolly a -> a
fromOnly Null     = error "NULL" -- Returns an error if the 'Null' constructor is passed
fromOnly (Only a) = a -- Returns the 'a' in 'Only a' 

-- This function is similar to 'fromOnly' but it takes two arguments, 'Prolly a' and 'a' and returns 'a'. This...
-- ... is done to safeguard against the 'Null' constructor. Instead of returning an error, it'll return 'b'
fromProlly :: Prolly a -> a -> a -- Type: Takes 'Prolly a', 'a' and returns 'a'
fromProlly Null b     = b -- Returns the second argument 'b' if 'Null' is the first argument
fromProlly (Only a) _ = a  -- Returns 'a' from 'Only a' 

{-

---------------------------
EPISODE EIGHT => Haskell IO
---------------------------

- Haskell is a purely functional programming language, where pure functions have no IO. However, a function...
... without IO is quite useless. Hence, Haskell tries to separate pure functions from impure functions. Impure...
... functions are also known as IO functions. Any function that interacts with IO, has a result type of...
... IO a, where 'a' is of any type. For example:

hello :: String -> IO ()
hello str = putStrLn ("Hello" ++ str)

- In the example above, we have a function that takes a String and returns an IO unit. Basically, the unit means...
... nothing, so we're not expecting a value to return from this function. Since the result type is IO, it is...
... impure; this is how to recognize impure functions. Also, whenever a function in Haskell interacts with...
... IO, it must return an IO value. Using the 'do' syntax, we can write multiple lines of code. For example:

nextNum :: Int -> IO Int
nextNum i = do
    putStrLn ("Successor of " ++ (show i))
    return (succ i)

- The return type of this function is IO Int because we are printing something on the screen and performing...
... an IO function. We also need to apply the return function to our result in order to wrap it in IO

- Return in Haskell is not the same as 'return' in other languages such as Java. In Haskell, Return wraps...
... a value in a Monad; and in our case, the IO Monad. 

- In Haskell, you can interact with user inputs by removing the user input from the Monad, manipulating...
... it, wrapping it back up in a Monad, and returning the modified Monad. For example: 

encrypt :: String -> String
encrypt a = map succ a

main = do
    input <- getLine;
    putStrLn (encrypt input);

- The function 'encrypt' maps the successor function on argument 'a', where 'a' is of type String. The second...
... function takes an argument from a user and prints the encrypted result. Since 'getLine' takes user input, its...
... result value is IO. However, since the function 'encrypt' does not work with IO, we need to extract the...
... value from getLine and put it in a String. This is what the arrow pointing to 'input' does. It says that...
... 'input' is a pure String that is extracted from the IO String, which is provided by getLine. Then, the...
... 'encrypt' function is applied to 'input' and the encrypted result is converted to String IO and printed...
... to the screen. Since 'putStrLn' is an IO function, we've satisfied all the laws of impure functions...
... where we begin with an IO type and end with an IO type. Furthermore, we have a clear distinction...
... between pure (encrypt) and impure (main) function. And finally, you don't need to put a semicolon after...
... every single line; it is optional and completely up to you.

- Now let's talk about the differences between:

1) putStr
putStr :: String -> IO ()
putStr ("Hello") --> "Hello World"

2) putStrLn 
putStr :: String -> IO ()
putStrLn ("Hello") --> "Hello World\n"


3) print 
print :: (Show a) => a -> IO ()
print 1 --> "1\n"
print (Just a) --> "Just a\n"

- The first two (putStr & putStrLn) are simple; they take a string and print it on the screen. However,...
... 'putStrLn' absorbs the newLine character (\n), and appends a newLine at the end of the String.

- The 'print' function is used to print other types on the screen, and it automatically appends the...
... newLine character to them. Also, the type being printed on the screen must be an instance of the...
... show class. Using 'print' is equivalent to 'putStrLn (Show a)'

- If you wanted to perform an IO action to a list of values, you would used 'mapM', and not 'map' because...
... 'map' does not work for IO functions. For example:

Prelude> map print ["Hello","World"]
ERROR: No instance for (Show IO)

Prelude> mapM print ["Hello","World"]
"Hello"
"World"
[(),()]

Prelude> mapM_ print ["Hello","World"]
"Hello"
"World"

- You can perform a list of IO functions by using the sequence function. For example

Prelude> sequence [getLine,getLine]
Hello
World
["Hello","World"]

Prelude> sequence [Just 1,Just 2]
Just [1,2]

- Even though 'getLine' is of type IO, 'sequence' changes the type of the values from Monadic to Strings, and...
... thus you get a list of Strings as the final result

---------------------------
EPISODE EIGHT => Haskell IO
---------------------------

-}

-- This function takes a String as an argument and prints "Hello " before it
hello :: String -> IO () -- Type: Takes a String and returns an IO ()
hello name = putStrLn ("Hello " ++ name) -- Prints "Hello name" to screen

-- This function asks the user for their name and then prints "Hello " to the screen followed by their name
helloName :: IO String -- Type: Returns an IO String
helloName = do
    putStrLn("What is your first name?"); -- Asks the user for a name
    name <- getLine; -- Stores the input into the variable 'name'
    return ("Hello " ++ name); -- Returns/prints "Hello " followed by 'name' to the screen

ffs x = x

-- This function asks the user for their first and last name and prints a greeting to the screen
userName :: IO String -- Type: Returns an IO String
userName = do
    putStrLn("What is your first name?"); -- Asks the user for first name
    firstName <- getLine; -- Stores input into 'firstName'
    putStrLn("What is your last name?"); -- Asks the user for last name
    lastName <- getLine; -- Stores input into 'lastName'
    return ("Good Afternoon Mr." ++ lastName ++ ". Or do you prefer " ++ firstName); -- Returns(prints) a greeting to screen

fs x = x

-- This function removes the uppercase or lowercase letters in a String, based on the first argument
removeCase :: Bool -> IO (Bool -> String -> String) -- Type: Takes a Bool and returns an IO (Bool -> String -> String)
removeCase b = do
    putStr("Enter A Phrase --> ") -- Asks the user to enter a sentence of some kind
    phrase <- getLine -- Stores the sentence in 'phrase'
    return selectCase -- If 'b' is True then all uppercase letters are removed, otherwise all lowercase letters
        where selectCase b phrase = if b then removeUpperCase phrase else removeLowerCase phrase

-- This function removes all uppercase letters from a function
removeUpperCase :: [Char] -> [Char] -- Type: Takes a list of Chars and returns a list of Chars
removeUpperCase xs = [ x | x <- xs, x `elem` ['a'..'b']] -- elem returns True if 'x' is in the list
-- Sorts through the list and if 'x' is equal to any item in the lowercase list, 'x' is removed

-- This function removes all lowercase letters from a function
removeLowerCase :: [Char] -> [Char] -- Takes a list of Chars and returns a list of Chars
removeLowerCase xs = [ x | x <- xs, x `elem` ['A'..'Z']] -- elem returns False if 'x' is NOT in the list
-- Sorts through the list and if 'x' is equal to any item in the uppercase list, 'x' is removed

-- This function returns the full month when supplied the first three letters
simpleMonth :: IO String -- Type: Returns an IO String
simpleMonth = do
    putStrLn("First 3 Letters Of Month?"); -- Asks for the first three letters of the month
    abbr <- getLine -- Stores the input in 'abbr'
    return (getMonth(abbr)) -- Returns the result of (getMonth(abbr)) and prints it to the screen

-- This function returns the full month name if given the first three letters
getMonth :: [Char] -> [Char]
getMonth "Jan" = "January"   ; getMonth "Feb" = "February"
getMonth "Mar" = "March"     ; getMonth "Apr" = "April"
getMonth "May" = "May"       ; getMonth "Jun" = "June"
getMonth "Jul" = "July"      ; getMonth "Aug" = "August"
getMonth "Sep" = "September" ; getMonth "Oct" = "October"  
getMonth "Nov" = "November"  ; getMonth "Dec" = "December"
getMonth _ = "Not A Month"   ; -- Anything else is "Not A Month"

-- This function takes a number and returns its successor
nextNum :: (Show b, Enum b) => b -> IO b -- Type: Takes 'b' and returns IO b, where 'b' is an instance of Show & Enum
nextNum i = do
    putStr("The Successor Of " ++ (show i) ++ " Is "); -- Prints the result in a formatted text
    return(succ i); -- Returns the successor of 'i'

-- This function takes a number and returns its predecessor
prevNum :: (Show b, Enum b) => b -> IO b -- Type: Takes 'b' and returns IO b, where 'b' is an instance of Show & Enum
prevNum i = do
    putStr("The Predecessor Of " ++ (show i) ++ " Is "); -- Prints the result in a formatted text
    return (pred i); -- Returns the predecessor of 'i'

-- This function computes the power of two numbers and prints it to the screen
power :: (Num a, Show a, Show b, Integral b) => a -> b -> IO () -- Type: Takes 'a', 'b' and returns IO ()
power x y = do
    putStrLn((show x) ++ " ^ " ++ (show y) ++ " = " ++ (show z)); -- Prints the result in a formatted text
    where z = x ^ y; -- 'z' is equal to 'x' to the power of 'y'

-- This function is similar to 'simpleMonth', but it is not case sensitive
advancedMonth :: IO String -- Type: Returns IO String
advancedMonth = do 
    putStr("First Three Letters Of Month ==> "); -- Asks the user to enter the first three characters of the month
    abbr <- getLine -- Stores result in 'abbr'
    return(getMonthNoCase(toLowerCase(abbr))) -- Converts 'abbr' to lowercase, pattern matches the result and prints it

-- Takes the first three characters of a String and converts it to lowercase
toLowerCase :: String -> String -- Type: Takes a String and returns a String
toLowerCase abbr = let 
    dropThree = take 3 abbr -- Takes the first three characters in 'abbr'
    lowerCase = map replace dropThree -- Replaces all uppercase letters with lowercase using 'map'
  in lowerCase

-- This function takes an uppercase letter and returns a lowercase letter using guards
replace :: Char -> Char -- Type: Takes a Char and returns a Char
replace x
    | x == 'A' = 'a' | x == 'B' = 'b' | x == 'C' = 'c'
    | x == 'D' = 'd' | x == 'E' = 'e' | x == 'F' = 'f'
    | x == 'G' = 'g' | x == 'H' = 'h' | x == 'I' = 'i'
    | x == 'J' = 'j' | x == 'K' = 'k' | x == 'L' = 'l'
    | x == 'M' = 'm' | x == 'N' = 'n' | x == 'O' = 'o'
    | x == 'P' = 'p' | x == 'Q' = 'q' | x == 'R' = 'r'
    | x == 'S' = 's' | x == 'T' = 't' | x == 'U' = 'u'
    | x == 'V' = 'v' | x == 'W' = 'w' | x == 'X' = 'x'
    | x == 'Y' = 'y' | x == 'Z' = 'z' | otherwise = x
-- All uppercase letters have been matched with their lowercase counterparts. Anything else will return 'x'

-- This function is similar to 'getMonth' but it compares against lowercase abbreviations
getMonthNoCase :: [Char] -> [Char] -- Type: Takes a list of Char and returns a list of Char using pattern matching
getMonthNoCase "jan" = "January"
getMonthNoCase "feb" = "February"
getMonthNoCase "mar" = "March"
getMonthNoCase "apr" = "April"
getMonthNoCase "may" = "May"
getMonthNoCase "jun" = "June"
getMonthNoCase "jul" = "July"
getMonthNoCase "aug" = "August"
getMonthNoCase "sep" = "September"
getMonthNoCase "oct" = "October"
getMonthNoCase "nov" = "November"
getMonthNoCase "dec" = "December"
getMonthNoCase _ = "Not A Month" -- Anything else not matched is "Not A Month" 

-- This function takes a String and returns the successor of each letter of the String, returning a new String
easyEncryption :: String -> String -- Type: Takes a String and returns a String
easyEncryption xs = map succ xs -- Maps the 'succ' function to the supplied String

-- This function takes a phrase and applies a basic encryption method to it
easyEncryptText :: IO () -- Type: Returns an IO ()
easyEncryptText = do
    putStr("Type Something --> ") -- Asks the user to enter something
    text <- getLine -- Stores input into 'text'
    putStrLn("Encrypted Text --> " ++ easyEncryption text) -- Returns/prints the encrypted text

-- This function is similar to the one above but it takes a key and applies the succ/pred function that many times
encryptMe :: Int -> IO () -- Type: Takes an Int and returns an IO ()
encryptMe x = do
    putStr("Key = " ++ (show x) ++ " | What would you like to encrypt? --> ") -- Asks the user what to encrypt
    text <- getLine -- Stores input into 'text'
    putStrLn("Key = " ++ (show x) ++ " | Your encrypted text is " ++ toCipherText x text) -- Returns/prints the encrypted text

-- This function converts plain text to cipher text by encrypting it by applying the succ/pred function to it
toCipherText :: (Num a, Ord a, Enum b) => a -> [b] -> [b] -- Type: Takes an 'a', a list of 'b', and returns a list of 'b'
toCipherText 0 xs = xs -- If the key is 0, then return the text as is, unchanged
toCipherText x xs
    | x > 0 = encrypt x xs -- If key is greater than 0 then encrypt, which applies the succ function
    | x < 0 = decrypt (negate x) xs -- If key is less than 0 then apply decrypt, which applies the pred function

-- This function is complementary to 'encryptMe' because it decrypts whatever the other function encrypts
decryptMe :: Int -> IO () -- Type: Takes an Int and returns an IO ()
decryptMe x = do
    putStr("Key = " ++ (show x) ++ " | What would you like to decrypt? --> ") -- Asks the user what they wanna decrypt
    text <- getLine -- Stores input into 'text'
    putStrLn("Key = " ++ (show x) ++ " | Your decrypted text is " ++ toPlainText x text) -- Returns decrypted String in formatted style

-- This function converts cipher text to plain text by appropriately applying the succ/pred function on it
toPlainText :: (Num a, Ord a, Enum b) => a -> [b] -> [b] -- Type: Takes an 'a', a list of 'b', and returns a list of 'b'
toPlainText 0 xs = xs -- If the Key is 0 then the text is returned as is without any modifications
toPlainText x xs 
    | x > 0 = decrypt x xs -- If the key is greater than 0, then decrypt it, and apply the pred function
    | x < 0 = encrypt (negate x) xs -- If the key is less than 0, then encrypt it, and apply the succ function

-- This function encrypts text by applying the succ function 'n' number of times
encrypt :: (Num a, Ord a, Enum b) => a -> [b] -> [b] -- Type: Takes an 'a', a list of 'b', and returns a list of 'b'
encrypt x xs
    | x > 0 = encrypt (x-1) (map succ xs) -- Uses the map function to apply succ to 'xs', 'x' number of times

-- This function decrypts text by applying the pred function 'n' number of times
decrypt :: (Num a, Ord a, Enum b) => a -> [b] -> [b] -- Type: Takes an 'a', a list of 'b', and returns a list of 'b'
decrypt x xs
    | x > 0 = decrypt (x-1) (map pred xs) -- Uses the map function to apply pred to 'xs', 'x' number of times

{-

------------------------
EPISODE NINE => Functors
------------------------

- Functor is a class in which IO and Maybe are an instance of. The functor class allows us to apply functions...
... to the values inside the types of IO and Maybe. A good example of this is the function 'fmap'; not to be...
... confused with 'map'; they are both very different. 'fmap' takes a function and a functor and applies that...
... functon to the value inside of the functor. Then it wraps the result back up in the functor. For example:

Prelude> fmap succ $ Just 1
Just 2

Prelude> fmap succ $ Just 'a'
Just 'b'

- You can think of it like this:
fmap succ (Just 1) --> succ (Just 1) --> succ 1 --> 2 --> Just 2
fmap succ (Just 'a') --> succ (Just 'a') --> succ 'a' --> 'b' --> Just 'b'

- Normally, we'd have to unwrap 'Just 1' in order to operate on 1, but 'fmap' does it for us. It unwraps...
... 1, adds 1 to it, and wraps the result back up. 

- 'fmap' is useful because it can apply functions to a potentially non-existent value and still be type safe. For example:

Prelude> fmap (+1) Nothing
Nothing

Prelude> fmap succ  Nothing
Nothing

- Here's how to apply functions to non-regular and impure types. For example:

Prelude> fmap (++ " World") getLine
Hello
"Hello World"

- You can also use the dollar sign operator wrapped in operands to accomplish the same thing. For example:

Prelude> (+1) <$> (Just 1)
Just 2

- Just imagine that the 'Just' constructor and dollar sign operator are gone and you're left with (+1) 1, which...
... is 2 because 1 + 1 = 2. It's quite simple!

- If you wanted to apply two arguments, you can use the asterisk surrounded by operands. For example:

Prelude> (++) <$> getLine <*> getLine
Hello
 World
"Hello World"

- The asterisk operator lets you add arguments to the function in case you need more than one or two. In simple...
... terms, this operator can be seen as the following (but isn't identical to):
getLine <*> getLine --> (++) getLine getLine
					OR
getLine <*> getLine --> getLine ++ getLine

- Functors allow us to separate purity from impurity, all while being type safe. The dollar sign operator and...
... 'fmap' are the same function, except that <$> is an infix function, and 'fmap' is prefix and infix. For example:

(++) <$> getLine <*> getLine
(++) `fmap` getLine <*> getLine

- Side note: Here are the types of <$> and <*>, respectively:

(<$>) :: Functor f => (a -> b) -> f a -> f b
(<*>) :: Applicative f => f (a -> b) -> f a -> f b

- In order to effectively learn and understand Monads, you need to master Functors & Applicatives. So get...
... used to using these two functions!!!

------------------------
EPISODE NINE => Functors
------------------------

-}

-- This function returns the successor of 'Just a'
succJust :: (Enum a) => Maybe a -> Maybe a -- Type: Takes a 'Maybe a' and returns a 'Maybe a', where 'a' is an instance of Enum
succJust Nothing  = Nothing -- Returns Nothing if Nothing is the argument
succJust (Just a) = Just b -- Returns 'Just b', where 'b' is the successor of 'a'
    where b = succ a -- Calculates 'succ a' and stores it in b

-- This function returns the predecessor of 'Just a'
predJust :: (Enum a) => Maybe a -> Maybe a -- Type: Takes a 'Maybe a' and returns a 'Maybe a', where 'a' is an instance of Enum
predJust Nothing  = Nothing -- Returns Nothing if Nothing is the argument
predJust (Just a) = Just b -- Returns 'Just b', where 'b' is the predecessor of 'a'
    where b = pred a -- Calculates 'pred a' and stores it in b

-- This function applies a functor to 'Just a' by unwrapping it, applying the function, and then wrapping it up again
fmapNoList :: (Num a) => (a -> b) -> Maybe a -> Maybe b -- Type: Takes a functor, 'Maybe a' and returns 'Maybe b'
fmapNoList _ Nothing  = Nothing -- Returns Nothing if Nothing is the argument
fmapNoList f (Just a) = Just b -- Returns 'Just b' where 'b' is (f a)
    where b = f a -- Stores (f a) in 'b'

-- This function is identical to the one above except that it makes use <$> to perform the transformation
fmapDollar :: (a -> b) -> Maybe a -> Maybe b -- Type: Takes a functor, 'Maybe a' and returns 'Maybe b'
fmapDollar _ Nothing = Nothing -- Returns Nothing if Nothing is the argument
fmapDollar f (Just a) = f <$> Just a -- The dollar sign is identical to 'fmap' except that it's an infix function

-- Applies a functor to (Just [a]), where [a] is a list of a. This works in a similar manner to 'fmapNoList'
fmapList :: (a -> b) -> Maybe [a] -> Maybe [b] -- Type: Takes a function, Maybe [a], and returns Maybe [b]
fmapList _ Nothing   = Nothing -- Returns Nothing if Nothing is the argument
fmapList f (Just xs) = Just (myMap f xs) -- Applies 'f' to every single element in 'xs' and wraps the result in 'Just'

-- 'fmapList' can also be defined with a Let Statement. They're both the exact same thing, except that this one just...
-- ... breaks it down over two lines. For example:

--fmapList :: (a -> b) -> Maybe [a] -> Maybe [b]
--fmapList _ Nothing   = Nothing
--fmapList f (Just xs) = let
--    newList = myMap f xs -- First we apply all transformations to each item in 'xs' and store that in 'newList'
--    wrap = Just newList -- Then we wrap 'newList' inside the 'Just' constructor
--  in wrap

-- This function is identical to the 'map' function in Prelude
myMap :: (a -> b) -> [a] -> [b] -- Type: Takes a function, list of a, and returns a list of b
myMap _ []     = [] -- Returns [] if the empty list is supplied
myMap f (x:xs) = f x : myMap f xs -- Recursively appends (f x) to the list until it is empty

-- This function is identical to 'succJust' except that it works on the Prolly data
succOnly :: (Enum a) => Prolly a -> Prolly a -- Type: Takes Prolly a, and returns Prolly a, where 'a' is an instance of Num
succOnly Null     = Null -- Returns Null if Null is the argument
succOnly (Only a) = Only b -- Returns Only b
    where b = succ a -- 'b' is equal to succ a

predOnly :: (Enum a) => Prolly a -> Prolly a
predOnly Null     = Null -- Returns Null if Null is the argument
predOnly (Only a) = Only b -- Returns Only a
    where b = pred a -- 'b' is equal to pred a

-- This function is identical to 'fmapList' except that it only works on the Prolly data
fmapOnlyList :: (a -> b) -> Prolly [a] -> Prolly [b] -- Type: Takes a function, Prolly [a], and returns Prolly [b]
fmapOnlyList _ Null      = Null -- Returns Null if Null is the argument
fmapOnlyList f (Only xs) = Only (myMap f xs) -- Applies 'f' to every single item in 'xs' and wraps the result in Only, then returns it

-- This function demonstrates how <$> is an infix function, and how <*> can be used to add arguments
userInput :: IO String -- Type: Returns an IO String
userInput = (++) <$> a <*> b -- Appends 'b' to 'a' by applying the ++ functor on it
    where a = getLine -- a equals user input
          b = getLine -- b equals user unput

-- THE END --
