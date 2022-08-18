// The "Averagemarks" class.
//Average Mark Calculator
//Pavanjot Gill
//Oct. 13, 2010
import java.awt.*;
import java.io.*;
import java.text.*;

public class Averagemarks
{
    
    public static void main (String[] args) throws IOException
    {
    String strName, strStudentNumb, strMark1, strMark2, strMark3, strMark4, strTest1, strTest2, strTest3, strTest4;
    double dblMark1, dblMark2, dblMark3, dblMark4, dblStudentNumb, dblAvg;
    DataInputStream keyboard = new DataInputStream (System.in);
    System.out.println("Please enter your name");
    strName = keyboard.readLine();
    
    System.out.println("Please enter your student number");
    strStudentNumb = keyboard.readLine();
    
    System.out.println ("Please enter the chapter title for the first test");
    strTest1 = keyboard.readLine();
    
    System.out.println("Please enter the mark received in the first test");
    strMark1 = keyboard.readLine();
    
    System.out.println ("Please enter the chapter title for the second test");
    strTest2 = keyboard.readLine();
    
    System.out.println("Please enter the mark received in the second test");
    strMark2 = keyboard.readLine();
    
    System.out.println ("Please enter the chapter title for the third test");
    strTest3 = keyboard.readLine();
    
    System.out.println("Please enter the mark received in the third test");
    strMark3 = keyboard.readLine();
    
    System.out.println ("Please enter the chapter title for the fourth test");
    strTest4 = keyboard.readLine();
    
    System.out.println("Please enter the mark received in the fourth test");
    strMark4 = keyboard.readLine();

    
    dblMark1 = Double.valueOf(strMark1).doubleValue();
    dblMark2 = Double.valueOf(strMark2).doubleValue();
    dblMark3 = Double.valueOf(strMark3).doubleValue();
    dblMark4 = Double.valueOf(strMark4).doubleValue();
    dblStudentNumb = Double.valueOf(strStudentNumb).doubleValue();
    //conversion code from string to double without changing the above codes
    dblAvg = (dblMark1+dblMark2+dblMark3+dblMark4)/4;
    //Calculate the average by adding all the marks inputted anddividing by 4
    DecimalFormat x = new DecimalFormat ("######");
    DecimalFormat z = new DecimalFormat ("##.#");
    //Formats the numbers so that it gets rounded and is not a very long decimal number
    System.out.println("__________________________");
    System.out.println("Name:                          " + strName);
    System.out.println("Student Number:                " + x.format(dblStudentNumb));
    System.out.println(strTest1 + ": " + z.format(dblMark1)+"%");
    System.out.println(strTest2 + ": " + z.format(dblMark2)+"%");
    System.out.println(strTest3 + ": " + z.format(dblMark3)+"%");
    System.out.println(strTest4 + ": " + z.format(dblMark4)+ "%");
    System.out.println("Your average grade is:         " + z.format(dblAvg)+ "%");
   
    

	
    } // main method
} // Averagemarks class
