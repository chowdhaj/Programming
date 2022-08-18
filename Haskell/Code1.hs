-- Haskell Tutorials By John John [Practice]
-- https://www.youtube.com/watch?v=e2IrZUF2MeI

inc x = x + 1 -- This increments a value by 1
dec x = x - 1 -- This decrements a value by 1
dub x = x * 2 -- This multiples a value by 2

increment :: Int -> Int
increment x = inc x

md x y = mod x y -- Returns the remainder when 'x' is divided by 'y'. [i.e.: 2 `mod` 10 == 0]
md2 :: Int -> Int -> Int
md2 x y = x `mod` y -- This is an infix function. See below for more.

addOne :: Int -> Int
addOne x = if even (x) then x + 1 else x - 1 -- If the number is even then add one, else subtract 1

--cubeRoot :: Float -> Float -- Can also define type this way... 
cubeRoot :: (Ord a, Floating a) => a -> a
cubeRoot x = if x > 0 then x ** (1/3) else negate ((abs x) ** (1/3)) -- Calculates cube root of a number

emp :: Eq a => [a] -> Bool -- Tests for equality, hence the 'Eq'
emp xs = if xs == [] then True else False  -- Returns True if the list is empty, otherwise False

lst = ['a', 'b', 'c', 'd', 'e', 'f'] -- Creates a list of Chars. Read as [Char]
num = [1, 2, 3, 4, 5, 6, 7] -- Creates a list of numbers. Read as [Integer], unless specified in type signature

hed = head lst -- head returns the first item in a list
tai = tail lst -- tail returns every item but the first item in a list
ini = init lst -- init returns every item but the last item in a list

pos :: Int -> Char
pos x = lst !! x -- Returns the 'x'th element in the list. Also, counting starts at 0
end x = num ++ [x] -- Adds 'x' to the end of the list
app x = x:num -- Adds 'x' to the beginning of a list. Notice how 'x' isn't inside []

len = length lst -- Returns the length of the list
isEmpty = null lst -- Returns True if the list is empty, otherwise False

rev :: [a] -> [a]
rev xs = reverse xs -- Returns the reverse of the list. [i.e.:'abc' becomes 'cba']

drp x = drop x lst -- Drops the first 'x' number of items in a list. [i.e. drop 2 xs will drop the first two items from the list]
drp2 :: Int -> [a] -> [a]
drp2 x xs = x `drop` xs -- Can be written as an infix function

tak x = take x lst -- Takes the first 'x' number of items in a list. [i.e. take 2 [1, 2, 3, 3] will return [1, 2]]
tak2 :: Int -> [a] -> [a]
tak2 x xs = x `take` xs -- Can be written as an infix function

ele x = elem x lst -- Returns True if 'x' is in the list, otherwise False
ele2 :: Char -> [Char] -> Bool
ele2 x xs = x `elem` xs -- Can be written as an infix function

-- Note: An infix function is when the function is between the arguments. [i.e. arg1 func_name arg 2]
-- Anything that takes two arguments can be written as an infix function

oneFive = [1..5] -- Creates a list from 1 to 5
oneNine = [1,3..9] -- Creates an odd numbered list from 1 to 9. List starts at 1, ends at 9, with stepsize of 2
oneTen = [2,4..10] -- Creates an even numbered list from 2 to 20. Stepsize = 2
infini = [1..] -- Creates an infinite list

inf = take 10 [1..] -- Takes the first 10 values from the infinite list
-- Because Haskell is a lazy language, it doesn't evaluate the infinite list and then takes 10 values...
-- Instead, it performs both operations side by side until completion

-- You can also add parameters to lists. Like so: 

-- This function generates a list from 1 to 100. Then, it filters the list; if 'x' divided by 2 doesn't return a...
-- ... remainder of 0, then that number is discarded. The resulting numbers are put in a list and printed to console
par = [x | x <- [1..100], mod x 2 == 0]

-- This function generates a list from 1 to 100, removes all even numbers. The remaining numbers are put into...
-- ... a list and multiplied by 3, and printed to console
par2 = [x * 3 | x <- [1..100], even x == False]
-- par2 = [return value | values for each variable, predicates/conditions]
-- return value == (x * 3)                  (((LAST)))
-- values for each variable == [1..100]     (((FIRST)))
-- condition == (even x == False)           (((SECOND)))
-- IMPORTANT: First the values are generated, then the condition is applied, and finally the return value

-- This function takes the first 'y' number of items from the infinite list. Each item in the infinity list is...
-- ... multiplied by 10 before being added to the final list where 'take y' can do its job
par3 :: Int -> [Int]
par3 y = take y [x * 10 | x <- [1..]]

-- You can even have two lists with two different variables, each with their own condition. For example:

-- Two lists are generated, and each element in list 'x' is multiplied by each element in list 'y'. For instance...
-- ... 2x1, 2x3, 2x5, then, 4x1, 4x3, 4x5, and so on and so forth
pars = [x * y | x <- [2,4,6], y <- [1,3,5]]

-- This takes two lists, and multiplies each element in list x, with each element in list y. Then...
-- ... it'll filter the list to make sure the elements can be evenly divided by 10. 
pars2 = [x * y | x <- [3,5,7], y <- [2,4,6], mod (x * y) 10 == 0]

-- A tuple is similar to a list, except that:
-- 1) A tuple does not have to be homogeneous like a list, it can be heterogeneous (store different types of data)
-- 2) Begins and ends with round brackets; lists begin and end with square brackets
-- 3) Cannot be appended to; items cannot be added to a tuple once created
-- 4) Must know amount of elements to be inserted into a tuple, before creating it; because point #3

-- This is how you create a tuple in Haskell
tup = ('a',2,'c',4)
tup2 = ('a','b')

-- When we write a function, the very first line is the function definition/signature. It tells...
-- ... us about its name, the type of function it is, and what it accepts
-- In plain english, 'dub2' takes an Int and returns an Int
dub2 :: Int -> Int -- This is the type of the function 'dub2'. It takes an Int, and returns an Int
dub2 x = x + x -- Returns the double of 'x'
-- You can find the type of a function or specific value by typing ":t function_name" in GHCi
-- For instance, if you type ":t dub2" in GHCi, you get "dub2 :: Num a => a -> a". This means that...
-- ... 'dub2' takes a number, and then returns a number
-- And, if you type ":t 4", you get "4 :: Num p => p", which means that 4 is a number
-- Note: If you specify a type, then the function will only expect that type. 'dub2' will no longer..
-- ... accept 2.0, now that it has a specific type of Int
-- Note: Haskell will cast up, but not down due to truncation. This means that it will convert...
-- ... a 2 to 2.0, but not vice versa, due to loss of accuracy.
-- Note: A string is a list of characters. If you type (:t "gold") in GHCi, you get ("gold" :: [Char]). This...
-- ... is because "gold" is just syntactic sugar for ['g','o','l','d']. Typing "gold" is easier than the latter

str :: String -> String -- OR you can write [Char] -> [Char] and it'll mean the same. See below
str x = x

str2 :: [Char] -> [Char] -- The real type of a 'String'
str2 x = x

-- This is an example of pattern matching. Based on the number passed, a certain phrase will be printed
lucky 1 = "1 Is Best"
lucky 3 = "Still Okay"
lucky 5 = "Important #"
lucky 7 = "Lucky Seven"
lucky x = "Not A Lucky Number" -- If 1, 3, 5, or 7 is not passed, this is printed

-- Implementing Haskell functions
-- The head function returns the first element in a list [i.e. head [1, 2] == 1]. Calling head...
-- ... on an empty list yields an error
heads :: [a] -> a -- Takes a list and returns a list. Though it should return Just A
heads []    = error "Empty list has no first element" -- This is the base case OR edge condition, incase an empty list is given
heads (x:_) = x -- 'xs' is the list and 'x' is the first item in the list. 'x' is printed out
-- 'heads' relies on pattern matching to function

-- This is the safeHead function
safeHead :: [a] -> Maybe a -- It takes a list of 'a' and (Maybe) returns 'a'
safeHead []    = Nothing -- Returns Nothing if an empty list is given
safeHead (x:_) = Just x -- Returns Just 'x', dropping 'xs'

-- This is the safeTail function
safeTail :: [a] -> Maybe [a] -- It takes a list of 'a' and (Maybe) returns a list of 'a'
safeTail []     = Nothing -- Returns Nothing if an empty list is given
safeTail (_:xs) = Just xs -- Returns Just 'xs', dropping 'x'

-- The tail function drops the first element in a list and returns the remaining elements
tails :: [a] -> [a] -- tails takes a list and returns a list
tails []     = [] -- This is the base case OR edge condition, incase an empty list is passed
tails [x]    = [x] -- If the list's length is 1, then nothing will be dropped
tails (_:xs) = xs -- 'x' is dropped and 'x' is returned
-- 'tails' also relies on pattern matching to function

-- The init function drops the last item in a list and returns the remaining list. For instance...
-- ... calling init on "hello" returns "hell"
inits :: [a] -> [a] -- Takes a list and returns a list
inits []      = [] -- Returns an empty list if an empty list is given
inits [_]     = [] -- Returns an empty list when only one item remains in the list
inits (x:xs)  = x:inits xs -- Removes 'x' from 'xs' until 'xs' only has one element in it; then returns the list of x's
-- Calling inits on [1,2,3] looks a little something like this:
{-
Prelude> inits [1, 2, 3]
1:inits [2, 3]
1:2:inits [3] <-- Only one item in remaining in list, hence, return the empty list
1:2 --> [1, 2]
-}

-- The last function returns the last item in  alist. For instance, calling last on [1, 2, 3] returns 3
lasts :: [a] -> a -- lasts takes a list and returns an element inside that list
lasts []     = error "Empty list has no last element" -- Throws an error when called on an empty list
lasts [x]    = x -- Returns 'x' when 'x' is the only element in the list
lasts (x:xs) = lasts xs -- Removes 'x' from 'xs' until 'xs' has only one element in it; then returns 'xs'
-- Calling lasts on [1, 2, 3] looks like this:
{-
Prelude> lasts [1, 2, 3]
1:[2, 3] --> [2, 3]
2:[3]    --> [3] 
3:[]     --> 3 
-}

-- The reverse function reverses the items in a list. For example, [1,2,3] becomes [3,2,1]
reverses :: [a] -> [a] -- Takes a list of 'a' and returns a list of 'a'
reverses [] = [] -- Reversing the empty list returns the empty list
reverses (x:xs) = xs ++ [x] -- Adds 'x' to the end of 'xs' 
-- Calling reverses on [1,2,4,5] looks like this:
{-
Prelude> reverses [1,2,4,5]
[2,4,5] ++ [1]
[4,5] ++ [2] ++ [1]
[5] ++ [4] ++ [2] ++ [1]
[] ++ [5] ++ [4] ++ [2] ++ [1]
[5,4,2,1]
-}

-- The replicate function is an INFIX function. It takes TWO values, a number, and something else, and...
-- ... multiplies the something else, 'n' number of times and puts it in a list
replicates :: Int -> a -> [a] -- Type: Takes an Int, an Element, and returns a list of the Element
replicates 0 _ = [] -- Returns an empty list if 0 is provided as 'n'
replicates n x = x:replicates (n - 1) x -- Recursively calls 'replicates' until...
--- ... 'x' is replicated 'n' number of times and in a list - then returned
-- Calling replicates 4 'a' looks like this:
{-
Prelude> replicates 4 'a'
'a':replicates (4-1) 'a' --> 'a':replicates 3 'a'
'a':'a':replicates (3-1) 'a' --> 'a':'a':replicates 2 'a'
'a':'a':'a':replicates (2-1) --> 'a':'a':'a':replicates 1 'a'
'a':'a':'a':'a':replicates (1-0) --> 'a':'a':'a':'a':replicates 0 'a'
'a':'a':'a':'a':replicates 0 --> 'a':'a':'a':'a':[] --> "aaaa" 

If you put this 'a':'a':'a':'a':[] into Haskell, it will return "aaaa", because the notation (x:y) is...
... how you append to the front of the list. Something like 1:[2] returns [1,2], and something like...
... 3:4:[5, 6, 7] returns [3,4,5,6,7]. Hence, 'a':'a':'a':'a':[]  returns "aaaa" because it tells Haskell...
... to add 'a' to the empty list, 4 times.

The empty list is extremely/hella powerful. It's like Superman and Batman combined...
... is the empty list. That's how good it is!!! This stuff is like Super Saiyan God. If the empty list...
... didn't exist, recursion, pattern matching, etc., would be very difficult, and maybe even impossible. 

[] acts as a base case so Haskell knows when to stop! If the empty list wasn't there, then...
... 'a':'a':'a':'a' would not work, because where would we store the values. Therefore, the...
... empty list is extremely important, powerful, and nescessary. 

Oh and, the empty list is POLYMORPHIC. It has many, many, many forms.
-}

-- The length function takes a list of [a] and returns the number of elements in list 'a'. For instance...
-- ... length [1,2,3,4] returns 4, because there are 4 elements inside the list
lengths :: [a] -> Int -- Takes a list of [a] and returns an Int
lengths []     = 0 -- If an empty list is supplied, zero is returned. This is the edge condition or base case
lengths (x:xs) = 1 + lengths xs -- 1 is recursively added to lengths xs until the empty list is reached
-- Calling lengths [1,2,3] looks like this:
{-
Prelude> lengths [1,2,3]
lengths (1:[2,3]) = 1 + lengths [2,3]
lengths (2:[3]) = 1 + 1 + lengths [3]
legnths (3:[]) = 1 + 1 + 1 + lengths []
lengths [] = 0 + 1 + 1 + 1 = 3
-}

-- This is the replicate function - using Guards. It has failsafes to prevent infinite loops when...
-- ... negative numbers are passed. Guards are somewhat similar to if-else statements
replicateGuard :: (Ord t, Num t) => t -> a -> [a] -- This says that 'replicateGuard' has a type of...
-- ... 't' and 'a', that returns a list of 'a', where 't' is an instance of Ord and Num
replicateGuard n x
  | n < 0     = error "Negative Number" -- Throws an error when a negative number is supplied
  | n == 0    = [] -- Returns the empty list when zero is supplied
  | otherwise = x:replicateGuard (n-1) x -- If a positive number is supplied, replicateGuard is...
  -- ... recursively called until 'n' equals 0, and the empty list is supplied

-- The type can also be written like this. This is simple and limits 't' to being an Int
replicateNegative :: Int -> a -> [a] -- Type: Takes an Int, 'a', and returns a list of 'a'
replicateNegative n x
  | n < 0     = x:replicateNegative (n+1) x -- If the number supplied is negative, it'll act as if it positive and add 1 to 'n'
  | n > 0     = x:replicateNegative (n-1) x -- Normal procedure for replicating
  | otherwise = error "Replicating Zero Times Won't Do Anything" -- Error message when 'n' is 0

-- This function mirrors the 'abs' function in Prelude. It takes a number and returns the absolute value of it
abso :: (Ord a, Num a) => a -> a -- 'abso' has a type of 'a' that returns an 'a', where 'a' is an instance of Ord and Num
abso x 
  | x < 0     = -(x) -- If 'x' is less than 0 then multiply it by negative
  | otherwise = x -- Else, return 'x'

-- This function returns the cube root of a floating point number
cubeMe :: (Floating a, Ord a) => a -> a -- 'cubMe' has a type of 'a' that returns 'a', where 'a' is an instance of Ord & Floating
cubeMe x
  | x < 0     = (abso x) ** (1/3) * (-1) -- If 'x' is less than zero, make it positive, find the cube root, then make it negative, and return
  | x == 0    = x -- If 'x' is 0, then return 0
  | otherwise = x ** (1/3) -- If 'x' is positive, apply the operations, and return the cube root

-- This function determines if a list is empty or not, and returns a corresponding Bool
nully :: Eq a => [a] -> Bool -- 'nully' has a type of a list of 'a' that returns a Bool, where 'a' is an instance of Eq
nully e 
  | e == []   = True -- If 'e' is equal to the empty list, return True
  | otherwise = False -- Else, return False

-- This function computes the factorial. It takes 'a' and returns 'a' where 'a' is an instance...
fuctorial :: (Ord a, Num a) => a -> a -- ... of Ord and Num
fuctorial n = if n > 0 then n * fuctorial (n-1) else 1 
-- If n is greater than 0, than recursively compute the factorial, else return 1
-- Calling this function looks a little something like this:
{-
Prelude> fuctorial 4
4 * fuctorial (4 - 1) --> 4 * fuctorial 3
4 * 3 * fuctorial (3 - 1) --> 4 * 3 * fuctorial 2
4 * 3 * 2 * fuctorial (2 - 1) --> 4 * 3 * 2 * fuctorial 1
4 * 3 * 2 * 1 * fuctorial (1 - 1) --> 4 * 3 * 2 * 1 * fuctorial 0
4 * 3 * 2 * 1 * 1 --> 24
-}

-- This function computes factorial, using guarded statements
fuctor :: (Eq a, Ord a, Num a) => a -> a -- Takes 'a' and returns 'a' where 'a' is an instance of Eq, Ord, & Num
fuctor n
  | n == 0    = 1 -- If 'n' is equal to 0 then return 1
  | otherwise = n * fuctor (n-1) -- Else recursively call the function and compute factorial

-- This function returns the product of all items in a list
prod :: (Num a) => [a] -> a -- Type: Takes a list of 'a', and returns 'a' where 'a' is an instance of Num
prod [] = 1 -- Product of the empty list is 1, because 1 is the identity of multiplication
prod (x:xs) = x * product xs -- Recursively multiplies 'x' by 'xs'

-- This function returns the sum of all items in a list
sume :: (Num a) => [a] -> a -- Type: Takes a list of 'a', and returns 'a' where 'a' is an instance of Num
sume [] = 0 -- Product of the empty list is 1, because 0 is the identity of addition
sume (x:xs) = x + sume xs -- Recursively adds 'x' to 'xs'

-- This function creates a list from 'x' to 'y' with all numbers between them
easyList :: Int -> Int -> [Int] -- Type: easyList has a type of two Ints, which return a list of Ints
easyList x y = [x..y] -- Where all the magic happens; creates the list
-- Calling easyList 5 10 will return [5,6,7,8,9,10]

-- Performs in the same manner as 'easyList' but has a case when 'y' is greater than 'x'
ezList :: (Enum a, Ord a) => a -> a -> [a] -- Takes two 'a's, and returns a list of 'a', where 'a' is an instance of Enum & Ord
ezList x y
  | x < y = [x..y] -- If 'x' is smaller than 'y' than return a list from 'x' to 'y'
  | x > y = [y..x] -- If 'x' is larger than 'y' than return a list from 'y' to 'x'

-- This function adds all the numbers between 'x' and 'y'
summation :: (Eq a, Ord a, Num a) => a -> a -> a -- Takes two 'a's and returns 'a', where 'a' is an instance of Eq, Ord, & Num
summation x y
  | x == y = x + y -- If 'x' is equal to 'y' then return 'x'
  | x < y  = x + summation (x + 1) y -- If 'x' is less than 'y' than add one to 'x' until it equals 'y'
  | x > y  = y + summation (y + 1) x -- If 'x' is greater than 'y' than add one to 'y' until it equals 'x'

-- The take function extracts the first 'n' number of items from a list
takes :: (Ord p, Num p) => p -> [a] -> [a] -- 'takes' has a type of 'p', list of 'a', and it returns a list of 'a', where 'p' is an instance of Ord and Num
takes n _
  | n <= 0 = [] -- This guarded statement checks if 'n' is less than or equal to 0 and returns an empty list
takes _ [] = [] -- If an empty list is supplied, an empty list is returned
takes n (x:xs) = x:takes(n-1) xs -- Recursively calls 'takes' and extracts the first 'n' items from 'xs' using pattern matching

-- The 'takeGuard' function acts identical to 'takes' except that it is made with only guarded statements
takeGuard :: (Eq a, Ord t, Num t) => t -> [a] -> [a] -- The type is the same as 'takes' with the addition of Eq (Equality Operator)
takeGuard n (x:xs)
  | n <= 0    = [] -- If 'n' is less than or equal to 0 then return an empty list
  | xs == []  = [] -- If 'xs' is an empty list then return an empty list
  | otherwise = x:takeGuard (n-1) xs -- Recursively call takeGuard until 'n' items have been extracted from 'xs'

-- This function is identical to 'takes' but it doesn't use any guarded statements, and relies strictly on pattern matching
takeNoGuards :: Int -> [a] -> [a] -- Type: Takes an Int, a list of 'a' and returns a list of 'a'. Notice how the type is different from 'takes'
takeNoGuards _ []     = [] -- If an empty list is supplied as 'xs', then return an empty list
takeNoGuards 0 _      = [] -- If 0 is passed as 'n', then return an empty list
takeNoGuards n (x:xs) = x:takeNoGuards (n-1) xs -- Using pattern matching and recursion, 'n' 'x''s are extracted from 'xs'

-- The repeat function takes an input [i.e. Char, Int, Etc.] and creates an infinite list out of it
repeats :: a -> [a] -- Type: Takes 'a' and returns a list of 'a'
repeats x = x:repeats x -- Recursively adds 'x' to a list forever
-- The repeat function can be used in conjunction with something like the take function...
-- ... For example: take 10 (repeat 4) --> [4,4,4,4,4,4,4,4,4,4]

{-
Instead of putting brackets around all the arguments, i.e.: take 20 (repeat 1), you can just...
... use a dollar sign. For example
Prelude> take 20 $ repeat 1
[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
-}

-- The 'elem' function checks if something is inside a list, and returns a Bool, appropriately
elems :: (Eq a) => a -> [a] -> Bool -- Takes 'a', a list of 'a' and returns a Bool; where 'a' is an instance of Eq
elems _ [] = False -- If an empty list is supplied, return False, because nothing will match
elems n (x:xs) 
  | n == x    = True -- If 'n' is equal to 'x', the first item in 'xs', then return True
  | otherwise =  elems n xs -- Else, recursively call elems on the rest of the list 'xs' 

-- This function returns how many times 'a' occurs in a list of 'a'
elem2 :: (Eq a) => a -> [a] -> Int
elem2 _ [] = 0
elem2 n (x:xs)
    | n == x = 1 + elem2 n xs
    | otherwise = elem2 n xs

-- This function checks if 'a' is inside 'a' and returns a tuple containing a number and a Bool. The...
-- ... Bool indicates whether the item was found, and the number represents how many times.
elem3 :: (Eq a) => a -> [a] -> (Bool, Int) -- Takes 'a', a list of 'a' and returns a (Bool, Int), where 'a' is an instance of Eq
elem3 _ [] = (False,0) -- Returns (False,0) if an empty list is supplied
elem3 n xs = let 
    --x = elems n xs -- Calls 'elems' to determine if 'n' is inside 'xs'. 'x' stores True or False
    y = elem2 n xs -- Calls 'elem2' to find out how many times 'n' occurs in 'xs'; returns an Int
    x = if y > 0 then True else False -- If 'y' is greater than 0, then 'x' equals True, else False
  in (x, y) -- Outputs answer in the format (Bool, Int)

-- This function acts as elem2 by returning the second item in 'elem3', an Int
numElem :: Eq a => a -> [a] -> Int -- Takes 'a', a list of 'a' and returns an Int, where 'a' is an instance of Eq
numElem n xs = snd (elem3 n xs) -- Returns the second item in 'elem3'; returns a number

-- This function acts as 'elems' by returning the first item in 'elem3', a bool
boolElem :: Eq a => a -> [a] -> Bool -- Takes 'a', a list of 'a', and returns a Bool
boolElem n xs = fst (elem3 n xs) -- Returns the first item in 'elem3';

-- This function takes two lists of the same type and pairs with the nth elements together
lameZippy :: [a] -> [a] -> [a] -- Takes two lists of 'a' and returns a list of 'a'
lameZippy xs []         = xs -- Returns 'xs' if an empty list is supplied as 'ys'
lameZippy [] ys         = ys -- Returns 'ys' if an empty list is supplied as 'xs'
lameZippy (x:xs) (y:ys) = x:y:lameZippy xs ys -- Using pattern matching, and recursion, it will pair up the elements in each list together

-- The zip function takes two lists, and combines them together and puts them in a tuple
zippy :: [a] -> [b] -> [(a,b)] -- Takes a list of 'a', a list of 'b' and returns a tuple of (a,b)
zippy _ [] = [] -- Returns an empty list if [b] == []
zippy [] _ = [] -- Returns an empty list if [a] == []
zippy (x:xs) (y:ys) = (x,y):zippy xs ys -- Adds 'x', 'y' in a tuple and recursively calls zippy on 'xs' and 'ys'...
-- ... until their elements are in the tuple. Calling zippy [1..4] ['a'..'d'] looks a lil something like this:
{-
Prelude> zippy [1..4] ['a'..'d']
(1,'a'):zippy [2..4] ['b'..'d']
(1,'a'):(2,'b'):zippy [3..4] ['c'..'d']
(1,'a'):(2'b'):(3,'c'):zippy [4] ['d']
(1,'a'):(2'b'):(3,'c'):(4,'d'):zippy [] []
(1,'a'):(2'b'):(3,'c'):(4,'d'):[]
[(1,'a'):(2'b'):(3,'c'):(4,'d')]

Also, you cannot do this: 
zippy xs [] = xs -- Returns 'xs' if [b] == []
zippy [] ys = ys -- Returns 'ys' if [a] == []
Because, Haskell is expecting a tuple of (a,b) but lets [a]. The [] works because it is polymorphic; it can...
... be anything. For example: [Int], [String], [Char], [(a,b)], etc. The empty list is extremely powerful!
-}

-- This function is a poorly implementation of the map function. It can only take the...
-- ... 4 basic arithmetic operators, add, subtract, multiply, and divide, in the form...
-- ... of a number from 0 to 3. 'weakMap' takes 'a', 'b', a list of 'b' and returns a...
-- ... list of 'b', where 'a' is an instance of Eq and Num, and 'b' is an instance of Integral
weakMap :: (Eq a, Num a, Integral b) => a -> b -> [b] -> [b]
weakMap _ _ [] = [] -- Returns [] if [] is supplied as an argument
weakMap m n (x:xs) 
  | m == 0     = (n + x):weakMap m n xs -- If m = 0, then add n to each element in xs
  | m == 1     = (n - x):weakMap m n xs -- If m = 1, then subtract n to each element in xs
  | m == 2     = (n * x):weakMap m n xs -- If m = 2, then multiply n to each element in xs
  | m == 3     = (n `div` x):weakMap m n xs -- If m = 3, then divide n to each element in xs
  | otherwise  = error "Invalid Entry For [m]" -- Otherwise, return an error, if 'm' isn't [0..3]
-- This is a very poorly written implementation of map because it is limited to 4 operators. Haskell...
-- ... is all about polymorphism. One implementation should yield many uses

-- The map function applies a transformation to every item in a list
fap :: (a -> b) -> [a] -> [b] -- Takes a function, a list of 'a', and returns a list of 'b'
fap f []     = [] -- Returns [] if the empty list is an argument
fap f (x:xs) = f x : fap f xs -- Applies the function 'f' to 'x', and every item in 'xs'
-- Calling fap (2*) [1,2,3] would look like this:
{-
fap (2*) (1:[2,3]) --> (2 * 1) : fap (2*) [2,3]
fap (2*) (2:[3]) --> (2 * 1) : (2 * 2) : fap (2*) [3]
fap (2*) (3:[]) --> (2 * 1) : (2 * 2) : (2 * 3) : fap (2*) []
fap (2*) ([]) --> (2 * 1) : (2 * 2) : (2 * 3) : []
2:4:6:[] --> [2,4,6]
-}

-- The fiter function cleans a list based off of a condition [i.e. Only keep even numbers]
filters :: (a -> Bool) -> [a] -> [a] -- Takes a function that returns Bool, a list of 'a' and returns a list of 'a'
filters b []    = [] -- Returns the empty list if [] is an argument
filters b (x:xs)
    | b x       = x : filters b xs -- If (b x) returns True then add 'x' to the new list
    | otherwise = filters b xs     -- Otherwise, continue analyzing the list 'xs'
-- Calling filters even [1..10] returns [2,4,6,8,10]

{-
Curried Functions
- Currying is the process of transforming a function that takes mutliple arguments into a function that takes a single...
... argument. For example:w
sum2 x y = x + y -- sum2 takes two numbers/arguments, and returns a single number/argument
-}

{-
Higher Order Functions
- In Haskell, functions are considered first-class, which means that functions can be passed as arguments to other...
... functions, and they can also be returned as values from other functions. Functions can even be stored in another...
... variable or data structure. For example:
1) take 20 (repeat 3) -- "repeat 3" is passed as an argument for take
2) bool'Even x = even x -- Calling 'even x' will return a Bool which will be stored in bool'Even
3) xs = map succ num -- 'xs' stores 'num' after 1 is added to every element
-}

{- 

EXTRA PRACTICE CODE -- NOW OBSOLETE

dub x = x + x
quad x = dub (dub x)

fact n = "The Answer Is " ++ show (product [1 .. n])
--test = "The Answer Is: " ++ show (fact 10)
avg ns = sum ns `div` length ns

powerOf x n = show (x) ++ " ^ " ++ show (n) ++ " = " ++ show(x^n)

a = 10
b = 20
c = 30

nes = a `div` length xs
    where
        a = 10
        xs = [1, 2, 3, 4, 5]

new_nes x xss = a `div` length xss

f x y = let
    z1 = x * x
    z2 = y * y
    z3 = z1 + z2
    in sqrt(z3)

lastC xs = head(reverse(xs))

{- 
lastCs xs = let
    z1 = reverse(xs)
    z2 = head(z1)
    sh show(z2)
-}

initC xs = reverse( a)
    where
        a = tail(reverse(xs))
    
initCC xs = let
    z1 = length(xs) - 1
    z2 = drop z1 (xs)
    in z2 

initS a b c d = let
    z1 = a + b + c + d * 2 + dub(d)
    in sqrt(z1)

cubS a b c d = a ^ b ^ c ^ d

cubE a b c d = let
    z1 = cubS a b c d
    in (z1)

Please Ignore These Comments. Thank you.

------------------------
Another Way To Do cubicQ
------------------------

cubicQ a b c = let
    z1 = 3 * a * c
    z2 = b * b
    z3 = 9 * a * a
    z4 = (z1 - z2) / z3
  in (z4)

------------------------
Another Way To Do cubicR
------------------------

cubicR a b c d = let
    z1 = 9 * a * b * c
    z2 = 27 * a * a * d
    z3 = 2 * b * b * b
    z4 = 54 * a * a * a
    z5 = (z1 - z2 - z3) / z4
  in (z5)

-----------------------------------
Another Way To Do cubicRealSolution
-----------------------------------

cubicRealSolution a b c d = (cubicS(cubicQ a b c) (cubicR a b c d)) 
    + (cubicT(cubicQ a b c) (cubicR a b c d)) - (b / (3 * a))

-------------------------------------
Other CubeRoot Function [Looks Nicer]
-------------------------------------
cubeRoot :: Float -> Float
cubeRoot x = if x > 0 then cRoot(x) else cRoot(abs x) * (-1)
cRoot x = x ** (1/3)

-}
