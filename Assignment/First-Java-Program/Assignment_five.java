/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_five;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_five {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Take 2 numbers as input and print the largest number.
       Scanner in = new Scanner (System.in);
       System.out.println("Enter two number: ");
       double a = in.nextDouble();
        double b = in.nextDouble();
        if (a>b)
            System.out.println(a+" is greaterthen ");
        else
            System.out.println(b+" is greater then");
    }
    
}
