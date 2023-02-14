/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_four;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner (System.in);
        
//        int a=10;
//        int b=8;
//        
//        int sum = a+b;
//        int sub = a-b;
//        int multi = a*b;
//        int div = a/b;
        System.out.println("Enter two numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        System.out.println("Choose the operation " + "+ , -, *, /");
        char op = in.next().charAt(0);
        
       if (op == '+')
           System.out.println("the sum of two numbers are: "+ (a+b));
        
       else if (op == '-')
           System.out.println("the sub of two numbers are: "+ (a-b));
       else if (op == '*')
           System.out.println("the multiplication of two numbers are: "+ (a*b));
       else if (op == '/')
           System.out.println("the divition of two numbers are: "+ (a/b));
        
            

        
    }
    
}
