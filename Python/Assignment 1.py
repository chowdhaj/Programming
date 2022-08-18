#=======================================#
# MORTGAGE.PY | POSTAL.PY | TRIANGLE.PY #
#=======================================#

import sys, os, time 

#OPTION PANEL FOR USER TO DECIDE WHICH UTILITY THEY WANT TO UTILIZE
def menu():
    os.system('cls')
    print '''
    UTILITIES
    ====================================
    Please type a number and press enter!

    1.  Calculate Mortgage
    2.  American Postal Rates
    3.  Triangle Calculator
    4.  Customer Assistance
    5.  Exit Application
    '''
    choice = raw_input("\t")
    return choice

def AcceptInputFromUser(): #Setting up the Mortgage Calculator Class

    print '''    CALCULATE YOUR MORTAGE
    ====================================\n'''
    
    b = float(input(("Enter the amount of MONEY you are borrowing: "))) #Requests amount of money being borrowed
    print("")
    
    while b < 1000 or b > 500000: #Error handling to make sure the amount of money borrowed is in between the specified values
        print("The amount must be between $1000 and $500000")
        b = float(input(("Pleaes enter the amount you want to borrow: "))) #Requests amount of money being borrowed if value inputed does not concide with the code
        print("")
    
    y = float(input(("Enter the number of YEARS you want to 'borrow' the money: "))) #Requets number of years the user wants the money
    print("")
    
    while y < 1 or y > 30: #Error handling to make sure the number of years entered is a positive integer
        print("The borrowing period must be in between 1 - 30 years")
        y = float(input(("Please enter the number of years you want to borrow the money: "))) #Requests the number of years again if value inputted does not concide with rule
        print("")
    
    r = float(input(("Enter the Annual Percentage Rate (APR) you want: "))) #Requests the interest rate from user
    print("")
    
    while r < 1 or r > 10: #Error handling to make sure the APR entered is not a decimal
        print("The interest rate must be in between 1% and 10%")
        r = float(input(("Please enter the APR you want: "))) #Requests interests rate again if value inputted by user does not concide with regulations
        print("")

    #Convert inputs recieved into usable formats
    p = float(b * 1)
    n = float(y * 12)
    i = float(r / 100 / 12)

    #Prints calculated mortgage and other statistics
    a = float(((p*i))/(1-((1+i))**-n))
    c = float(a * n)
    d = float(c - b)
    e = int(d * 100) / 100.0
    f = int(a *100) / 100.0

    #Prints out final results and figures to user
    print("")
    print("=============================== Basic Info ===============================\n")
    print("The total interest is going to be ${0:.2f} over {1} years\n").format(d,y)
    print("============================== Advanced Info =============================\n")
    print("To be more precise, every month, you are going to pay: $%s\n") % (round(a, 3))
    print("============================== (Rate 20/20) ==============================\n")

    time.sleep(5)

def ExitAnimation(): #The exit animation class
    
    count = 100
    while (count < 101):
        print "The program will end in", count, "seconds"
        count = count - 1
        if count == 0:
            exit()

def PostalRates(): #Postal Rate Class

    #Assigns country name to country with multiple cases
    Canada = "Canada", "canada"
    USA = "USA", "usa"

    print '''    NORTH AMERICAN POSTAL RATES
    ====================================
    Please follow the steps carefully!
    '''
    print("")

    CountryChoice = str(raw_input("Please enter the name of the country you are shipping your package to: "))

    if CountryChoice.lower() == "canada" or "usa":
        
        print("Valid Country \n")
    
    elif CountryChoice.lower() <> "canada" or "usa":

        print("Invalid Country \n")
        return
        time.sleep(2)
        quit()
        
    UserInput = str(raw_input("Are you exporting a Standard Letter? "))
    print("")

    LetterWeight = float(raw_input("Please enter the weight of your package: "))
    print("")

    if UserInput.lower() = "ye" or "y" or "yes":

        print("You have chosen to ship a Standard Letter")

        if LetterWeight > 1 and LetterWeight < 30:

            print("You are shipping a {0:.2f}g parcel to ", str(CountryChoice) "

            if 

            

    elif UserInput.lower() <> "n" or "no":

        print("You have chosen to ship a Non-Standard Letter")

        

    



    
    
    if UserInput.lower() == "y" or "yes" or "ye":
        
        LetterWeight = float(raw_input("Please enter the weight of your package: "))
        print("")

    elif UserInput.lower() <> "y" or"yes" or "ye":

        LetterWeight = 














            


            

        elif LetterWeight >= 1 and LetterWeight <= 30:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shippping a {0:.3f}g parsel to Canada for $0.63 \n").format(LetterWeight)
                time.sleep(4)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $1.10 \n").format(LetterWeight)
                time.sleep(4)

            elif CountryChoice.lower() <> "canada" or "usa":

                print("""
-----------------------------------------------------------------------------
The country you have selected does not exist in our records, please try again
-----------------------------------------------------------------------------
""") * 3
                time.sleep(5)

        elif LetterWeight > 30 and LetterWeight <= 50:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $1.10 \n").format(LetterWeight)
                time.sleep(4)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $1.34 \n").format(LetterWeight)
                time.sleep(4)

            elif CountryChoice.lower() <> "canada" or "usa":

                print("""
-----------------------------------------------------------------------------
The country you have selected does not exist in our records, please try again
-----------------------------------------------------------------------------
""") * 3
                time.sleep(5)

'''
                    if LetterWeight > 50:
            
            print("""
---------------------------------------------------------------------------------------------------------
The weight of the parcel exceeds Standard Regulations, we have switched you over to the Non-Standard plan
---------------------------------------------------------------------------------------------------------
""") * 1

    elif UserInput.lower() <> "y" or "yes" or "ye" or "yesh":
        
        print("You are exporting a parcel that allegedly fits our Non-Standard package \n")
        LetterWeight = float(raw_input("Please enter the weight of your package: "))
        print("")

        if LetterWeight < 50:

            print("The weight of the parcel does not meet the requirements for our Non-Standard plan, we have switched your plan to Standard")
        
        CountryChoice = str(raw_input("Please enter the name of the country you are shipping your package to: "))
        print("")
        
        if CountryChoice.lower() <> "canada" or "usa": #Prints out an error message if country is not eligible

            print("") * 3
            print("==========================---==========================---==========================")
            print("Incorrect country selected | Incorrect country selected | Incorrect country selected")
            print("==========================---==========================---==========================")
            print("") * 3
            time.sleep(5)
            
        if LetterWeight > 50 and LetterWeight <= 100:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $1.34").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $2.20").format(LetterWeight)

        elif LetterWeight > 100 and LetterWeight <= 200:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $2.20").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $3.80").format(LetterWeight)

        elif LetterWeight > 200 and LetterWeight <= 300:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.05").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $7.60").format(LetterWeight)

        elif LetterWeight > 300 and LetterWeight <= 400:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.50").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $7.60").format(LetterWeight)

        elif LetterWeight > 400 and LetterWeight <= 500:
            
            if CountryChoice.lower() == "Canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.75").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $7.60").format(LetterWeight)

        elif LetterWeight > 500:
            
            print("That is not an option")
            ExitAnimation()

    if CountryChoice.lower() <> "canada" or "usa": #Prints out an error message if country is not eligible
        print("") * 3
        print("==========================---==========================---==========================")
        print("Incorrect country selected | Incorrect country selected | Incorrect country selected")
        print("==========================---==========================---==========================")
        print("") * 3
        time.sleep(5)

        '''

def AreaTriangle():
    
    print("STILL WORKING ON IT")

def CustomerService():
    
    print(" All lines are currently busy ") * 100
    

#OPTION PANEL DECISCION STRUCTURE
choice = ""
while choice != "5":
    choice = menu()
    if choice == "1":
        os.system('cls')
        print("")
        AcceptInputFromUser()

    elif choice == "2":
        os.system('cls')
        print("")
        PostalRates()
        
    elif choice == "3":
        os.system('cls')
        print("")
        AreaTriangle()
        
    elif choice == "4":
        os.system('cls')
        print("")
        CustomerService()
        
    else:
        if choice == "5":
            print '''

Thank you for using Jatin's Super Advanced Utilities!
Enjoy the rest of your day, and don't have too much fun!
''' * 1

            time.sleep(2)
            
        ExitAnimation()




        

''' POSTAL RATE NON-STANDARD CODE 

    elif UserInput.lower() <> "y" or "yes" or "ye" or "yesh":
        
        print("You are exporting a Non-Standard package \n")
        LetterWeight = float(raw_input("Please enter the weight of your package: "))
        print("")

        if LetterWeight < 50:

            print("The weight of the parcel does not meet the requirements for our Non-Standard plan, we have switched your plan to Standard")
        
        CountryChoice = str(raw_input("Please enter the name of the country you are shipping your package to: "))
        print("")
        
        if CountryChoice.lower() <> "canada" or "usa": #Prints out an error message if country is not eligible

            print("") * 3
            print("==========================---==========================---==========================")
            print("Incorrect country selected | Incorrect country selected | Incorrect country selected")
            print("==========================---==========================---==========================")
            print("") * 3
            time.sleep(5)
            
        if LetterWeight > 50 and LetterWeight <= 100:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $1.34").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $2.20").format(LetterWeight)

        elif LetterWeight > 100 and LetterWeight <= 200:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $2.20").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $3.80").format(LetterWeight)

        elif LetterWeight > 200 and LetterWeight <= 300:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.05").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $7.60").format(LetterWeight)

        elif LetterWeight > 300 and LetterWeight <= 400:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.50").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $7.60").format(LetterWeight)

        elif LetterWeight > 400 and LetterWeight <= 500:
            
            if CountryChoice.lower() == "Canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $3.75").format(LetterWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $7.60").format(LetterWeight)

        elif LetterWeight > 500:
            
            print("That is not an option")
            ExitAnimation()

    if CountryChoice.lower() <> "canada" or "usa": #Prints out an error message if country is not eligible
        print("") * 3
        print("==========================---==========================---==========================")
        print("Incorrect country selected | Incorrect country selected | Incorrect country selected")
        print("==========================---==========================---==========================")
        print("") * 3
        time.sleep(5)

'''
    
