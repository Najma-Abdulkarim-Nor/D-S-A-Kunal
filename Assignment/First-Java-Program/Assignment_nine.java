/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_nine;

import java.util.Scanner;

/**
 *
 * @author na7ma
 */
public class Assignment_nine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //To find Armstrong Number between two given number.
        

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start_num = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end_num = scanner.nextInt();

        // Check each number between the start and end values
        for (int num = start_num; num <= end_num; num++) {
            // Calculate the sum of digits raised to the power of number of digits
            int sum = 0;
            int order = Integer.toString(num).length();
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, order);
                temp /= 10;
            }

            // Check if the number is Armstrong
            if (num == sum) {
                System.out.println(num);
            }
        }
    }
    
}
