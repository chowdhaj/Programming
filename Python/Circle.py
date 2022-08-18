import turtle

def Main():

    circle1 = 0
    angle = 120
    while circle1 < 10:

      radius1 = 180  
        
      turtle.fillcolor("#014B00") #dark green color
      turtle.begin_fill()
      turtle.left(-90)
      turtle.forward(radius1)
      turtle.left(90)
      turtle.circle(radius1,angle)
      turtle.end_fill()
 
      turtle.penup()
      turtle.goto(0,0)
      turtle.pendown()

      turtle.fillcolor("#500000") #maroon or dark red color
      turtle.begin_fill()
      turtle.left(-90)
      turtle.forward(radius1)
      turtle.left(90)
      turtle.circle(radius1,angle)
      turtle.end_fill()
 
      turtle.penup()
      turtle.goto(0,0)
      turtle.pendown()

      circle1 = circle1 + 1

    turtle.penup()
    turtle.goto(0,0)
    turtle.pendown()
    turtle.right(90)
    turtle.forward(radius1)
