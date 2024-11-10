package task;
	import java.util.Scanner;

	public class Find_the_Nth_Prime_Number_22{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the value of N:");
	        int n = scanner.nextInt();
	        
	        int count = 0;  // To count prime numbers
	        int number = 2; // Starting from the first prime number
	        
	        while (true) {
	            if (isPrime(number)) {
	                count++;
	                if (count == n) {
	                    System.out.println("The " + n + "th prime number is: " + number);
	                    break;
	                }
	            }
	            number++;
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}