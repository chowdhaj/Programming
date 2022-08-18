package lesson.examples; // Location of our class file is inside two packages, 'lesson', and 'examples', respectively

import java.util.Random; // Imports the random number generator built into the JDK

public class RandomExample {

    public static void main(String[] args) {
    	
    	// PSEUDO-RANDOM GENERATOR //
    	
    	Random generatorPseudo = new Random(); // Creates an object of type random called 'generator' - a new object of type random
    	
    	int i = generatorPseudo.nextInt(10); // Assigns 'i' a pseudo-random number from 0 - 9					
        System.out.println(i); // Prints 'i' to console
        
        i = generatorPseudo.nextInt(15); // Assigns 'i' a pseudo-random number from 0 - 14
        System.out.println(i); // Prints 'i' to console
        
        i = generatorPseudo.nextInt(20); // Assigns 'i' a pseudo-random number from 0 - 19
        System.out.println(i); // Prints 'i' to console
        
        divider(); // Calls our divider method
        
        // SEEDED-RANDOM GENERATOR //
        
        Random generateSeed = new Random(1); // Creates an object of type random called 'generateSeed' // Assigns a seed of 1
        
        int j = generateSeed.nextInt(10); // Assigns 'j' a seed-random number // Since the seed is 1, 'j' gets 5
        System.out.println(j); // Prints 'j' to console
        
        j = generateSeed.nextInt(10); // Assigns 'j' a seed-random number // Since the seed is 1, 'j' gets 8
        System.out.println(j); // Prints 'j' to console
        
        j = generateSeed.nextInt(10); // Assigns 'j' a seed-random number // Since the seed is 1, 'j' gets 7
        System.out.println(j); // Prints 'j' to console
    }
    
    // This is our divider method - ignore this - it makes the output look cleaner [divides the pseudo-random numbers from seeded numbers]
    public static void divider() { System.out.println("---"); }
}

/*

*** Background Info ***

When you provide a 'seed' to 'Random()' it will generate the same set of numbers over and over again. Refer to example above

Seeding is useful when you want to test out a scenario over and over again [useful for testing games]. When you are... 
... testing a game, you need predictability, and when you are playing a game, you need unpredictability. By seeding the...
... random number generator, you will always get the same set of numbers

The instructions for how to use a class can be found in the Java Docs. Just google them up like this: "java random javadocs"


*** Brief Synopsis Of Pseudo-Random ***

Believe it or not, but truly randomizing numbers with a computer is very a difficult problem in CS. This is because... 
... a computer is a machine that has very specific rules and instructions built into it, which means that everything is...
... calculated. And since everything is a function, it is hard to create randomness since the computer follows instructions

Seed: A number input [AKA specific seed] into a random generator to produce a specific sequence of random numbers. This...
... helps with testing code and replaying a specific scenario

Check out http://www.random.org/randomness/

*/