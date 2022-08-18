import math

# Prints text to console
print("Text Goes Here")

# Prints a triangle to console
print("   /|")
print("  / |")
print(" /  |")
print("/___|")

# Prints a short story to console using variables
character_name = "John" # Creates a variable that stores "John"
character_age= "35" # Creates a variable that stores "35"
print("There once was a man named " + character_name + ", ")
print("he was " + character_age + " years old.")

character_name = "Mike" # Changing the variable to store "Mike"
print("He really liked the name " + character_name + ", ")
print("but didn't like being " + character_age + ".")

# Prints the name on two different lines
print("\nHarvey\nSpectre")
print("Is My Name\n")

# Example of how to use to escape character --> \
print("You Are \"Not\" Right")

my_name = "Mike"
print(my_name + " Ross\n") # Example of string concatenation

my_school = "McMaster University" 
print(my_school.lower()) # Converts the entire string to lowercase letters
caps_key = "capslock wins"
print(caps_key.upper()) # Converts the entire string to uppercase letters

my_city = "England"
print(my_city.upper().isupper()) # Converts the entire string to uppercase and checks if it is all uppercase. Returns true

get_length = "How Big?"
print(len(get_length)) # Returns the length of the string

get_character = "Xylophone"
print(get_character[0]) # Returns the first character of the string, which happens to be 'X'

print("") # Prints a newline; it's kind of like a divider

first_letter = "Hello"
print(first_letter[0]) # Returns the first character of the string, which is 'H'

last_letter = "Hello"
print(last_letter[4]) # Returns the last character of the string, which is 'o'

sentence = "The quick brown fox jumped over the lazy dog"
print(sentence.index("q")) # Returns the location of the first 'q', which is 4 
print(sentence.index("fox")) # Returns the location of where the word starts, which is 16
                             # 16 is the location of the character, 'f'
                             
print(sentence.replace("fox", "cow")) # Replaces 'fox' with 'cow' in the string and prints it

print("")

print(3)
print(3.14159)
print(-3.14159)

print(6 + 9.9)
print(6.2 - 3.2)
print(2 * 2)
print(10 / 2)

print(10 * 2 + 5) # Prints 25
print(10 * (2 + 5)) # Prints 70

print(10 % 3) # Prints 1

number = 42 # Creates a variable called 'number' and assigns it a value of 42
print(number) # Prints 42

print(str(number)) # Converts 'number' to a string and prints it
print(str(number) + " is my favorite number!\n")

print(abs(-10)) # Returns the absolute value of the number
print(pow(3,4)) # Returns the power of 3^4
print(max(15,20)) # Returns the maximum of two numbers
print(min(5,20)) # Returns the minimum of two numbers
print(round(3.3)) # Rounds the number. In this case: 3
print(round(3.7)) # Rounds the number. In this case: 4

print("")

print(math.floor(3.99)) # Floor always rounds down, no matter what
print(math.ceil(3.11)) # Ceil always rounds up, no matter what
print(math.sqrt(16)) # Takes the square root

print("")

input_name = input("What Is Your Name? ==> ")
input_age = input("How Old Are You? ==> ")

print("Greetings, " + input_name + ". " + "It's a good day to be " + input_age)

int_num1 = input("Enter a number: ") # Takes input from user and stores it into a variable
square = int(int_num1) * int(int_num1) # Converts input into an integer and multiplies it with itself
print(square) # Prints result

print("")

float_num1 = input("Enter a decimal number: ")
square_d = float(float_num1) * float(float_num1) # Converts input into a float and squares it
print(square_d)

# Mad Libs App
first_noun_plural = input("Enter A Plural Noun: ")
first_adjective = input("Enter An Adjective: ")

second_noun_plural = input("Enter Another Plural Noun: ")
second_adjective = input("Enter Another Adjective: ")

first_verb = input("Enter A Verb: ")

print("\n" + first_noun_plural + " Are " + first_adjective)
print(second_noun_plural + " Are "+ second_adjective)
print("I " + first_verb + " You")
# Mad Libs App

games = ["Call of Duty", "Battlefield", "Crysis", "Minesweeper"] # Creates a list of games
profile = ["John", "Smith", 35, True] # Creates a list

print(games) # Prints the entire list
print(profile)

print("")

print(games[0]) # Returns the first element, then prints it
print(profile[3]) # Returns 4th element, then prints it

print("")

print(games[-4]) # Returns the 1st element, then prints it
print(profile[-1]) # Returns the last element, then prints it

print("")

print(games[0:2]) # Returns every element from the first to 2nd
print(profile[2:]) # Returns every element from the 3rd index to last
print(games[:3]) # Returns every element from the 1st element to 2nd

print()

games[3] = "Chess" # Changes 4th element in list 
profile[1] = "Doe" # Changes 2nd element in list

print(games)
print(profile)

games.extend(profile) # Appends 'profile' to end of 'games' list
print(games)

games.append("Checkers") # Adds item to end of list
games.insert(1, "BOTW") # Inserts item at 2nd position
games.remove("Crysis") # Removes item from list
print(games)
games.index(1) # Returns item at 2nd index in list
print(games.index(1)) 

my_nums = [1,4,7,9,3,5,7,4,7,8,4,0,9]
my_nums.sort() # Sorts the list from low to high
print(my_nums)

games.reverse() # Reverses the list
print(games)

coordinates = (4,2) # Creates a tuple
print(coordinates) # Prints entire tuple
print(coordinates[0]) # Prints first item in tuple
print(coordinates[1]) # Prints second item in tuple

def say_hello():
    print("Say Something...")

say_hello() # Runs the function

def greet_user(name):
    print("Hello "+ name)

greet_user("Mike")
greet_user("Steve")

def exam_details(subject, adjective, student_name, mark):
    print("The " + subject + " exam was " + adjective + ". "
                 + student_name + " got a " + mark + "%.")

exam_details("chem", "bad", "Steven", "50") # Runs the function and passes parameters
exam_details("math", "great", "Harry", "95")

def cube_number(cube_this_number):
    return cube_this_number * cube_this_number * cube_this_number # Return statement

print(cube_number(5))

print()

is_male = True

if (is_male): 
    print("You are a male")

is_male = False

if (is_male): 
    print("You are a male") # Does not get executed


is_rainy = True

if (is_rainy):
    print("Get Umbrella")
else:
    print("Get Sunglasses") # Does not get executed

is_gamer = True
has_gaming_PC = True

if (is_gamer) and (has_gaming_PC):
    print("You are part of the master race")
else:
    print("You may be a gamer OR have a gaming PC")

is_gamer = False
has_gaming_PC = False

if (is_gamer) or (has_gaming_PC):
    print("You may be a gamer OR have a gaming PC")
else:
    print("You are not a gamer and you don't have a gaming PC")

is_gamer = False
has_gaming_PC = True

if not (is_gamer) and (has_gaming_PC):
    print("You are not a gamer but you have a gaming PC")

is_gamer = True
has_gaming_PC = False

if (is_gamer):
    if (has_gaming_PC):
        print("PC Master Race")
    else:
        print("Consoles Are Meh")
else:
    print("You are missing out!")


is_weekend = True
no_homework = True

if (is_weekend) and (no_homework):
    print("You get to sleep in")
elif (is_weekend) and not (no_homewok):
    print("You can sleep after you finish your homework")
elif not (is_weekend) and (no_homework):
    print("I guess you can relax")
else:
    print("Homework's due tomorrow, you better finish it!")

print()

def max_number_3(num1, num2, num3):
    if (num1 >= num2) and (num1 >= num3):
        return num1
    elif (num2 >= num1) and (num2 >= num3):
        return num2
    else:
        return num3

print(max_number_3(30,4,5))
print()


### CALCULATOR ###
def smart_calculator(calc_num1, calc_op, calc_num2):

    if (calc_op == "+"):
        return calc_num1 + calc_num2
    elif (calc_op == "-"):
        return calc_num1 - calc_num2
    elif (calc_op == "/"):
        if (calc_num2 == 0):
            return "Only Chuck Norris Can Divide By Zero"
        else:
            return calc_num1 / calc_num2
    elif (calc_op == "*") or (calc_op == "x") or (calc_op == "X"):
        return calc_num1 * calc_num2
    elif (calc_op == "^"):
        return pow(calc_num1, calc_num2)
    elif (calc_op == "%"):
        return calc_num1 % calc_num2
    else:
        print("Invalid Operator: Not Recognized")

calc_num1 = float(input("Enter the first number: "))
calc_op = input("What operator do you want to use: ")
calc_num2 = float(input("Enter the second number: "))

print("Answer: " + str(smart_calculator(calc_num1, calc_op, calc_num2)))
### CALCULATOR ###


month_conversion = {
    "Jan" : "January",
    "Feb" : "February",
    "Mar" : "March",
    "Apr" : "April",
    "May" : "May",
    "Jun" : "June",
    "Jul" : "July",
    "Aug" : "August",
    "Sep" : "September",
    "Oct" : "October",
    "Nov" : "November",
    "Dec" : "December"
}

print(month_conversion["Nov"])
print(month_conversion.get("May"))
print(month_conversion.get("ABC", "This is not a valid key"))

print()

month_conversion_number = {
    1 : "January",
    2 : "February",
    3 : "March",
    4 : "April",
    5 : "May",
    6 : "June",
    7 : "July",
    8 : "August",
    9 : "September",
    10 : "October",
    11 : "November",
    12 : "December"
}

print(month_conversion_number[4])
print(month_conversion_number.get(5))
print(month_conversion_number.get(500, "Not valid"))

counter = 1

while (counter <= 10):
    print(counter)
    counter += 1 # Same as counter = counter + 1
print("Done With Loop")

### Guessing Game ###
secret_word = "iphone"
guess_try = ""
guess_attempt = 0

while (secret_word != guess_try):
    guess_try = input("Guess what the secret word is: ").lower()
    guess_attempt += 1
    if (secret_word != guess_try):
        if (guess_attempt == 1):
            print("Hint 1: This item is very popular")
        elif (guess_attempt == 6):
            print("Hint 2: Designed by an American company and made in China")
        elif (guess_attempt == 11):
            print("Hint 3: The company in question is Apple")
        elif (guess_attempt == 15):
            print("Hint 4: This is their most popular and most sold product")

print("SUCCESS!")
print("It took you " + str(guess_attempt) + " tries")
### Guessing Game ###

foods = ["Pizza", "Burgers", "Sub", "Fries", "Timbits"]
for food in range(len(foods)):
    print(foods[food])

def power_of(base, exponent):
    base_power_exp = 1
    is_negative = False

    if (exponent < 0):
        is_negative = True
        exponent = exponent * (-1)

    for i in range(exponent):
        base_power_exp = base_power_exp * base

    if (is_negative):
        return (1 / base_power_exp)
    else:
        return base_power_exp

print(power_of(2,4))
print(power_of(4,3))
print(power_of(9,3))
print(power_of(5,5))
print(power_of(2,10))
print(power_of(2,-2))

# This list contains 4 lists inside of it
two_dim_list = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0] ]

print(two_dim_list) # Prints the entire 2D list

print()

# This For Loop prints every list inside the 2D list on a separate line
for single_list in two_dim_list:
    print(single_list)

print()

# This For Loop Prints each element inside each list that is inside the 2D list
for single_list in two_dim_list:
    for item in single_list:
        print(item)

### Alien Language Translater ###

translated_phrase = ""
user_input = input("Enter phrase to translate: ")

for word in user_input:
    if word.lower() in "aeiou":
        if word.isupper():
            translated_phrase = translated_phrase + "X"
        else:
            translated_phrase = translated_phrase + "x"
    else:
        translated_phrase = translated_phrase + word
         
print(translated_phrase)

### Alien Language Translater ###

'''
3 single quotes on top 

I
Can
Write
Anything

This
Is
A
Multi-
Line
Comment

3 single quotes on bottom
'''

try:
    try_int = int(input("Enter A Number: "))
    print("Success")
except:
    print("ERROR: Not A Number")

try:
    zero_error = 10/0
except ZeroDivisionError as err
    print(err) # Prints out the error
    print("ERROR: Cannot Divide By Zero")

employee_file = open("employees.txt", "r")

#print(employee_file.readline())
print(employee_file.readlines())

employee_file.seek(0)

for employee in employee_file.readlines():
    print(employee)

employee_file.close()

employee_file = open("employees.txt", "a")
employee_file.write("\nTom - Janitor")
employee_file.close()

employee_file = open("employees.txt", "w")
employee_file.write("\nTom - Janitor")
employee_file.close()

employee_file = open("newFileExample.txt", "w")
employee_file.write("A new file was just created")
employee_file.close()

### STUDENT CLASS CODE  ####

# This creates the Student class
class Student:

    # This is the initializer method. Every class needs to have this
    # __init__ is initialize
    def __init__ (self, name, major, gpa, is_on_probation):
    # 'self' refers to the instantiation you create with the class
    # Every other parameter belongs to the Student Class

        self.name = name # Assigns the 'name' you pass to 'self.name'
        self.major = major
        self.gpa = gpa # Assigns the 'gpa' you pass to 'self.gpa'
        self.is_on_probation = is_on_probation

### STUDENT CLASS CODE  ####

def main():

    # Using the Student class, an instantiation, 'student1' is created
    student1 = Student("Mike", "Business", 3.3, False) # These are the parameters that are passed
    print(student1.name) # Prints the students name
    # student1.name fetches the 'name' in the 'student1' data type

main()

### MULTIPLE CHOICE QUIZ ###

class QuestionMaker:

    def __init__(self, question_prompt, answer):
        self.question_prompt = question_prompt
        self.answer = answer

questions_list = [
    "What color is the Sun?\n(A) Blue\n(B) Red\n(C) Yellow\n(D) White\n",
    "What is the 4th planet from the sun?\n(A) Mars\n(B) Earth\n(C) Mercury\n(D) Pluto\n",
    "What is the cube root of 27\n(A) 2\n(B) 5\n(C) 4\n(D) 3\n",
]

questions_formatted = [
    QuestionMaker(questions_list[0], "C"),
    QuestionMaker(questions_list[1], "A"),
    QuestionMaker(questions_list[2], "D")
]

score = 0

for a_question in questions_formatted:
    user_answer = input(a_question.question_prompt + "==> ")
    print()
    
    if (user_answer.upper() == a_question.answer):
        #print(user_answer.upper())
        #print(a_question.answer)
        score += 1

print("You got " + str(score)  + " out of "
      + str(len(questions_formatted)) + " questions right")

### MULTIPLE CHOICE QUIZ ###

class Student:

    def __init__(self, name, major, year, cgpa):
        self.name = name
        self.major = major
        self.year = year
        self.cgpa = cgpa

    # This function calculates if the student is on the honor roll
    def on_honor_roll(self):
        if (self.cgpa >= 3.5): # If cpga is greater than or equal to 3.5, then yes
            return True
        else:
            return False

def main():
    
    student_100 = Student("Tom", "Business", 3, 3.1)
    student_200 = Student("Jim", "Engineering", 1, 3.6)

    print (Student.on_honor_roll(student_200))

main()

### EXAMPLE OF INHERITANCE BELOW

# This creates a Chef class
class Chef:

    # This is the initializer method and specifies the type of chef
    def __init__(self, type_of_chef):
        self.type_of_chef = type_of_chef

    # The chef makes a Chicken Dish
    def make_chicken(self):
        print("The " + self.type_of_chef + " chef makes a Chicken Dish")

    def make_salad(self):
        print("The " + self.type_of_chef +" chef makes a Salad")

    # The chef's special dish is BBQ Ribs
    def make_special_dish(self):
        print("The " + self.type_of_chef + " chef makes BBQ Ribs")

# This class is for a more specific Chef - a Chinese Chef
# This class has all methods in the Chef class including additional methods; defined in its own class
class ChineseChef(Chef):

    # The Chinese chef makes Spring Rolls
    def make_spring_rolls(self):
        print("The " + self.type_of_chef + " chef makes Spring Rolls")

    # The Chinese chef makes Spicy Noodles
    def make_spicy_noodles(self):
        print("The " + self.type_of_chef + " chef makes Spicy Noodles")

    # The Chinese chef's special dish is Kung Pao Chicken, different from chef above
    def make_special_dish(self):
        print("The " + self.type_of_chef + " chef makes Kung Pao Chicken")

def main():

    # Creates a chef
    g_chef = Chef("American")
    g_chef.make_chicken()
    g_chef.make_salad()
    g_chef.make_special_dish()

    c_chef = ChineseChef("Chinese")
    # The Chinese chef can make all dishes the other chef can
    c_chef.make_chicken()
    # The Chinese chef can make additional dishes, like spring rolls
    c_chef.make_spring_rolls()
    # The Chinese chef's special dish is different from the other chef
    c_chef.make_special_dish()

main()

# BETTER EXAMPLE OF INHERITANCE

# This is the RegularChef class
class RegularChef():

    # This init method sets the name of the Chef
    def __init__(self, name):
        self.name = name

    # The chef makes fried chicken
    def make_fried_chicken(self):
        print("The regular chef, " + self.name + ", makes fried chicken")

    # The chef makes salad
    def make_salad(self):
        print("The regular chef, " + self.name + ", makes fried chicken")

    # The chef makes chocolate pancakes
    def make_signature_dish(self):
        print("The regular chef, " + self.name + ", makes chocolate pancakes")

# This class is for the SpecialChef
# It inherits from the RegularChef
# All attributes in RegularChef are available in SpecialChef
class SpecialChef(RegularChef):

    # The chef makes gourmet pizza - a new dish
    def make_gourmet_pizza(self):
        print("The special chef, " + self.name + ", makes gourmet pizza")

    # The chef makes cajun seafood pasta - a new dish        
    def make_cajun_seafood_pasta(self):
        print("The special chef, " + self.name + ", makes cajun seafood pasta")

    # The chef makes chocolate ganache
    # This dish is different from the regular chef
    # This method replaces the one loaded from RegularChef
    def make_signature_dish(self):
        print("The special chef, " + self.name + ", chocolate ganache")

def main():

    # Creates a regular chef called "John Doe"
    reg_chef = RegularChef("John Doe")
    reg_chef.make_fried_chicken() # The chef makes fried chicken
    reg_chef.make_salad()
    reg_chef.make_signature_dish() # The chef makes his signature dish - chocolate pancakes

    print()

    # Creates a special chef called "Gordan Ramsay" 
    sep_chef = SpecialChef("Gordan Ramsay")
    sep_chef.make_fried_chicken() # The chef makes fried chicken, similar to the regular chef
                                  # This shows that all methods in RegularChef are also in SpecialChef

    sep_chef.make_gourmet_pizza() # The chef makes gourmet pizza. This new dish is not found in RegularChef

    sep_chef.make_signature_dish() # The chef makes his signature dish, chocolate dish
                                   # The special chef's signature dish is different from the regular chef
                                   # This demonstrates method overriding
main()
