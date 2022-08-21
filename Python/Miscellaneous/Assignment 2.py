#=======================================#
# TURTLE.PY | GRAPHICS.PY | CODING.PY   #
#=======================================#

import sys, os, time, math, turtle, winsound

speed = 5

print("-") * 50
print("PLEASE TURN UP YOUR SPEAKERS ALL THE WAY")
print("-") * 50

#OPTION PANEL FOR USER TO DECIDE WHICH UTILITY THEY WANT TO UTILIZE
def Menu():
    
    winsound.PlaySound('Gta.wav',winsound.SND_ASYNC)
    os.system('cls')
    print '''
    BOSS UTILITIES
    ====================================
    Please type a number and press enter!

    1.  Dartboard
    2.  Rainbow Star
    3.  Spiral Tunnel
    4.  Christmas Star
    5.  Double Turtle
    6.  Tactical Nuke
    7.  Exit Application

    Please enter the number of the design you wish to view.
    '''
    choice = raw_input("\t")
    return choice

def Dartboard():

    Jatin = turtle.Turtle() #Makes Jatin into a Turtle

    #Sets numbers, colors and other identities
    Radius = 260
    B = "darkred"
    Y = "darkgreen"
    R = "darkred"
    W = "White"
    Counter = 1
    Counter2 = 2
    Counter3 = 3
    Counter4 = 4
    Angle = 36
    Home = 20
    Outline = "white"
    Outline2 = "white"

    turtle.screensize(500,500) #Set max screensize for turtle window
    turtle.bgcolor("black") #Makes background color black

    Jatin.shape("turtle")
    Jatin.pensize(5.5) #Optimal Size = 5.5
    Jatin.speed(0) #It's over 9000!
    Jatin.pencolor(Outline)
        
    #Adds white lines to show dartboard is hanging
    Jatin.penup()
    Jatin.goto(260,250)
    Jatin.pendown()
    Jatin.goto(0,450)
    Jatin.goto(-260, 250)
    Jatin.pendown()
    Jatin.penup()
    Jatin.goto(0,450)
    Jatin.pendown()
    Jatin.fillcolor("gray")
    Jatin.begin_fill()
    Jatin.circle(20)
    Jatin.end_fill()
    Jatin.penup()

    #Draws the dartboard
    Jatin.fillcolor("black")
    Jatin.goto(0, -330)
    Jatin.pendown()
    Jatin.fillcolor()
    Jatin.begin_fill()
    Jatin.circle(350)
    Jatin.end_fill()
    Jatin.home()
    Jatin.goto(0,-240)

    while Counter < 11:

        Jatin.fillcolor(Y)
        Jatin.begin_fill()
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Jatin.fillcolor(B)
        Jatin.begin_fill()
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Counter = Counter + 1

    Radius = Radius - 20
    Jatin.goto(0, Home)
    Jatin.forward(Radius)
    Jatin.left(90)
    
    while Counter2 < 12:
        
        Jatin.fillcolor("black")
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Jatin.fillcolor("white")
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Counter2 = Counter2 + 1

    Radius = Radius - 80
    Jatin.goto(0, Home)
    Jatin.forward(Radius)
    Jatin.left(90)
    
    while Counter3 < 13:
        
        Jatin.fillcolor(Y)
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Jatin.fillcolor(B)
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Counter3 = Counter3 + 1

    Radius = Radius - 20
    Jatin.goto(0, Home)
    Jatin.forward(Radius)
    Jatin.left(90)

    while Counter4 < 14:

        Jatin.fillcolor("black")
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Jatin.fillcolor("white")
        Jatin.begin_fill(),
        Jatin.circle(Radius,Angle)
        Jatin.left(90)
        Jatin.forward(Radius)
        Jatin.left(162)
        Jatin.forward(Radius)
        Jatin.left(90)
        Jatin.end_fill()
        Counter4 = Counter4 + 1
    
    #Adds white lines across dartboard (Crosshairs)
    Jatin.pencolor(Outline2)
    Jatin.penup()
    Jatin.goto(0,Home)
    Jatin.pendown()
    j = 1
    SubAngle = 18
    SA = 1
    
    while j < 22:
        
        Jatin.setheading(SubAngle * SA)
        Jatin.forward(350)
        j = j + 1
        SA = SA + 1
        Jatin.goto(0, Home)

    #Draws the green circle in the middle
    Jatin.pencolor(Outline)
    Jatin.penup()
    Jatin.home()
    Jatin.fillcolor("darkgreen")
    Jatin.begin_fill()
    Jatin.goto(0, -28.5)
    Jatin.pendown()
    Jatin.circle(50)
    Jatin.end_fill()
    Jatin.penup()
    Jatin.goto(0, 20)
    Jatin.pendown()

    #Draw red circle in the middle
    Jatin.penup()
    Jatin.home()
    Jatin.fillcolor("darkred")
    Jatin.begin_fill()
    Jatin.goto(0, -4)
    Jatin.pendown()
    Jatin.circle(25)
    Jatin.end_fill()
    Jatin.penup()
    Jatin.goto(0, 20)
    Jatin.pendown()
    
    Jatin.hideturtle() #Hides the turtle (showturtle = visible)

    #Setting up method for Darts
    def Darts():

        Jatin.setheading(90)
        s = 0
        
        while s < 10:
            Jatin.pencolor("darkred")
            Jatin.pensize(s + 0.1)
            Jatin.bk(15)
            s = s + 1
        
        while s < 21:
            Jatin.bk(30)
            
            if s % 2 == 0:
                Jatin.pencolor("white")
                Jatin.pensize(s + (s / 4))
            else:
                Jatin.pencolor("grey")
                Jatin.pensize(s - (s / 2))
                Jatin.bk(6)
            s = s + 1

        while s < 35:
            
            Jatin.pensize(s / (s / 1.01) * 1.2)
            Jatin.backward(3)
            s = s + 1
        
        Jatin.penup()
        Jatin.fd(25)
        Jatin.pendown()
        Jatin.pensize(7)
        Jatin.pencolor("darkred")
        Jatin.fillcolor("red")
        Jatin.begin_fill()
        Jatin.setheading(45)
        Jatin.fd(55)
        Jatin.setheading(45)
        Jatin.fd(60)
        Jatin.setheading(90)
        Jatin.bk(150)
        Jatin.setheading(225)
        Jatin.fd(115)
        Jatin.setheading(135)
        Jatin.fd(115)
        Jatin.setheading(90)
        Jatin.fd(150)
        Jatin.setheading(135)
        Jatin.bk(115)
        Jatin.end_fill()
        Jatin.hideturtle()

    #Settings for right dart
    Jatin.penup()
    Jatin.goto(500,250)
    Jatin.pendown()
    Jatin.pencolor("grey")
    Jatin.fillcolor("grey")
    Jatin.shape("classic")
    Darts()

    #Settings for left dart
    s = 0
    Jatin.penup()
    Jatin.goto(-500,250)
    Jatin.pendown()
    Darts()

    #Adds writing on canvas
    Jatin.fillcolor("black")
    Jatin.pensize(2)
    Jatin.penup()
    Jatin.goto(-310,-425)
    Jatin.pendown()
    Jatin.pencolor("white")
    Jatin.write("B0SS DARTB0ARD", True, font = ("Arial", 50, "bold"))
    Jatin.stamp()
    Jatin.pencolor("black")
    Jatin.goto(-105, -465)
    Jatin.pencolor("white")
    Jatin.write("Liscensed To Arduini", True, font = ("Arial", 15, "bold"))
    Jatin.stamp()

##    time.sleep(3)

    Jatin.penup()
    Jatin.showturtle()
    Jatin.shape("turtle")
    Jatin.goto(0,20)
    #Jatin.pendown()
    Jatin.pencolor("black")
    Jatin.fillcolor("black")

    Number = [20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5]

    Jatin.penup()
    Jatin.home()
    Jatin.goto(0,260)
    Jatin.pencolor("red")
    Jatin.pensize(0.1)
    Jatin.pendown()
    Jatin.setheading(5)

    r = 0
    for a in Number:
        
        Jatin.write(a, font = ("Arial", 22, "normal"))
        Jatin.circle(-250, 18)
        r = r + 1
        
    Jatin.pendown()

    xbmc = 0
    setangle = 0
    
    while xbmc < 24:
        while setangle < 360:
            Jatin.setheading(setangle)
            setangle = setangle + 1
        xbmc = xbmc + 1

    Jatin.hideturtle()
    
    turtle.done()

    print("Sht done")

def Rainbow():

    turtle.reset()
    turtle.hideturtle()
    turtle.speed(speed ** 6)

    turtle.home()

    counter = 0
    
    turtle.penup()
    turtle.goto(-450,300)
    turtle.write("Stare At Center", True, font = ("Arial", 85, "bold"))
    turtle.home()
    turtle.pendown()
    
    for i in xrange (400):
        turtle.fillcolor("black")
        turtle.begin_fill()
        
        while i > 1000:
            for j in jrange(500):
                while j > 250:
                    
                    turtle.left(-450)
                turtle.backward(450)
            turtle.right(400)
        turtle.forward(200)
        
        turtle.forward(i)
        turtle.right(500)
        turtle.pencolor("white")

        counter = counter + 1
        
        if counter % 2 == 0:
             turtle.pencolor("red")

        if counter % 3 == 0:
             turtle.pencolor("blue")

        if counter % 4 == 0:
             turtle.pencolor("green")

        turtle.end_fill()

    turtle.done()

def Spiral():

    turtle.reset()
    turtle.speed(speed)

    turtle.home()

    counter = 2
    
    for i in xrange (500):
        
        while i > 750:
            turtle.pencolor("blue")
            turtle.stamp()
            
        turtle.speed(speed * counter)
        turtle.stamp
        turtle.forward(i)
        turtle.right(50)
        turtle.pencolor("black")
        counter = counter * 2

    turtle.penup()
    turtle.home()
    turtle.pendown()

    for i in xrange (700):

        turtle.forward(i)
        turtle.right(88)
        turtle.pencolor("white")
        
    turtle.done()

def Christmas():
    
    turtle.reset()
    turtle.hideturtle()
    turtle.speed(speed ** 6)

    turtle.home()
    
    for i in xrange (450):
        
        turtle.forward(i)
        turtle.right(200)
        turtle.pencolor("black")

    ###turtle.reset() #Remove the |###| to see another kind of star
    turtle.speed(speed ** 6)

    turtle.home()
    
    for j in xrange (450):

        turtle.stamp()

        turtle.forward(j)
        turtle.right(200)
        turtle.pencolor("black")        
        
    turtle.done()

def NuKeM():

    B = "black"
    Y = "yellow"
    Radius = 250
    Angle = 72
    Counter = 4

    turtle.screensize(500,500) #Set max screensize for turtle window
    turtle.bgcolor("black") #Makes background color black

    turtle.shape("classic") #Replaces turtle with Jatin
    turtle.hideturtle
    turtle.pensize(5.5)
    turtle.speed(500) #It's over 9000!
    turtle.pencolor("black")

    turtle.goto(0,-250)

    while Counter < 16:

        turtle.fillcolor(Y)
        
        if Counter % 2 == 1:
            turtle.pencolor(B)
        else:
            turtle.pencolor(Y)
                
        turtle.begin_fill()
        turtle.circle(Radius, Angle)
        turtle.left(90)
        turtle.forward(Radius)
        turtle.left(162)
        turtle.forward(Radius)
        turtle.left(90)
        turtle.end_fill()
        turtle.fillcolor(B)
        turtle.begin_fill()
        turtle.circle(Radius, Angle)
        turtle.left(90)
        turtle.forward(Radius)
        turtle.left(162)
        turtle.forward(Radius)
        turtle.left(90)
        turtle.end_fill()
        Counter = Counter + 1

        if Counter % 3 == 1:
            turtle.clear()
        else:
            continue

    turtle.done()

def Sun():

    speed = 5 

    Jatin = turtle.Turtle()
    turtle.color('red')
    turtle.speed(speed)

    counter = 1
    
    while counter < 150:

        turtle.begin_fill()
        turtle.forward(250)
        turtle.backward(290)
        turtle.right(500)
        turtle.left(1000)
        turtle.forward(50)
        turtle.speed(speed ** counter)
        turtle.stamp()
        turtle.end_fill()
        counter = counter + 2

        Jatin.pencolor("blue")
        Jatin.begin_fill()
        Jatin.forward(-250)
        Jatin.backward(-290)
        Jatin.right(-500)
        Jatin.left(-1000)
        Jatin.forward(-50)
        Jatin.speed(speed ** counter)
        Jatin.stamp()
        Jatin.end_fill()
        counter = counter + 2    
        
        turtle.begin_fill()
        turtle.forward(250)
        turtle.backward(290)
        turtle.right(500)
        turtle.left(1000)
        turtle.forward(50)
        turtle.speed(speed ** counter)
        turtle.stamp()
        turtle.end_fill()
        counter = counter + 2
        
    turtle.done()

def ExitAnimation():
    
    count = 25
    while (count < 26):
        print "The program will end in", count, "seconds"
        count = count - 1
        
        time.sleep(1)
        if count == 0:
            #Plays music after or before executing code (ALIAS)
            winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
            exit()

#OPTION PANEL DECISCION STRUCTURE
choice = ""
while choice != "6":
    choice = Menu()
    if choice == "1":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        winsound.PlaySound('Bullseye.wav',winsound.SND_ASYNC)
        Dartboard()

    elif choice == "2":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        winsound.PlaySound('Toni.wav',winsound.SND_ASYNC)
        Rainbow()
        
    elif choice == "3":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        winsound.PlaySound('Escalon.wav',winsound.SND_ASYNC)
        Spiral()
        
    elif choice == "4":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        winsound.PlaySound('Bell.wav',winsound.SND_ASYNC)
        Christmas()

    elif choice == "5":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        winsound.PlaySound('Boom.wav',winsound.SND_ASYNC)
        Sun()

    elif choice == "6":
        os.system('cls')
        print("")
        winsound.MessageBeep()
        NuKeM()
        
    else:
        if choice == "7":
            print '''

----------------------------------------------------------
Thank you for using Jatin's Super Advanced Turtle Graphics!
----------------------------------------------------------

''' * 1
            #Plays music in background (ASYNC)
            winsound.PlaySound('Suits.wav',winsound.SND_ASYNC)

            time.sleep(2)

            ExitAnimation()
