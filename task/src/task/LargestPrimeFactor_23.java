package task;

import java.util.Scanner;

public class LargestPrimeFactor_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        int largestPrimeFactor = findLargestPrimeFactor(number);
        
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor);
    }

    // Method to find the largest prime factor
    public static int findLargestPrimeFactor(int n) {
        int largestFactor = -1;

        // Divide out factors of 2
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If n is still greater than 2, then it is prime itself
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }
}

