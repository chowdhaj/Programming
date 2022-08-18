package classes.main;

import classes.testing.*;
import java.util.Formatter;
import java.util.Collections;
import java.util.Scanner;

import classes.testing.Animal;
import classes.testing.Counter;
import classes.testing.Vehicle;

import java.util.ArrayList;
import java.lang.ArithmeticException;
import java.lang.Exception;
import java.util.HashMap;
import java.util.HashSet;
import java.io.File;

// Abstract method 'Animals'
abstract class Animals {
    int legs = 0;
    abstract void makeSound();
}

interface Creatures {
    public void eat();
    public void makeSound();
    public void breath();
}

class Dragon implements Creatures {
    @Override
    public void makeSound() {
        System.out.println("PPSSKK ... WIIISSSHHHOO");
    }
    @Override
    public void eat() {
        System.out.println("omnomnomnomnomnomo");
    }
    @Override
    public void breath() {
        // No idea how a dragon sounds like lmao
    }
}

// This is known as method overriding
class Doggie extends Animals {
    //@Override
    @Override
    public void makeSound() {
        // What the dog will say
        System.out.println("Growl ... Woof");
    }
}

class Cat extends Animals {
    //@Override
    @Override
    public void makeSound() {
        // What the cat says
        System.out.println("Meow ... Purrrr");
    }
}

class Ax {
    public Ax() {
        System.out.println("> You going down?");
    }
}

class Bx extends Ax {
    public Bx() {
       System.out.println("> All the way up, a-hole!");
    }
}

 class Machine {
    public void start() {
        System.out.println("Starting Run.Exe...");
    }
}

class Bob {
    String name;
    Bob(String n) {
        name = n;
    }
}

enum accountType {
    NORMAL,
    IRONMAN,
    HARDCORE_IRONMAN
}

class ABC {
    public void print() {
        System.out.println("a");
    }
    public void print(String str) {
        System.out.println("b");
    }
    public void print(int x) {
        System.out.println("c");
    }
}

class Loader extends Thread {
    public void run() {
        System.out.println("SUP!");
    }
}

class Loading implements Runnable {
    public void run() {
        System.out.println("We LIT");
    }
}

public class Classes {
    
    public static void main(String[] args) {
                
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        System.out.println(colors);
        colors.remove("Orange");
        System.out.println(colors);
        System.out.println(colors.get(1));
        System.out.println(colors.size());
        colors.clear();
        colors.add("Black");
        System.out.println(colors);
        System.out.println(colors.size());
        
        HashMap<String, Integer> pts = new HashMap<String, Integer>();
        pts.put("Amy", 154);
        pts.put("Dave", 42);
        pts.put("Rob", 733);
        System.out.println(pts.get("Dave"));
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        int numberOne = 0; 
        int numberTwo = (numberOne == 0)? 111:11;
        System.out.println(numberTwo);
        
        int numberThree = 12;
        int numberFour = 11;
        
        //boolean statusUpdate = true;
        if (!(numberThree != numberFour)) {
            System.out.println("They are not equal");
            System.out.println(numberThree + " =/= " + numberFour);
            //System.out.println(statusUpdate);
        } else {
            System.out.println("They are equal");
            System.out.println(numberThree + " = " + numberFour);
            //statusUpdate = true;
            //System.out.println(statusUpdate);
        }
        
        int dayOfWeek = 5;
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:  
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a valid day of the week"); 
        }
        
        byte loopTest = 0;
        while (loopTest < 10) {
            System.out.print(loopTest++);
            if (loopTest == 10) {
                System.out.println("");
            }
            //loopTest++;
        }
        
        byte doLoop = 11;
        do {
            System.out.println("Statement executed");
        } 
        while (doLoop < 10);
        
        for (byte forByte = 10; forByte < 15; forByte++) {
            System.out.print(forByte);
            if (forByte == 14) {
                System.out.println();
            }
        }
        
        System.out.println("--------- DIVIDER ---------");
        
        // Break [checks for clause & then stop code at that clause]
        for (byte biteOne = 1; biteOne < 10; biteOne++) {
            // NOTE: IF THE 'IF STATEMENT' WAS UP HERE THEN THE CODE
            // EXECUTION STOPS AT '7' AND '7' WILL NOT GET PRINTED
            // THIS MEANS THAT '6' IS THE LAST NUMBER TO BE PRINTED
            /*
            if (biteOne == 7) {
                System.out.println("No more code will be executed");
                System.out.println("Code stops at " + (biteOne - 1));
                System.out.println((biteOne) + " will not be printed");
                break;
            }
            */
            System.out.println(biteOne);
            if (biteOne == 7) {
                System.out.println("No more code will be executed");
                System.out.println("Code stops when counter = " + biteOne);
                break;
            }
        }
        
        System.out.println("--------- DIVIDER ---------");
        
        // Continue [skips the iteration & executes code]
        for (byte biteTwo = 1; biteTwo < 15; biteTwo++) {
            if (biteTwo == 7) {
                System.out.println(biteTwo + " is a lucky number");
                continue;
            }
            if (biteTwo == 11) {
                System.out.println(biteTwo + " is also lucky");
                continue;
            }
            // KEEP IN MIND THAT THE ABOVE HAS TO COME FIRST!!!
            // THE 'CONTINUE' STATEMENT MUST BE BEFORE ANYTHING ELSE!!!
            System.out.println(biteTwo);
        }
        
        // For Loop (Initialization; Condition; Execution) {...}
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        // QUIZ #2
        
        for (byte evenNumber = 0; evenNumber < 101; evenNumber += 2) {
            System.out.println(evenNumber);
        }
        
        System.out.println("--------- DIVIDER ---------");
        
        for (byte oddNumber = 1; oddNumber < 101; oddNumber +=2) {
            System.out.println(oddNumber);
        }
        
        System.out.println("--------- DIVIDER ---------");
        
        int totalNumber = 0;
        for (byte addNumbers = 0; addNumbers < 101; addNumbers++) {
            totalNumber += addNumbers;
        }
        System.out.println("The sum of numbers from 1 to 100 is " + totalNumber);
        
        double bigNumber = 3;
        for (int threeNum = 7; threeNum < 169; threeNum += 4) {
            bigNumber *= threeNum;
        }            
        System.out.println("Big number is " + bigNumber);
        
        /*
        double xyz = 1; 
        double xxy = 3; 
        double county = 4;
        while (xxy < 168) {
            xyz *= xxy; 
            xxy += county;
            if (xxy == 167) {
                System.out.print("The answer is: ");
            }
        } 
        System.out.println(xyz);
        */
                                                          
        // MASTER CHALLENGE - [HARD] - jk it's easy af //
        
        for (byte guessAge = 1; guessAge < 101; guessAge++) {
            System.out.println("Are you " + guessAge + "?");
            Scanner userAge = new Scanner(System.in);
            String realAge = userAge.nextLine();
            if (realAge.equalsIgnoreCase("yes")) {
                System.out.println("\nyou are " + guessAge + "\ngratz buddy!");
                break;}else{continue;}}
        
        // MASTER CHALLENGE - [HARD] - jk it's easy af //
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        // CHAPTER 4 // ARRAYS //
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] names = {"0. Bob", "1. David", "2. Jill", "3. John"};
        //System.out.println(names[2] + " " + arr[6] + arr.length);      
        
        for (String primes:names) {
            System.out.println(primes);
        }
        
        int sumNum = 0;
        for (byte arrayNumber = 0; arrayNumber < arr.length; arrayNumber++) {
            sumNum += arr[arrayNumber];
        } System.out.println(sumNum);
       
        int[] arz = new int[5];
        for (byte county = 0; county < 5; county++) {
            Scanner newNumber = new Scanner(System.in);
            System.out.println("Number " + county + " of 4");
            arz[county] += newNumber.nextInt();
        } 
        
        int sumTotal = 0;
        for (int ace:arz) {
            sumTotal += ace;
        } System.out.println("Sum is " + sumTotal);
        // CHAPTER 4 // ARRAYS //
  
        //System.exit(0);
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(36);
        num.add(73);
        num.add(40);
        num.add(1);

        Collections.sort(num);
        Collections.max(num);
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
        
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Snake");
        animals.add("Dog");
        
        Collections.sort(animals);
        System.out.println(animals);

        Thread mrt = new Thread(new Loading());
        try {
            Thread.sleep(69);
        } catch (Exception e) {
            //System.out.println("n0");
        }
        
        mrt.start();
        
        Loader load = new Loader();
        load.setPriority(10);
        load.start();
        
        int c1 = 10;
        int c2 = 0;
                
        try {
            int c3 = c1 / c2;
            System.out.println(c1 + "/" + c2 + "=" + c3);
        } catch (Exception e) {
            System.out.println("Only god can divide by 0");
        }
        
        ABC object = new ABC();
        // Pass nothing: 'a' is printed 
        // Pass a string: 'b' is printed
        // Pass an 'int': 'c' is printed
        object.print(120);
        
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.print(set.size() + "x ");
        System.out.println(set);
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        // The word "David" is an example of a parameter - you can change this
        sayHello("NoName");
        doMath(4.0);
        int aa = 20;
        int bb = 500;
        int val = sum(aa, bb);
        System.out.println(aa + " + " + bb + " = " + val);
        int res = returnMax(aa, bb);
        System.out.println(res + " > " + Math.min(aa, bb));
        Animal dog = new Animal();
        dog.bark();
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();
        Vehicle v4 = new Vehicle("Green");
        v1.setColor("Red");
        //System.out.print("Car is ");
        System.out.println("Car is " + v1.getColor());
        v1.horn();
        v1.setSpeed(100);
        //System.out.print("Speed is ");
        System.out.println("Speed is " + v1.getSpeed() + " km/h");
        v1.setFuel(6.8);
        System.out.println(v1.getFuel() + " litres remaining");
        System.out.println("Other car is " + v3.getColor());
        
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        passByValue();
        Counter c3 = new Counter();
        // Prints out '1' because only 1 instance in total is called
        System.out.println(Counter.COUNT);
        countCall();
        v3.horn();
        
        int ma = Math.abs(-20);
        double f = Math.ceil(9.9);
        int max = Math.max(aa, bb);
        int mat = Math.abs(Math.min(-6, 3));
        double p = Math.abs(Math.pow(-4,5));
        System.out.println(ma + ", " + f + ", " + max + ", " + mat + ", " + p);
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        final double PI = 3.14;
        System.out.print("Do you want some ");
        System.out.println(PI + "?");
        //PI++; // This will result in an error and Java won't let you run
        
        System.out.println("NTY, I'm good with water ");
                
        Doggie doggie = new Doggie(); // Animals Ax = new Doggie();
        doggie.makeSound(); // Ax.makeSound();
        
        Cat cat = new Cat(); // Animals Bx = new Cat();
        cat.makeSound(); // Bx.makeSound();
        
        // Looks for "class Bx()", but 'Bx' extends 'Ax' so 'Ax' gets executed first
        Bx obj = new Bx();
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        // Interfaces code
        Dragon dragon = new Dragon();
        dragon.eat();
        
        Creatures drag = new Dragon();
        drag.makeSound();
        
        int xyz = (int)3.14;
        double yyz = 42.571;
        int bad = (int) yyz;
        System.out.println(xyz + ", " + bad);
        
        Machine m1 = new Machine();
        m1.start();
        
        Machine m2 = new Machine() {
            @Override public void start() {
                System.out.println("Injecting Virus.exe...");
            }
        };
        m2.start();
        
        Bob b1 = new Bob("Billy");
        Bob b2 = new Bob("Billy");
        System.out.println("This is " + (b1 == b2));
        // Still returns 'false'
        //System.out.println(b1.equals(b2));
       
        accountType normal = accountType.NORMAL;
        accountType ironman = accountType.IRONMAN;
        accountType hc_ironman = accountType.HARDCORE_IRONMAN;
        
        switch (hc_ironman) {
            case NORMAL:
                System.out.println("Normal");
                break;
            case IRONMAN:
                System.out.println("Retarded");
                break;
            case HARDCORE_IRONMAN:
                System.out.println("Retarded AFFFF");
                
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        int aaa = 12;
        int bbb = 00;
        int and = div(aaa, bbb);
        
        try {
            File xxx = new File("/Users/chowdhaj/Desktop/input.rtf");
            Scanner sc = new Scanner(xxx);
            while (sc.hasNext()) {
                    System.out.println(sc.next());
            }	
            sc.close();	
        } catch (Exception e) {
            System.out.println("File Not Found!");
        }
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            //System.out.println("n0");
        }
        
        try {
            Formatter fx = new Formatter("/Users/chowdhaj/Desktop/input.txt");
            fx.format("%s%s%s%s", "1)", " John", " Donald", " Smith \r\n");
            fx.format("%s%s%s%s", "2)", " Amy", " Laura", " Brown");
            fx.close();
        } catch (Exception e) {
            System.out.println("File Not Found!");
        }
        
        // This is a single line comment
        
        /* And this
        is a multi
        line comment
        */
        
        int smallNumber = 69;
        double decimalNumber = 3.14159;
        String firstName = "Gordan";
        char firstLetter = 'D';
        boolean userName = true;
        
        int sum1, sum2, sum3;
        sum1 = 10 + 10;
        sum2 = sum1 + 10;
        sum3 = sum1 + sum2;
        
        int zum1, zum2, zum3;
        zum1 = 100 - 10;
        zum2 = zum1 - 10;
        zum3 = zum1 - zum2;
        
        double threeFX = zum3 % sum3;
        
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Are you a doing good?");
        String inputUser = inputFromUser.nextLine();
        if (inputUser.equalsIgnoreCase("maybe")) {
            System.out.println("I like your style; it's real fresh");
        } else if (inputUser.equalsIgnoreCase("no")) {
            System.out.println("Ya may deny it, but maybe you should relax.");
        } else if (inputUser.equalsIgnoreCase("yes")) {
            System.out.println("Good on you for telling the truth");
        } else {
            System.out.println("Invalid response!");
        }
        
         try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //System.out.println("n0");
        }
        
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        // Recieve length from user
        System.out.println("Gimme a Length?");
        Scanner userSuppliesNumber = new Scanner(System.in);
        double length = userSuppliesNumber.nextDouble();

        // Recieve width from user
        System.out.println("Now I need a Width?");
        double width = userSuppliesNumber.nextDouble();
        
        // Calculate and output area of square uno
        double areaSquareOne = Math.pow(length, 2);
        System.out.println("If length = " + length + ", then area = " + Math.ceil(areaSquareOne));
        
        // Calculate the output of area square deux
        double areaSquareTwo = Math.pow(width, 2);
        System.out.println("If width = " + width + ", then area = " + Math.ceil(areaSquareTwo));
        
        // Calulate area of rectange
        double areaRectangle = length * width;
        System.out.println("Area of rectangle is " + Math.ceil(areaRectangle));
        
        // Calculate area of triangle
        double areaTriangle = areaRectangle / 2;
        System.out.println("Area of triangle is " + Math.ceil(areaTriangle));
        
        // This is a divider to make the output window look cleaner
        for (int v = 0; v < 20; v++) {
            System.out.print("-");
            if (v == 19) {
                System.out.println("");
            }
        }
        
        int i = 0; 
        int m = (i == 0)? 10:5; 
        System.out.println(m); 
        
        // Code
        
    }
}
    
    static void Example() throws ArithmeticException, IndexOutOfBoundsException, IllegalArgumentException {
	// CODE
    }

    static int div(int aaa, int bbb) throws ArithmeticException {
        try {
             System.out.println("Answer is " + aaa/bbb);
        } catch (Exception e) {
            System.out.println("Only.Chuck.Norris.Can.Divide.By.Zero");
        }
        return 0;
    }
    
    // ----------------------------------- \\
    // JAVA PASSES BY VALUE, NOT REFERENCE \\
    // ----------------------------------- \\
    public static void passByValue() {             
        int cx = 5;
        addOneTo(cx);
        // Output of this is 5
        System.out.println(cx);
    }
    
    // The value, 5, is passed below, not 'int cx' - hence cx remains 5
    static void addOneTo(int cx) {
        // Output of this is 6
        System.out.println(++cx);
    }
    // ----------------------------------- \\
    // JAVA PASSES BY VALUE, NOT REFERENCE \\
    // ----------------------------------- \\
   
    // This is an example of a method
    static void sayHello(String name) {
        // When 'sayHello()' is called, "Hello" is printed to console
        System.out.println("Hello " + name);
    }

    // This is another method
    static void doMath(double x) {
        // Calculates the square root of a number and outputs it to console
        System.out.println("Square of " + x + " is " + Math.pow(x, 0.5));
    }

    // This method adds two numbers and returns the sum to main
    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    static int returnMax(int aa, int bb) 
    // This improper formatting of braces demonstrates that everything in Java
    // should be in a brace no matter what, and Java doesn't care about
    // formatting - it is done for proper conventions and readability.
    {if (aa > bb) {return aa;} else {return bb;}}
    
    static void countCall() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        // Prints out '3' because in total, 3 instances have been called
        System.out.println(Counter.COUNT);
    }
      
}
