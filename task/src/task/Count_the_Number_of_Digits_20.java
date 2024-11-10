package task;
import java.util.Scanner;

public class Count_the_Number_of_Digits_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        int count = 0;
        
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;      // Increment the count
        }
        
        System.out.println("Number of digits: " + count);
    }
}
