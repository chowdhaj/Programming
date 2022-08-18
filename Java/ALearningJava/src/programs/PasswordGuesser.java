package programs;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 * @ideas Start Here
 * @author Anon
 */
public class PasswordGuesser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * @ideas
     * Account For Case Sensitivity
     * Have More Password Options
     * Add More Hints
     * Panels Should Have Titles
     * Modify Panels To Have Custom Options: "Yes & Yes"
     * More Fail-Safes
    */        
        // Welcome message
        System.out.println("Come & Guess My Password LOL");
        
        // You won't crack it cuz its hard
        System.out.println("Only Smart People Will Crack It");
        
        // The guess field is empty
        String guess = "";
        //String guess1 = "";
        
        // Our counter
        byte i = 0;
        byte bite = 0;

        // Declare a string
        String str = "USA";    
        String bos = "boss";  
        
        // Make the string final and immutable
        final String pwd = str;
        
        String hint1 = "Hint: Obama was the president of _ _ _";
        String hint2 = "Hint: George Washington was born in _ _ _";
        
        while (guess == null || !guess.equals(pwd)) {
            guess = JOptionPane.showInputDialog(null,"Guess my SUPER SECRET password");
            
                if (!guess.equals(pwd)) {
                    JOptionPane.showMessageDialog(null, "Try Harder");
                    i++;
                    }
                
                if (i == 3) {
                    i++;
                    JOptionPane.showMessageDialog(null, hint1);
                    JOptionPane.showMessageDialog(null, hint2);

                    
                if (i == 10) {
                    i++;
                    JOptionPane.showMessageDialog(null, "Hint: The country below Canada is _ _ _");
                }     
                }
            }
     
        if (guess.equals(pwd)) {
            JOptionPane.showMessageDialog(null,"How did you crack it???");
            
        JOptionPane.showConfirmDialog(null, "Are you a " + bos + "?");
        JOptionPane.showMessageDialog(null, "You must be a " + bos);
        }
    }
    
    }