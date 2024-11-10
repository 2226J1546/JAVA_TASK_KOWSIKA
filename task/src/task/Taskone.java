package task;
import java.util.Scanner;
public class Taskone{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();
        int reversedNumber = 0;
        int temp = originalNumber;
        System.out.print(temp);
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            System.out.println(reversedNumber); 
            temp /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("The given number is a palindrome"); 
        } else {
            System.out.println("The given number is not a palindrome"); 
        }
    }
}