/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alotofloops;
import java.util.*;
/**
 *
 * @author ddj10
 */
public class AlotOfLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int i = 11;
        
        do
        {
            System.out.printf("%d - executing!\n", i);
            i++;
        }while (i < 100);
             
          
        boolean isValidated = false;  
            
        
        
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Running security check...");
            System.out.println("Enter your username:");
            
            String userName = input.nextLine();
        
            isValidated = userName.equalsIgnoreCase("Fred");
        
        
        } while (!isValidated);
        
        System.out.println("Demonstration complete!");
    }
}

