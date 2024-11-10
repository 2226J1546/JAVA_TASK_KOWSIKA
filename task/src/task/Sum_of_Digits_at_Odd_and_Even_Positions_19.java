package task;

public class Sum_of_Digits_at_Odd_and_Even_Positions_19 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        int oddSum = 0, evenSum = 0;
        int position = 1; // Start from position 1
        
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            
            if (position % 2 != 0) { // Odd position
                oddSum += digit;
            } else { // Even position
                evenSum += digit;
            }
            
            number /= 10; // Remove the last digit
            position++;  // Move to the next position
        }
        
        System.out.println("Odd Position Sum: " + oddSum);
        System.out.println("Even Position Sum: " + evenSum);
    }
}
