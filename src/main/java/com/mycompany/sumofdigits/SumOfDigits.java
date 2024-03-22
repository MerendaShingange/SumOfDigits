/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofdigits;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        // Print sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
        
    

