package task;

import java.util.Scanner;

public class PowerOfTwo_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        boolean isPowerOfTwo = checkPowerOfTwo(number);
        
        if (isPowerOfTwo) {
            System.out.println("True (The number " + number + " is a power of two)");
        } else {
            System.out.println("False (The number " + number + " is not a power of two)");
        }
    }

    // Method to check if a number is a power of two
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0; // Uses bitwise AND
    }
}
