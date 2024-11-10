package task;

import java.util.Scanner;

public class ProductOfDigits_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        int product = 1; // Start with 1 because multiplying by 0 results in 0
        
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            product *= digit;        // Multiply it to the product
            number /= 10;            // Remove the last digit
        }
        
        System.out.println("Product of the digits: " + product);
    }
}
