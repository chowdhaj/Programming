-- Learn You A Haskell By Miran Lipovaca
-- https://www.youtube.com/watch?v=NBKnY7Z_w3I
-- https://www.nostarch.com/lyah.htm
-- http://learnyouahaskell.com/chapters

{-

=======================
HASKELL 1: INTRODUCTION
======================= 

- Haskell is a programming language, named after the Logician, Haskell Curry. Haskell is extremely different...
... from other languages (i.e. Java, C, Etc.) because it is purely functional, lazy, and has type inference.

- In imperative languages, a function takes input, looks at the state of memory (i.e. The variable), modifies the...
... result (This is called a side effect) and returns something. Since Haskell is a purely functional language...
... functions never consult memory or have side effects. Given the same input, a Haskell function always...
... produces the same output. This makes debugging a lot easier since everything that can affect a function's...
... output is right there in the code. Functional languages are great dealing with multi-core CPUs.

- Haskell is lazy; it waits until the last minute to evaluate expressions. Haskell doesn't return anything...
... unless you tell it to, and only evaluates the expression until the end of the parameter. For example, let's...
... assume you had a list of numbers and the first item in the list wasn't a number, it was a Boole value. Haskell...
... would only throw an error if you tried to work with it. If you don't use it, Haskell won't use it.

- Haskell is statically typed, but doesn't require declaration of types. Instead, the compiler infers...
... them. If we set 'n' to 2+2, then Haskell figures out that 'n' is an Int. This helps catch errors at compile time. 

=======================
HASKELL 1: INTRODUCTION
======================= 

-} 

-- NO CODE HERE, KEEP SCROLLING!!!

{-

===================================
HASKELL 2a: HASKELL AS A CALCULATOR
===================================

- GHCi stands for Glasgow Haskell Compiler Interactive

- GHCi can evaluate simple expressions. For example:

Prelude> 2 + 2
4

- Haskell follows BEDMAS. For example:

Prelude> 2 + 3 * 5
17

Prelude> (2 + 3) * 5
25 

- When dealing with negative numbers, surround them in brackets. For example:

Prelude> 2 * (-5)
-10

- Division in Haskell is different from other programming langauges because Haskell keeps the fractional part, where...
... as in other languages, it is discarded. For example:

Prelude> 3 / 2
1.5 

Prelude> 10 / 4 
2.5

- Haskell can also store extremely large numbers. For example:

Prelude> 50 ^ 50
8881784197001252323389053344726562500000000000000000000000000000000000000000000000000

Prelude> 70 ^ 70
1435036016098684342856030763566710717400773837392460666392490000000000000000000000000000000000000000000000000000000000000000000000

- Just like other languages, Haskell also has boolean values, True & False. These can be combined with the...
... operators AND ( && ), OR ( || ), and not ( not ). For example:

Prelude> True && True
True

Prelude> True && False
False

Prelude> False || False
False

Prelude> not True
False

Prelude> not False
True

- Comparing data can be done using the following operators:

==  --> Equal To
/=  --> Not Equal To
<   --> Less Than
<=  --> Less Than Or Equal To
>   --> Greater Than
>=  --> Greater Than Or Equal To

- And is used like so:

Prelude> 3 == 4
False

Prelude> 4 == 4
True

Prelude> 3 /= 4
True

Prelude> 3 < 4
True

Prelude> 4 > 3
True

Prelude> 5 >= 5
True

Prelude> 10 <= 10
True

- Haskell functions can be divided into two categories, infix and prefix. Infix is when the function is between...
... the arguments (i.e. Arithmetic Operators (Such as the ones listed above)). And prefix is when the function...
... comes before the arguments (i.e. 'not' and the minus sign). With the exception of the arithmetic operators...
... most Haskell functions are prefix. Here are more examples of prefix functions:

Prelude> min 3 6 
3

Prelude> max 4 9
9

- Function application has higher precedence has operator precedence. Hence, the following are identical:

Prelude> max 3 5 * 2
10

Prelude> (max 3 5) * 2
10

- A prefix function can be turned into an infix function by wrapping it in backticks. However, the prefix...
... function must be a binary function; accepts ONLY two arguments. For example:

Prelude> 3 `max` 5
5

Prelude> 3 `min` 9
3

- If you want to leave GHCi, type :quit or :q into the command line. 

===================================
HASKELL 2a: HASKELL AS A CALCULATOR
===================================

-} 

{-

==================================
HASKELL 2b: FUNCTIONS, IF, AND LET
==================================

- We can define our own functions in Haskell (in a separate file). This provides many benefits such as saving...
... your code, distributing it other people, publishing it online, and replicating it an infinite number of times.

- You can use any text editor to create Haskell files, as long as they are saved as plain text and end...
... in '.hs' (i.e. program.hs, test.hs, haskell.hs, etc.)

- Defining functions in Haskell is relatively easy. The format looks like this:
functionName arguments = {what the function should do}

- In practice, this looks like:
double x = x + x
hypotenuse a b = sqrt (a ^ 2 + b ^ 2)

- There is no need for semicolons or brackets, as Haskell relies on lines and spacing. Also, all functions...
... must start with a lowercase letter and follow camelCase. Even though this is a convention in other...
... languages, it is enforced in Haskell. A function cannot start with a capital letter; an error is thrown

- Loading files in GHCi is simple. Type :load OR :l, followed by the path of the file. For example:
Prelude> :load /Users/Chowdhaj/Desktop/prac3.hs 
Prelude> :l /Users/Chowdhaj/Desktop/Folder/test.hs 

- Calling functions is quite easy. Simply type the name, followed by the arguments. For example:
*Main> hypotenuse 3 4
5.0

- If you make a change in the text file, make sure you reload the file again in GHCi, by typing colon r ( :r )

- Like other languages, Haskell also has an if-else expression. Here's the syntax: 

identifyCamel humps = if humps == 1 
                      then "dromedary" 
                      else "Bactrian"

- In an if-else expression, the 'else' part is required because a Haskell function must always return a value

- The let statement allows us to define functions and values on the fly. For example:

*Main> let dubs x = 2 * x
*Main> dubs 3
6

*Main> let x = 3.0
*Main> let y = 4.0
*Main> hypotenuse x y
5.0

==================================
HASKELL 2b: FUNCTIONS, IF, AND LET
==================================

-}

double x = x + x

triple x = x + x + x

triple2 x = double x + x

hypotenuse a b = sqrt (a ^ 2 + b ^ 2)

sevenOrNot x = if x == 7 then "Seven!" else "Not Seven!"

calculateRightTriangle a b c = if (a ^ 2 + b ^ 2 == c ^ 2)
                               then "This Is A Right Triangle"
                               else "This Ain't A Right Triangle"

dividesEvenly a b = if (a `div` b) * b == a then "Divides Evenly" else "Nope"

{-

=================
HASKELL 2c: LISTS
=================

- The most common data structure in Haskell is the linked list. For example:

Prelude> let numbers = [4,8,16,64,256]

- A linked list is made up of nodes, each of which contain one element, and a pointer to the next node. The...
... pointer in the last node is null, it doesn't point to anything. For example:

4 -> 8 -> 16 -> 64 -> 256 -> null

- The functions 'head' and 'tail' lets us look at pieces of a list. Head returns the first element of the...
... list and tail drops the first element and returns the rest of the list. For example:

Prelude> head [1,2,3,4]
1

Prelude> tail [1,2,3,4]
[2,3,4]

- Haskell data structures are immutable; they never change. You can call the tail function on a list until...
... you have an empty list, but the original list will never change. For example:

Prelude> let numbers = [1,2,3,4]
Prelude> tail(tail(numbers))
[3,4]
Prelude> numbers
[1,2,3,4]

- Adding items to the front of lists can be done by using the colon operator. It constructs a new list node. Hence...
... it is also sometimes called the 'Cons' operator. For example:

Prelude> 5 : []
[5]

Prelude> 5 : 4 : 3 : 2 : 1 : []
[5,4,3,2,1]

- The cons operator works from right to left. Think about it this way:

5 : 4 : 3 : 2 : 1 : []
5 : 4 : 3 : 2 : [1]
5 : 4 : 3 : [2,1]
5 : 4 : [3,2,1]
5 : [4,3,2,1]
[5,4,3,2,1]

- Also, the cons operator can only append a SINGLE ITEM to the FRONT of a LIST. Joining two lists together...
... requires the use of the 'Plus-Plus' operator. For example:

Prelude> [1,2,3] ++ [4,5,6]
[1,2,3,4,5,6]

- Here are some more functions you can use with lists. For example:

1. Head: Returns the first element in the list

Prelude> head [1,2,3]
1

2. Tail: Drops the first element and returns the rest of the list

Prelude> tail [1,2,3]
[2,3]

3. Length: Returns the length of the list

Prelude> length [1,2,3]
3

4. Reverse: Reverses the entire list

Prelude> reverse [1,2,3]
[3,2,1]

5. Index ( !! ): Returns the element at a particular index of a list. Also, counting starts at 0.

Prelude> [1,2,3] !! 2
3

6. Last: Returns the last item in a list

Prelude> last [1,2,3]
3

7. Init: Drops the last item and returns the list

Prelude> init [1,2,3]
[1,2]

8. Null: Returns True if the list is empty, otherwise False

Prelude> null []
True

Prelude> null [1,2,3]
False

9. Elem: Analyzes a list to see if a particular item is inside a list. Returns True if it exists, otherwise False

Prelude> elem 3 [1,2,3]
True

Prelude elem 4 [1,2,3]
False

10. Plus-Plus ( ++ ): Appends a SINGLE ITEM to the FRONT of a LIST

Prelude> 5 : [1]
[5,1] 

- When dealing with lists, you need to be aware of constant time and linear time. In constant time, the length...
... of the length does not matter in when it comes to computational speed. In linear time, the length of the...
... list is directly related to how fast the computation is carried out. A long list results in long computing...
... times, and a short list results in short computing times. Here are some functions and their times:

1. Head: Constant time; because head returns the first item in the list. Hence, the list can be extremely large...
... and it won't matter because Haskell only cares about the first item.

2. Tail: Constant time; because Haskell doesn't create any new nodes. It just drops the first item and returns...
... the remaining list.

3. Length: Linear time; because Haskell needs to go through the entire list in order to determine the number of...
... elements in the list

4. Reverse: Linear time; because Haskell needs to walk down the list and create new nodes, which takes linear time

5. Index ( !! ): Linear time; because Haskell needs to go through the list in order to return the element at the...
... specific index. The index could be the first item or the last. In any case, index takes linear time.

6. Last: Linear time because the list needs to be walked down

7. Init: Linear time because all of the nodes need to be rebuilt

8. Null (null): Constant time; because a simple equality check is performed to see if the list is empty or not

9. Elem: Linear time because it needs to walk down the list to check if an item is in a list

10. Plus-Plus ( ++ ): Linear time because the first list needs to be rebuilt

- Lists are not limited to numbers. You can also store characters. In fact, in Haskell, Strings are just...
... lists of characters. Something like "Hello" is just syntactic sugar for ['H','e','l','l','o']. You can prove...
... this like this:

Prelude> "Hello" == ['H','e','l','l','o']
True

- Lists can be compared using the equality operators. For example:

Prelude> "adam" > "ant"
False

Prelude> [1,2,3] > [4]
False

- When comparing lists, this way, the first element is checked. The equality operators check the ordering of the...
... data. It goes through both lists, character by character until it finds one with a lower value. This takes...
... linear time. When comparing Strings of characters, Haskell compares lexica graphic order, not alphabetical; all...
... uppercase letters come before all lowercase letters. 

- You can even create lists inside of lists. For example:

Prelude> [[1,2,3],[4,5,6],[7,8,9]]
[[1,2,3],[4,5,6],[7,8,9]]

- Here are some more functions you can use with lists:

1. Maximum: Returns the largest element in a list. Takes linear time.

Prelude> maximum [1,2,3,4]
4

Prelude> maximum ['a','b','y','z']
'z'

2. Minimum: Returns the smallest element in a list. Takes linear time. 

Prelude> minimum [1,2,3,4]
1

Prelude> minimum ['a','b','y','z']
'a'

3. Sum: Returns the sum of the list. Only works on numbers. Takes linear time.

Prelude> sum [1,2,3,4]
10

- You can imagine 'sum' like this: sum [1,2,3,4] -> 1 + 2 + 3 + 4 -> 10

4. Product: Returns the product of the list. Only works on numbers. Takes linear time. 

Prelude> product [1,2,3,4]
24

- 'product' looks something like this: (1 x 2 x 3 x 4) -> 24

- A texas range allows you to create long lists by specifying a beginning and end value. For example:

Prelude> [1..10]
[1,2,3,4,5,6,7,8,9,10]


Prelude> ['a'..'z']
"abcdefghijklmnopqrstuvwxyz"

- You can even specify a step. For example:

Prelude> [2,4..10]
[2,4,6,8,10]

- You can countdown, but you NEED to provide a step. This is because texas range are programmed to increase...
... by default. Adding a step is imperative because it specifies counting down. For example:

Prelude> [10,9..1]
[10,9,8,7,6,5,4,3,2,1]

- A texas range allows you to create an infinitely long list. Just leave off the end. For example:

Prelude> [1..]
*The result is to long to paste here. Try it out yourself in GHCi*

- At first a texas range seems useless, but combined with other functions, it's useful. For example, combining...
... the take function with a texas range allows you to extract the first couple of items from the infinite list:

Prelude> take 5 [1..]
[1,2,3,4,5]

- Here are some more functions you can use with lists:

1. Drop: Drops the first 'x' number of items in a list. Takes linear time because Haskell needs to walk down the...
... list in order to drop the items

Prelude> drop 4 [1..5]
[5]

2. Take: Takes the first 'x' number of items in a list. Takes linear time because new nodes need to be created

Prelude> take 4 [1..10]
[1,2,3,4]

3. Cycle: Repeats the contents of a list, an infinite number of times. Takes linear time because a new list, and...
... new nodes are created

Prelude> cycle [1..10]
[1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10...] -- This continues forever

4. Repeat: Repeats a single element, an infinite number of times, and puts it in a list. Takes linear time. 

Prelude> repeat 5
[5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5...] -- This continues forever

5. Replicate: Takes a number, and a value, and repeats the value, the number of times specified. Takes linear time.

Prelude> replicate 4 1
[1,1,1,1]

Prelude> replicate 4 [1]
[[1],[1],[1],[1]]

6. DropWhile: Takes a boolean expression, and a list and drops the elements that satisfy the condition, as long...
... as the expression is true. Takes linear time.

Prelude> dropWhile (==0) [0,0,0,0,1,1,1,0,0,0]
[1,1,1,0,0,0]

Prelude> dropWhile (==0) [1,0,0,0,1,1,1,0,0,0]
[1,0,0,0,1,1,1,0,0,0]

7. TakeWhile: Similar to 'dropWhile', but returns the values in a list. Takes linear time.

Prelude> takeWhile (==0) [0,0,0,0,1,1,1,0,0,0]
[0,0,0,0]

Prelude> takeWhile (==0) [1,0,0,0,1,1,1,0,0,0]
[]

=================
HASKELL 2c: LISTS
=================

-}

lengthOfWord xs = length xs

wordCount xs = length (words xs)

isPalindrome xs = if (xs == (reverse xs)) then True else False

middleNumber xs = length xs `div` 2

middleChar xs = if even (length xs) then error "No Middle Character" else xs !! (middleNumber xs)

firstAndLast xs = (head xs + last xs) / 2

listRange xs = (maximum xs + minimum xs) / 2

factorial x = product [1..x]

safeFactorial x = if (x < 0) then error "Does Not Exist" else product [1..x]

average xs = sum xs / fromIntegral (length xs)

cleanNumber x xs = reverse (dropWhile (==x) (reverse (dropWhile (==x) xs)))

{-

===============================
HASKELL 2d: LIST COMPREHENSIONS
===============================

- List comprehensions in Haskell are used to manipulate lists in an extremely concise, mathematical...
... notation. The following example uses a texas range to create a list from 1 to 10, and uses it as a...
... power of 2. For example:

Prelude> [2^n | n <- [1..10]] 
[2,4,8,16,32,64,128,256,512,1024]

- The [2^n] specifies what the final values of 'n' should be. In this example, they should be powers of 2

- The [n <- [1..10]] tells Haskell what the initial list will look like. In this case, it's a simple list...
... ranging from 1 to 10 (i.e.[1,2,3,4,5,6,7,8,9,10]).

- The final list looks something like this:
[2^1,2^2,2^3,2^4,2^5,2^6,2^7,2^8,2^9,2^10] --> [2,4,8,16,32,64,128,256,512,1024]

- You can even set a range of acceptable values. For instance, what if we only wanted two digit numbers. You can...
... accomplish this by using predicates/filters to constraint the acceptable values. For example:

Prelude> [2^n | n <- [1..10], 2^n > 10, 2^n < 100]
[16,32,64]

- [2^n > 10] says that 2^n must be greater than 0, and [2^n < 100] says that 2^n must be less than 100. Hence, we...
... have a list that looks like this: [16,32,64], where all values are between 10 and 100. 

- Since Strings are lists, we can use list comprehensions on them too. The following example removes all vowels...
... from a word:

Prelude> [x | x <- "the quick brown fox", not (elem x "aeiou")]
"th qck brwn fx"

- This says that the list of all characters 'x', where 'x' comes from the list "the quick brown fox", and...
... 'x' is not an element of "aeiou". In simpler terms, 'x' is gonna equal "the quick brown fox", and if any...
... character in 'x' matches "aeiou", we're gonna remove it.

- You can even nest list comprehensions for more functionality. For example:

Prelude> [[x | x <- word, not (elem x "aeiou")] | word <- ["bell", "horn", "ball", "hurly"]]
["bll","hrn","bll","nggrs"]

- The inner list comprehension - [x | x <- word, not (elem x "aeiou")] - removes all the vowels from a word, and...
... the outer list comprehension - [word <- ["bell", "horn", "ball", "hurly"]] - does that for each word in...
... the list. 

- List comprehensions can do all sorts of things in a concise manner, such as create multiplication tables. For...
... example:

*Main> [[x * y | y <- [1..5]] | x <- [1..5]]
[[1,2,3,4,5],[2,4,6,8,10],[3,6,9,12,15],[4,8,12,16,20],[5,10,15,20,25]]

- The inner list comprehension - [[x * y | y <- [1..5]] - multiplies 'x' by each value of 'y', and the outer...
... list comprehension - [x <- [1..5]] - supplies the values to the inner list comprehension. Think of it like...
... this: 

x = 1, y = 1,2,3,4,5
x * y = 1 * 1, 1 * 2, 1 * 3, 1 * 4, 1 * 5 --> [1,2,3,4,5]

x = 2, y = 1,2,3,4,5
x * y = 2 * 1, 2 * 2, 2 * 3, 2 * 4, 2 * 5 --> [2,4,6,8,10]

x = 3, y = 1,2,3,4,5
x * y = 3 * 1, 3 * 2, 3 * 3, 3 * 4, 3 * 5 --> [3,6,9,12,15]

x = 4, y = 1,2,3,4,5
x * y = 4 * 1, 4 * 2, 4 * 3, 4 * 4, 4 * 5 --> [4,8,12,16,20]

x = 5, y = 1,2,3,4,5
x * y = 5 * 1, 5 * 2, 5 * 3, 5 * 4, 5 * 5 --> [5,10,15,20,25]

===============================
HASKELL 2d: LIST COMPREHENSIONS
===============================

-}

ramSticks = [2^n | n <- [1..7]]

powersOf x y = [x ^ z | z <- [1..y]]

removeLetter x xs = [z | z <- xs, not (elem z x)]

listPowers x y = [[x ^ y| y <- [1..y]] | x <- [1..x]]

removeUppercase xs = [x | x <- xs, not (elem x ['A'..'Z'])]

removeLowercase xs = [x | x <- xs, not (elem x ['a'..'z'])]

zipped = [("AA"," BB"),("CC"," DD"),("EE"," FF"),("GG"," HH")]

swearWords = [(fst p ++ snd q) | p <- zipped, q <- zipped]

removeSmallWords z xs = [[x | x <- word, (if (length word > z) then True else False)] | word <- xs]

{-

==================
HASKELL 2e: TUPLES
==================

- Up until now, we've only been working with lists. Now, we're gonna take a look at tuples (pronounced: to-pulls).

- Tuples are similar to lists but with a few key differences. These are:

1. Lists have SQUARE brackets, tuples have ROUND brackets.

2. The length of a tuple is part of its type. Tuples of different lengths are of different types. Where as...
... lists are the same type, regardless of length.

3. Elements of a tuple can be of different types, while elements of a list must be of the same type.

- Here are some examples of tuples. 

1. (a,b) -- Often called Pair

Prelude> ("John", 83)
("John",83)

2. (a,b,c) -- Referred to as Triple

Prelude> ("John",True,17)
("John",True,17)

3. (a,b,c,d) -- Also called Four Tuple

Prelude> ("Bob", 23,'B',177.4)
("Bob",23,'B',177.4)

- Note: Tuples can be as long as you need them to be, and are referred to as tuples (no special name)

- A tuple is like a struct in C or an object in Java. It collects several pieces of information which may be...
... of different types. For instance, we can use a tuple to store the make, model, and year of a car. For example:

Prelude> ("Honda","Civic",2017)
("Honda","Civic",2017)

- The Pair tuple has two special functions, 'fst', and 'snd' that return the first and second value of the...
... tuple, respectively. For example:

*Main> fst ("John",23)
"John"

*Main> snd ("John",23)
23

- The 'zip' function turns two lists into a list of pairs/tuples. For example:

Prelude> zip [1..26] ['a'..'z']
[(1,'a'),(2,'b'),(3,'c'),(4,'d'),(5,'e'),(6,'f'),(7,'g'),(8,'h'),(9,'i'),(10,'j'),(11,'k'),(12,'l'),(13,'m'),
(14,'n'),(15,'o'),(16,'p'),(17,'q'),(18,'r'),(19,'s'),(20,'t'),(21,'u'),(22,'v'),(23,'w'),(24,'x'),(25,'y'),
(26,'z')]

==================
HASKELL 2e: TUPLES
==================

-} 

fst3 (a,b,c) = a

mid3 (a,b,c) = b

lst3 (a,b,c) = c

createCar xs ys zs = (xs,ys,zs)

createPerson xs ys zs = (xs,ys,zs)

fstTupleToList xs = [(fst p) | p <- xs]  

sndTupleToList xs = [(snd p) | p <- xs]

listCharsAndNum = zip [1..26] ['a'..'z']

pairs = [(1,"one"),(2,"two"),(3,"three"),(4,"four"),(5,"five"),(6,"six"),(7,"seven"),(8,"eight")]

list = [(fst p, fst q) | p <- pairs, q <- pairs, fst p < fst q, length (snd p) > length (snd q)]

{-

==============================
HASKELL 3: TYPES & TYPECLASSES
==============================

- Types are sets of values, and typeclasses are sets of types. For example, the type integer, includes...
... values like 3, -4, and 8. The typeclass 'Num' includes things like Integer, Double, Float, & Int. This is...
... somewhat analogous to Java, where classes are sets of objects, and interfaces are sets of classes. For...
... example, the interface comparable, includes the classes String and Integer. Imagine it like this:

Haskell  ::  Value   ->  Type   ->  Typeclasses
   Java  ::  Object  ->  Class  ->  Interface 

- You can use ':type' OR ':t' to find out the type of a value. For example:

Prelude> :t True
True :: Bool -- The result says that 'True' is a Bool

Prelude> :t 'a'
'a' :: Char -- This means that 'a' is a single character

Prelude> :t "Hello"
"Hello" :: [Char] -- The word "Hello" is a list of characters. In fact, "Hello" == ['H','e','l','l','o']

Prelude> :t 69 -- The value 69 belongs to every single type in the typeclass 'Num', including double and float.
69 :: Num p => p -- Haskell is being lazy by not committing to a type. 69 is polymorphic and can be anything.

Prelude> 69 :: Double -- This is how you force haskell into using a specific type
69.0 -- 69.0 is now a double

Prelude> :t head -- You can even get the type of functions.
head :: [a] -> a -- This says, for any type 'a', head takes a list of 'a', and returns an 'a'

Prelude> :t (+) -- Since 'Plus' is an infix operator, it has to be surrounded with parenthesis
(+) :: Num a => a -> a -> a -- There is some type 'a' in the typeclass 'Num'. Plus takes two 'a' and returns another 'a'

Prelude> :t zip 
zip :: [a] -> [b] -> [(a, b)] -- Takes a list of 'a' and a list of 'b' and returns a list of 'a','b' pairs

- Note: Types and Typeclasses start with uppercase letters, while functions start with lowercase letters

- Haskell's type system is startingly effective. Consider the following function, it adds the first element...
... of the list to the length of the list:

f xs = head xs + length xs 

- Haskell can figure out that the overall result must be an Int because 'length xs' returns an Int. By...
... typing ':t f' into GHCi, you get:

f :: [Int] -> Int -- Means that 'f' takes a list of Ints and returns a single Int

- Our final code looks like the following (we are allowed to specify the type of a function before hand): 

f :: [Int] -> Int
f xs = head xs + length xs 

- Haskell's type system is extremely rigid, it can also help us find bugs. For example: 

dividesEvenly :: Int -> Int -> Bool
dividesEvenly x y = (y / x) * x == y

- Loading this function will yield an error because we are expected Ints, but getting Fractionals. We need...
... to remove the (/) and remove it with `div`. For example:

dividesEvenly :: Int -> Int -> Bool
dividesEvenly x y = (y `div` x) * x == y

- Haskell's type system is really good at catching bugs during compile time. Haskell programmers often joke...
... that if you can get your code past the type system, it's probably correct.

==============================
HASKELL 3: TYPES & TYPECLASSES
==============================

-}

fst4 :: (a,b,c,d) -> a
fst4 (a,b,c,d) = a

snd4 :: (a,b,c,d) -> b
snd4 (a,b,c,d) = b

thd4 :: (a,b,c,d) -> c
thd4 (a,b,c,d) = c

lst4 :: (a,b,c,d) -> d
lst4 (a,b,c,d) = d

intType :: Int
intType = 69

intFloat :: Float
intFloat = 420.69

sHead :: [a] -> a
sHead xs = head xs 

sTail :: [a] -> [a]
sTail xs = tail xs

doubleType :: Double
doubleType = 420.0

stringType :: String
stringType = "Hello"

sLength :: [a] -> Int
sLength xs = length xs

charsType :: [Char]
charsType = "Hello, Again"

sZip :: [a] -> [b] -> [(a,b)]
sZip xs ys = zip xs ys

fullList :: [a] -> [a]
fullList xs = head xs : tail xs

someFunction :: [Int] -> Int
someFunction xs = head xs + length xs 

moveHeadToEnd :: [a] -> [a]
moveHeadToEnd xs = tail xs ++ [head xs]

moveHeadToEndBool :: [a] -> Bool -> [a]
moveHeadToEndBool xs b = if b then moveHeadToEnd xs else fullList xs

createPhone :: (Num c) => a -> b -> c -> (a,b,c)
createPhone xs ys x = (xs,ys,x)

--factorOf :: Int -> Int -> Bool -- This works as well
factorOf :: (Eq a, Integral a) => a -> a -> Bool
factorOf x y = (y `div` x) * x == y

-- passOrFail :: Int -> String -- This type signature is valid
passOrFail :: (Ord a, Num a) => a -> String
passOrFail x = if x > 50 && x < 100 then "Pass" else "Fail"

--getHypotenuse :: Double -> Double -> Double -- This is more simple, but works as well
getHypotenuse :: (Floating a, Num a) => a -> a -> a
getHypotenuse a b = sqrt (a ^ 2 + b ^ 2)

--isRightTriangle :: Double -> Double -> Double -> Bool -- Simple, but works just fine
isRightTriangle :: (Num a, Eq a) => a -> a -> a -> Bool
isRightTriangle a b c = if (a ^ 2 + b ^ 2 == c ^ 2) then True else False

--percentToGrade :: Int -> String -- This also works
percentToGrade :: (Ord a, Num a) => a -> [Char]
percentToGrade x = 
    if (x <= 100 && x >= 90) then "A+" else
    if (x <= 89 && x >= 85)  then "A"  else
    if (x <= 84 && x >= 80)  then "A-" else
    if (x <= 79 && x >= 77)  then "B+" else
    if (x <= 76 && x >= 73)  then "B"  else
    if (x <= 72 && x >= 70)  then "B-" else
    if (x <= 69 && x >= 67)  then "C+" else
    if (x <= 66 && x >= 63)  then "C"  else
    if (x <= 62 && x >= 60)  then "C-" else
    if (x <= 59 && x >= 57)  then "D+" else
    if (x <= 56 && x >= 53)  then "D"  else
    if (x <= 52 && x >= 50)  then "D-" else
    if (x <= 49 && x >= 0)   then "F"  else 
    "Not Valid"

percentToGradeFiller :: Int -> String
percentToGradeFiller x = percentToGrade x

--gradeToPercent :: [Char] -> [Char] -- This works too because String == [Char]
gradeToPercent :: String -> String
gradeToPercent xs = 
    if (xs == "A+") then "90 - 100" else
    if (xs == "A")  then "85 - 89"  else 
    if (xs == "A-") then "80 - 84"  else
    if (xs == "B+") then "77 - 79"  else
    if (xs == "B")  then "73 - 76"  else
    if (xs == "B-") then "70 - 72"  else
    if (xs == "C+") then "67 - 69"  else
    if (xs == "C")  then "63 - 66"  else
    if (xs == "C-") then "60 - 62"  else
    if (xs == "D+") then "57 - 59"  else
    if (xs == "D")  then "53 - 56"  else
    if (xs == "D-") then "50 - 52"  else
    if (xs == "F")  then "0 - 49"   else 
    "Not Valid"

gradeToPercentFiller :: String -> String
gradeToPercentFiller xs = gradeToPercent xs

letterNumberPair :: [(Int, Char)]
letterNumberPair = [(1,'a'),(2,'b'),(3,'c'),(4,'d'),(5,'e'),(6,'f'),(7,'g'),(8,'h'),(9,'i'),(10,'j')]

letterNumber2 :: [(Double, Char)]
letterNumber2 = [(1.0,'A'),(2.0,'B'),(3.0,'C'),(4.0,'D'),(5.0,'E'),(6.0,'F'),(7.0,'G'),(8.0,'H'),(9.0,'I'),
    (10.0,'J')]

{-

==========================
HASKELL 4: FUNCTION SYNTAX
==========================

- Haskell offers several expression types that make defining expressions concise and elegant. Consider the...
... following function:

increasing :: (Ord a) => [a] -> Bool
increasing xs = if xs == null 
                then True 
                else if tail xs == [] 
                    then True 
                    else if head xs <= head (tail xs) 
                        then increasing (tail xs) 
                        else False

- This function tells us if a list is ordered from decreasing to increasing. The type signature tells us...
... that for any ordered type 'a', our function takes a list of 'a', and returns a Bool. If an empty list...
... or a list of one item is supplied, then return True because both lists are increasing. Otherwise, if...
... the head of the list is less than the head of the tail of the list (second element is greater than first), then...
... recursively call the function on the tail of the list. If none of the above apply, then return False. This...
... is a recursive function, it is defined in terms of itself. Recursion will be talked about in detail, later.

- The 'increasing' function can be written much more eloquently using Haskell's pattern matching syntax. We...
... simply list a series of patterns that the input might match. For example:

increasing :: (Ord a) => [a] -> Bool
increasing []       = True -- An empty list is increasing
increasing [x]      = True -- A list of one item is also increasing
increasing (x:y:ys) = x <= y && increasing (y:ys)

- The notation (x:y:ys) refers to the list, where 'x' is the first item, 'y' is the second item, and 'ys' is...
... the rest of the list. Hence, the list is increasing if 'x' is less than 'y', and so is the rest of...
... the list. Also, brackets (i.e. (x:y:ys)) are required when we match several things at once. 

- In pattern matching, Haskell goes through the list of patterns in sequence until it finds one that is...
... matching. For example:

*Main> increasing []
True

- Haskell stops at the first pattern because it recognizes an empty list and returns the corresponding...
... output; True

*Main> increasing [42]
True

- Haskell skips the first pattern because it doesn't match. [42] is NOT an empty list. However, the second...
... pattern matches, so Haskell returns the corresponding output, True.

- Since Haskell goes through the patterns in order, we can be even more concise and robust. For example:

increasing :: (Ord a) => [a] -> Bool
increasing (x:y:ys) = x <= y && increasing (y:ys)
increase _          = True

- The first line handles the list with at least two items. The last line says that anything else is...
... increasing. This makes sense because a list needs at least two items to determine if it's increasing...
... or not, and anything else is increasing, hence True. This is possible because the underscore matches...
... everything. The underscore means that the value being passed is irrelevant, because the result is True...
... no matter what. The underscore is used when we don't care what we match; and a value needs to be passed.

- Here's a function that takes a String and returns the same String with no vowels. For example:

noVowels :: [Char] -> [Char] -- OR noVowels :: String -> String
noVowels word = if word == "" 
                then "" 
                else if head word `elem` "aeiouAEIOU" 
                    then noVowels (tail word) 
                    else (head word) : noVowels (tail word)

- If 'word' is an empty String, then return an empty String. But, if 'word' is not an empty String, and the...
... first letter of the word is a vowel then recursively call the function on the tail of the 'word'. And if...
... the word is not a vowel then append the head of 'word' to the tail of 'word' without vowels. Here's how...
... it works:

*Main> noVowels "The Quick Brown Fox Jumps Over The Lazy Dog"
"Th Qck Brwn Fx Jmps vr Th Lzy Dg"

*Main> noVowels "I Like To Eat Pizza & Burgers"
" Lk T t Pzz & Brgrs"

- The function 'noVowels' can be defined using pattern matching. For example:

noVowels :: [Char] -> [Char] -- OR noVowels :: String -> String
noVowels ""     = ""
noVowels (x:xs) = if x `elem` "aeiouAEIOU" 
                  then noVowels xs 
                  else x : noVowels xs

- With pattern matching, we don't need to constantly break-down the word using head and tail because the...
... pattern matcher has already broken it done. 'x' represents the first letter (aka head), and 'xs' is the...
... rest of the word (aka tail). 

- We can also use Guards (which are practically identical to if-else statements) to specify a condition, and...
... what needs to be done in each case. For example:

noVowels :: [Char] -> [Char] -- OR noVowels :: String -> String
noVowels "" = ""
noVowels (x:xs)
    | elem x "aeiouAEIOU" = noVowels xs
    | otherwise           = x : noVowels xs

- In Guarded statements, after each pipe ( | ) is a boolean condition, an equals sign, and what the function...
... returns - OR what to do - in that case. You can have any number of cases, as you want. This is analogous...
... to a cons statement in Lisp or Scheme. 

- The next function calls out the report of the night watch. Occasionally, there's cause for an alarm:

watch :: Int -> [Char] -- [Char] can be replaced with String
watch n = if n == 7
          then "7 o'clock and... SHARNADO!!!!"
          else show n ++ " o'clock and all's well." -- Note: The 'show' function converts 'n' to a String

- Let's try it out: 

*Main> watch 7
"7 o'clock and... SHARNADO!!!!"

*Main> watch 70
"70 o'clock and all's well."

- The 'watch' function can be defined using pattern matching. For example:

watch :: Int -> [Char] -- [Char] can be replaced with String
watch 7 = "7 o'clock and... SHARNADO!!!!"
watch n = show n ++ " o'clock and all's well." -- The 'show' function converts 'n' to a String

- We can reduce a small amount of redundancy by using a 'where' expression. For example:

watch :: Int -> [Char] -- [Char] can be replaced with String
watch n = show n ++ " o'clock and" ++ message n
          where message 7 = "... SHARKNADO!"
                message _ = " all's well."

- In a 'where' statement, a local function is created, that is only accessible to the parent / main function.

- Another way to define 'watch' is through a case statement; which is like a switch statement in 'C' or...
... Java. For example:

watch :: Int -> [Char] -- [Char] can be replaced with String
watch n = show n ++ " o'clock and" ++ case n of 7 -> "... SHARKNADO!"
                                                _ -> " all's well."

- A case statement is sort of like pattern matching, where you list all the cases and a result to go along...
... with it. However, with case statements, you can check for equality and ordering and other things. Also, to...
... recap, an underscore matches everything, hence it is the last statement. 

- The next function calculates acceleration due to gravity at distance 'r' from the center of the...
... Earth. Here it is:

gravity :: (Fractional a) => a -> a
gravity r = 6.674e-11 * 5.972e24 / (r ^ 2)

- The first number (6.674e-11) is the universal gravitational constant. The second number (5.972e24) is the...
... mass of the Earth. Upon passing the radius of the Earth (in meters) as an argument, we get the force of...
... gravity. For example:

*Main> gravity 6371000
9.819532032815959

- We can make the function more clear and easy to understand by using a let expression. For example:

gravity :: (Fractional a) => a -> a
gravity r = let
    gravitationalConstant = 6.674e-11
    massOfEarth = 5.972e24
    radiusDivideBy2 = r / 2
  in gravitationalConstant * massOfEarth / radiusDivideBy2

- The advantage of using 'let' statements is that the variables within the let statement are only locally...
... available; they do not exist outside the function. Since good names are hard to come by, it's better to...
... define things as locally as possible. 

- A definition (pattern matching) looks like this:

pattern = result
...

- It's okay to list several different patterns involving the function name, as we did with 'increasing'. The...
... pattern should be exhaustive so nothing slips through the cracks. Hence, it's a good idea to have the 
... last pattern match everything. 

- A Guard expression looks like this:

pattern
    | expression = result
    ...
    | otherwise  = result 

- The 'otherwise' clause isn't required but it's a good idea to make sure that the rule is exhaustive.

- A 'where' clause can only be used inside a definition/function, and cannot be nested. It looks like this: 

result where
pattern = result
...

- A 'let' expression can be used anywhere and can be nested. A 'let' expression looks like this:

let pattern = result
    ...
in result

- A 'case' expression looks like this: 

case expression of pattern -> result
                   ...

- Haskell cares about indentation. Corresponding parts should be indented to the same level, and subordinate...
... parts should be indented further. For example, this is okay:

something x = let
    a = b
    b = c
    c = x
  in a

- But this is NOT okay:

something x = let
    a = b
b = c
    c = x
  in a

- Furthermore, use spaces to indent; NOT tabs!!!

==========================
HASKELL 4: FUNCTION SYNTAX
==========================

-}

myHead :: [a] -> a
myHead (x:xs) = x
myHead _      = error "Empty List"

myTail :: [a] -> [a]
myTail (x:xs) = xs
myTail _      = error "Empty List"

myLast :: [a] -> a
myLast [x]    = x
myLast (x:xs) = myLast xs
myLast _      = error "No Pattern"

myInit :: [a] -> [a]
myInit [x]    = []
myInit (x:xs) = x : myInit xs
myInit _      = []

isDecreasing1 :: (Eq a, Ord a) => [a] -> Bool
isDecreasing1 xs = if null [] 
                   then True 
                   else if tail xs == [] 
                        then True 
                        else if head xs >= head (tail xs) 
                             then isDecreasing1 (tail xs) 
                             else False

isDecreasing2 :: (Ord a) => [a] -> Bool
isDecreasing2 []       = True
isDecreasing2 [x]      = True
isDecreasing2 (x:y:ys) = x >= y && isDecreasing2 (y:ys)

isDecreasing3 :: (Ord a) => [a] -> Bool
isDecreasing3 (x:y:ys) = x >= y && isDecreasing3 (y:ys)
isDecreasing3 _        = True

isDecreasing4 :: (Eq a, Ord a) => [a] -> Bool
isDecreasing4 xs
    | null xs                   = True
    | tail xs == []             = True
    | head xs >= head (tail xs) = isDecreasing4 (tail xs)
    | otherwise                 = False 

isDecreasing5 :: (Ord a) => [a] -> Bool
isDecreasing5 [] = True
isDecreasing5 [x] = True
isDecreasing5 (x:y:ys)
    | x >= y    = isDecreasing5 (y:ys)
    | otherwise = False

isDecreasing6 :: (Ord a) => [a] -> Bool
isDecreasing6 [] = True
isDecreasing6 [x] = True
isDecreasing6 (x:y:ys) = result
    where 
        result = x >= y && isDecreasing3 (y:ys)

isDecreasing7 :: (Ord a) => [a] -> Bool
isDecreasing7 xs = a
    where x    = head xs
          y    = tail xs
          z    = head y
          a = x >= z && isDecreasing7 y

isDecreasing8 :: (Ord a) => [a] -> Bool
isDecreasing8 [] = True
isDecreasing8 [x] = True
isDecreasing8 (x:y:ys) = let
    result = x >= y && isDecreasing8 (y:ys)
  in result

isDecreasing9 :: (Ord a) => [a] -> Bool
isDecreasing9 [] = True
isDecreasing9 [x] = True
isDecreasing9 xs = let 
    heads = head xs
    tails = tail xs
    heads2 = head (tails)
  in (heads >= heads2 && isDecreasing9 tails)

isDecreasing10 :: (Ord a) => [a] -> Bool
isDecreasing10 xs = case xs of []  -> True
                               [x] -> True
                               ans -> True
                                    where 
                                        x   = head xs
                                        y   = tail xs
                                        z   = head y
                                        ans = x >= z && isDecreasing10 y 

monthIfElse :: Int -> String
monthIfElse x = 
    if x == 1 then "Jan" else 
    if x == 2  then "Feb"  else 
    if x == 3  then "Mar"  else 
    if x == 4  then "Apr"  else 
    if x == 5  then "May"  else 
    if x == 6  then "June" else 
    if x == 7  then "July" else 
    if x == 8  then "Aug"  else 
    if x == 9  then "Sept" else
    if x == 10 then "Oct"  else
    if x == 11 then "Nov"  else
    if x == 12 then "Dec"  else 
    "Not A Valid Month!!"

monthPatternMatch :: Int -> String
monthPatternMatch 1  = "January"
monthPatternMatch 2  = "February"
monthPatternMatch 3  = "March"
monthPatternMatch 4  = "April"
monthPatternMatch 5  = "May"
monthPatternMatch 6  = "June"
monthPatternMatch 7  = "July"
monthPatternMatch 8  = "August"
monthPatternMatch 9  = "September"
monthPatternMatch 10 = "October"
monthPatternMatch 11 = "November"
monthPatternMatch 12 = "December"
monthPatternMatch _  = "Not A Month"

monthGuards :: Int -> String
monthGuards x
    | x == 1    = "January"
    | x == 2    = "February"
    | x == 3    = "March"
    | x == 4    = "April"
    | x == 5    = "May"
    | x == 6    = "June"
    | x == 7    = "July"
    | x == 8    = "August"
    | x == 9    = "September"
    | x == 10   = "October"
    | x == 11   = "November"
    | x == 12   = "December"
    | otherwise = "Not A Month"

monthCaseExp :: Int -> String
monthCaseExp x = case x of 1  -> "January"
                           2  -> "February"
                           3  -> "March"
                           4  -> "April"
                           5  -> "May"
                           6  -> "June"
                           7  -> "July"
                           8  -> "August"
                           9  -> "September"
                           10 -> "October"
                           11 -> "November"
                           12 -> "December"
                           _  -> "Not A Valid Month"

f1 x = x

removeElementIfElse :: (Eq a) => a -> [a] -> [a] 
removeElementIfElse _ []     = []
removeElementIfElse x (y:ys) = if x == y then removeElementIfElse x ys else y : removeElementIfElse x ys

removeElementGuards :: (Eq a) => a -> [a] -> [a] 
removeElementGuards _ [] = []
removeElementGuards x (y:ys)
    | x == y    = removeElementGuards x ys
    | otherwise = y : removeElementGuards x ys

toLowerCaseA :: [Char] -> [Char]
toLowerCaseA [] = []
toLowerCaseA (x:xs) =
    if x == 'A' then 'a' : toLowerCaseA xs else x : toLowerCaseA xs

toLowerCaseB :: [Char] -> [Char]
toLowerCaseB [] = []
toLowerCaseB (x:xs) =
    if x == 'B' then 'b' : toLowerCaseB xs else x : toLowerCaseB xs

toLowerCaseC :: [Char] -> [Char]
toLowerCaseC [] = []
toLowerCaseC (x:xs) =
    if x == 'C' then 'c' : toLowerCaseC xs else x : toLowerCaseC xs

toLowerCaseD :: [Char] -> [Char]
toLowerCaseD [] = []
toLowerCaseD (x:xs) =
    if x == 'D' then 'd' : toLowerCaseD xs else x : toLowerCaseD xs

toLowerCaseE :: [Char] -> [Char]
toLowerCaseE [] = []
toLowerCaseE (x:xs) =
    if x == 'E' then 'e' : toLowerCaseE xs else x : toLowerCaseE xs

toLowerCaseF :: [Char] -> [Char]
toLowerCaseF [] = []
toLowerCaseF (x:xs) =
    if x == 'F' then 'f' : toLowerCaseF xs else x : toLowerCaseF xs
    
toLowerCaseG :: [Char] -> [Char]
toLowerCaseG [] = []
toLowerCaseG (x:xs) =
    if x == 'G' then 'g' : toLowerCaseG xs else x : toLowerCaseG xs
    
toLowerCaseH :: [Char] -> [Char]
toLowerCaseH [] = []
toLowerCaseH (x:xs) =
    if x == 'H' then 'h' : toLowerCaseH xs else x : toLowerCaseH xs

toLowerCaseI :: [Char] -> [Char]
toLowerCaseI [] = []
toLowerCaseI (x:xs) =
    if x == 'I' then 'i' : toLowerCaseI xs else x : toLowerCaseI xs
    
toLowerCaseJ :: [Char] -> [Char]
toLowerCaseJ [] = []
toLowerCaseJ (x:xs) =
    if x == 'J' then 'j' : toLowerCaseJ xs else x : toLowerCaseJ xs

toLowerCaseK :: [Char] -> [Char]
toLowerCaseK [] = []
toLowerCaseK (x:xs) =
    if x == 'K' then 'k' : toLowerCaseK xs else x : toLowerCaseK xs
    
toLowerCaseL :: [Char] -> [Char]
toLowerCaseL [] = []
toLowerCaseL (x:xs) =
    if x == 'L' then 'l' : toLowerCaseL xs else x : toLowerCaseL xs
    
toLowerCaseM :: [Char] -> [Char]
toLowerCaseM [] = []
toLowerCaseM (x:xs) =
    if x == 'M' then 'm' : toLowerCaseM xs else x : toLowerCaseM xs
    
toLowerCaseN :: [Char] -> [Char]
toLowerCaseN [] = []
toLowerCaseN (x:xs) =
    if x == 'N' then 'n' : toLowerCaseN xs else x : toLowerCaseN xs
    
toLowerCaseO :: [Char] -> [Char]
toLowerCaseO [] = []
toLowerCaseO (x:xs) =
    if x == 'O' then 'o' : toLowerCaseO xs else x : toLowerCaseO xs

toLowerCaseP :: [Char] -> [Char]
toLowerCaseP [] = []
toLowerCaseP (x:xs) =
    if x == 'P' then 'p' : toLowerCaseP xs else x : toLowerCaseP xs
    
toLowerCaseQ :: [Char] -> [Char]
toLowerCaseQ [] = []
toLowerCaseQ (x:xs) =
    if x == 'Q' then 'q' : toLowerCaseQ xs else x : toLowerCaseQ xs
    
toLowerCaseR :: [Char] -> [Char]
toLowerCaseR [] = []
toLowerCaseR (x:xs) =
    if x == 'R' then 'r' : toLowerCaseR xs else x : toLowerCaseR xs
    
toLowerCaseS :: [Char] -> [Char]
toLowerCaseS [] = []
toLowerCaseS (x:xs) =
    if x == 'S' then 's' : toLowerCaseS xs else x : toLowerCaseS xs
    
toLowerCaseT :: [Char] -> [Char]
toLowerCaseT [] = []
toLowerCaseT (x:xs) =
    if x == 'T' then 't' : toLowerCaseT xs else x : toLowerCaseT xs
    
toLowerCaseU :: [Char] -> [Char]
toLowerCaseU [] = []
toLowerCaseU (x:xs) =
    if x == 'U' then 'u' : toLowerCaseU xs else x : toLowerCaseU xs
    
toLowerCaseV :: [Char] -> [Char]
toLowerCaseV [] = []
toLowerCaseV (x:xs) =
    if x == 'V' then 'v' : toLowerCaseV xs else x : toLowerCaseV xs
    
toLowerCaseW :: [Char] -> [Char]
toLowerCaseW [] = []
toLowerCaseW (x:xs) =
    if x == 'W' then 'w' : toLowerCaseW xs else x : toLowerCaseW xs
    
toLowerCaseX :: [Char] -> [Char]
toLowerCaseX [] = []
toLowerCaseX (x:xs) =
    if x == 'X' then 'x' : toLowerCaseX xs else x : toLowerCaseX xs
    
toLowerCaseY :: [Char] -> [Char]
toLowerCaseY [] = []
toLowerCaseY (x:xs) =
    if x == 'Y' then 'y' : toLowerCaseY xs else x : toLowerCaseY xs
    
toLowerCaseZ :: [Char] -> [Char]
toLowerCaseZ [] = []
toLowerCaseZ (x:xs) =
    if x == 'Z' then 'z' : toLowerCaseZ xs else x : toLowerCaseZ xs

toLowerCaseIfElseLet :: [Char] -> [Char]
toLowerCaseIfElseLet xs = let
    lowerA = toLowerCaseA xs
    lowerB = toLowerCaseB lowerA
    lowerC = toLowerCaseC lowerB
    lowerD = toLowerCaseD lowerC
    lowerE = toLowerCaseE lowerD
    lowerF = toLowerCaseF lowerE
    lowerG = toLowerCaseG lowerF
    lowerH = toLowerCaseH lowerG
    lowerI = toLowerCaseI lowerH
    lowerJ = toLowerCaseJ lowerI
    lowerK = toLowerCaseK lowerJ
    lowerL = toLowerCaseL lowerK
    lowerM = toLowerCaseM lowerL
    lowerN = toLowerCaseN lowerM
    lowerO = toLowerCaseO lowerN
    lowerP = toLowerCaseP lowerO
    lowerQ = toLowerCaseQ lowerP
    lowerR = toLowerCaseR lowerQ
    lowerS = toLowerCaseS lowerR
    lowerT = toLowerCaseT lowerS
    lowerU = toLowerCaseU lowerT
    lowerV = toLowerCaseV lowerU
    lowerW = toLowerCaseW lowerV
    lowerX = toLowerCaseX lowerW
    lowerY = toLowerCaseY lowerX
    lowerZ = toLowerCaseZ lowerY
  in lowerZ

f2 x = x

toLowerCaseIfElse2 :: [Char] -> [Char]
toLowerCaseIfElse2 xs = toLowerCaseA $ toLowerCaseB $ toLowerCaseC $ toLowerCaseD $ toLowerCaseE $ toLowerCaseF $ 
                        toLowerCaseG $ toLowerCaseH $ toLowerCaseI $ toLowerCaseJ $ toLowerCaseK $ toLowerCaseL $ 
                        toLowerCaseM $ toLowerCaseN $ toLowerCaseO $ toLowerCaseP $ toLowerCaseQ $ toLowerCaseR $ 
                        toLowerCaseS $ toLowerCaseT $ toLowerCaseU $ toLowerCaseV $ toLowerCaseW $ toLowerCaseX $ 
                        toLowerCaseY $ toLowerCaseZ $ xs

toLowerCasePatternMatching :: Char -> Char
toLowerCasePatternMatching 'A' = 'a'
toLowerCasePatternMatching 'B' = 'b'
toLowerCasePatternMatching 'C' = 'c'
toLowerCasePatternMatching 'D' = 'd'
toLowerCasePatternMatching 'E' = 'e'
toLowerCasePatternMatching 'F' = 'f'
toLowerCasePatternMatching 'G' = 'g'
toLowerCasePatternMatching 'H' = 'h'
toLowerCasePatternMatching 'I' = 'i'
toLowerCasePatternMatching 'J' = 'j'
toLowerCasePatternMatching 'K' = 'k'
toLowerCasePatternMatching 'L' = 'l'
toLowerCasePatternMatching 'M' = 'm'
toLowerCasePatternMatching 'N' = 'n'
toLowerCasePatternMatching 'O' = 'o'
toLowerCasePatternMatching 'P' = 'p'
toLowerCasePatternMatching 'Q' = 'q'
toLowerCasePatternMatching 'R' = 'r'
toLowerCasePatternMatching 'S' = 's'
toLowerCasePatternMatching 'T' = 't'
toLowerCasePatternMatching 'U' = 'u'
toLowerCasePatternMatching 'V' = 'v'
toLowerCasePatternMatching 'W' = 'w'
toLowerCasePatternMatching 'X' = 'x'
toLowerCasePatternMatching 'Y' = 'y'
toLowerCasePatternMatching 'Z' = 'z'
toLowerCasePatternMatching   x = x
 
toLowerCasePattern :: [Char] -> [Char]
toLowerCasePattern []     = []
toLowerCasePattern (x:xs) = toLowerCasePatternMatching x : toLowerCasePattern xs
 
toLowerCaseWithGuards :: Char -> Char
toLowerCaseWithGuards x
    | x == 'A' = 'a' | x == 'B' = 'b' | x == 'C' = 'c'
    | x == 'D' = 'd' | x == 'E' = 'e' | x == 'F' = 'f'
    | x == 'G' = 'g' | x == 'H' = 'h' | x == 'I' = 'i'
    | x == 'J' = 'j' | x == 'K' = 'k' | x == 'L' = 'l'
    | x == 'M' = 'm' | x == 'N' = 'n' | x == 'O' = 'o'
    | x == 'P' = 'p' | x == 'Q' = 'q' | x == 'R' = 'r' 
    | x == 'S' = 's' | x == 'T' = 't' | x == 'U' = 'u' 
    | x == 'V' = 'v' | x == 'W' = 'w' | x == 'X' = 'x'
    | x == 'Y' = 'y' | x == 'Z' = 'z' | otherwise = x

toLowerCaseGuards :: [Char] -> [Char]
toLowerCaseGuards []     = []
toLowerCaseGuards (x:xs) = toLowerCaseWithGuards x : toLowerCaseGuards xs         

toLowerCaseExp :: Char -> Char
toLowerCaseExp x = case x of 'A' -> 'a'
                             'B' -> 'b'
                             'C' -> 'c'
                             'D' -> 'd'
                             'E' -> 'e'
                             'F' -> 'f'
                             'G' -> 'g'
                             'H' -> 'h'
                             'I' -> 'i'
                             'J' -> 'j'
                             'K' -> 'k'
                             'L' -> 'l'
                             'M' -> 'm'
                             'N' -> 'n'
                             'O' -> 'o'
                             'P' -> 'p'
                             'Q' -> 'q'
                             'R' -> 'r'
                             'S' -> 's'
                             'T' -> 't'
                             'U' -> 'u'
                             'V' -> 'v'
                             'W' -> 'w'
                             'X' -> 'x'
                             'Y' -> 'y'
                             'Z' -> 'z'
                             _   -> x

f3 x = x

toLowerCaseExpe :: [Char] -> [Char]
toLowerCaseExpe []     = []
toLowerCaseExpe (x:xs) = toLowerCaseExp x : toLowerCaseExpe xs

putSpacesInText :: [Char] -> [Char]
putSpacesInText []     = []
putSpacesInText (x:xs) = let
    spce = x : " "
    list = spce ++ putSpacesInText xs
    rest = list
  in rest 

f4 x = x

monthToNum :: String -> String
monthToNum xs = let
    takeTre = take 3 xs
    toLower = toLowerCasePattern takeTre
    pattern = case toLower of "jan" -> 1
                              "feb" -> 2
                              "mar" -> 3
                              "apr" -> 4
                              "may" -> 5
                              "jun" -> 6
                              "jul" -> 7
                              "aug" -> 8
                              "sep" -> 9
                              "oct" -> 10
                              "nov" -> 11
                              "dec" -> 12
                              _     -> 0
    
    middle = if (pattern == 0) then " NOT a" else (" the " ++ (show pattern) ++ ordinal)
        where 
            ordinal
                | pattern == 1    = "st"
                | pattern == 2    = "nd"
                | pattern == 3    = "rd"
                | otherwise       = "th"
  
  in "This is" ++ middle ++ " month"

f5 x = x

rightTriangle :: (Floating a, Num a, Show a) => a -> a -> [Char]
rightTriangle a b = let 
    aSquared = a ^ 2
    bSquared = b ^ 2
    aPlusB = aSquared + bSquared
    hypotenuse = sqrt aPlusB
  in "The hypotenuse is " ++ show hypotenuse

f6 x = x

quadraticRoot :: (Ord a, Eq a, Floating a, Num a) => a -> a -> a -> ([String],[a])
quadraticRoot a b c = if (b ^ 2 - 4 * a * c) < 0 then (["There Are NO Real Roots"],[]) else calculateRoots
    where
        calculateRoots = let
            discrim = sqrt $ b ^ 2 - 4 * a * c
            rootOne = ((-b) + discrim) / (2 * a)
            rootTwo = ((-b) - discrim) / (2 * a)
            roots   = if rootOne == rootTwo then [rootOne] else [rootOne,rootTwo]
            message = if (length roots) == 1 then "There Is ONE Real Root" else "There Are Two Real Roots"
          in ([message],roots)

f7 x =x

{-

====================
HASKELL 5: RECURSION
====================

- A recursive function is one that calls itself. This is a powerful technique for solving problems in terms...
... of easier problems. A recursive function has one or more (at least one) base cases, also known as...
... edge conditions, and one or more recursive cases (once again, at least one). The base cases are easy...
... problems that can be solved directly. The recursive cases are problems that can be solved using the...
... solutions to slightly easier problems. Here are a few examples of recursive functions (from Prelude):

recLength :: [a] -> Int
recLength []     = 0 -- This is the base case / edge condition. If the list is empty, the length is 0
recLength (_:xs) = 1 + recLength xs -- This is the recursive list. The length of the list is 1 + the length...
... of the tail of the list. Finding the length of the tail is easier because its closer to the base case.

recSum :: (Num a) => [a] -> a
recSum []     = 0 -- Base case
recSum (x:xs) = x + recSum xs -- Recursive case; head of the list plus the tail of the list

recProduct :: (Num a) => [a] -> a
recProduct []     = 1 -- Base case
recProduct (x:xs) = x * recProduct xs -- Recursive case

- When dealing with lists and recursion, the base case is the empty list. The recursive case involves the...
-- ... function calling itself on the tail of the list. This process repeats until the base case is reached.   

recMaximum :: (Ord a) => [a] -> a
--recMaximum []   = error "Empty List"
recMaximum [x]  = x -- Base case
recMaximum (x:xs)
    | x > mx    = x
    | otherwise = mx
    where mx = recMaximum xs -- The recursive case. It finds the maximum of the tail of the list, and then...
    -- ... compares that to the first item. Eventually, once the list is exhausted, the maximum value will...
    -- ... be inside the list and then extracted out and printed to the screen.

- Trying to find the maximum of the empty list results in an error message. For example:

*Main> recMaximum []
*** Exception: /Users/Chowdhaj/Desktop/prac3.hs:(1697,1)-(1701,28): Non-exhaustive patterns in function recMaximum

- It doesn't make sense to take the maximum of an empty list, because there are no elements in it. However, we...
... can give it our own custom error message, using: recMaximum [] = error "Empty List". Passing [] as an...
... argument will yield:

*Main> recMaximum []
*** Exception: Empty List
CallStack (from HasCallStack):
  error, called at /Users/Chowdhaj/Desktop/prac3.hs:1673:19 in main:Main

- Tip: Comment your code whenever possible. It'll help organize it and provide useful documentation for...
... future reference. Comments are made using a double dash. For example 

-- This is a comment
-- Another one!

{-
This
Is
A
Multi-
line
Comment
-}

- Tip: The special value 'it' returns the last expression evaluated. For example:

*Main> 5 +5
10

*Main> it
10

*Main> it
10

*Main> 5 == 5
True

*Main> it
True

*Main> it
True 

====================
HASKELL 5: RECURSION
====================

-}

cyclez :: [a] -> [a]
cyclez xs = xs ++ cyclez xs

drops :: Int -> [a] -> [a]
drops 0 xs     = xs
drops _ []     = []
drops n (x:xs) = drops (n - 1) xs

dropAll :: (a -> Bool) -> [a] -> [a]
dropAll _ []     = [] 
dropAll f (x:xs) = if f x then dropAll f xs else x : dropAll f xs

dropWhilez :: (a -> Bool) -> [a] -> [a]
dropWhilez _ []     = []
dropWhilez f (x:xs) = if f x then dropWhilez f xs else (x:xs)

filterz :: (a -> Bool) -> [a] -> [a]
filterz _ []     = []
filterz f (x:xs) = if f x then x : filterz f xs else filterz f xs

mappy :: (a -> b) -> [a] -> [b]
mappy f (x:xs) = f x : mappy f xs

repeatz :: a -> [a]
repeatz x = x : repeatz x

replica :: Int -> a -> [a]
replica 0 xs = []
replica x xs = xs : replica (x - 1) xs

replicateAndJoinLists :: Int -> [a] -> [a]
replicateAndJoinLists _ [] = []
replicateAndJoinLists 0 xs = xs
replicateAndJoinLists x xs = xs ++ replicateAndJoinLists (x - 1) xs

reversz :: [a] -> [a]
reversz []     = []
reversz (x:xs) = (reversz xs) ++ [x]

splitAts :: Int -> [a] -> ([a],[a])
splitAts _ []       = ([],[])
splitAts n xs = (take n xs, drop n xs) -- OR: (takes n xs, drops n xs)

takes :: Int -> [a] -> [a]
takes 0 _ = []
takes n (x:xs) = x : takes (n - 1) xs

takeAll :: (a -> Bool) -> [a] -> [a]
takeAll _ [] = []
takeAll n (x:xs) = if n x then x : takeAll n xs else takeAll n xs

takeWhilez :: (a -> Bool) -> [a] -> [a]
takeWhilez f (x:xs) = if f x then x : takeWhilez f xs else []

unzippy :: [(a,b)] -> ([a],[b])
unzippy xs = (fs,sd)
    where
        fs = [fst x | x <- xs]
        sd = [snd x | x <- xs]

threeTupleList = [(1,'A','a'),(2,'B','b'),(3,'C','c'),(4,'D','d'),(5,'E','e'),(6,'F','f'),(7,'G','g'),
    (8,'H','h'),(9,'I','i'),(10,'J','j')]

unzippy3 :: [(a,b,c)] -> ([a],[b],[c])
unzippy3 xs = (fs,md,ls)
    where
        fs = [fst3 x | x <- xs]
        md = [mid3 x | x <- xs]
        ls = [lst3 x | x <- xs]

zippy :: [a] -> [b] -> [(a,b)]
zippy _ []          = []
zippy [] _          = []
zippy (x:xs) (y:ys) = (x,y) : zippy xs ys

zippy3 :: [a] -> [b] -> [c] -> [(a,b,c)]
zippy3 [] _ _               = []
zippy3 _ [] _               = []
zippy3 _ _ []               = []
zippy3 (x:xs) (y:ys) (z:zs) = (x,y,z) : zippy3 xs ys zs

{-

==================================
HASKELL 6a: HIGHER ORDER FUNCTIONS
==================================

- Here's a nice and simple function: 

add1 :: Int -> Int
add1 x = x + 1

- The function above takes an Int and returns an Int (adds one to the argument). In Functional Languages, we...
... aren't limited to passing data types such as Int, Char, Double, etc., we can even accept and return other...
... functions. Functions that pass other functions as values are said to have First-Class functions. For...
... example, here's a function that takes another function as an argument:

f :: (Int -> Int) -> Int
f x = 3 -- Ignores its argument and (always) returns 3

- Here's a function that returns a function:

g :: Int -> (Int -> Int)
g x = add1 -- Ignores its arguments and returns the function 'add1' everytime

- These two simple functions ('f' and 'g') serve as examples of higher-order functions; functions that...
... acccept or return other functions

- A much more useful higher-order function is 'map', which takes a function, and a list, and applies the...
... function to each element in the list. For example:

Prelude> map (+1) [1,1,1]
[2,2,2] -- 1 was added to every single item in [1,1,1], hence [2,2,2] was returned

- We can define our own function to increment each element in a list by one. For example:

addOne :: (Num a) => [a] -> [a]
addOne [] = []
addOne (x:xs) = x + 1 : addOne xs

- Map makes this much easier by separating the processing of the list from the action being performed on each...
... element. By capturing a common pattern of computation, 'map' lets us avoid a lot of redundant code. For...
... instance, we don't need to define separate functions for 'addOne', 'minusOne', 'squareEachValue', etc.

- Consider the following function:

h :: Int -> Int -> Int
h x y = x + y

- You might think that 'h' takes two Ints and returns a third one. However, this is incorrect. In reality, 'h'...
... takes an Int and returns a function that in turn takes an Int and returns an Int. Consider this:

*Main> h 3 4
7

*Main> (h 3) 4
7

- This looks a little odd because it appears as if only one argument is being applied to 'h'. In reality, it...
... looks more like this:

h 3 4 --> h 3 --> ((h 3) 4)

- Even though we can't print 'h 3' to the screen:

*Main> h 3

<interactive>:18:1: error:
    • No instance for (Show (Int -> Int)) arising from a use of ‘print’
        (maybe you haven't applied a function to enough arguments?)
    • In a stmt of an interactive GHCi command: print it

- We can still assign it to functions/values. For example:

*Main> let x = h 3
*Main> x 4
7

- The function 'x' is a partially applied function of 'h 3'. Any Haskell function that takes multiple...
... arguments can be partially applied this way. For example:

*Main> map (max 3) [1..5]
[3,3,3,4,5]

- In this case, we partially apply the 'max' function to 3 and its argument. The argument is the list. Every...
... function in Haskell takes one argument and returns one value. For example:

sums :: Int -> Int -> Int -> Int
sums a b c = a + b + c

- When we type 'sums a b c', what we're really asking for is (((sums a) b) c), and the type signature can...
... be rewritten like this: sums :: Int -> (Int -> (Int -> Int)) - but is not required because Haskell...
... allows us to leave out the applied parenthesis in both the type signature and function application

- Functions that are broken down like the one above, are curried. Currying is possible in all Functional...
... languages, but is default in Haskell; in Haskell, all functions are curried. Infix operators are also...
... curried. Conveniently, we can supply either of the two arguments. For example:

*Main> map (10/) [1..5]
[10.0,5.0,3.3333333333333335,2.5,2.0]

*Main> map (/10) [1..5]
[0.1,0.2,0.3,0.4,0.5]

- The map function is built into Haskell - included in Prelude - but, it can be defined like this:

map2 :: (a -> b) -> [a] -> [b]
map2 _ []     = []
map2 f (x:xs) = f x : map2 f xs

- Beacuse 'map' is curried, it takes a function from 'a' to 'b' and returns a function from a list of 'a' to...
... a list of 'b'. It's easier to imagine that it takes two arguments, a function and a list, and returns a...
... a list. We can partially apply 'map', if we really wanted to.

- Suppose we have two lists that we wan't to combine with some function. The higher order function...
... 'zipWith', makes this effortless. For example:

*Main> zipWith (+) [1..5] [5..10]
[6,8,10,12,14]

*Main> zipWith (*) [1..5] [5..10]
[5,12,21,32,45]

- To get a function that's just like an existing one, but with the arguments in the opposite order, use...
... 'flip'. For example:

from :: Int -> Int -> Int
from = flip (-) -- This says that 'from' is the result of flipping the subtraction operator

*Main> from 5 8
3 -- 8 - 5 = 3

*Main> from 8 5
-3 -- 5 - 8 = -3

- The 'filter' function takes a function and a list and returns a list for which the function returns...
... True. It's kind of like applying 'dropWhile' on the ENTIRE list. For example:

*Main> filter (==0) [0,0,0,1,1,1,0,0,2,2,0]
[0,0,0,0,0,0]

*Main> filter (>1) [0,0,0,1,1,1,0,0,2,2,0]
[2,2]

- The 'takeWhile' function takes a function and a list and returns the beginning of the list, stopping when...
... it finds something that doesn't satisfy the function. It's identical to 'dropWhile', but instead...
... it returns the elements in a list. For example:

*Main> takeWhile (==0) [0,0,0,1,1,1,0,0,2,2,0,0]
[0,0,0]

*Main> takeWhile (==1) [0,0,0,1,1,1,0,0,2,2,0,0]
[]

- Note: 'takeWhile' and 'dropWhile' only work on the front of the list, hence making them great for removing...
... or extracting trails of numbers

- Higher-order functions are enormously powerful

==================================
HASKELL 6a: HIGHER ORDER FUNCTIONS
==================================

-}

-- define map, define alternatives of map, make type signatures with parenthesis, partially applied map, 
-- recreate zipWith & filter & takeWhile
