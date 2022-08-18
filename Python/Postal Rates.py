def PostalRates():
    
    StandardLetter = str(raw_input("Are you exporting a Standard Letter? "))
    print("")
    
    if StandardLetter.lower() == "y" or "yes":
        
        StandardWeight = float(raw_input("Please enter the weight of your package: "))
        print("")
            
        CountryChoice = str(raw_input("Please enter the name of the country you are shipping your package to: "))
        print("")

        if StandardWeight > 1 and StandardWeight < 30:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shippping a {0:.3f}g parsel to Canada for $0.63").format(StandardWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $1.10").format(StandardWeight)

        if StandardWeight > 30 and StandardWeight < 50:
            
            if CountryChoice.lower() == "canada":
                
                print("You are shipping a {0:.3f}g parsel to Canada for $1.10").format(StandardWeight)
                
            elif CountryChoice.lower() == "usa":
                
                print("You are shipping a {0:.3f}g parsel to USA for $1.34").format(StandardWeight)

                #ADD THE CODE FOR NON STANDARD

    elif StandardLetter.lower()  == "n" or "no":
        
        print("You are exporting a Non-Standard package")
        size = int(raw_input("please enter the size of your letter"))
        distination = raw_input("please enter the destination country you would like to ship your letter")
        
        if size>30 and size<50:
            if distination == "Canada":
                print("you owe $1.10")
            elif distination == "USA" or "America" or "United States":
                print("you owe $1.34")

        elif size>50 and size<100:
            if distination == "Canada":
                print("you owe $1.34")
            elif distination == "USA" or "America" or "United States":
                print("you owe $2.20")

        elif size>100 and size<200:
            if distination == "Canada":
                print("you owe $2.25")
            elif distination == "USA" or "America" or "United States":
                print("you owe $3.80")

        elif size>200 and size<300:
            if distination == "Canada":
                print("you owe $3.05")
            elif distination == "USA" or "America" or "United States":
                print("you owe $7.60")

        elif size>300 and size<400:
            if distination == "Canada":
                print("you owe $3.50")
            elif distination == "USA" or "America" or "United States":
                print("you owe $7.60")

        elif size>400 and size<500:
            if distination == "Canada":
                print("you owe $3.75")
            elif distination == "USA" or "America" or "United States":
                print("you owe $7.60")

PostalRates()
