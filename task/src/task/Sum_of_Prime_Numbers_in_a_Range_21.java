package task;
	import java.util.Scanner;

	public class Sum_of_Prime_Numbers_in_a_Range_21 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the start of the range:");
	        int start = scanner.nextInt();
	        
	        System.out.println("Enter the end of the range:");
	        int end = scanner.nextInt();
	        
	        int sum = 0;
	        
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }
	        
	        System.out.println("Sum of prime numbers between " + start + " and " + end + ": " + sum);
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