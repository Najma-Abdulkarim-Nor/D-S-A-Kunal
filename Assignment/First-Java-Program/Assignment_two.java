/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_two;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Take name as input and print a greeting message for that particular name.
        
        Scanner in = new Scanner (System.in);
        
       System.out.println("Enter your name: ");
       String name = in.nextLine();
       System.out.println("Life might throw challenges at you, but you are the one in charge of your future! Good luck!" + name);
        
    }
    
}
