package task;
import java.util.Scanner;
public class Perfect_Number_7 {
    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false; 
        }
        int sumOfDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean result = isPerfectNumber(number);
        System.out.println(result); 
    }
}
