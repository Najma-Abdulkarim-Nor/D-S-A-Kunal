/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_seven;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_seven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner (System.in);
        int a=0;
        int b=1;
        int fib=0;
     
          System.out.println("enter number: ");
          int num = in.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(fib);
             fib =a+b;
             a=b;
             b=fib;
             
             
             
        }
    }
    
}
