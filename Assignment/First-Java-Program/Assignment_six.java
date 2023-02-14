/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_six;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_six {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //6: Input currency in rupees and output in USD.
        
       Scanner in = new Scanner (System.in);
       System.out.println("Enter rupees: ");
       float r = in.nextFloat();
       float USD = r/83;
        System.out.printf("Value of USD is %.2f\n", USD);    }
    
}
