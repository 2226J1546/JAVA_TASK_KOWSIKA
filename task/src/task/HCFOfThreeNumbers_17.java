package task;

import java.util.Scanner;

public class HCFOfThreeNumbers_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int hcf = findHCF(num1, findHCF(num2, num3));
        
        System.out.println("HCF of " + num1 + ", " + num2 + ", and " + num3 + " is: " + hcf);
    }

    // Method to calculate HCF of two numbers
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
