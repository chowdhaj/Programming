package programs;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 * @ideas Start Here
 * @author Chowdhaj
 */
public class CurseWordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Account for "A" & "An"
        
        // Size Of Arrays
        int n = 21;
        
        // First Wave of Curses
        String [] curseWords1 = {
            "Lazy", "Not-Smart", "Not-Secure",
            "Lame", "Smelly", "Stinky",
            "Small", "Poopy", "Cookie",
            "Nosy", "Eaty", "Ragged",
            "Else", "Bad", "Weird",
            "Butter", "Tone", "Not-Good",
            "Creepy", "Sighty", "Awkward"
        };
        
        // Second Wave of Curses
        String [] curseWords2 = {
            "Lazy", "Not-Smart", "Not-Secure",
            "Lame", "Smelly", "Stinky",
            "Small", "Poopy", "Cookie",
            "Nosy", "Eaty", "Ragged",
            "Else", "Bad", "Weird",
            "Butter", "Tone", "Not-Good",
            "Creepy", "Sighty", "Awkward"
        };
        
        // Last Wave of Curses
        String [] curseWords3 = {
            "Lazy", "Not-Smart", "Not-Secure",
            "Lame", "Smelly", "Stinky",
            "Small", "Poopy", "Cookie",
            "Nosy", "Eaty", "Ragged",
            "Else", "Bad", "Weird",
            "Butter", "Tone", "Not-Good",
            "Creepy", "Sighty", "Awkward"
        };
        
        int count = 0;
        int county = 0;
        while (count < 1) { // Change the "1" to "100" to generate more slurs
        
            // Generates Random Number
            Random rand = new Random();
        
            // Int X
            int x = rand.nextInt(n) + 0;
            
            // Int Y
            int y = rand.nextInt(n) + 0;
        
            // Int Z
            int z = rand.nextInt(n) + 0;

            //Generate Curse Words
            System.out.println(curseWords1[x] + " " + curseWords2[y] + " " + curseWords3[z]);
            count++;
        }
    }
}