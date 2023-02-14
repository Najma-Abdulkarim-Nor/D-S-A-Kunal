/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_eight;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_eight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //To find out whether the given String is Palindrome or not.
            Scanner in = new Scanner (System.in);
            System.out.println("Enter String: ");
            String str = in.nextLine();
              str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
             boolean isPalindrome = true;
             
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
            if(isPalindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Is no Palindrome");
            
            
    }
    
}
