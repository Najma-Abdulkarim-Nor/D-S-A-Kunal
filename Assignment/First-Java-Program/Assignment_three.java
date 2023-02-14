/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_three;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner (System.in);
        System.out.println("Enter principal: ");
        double p = in.nextDouble();
        
        System.out.println("Enter time : ");
        double t = in.nextDouble();
        
        System.out.println("Enter rate: ");
        double r = in.nextDouble();
        
        double i = (p*t*r)/100;
        
        System.out.println("the simple interest is " + i);
    }
    
}
