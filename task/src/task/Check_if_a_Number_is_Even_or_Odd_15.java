package task;
import java.util.Scanner;
public class Check_if_a_Number_is_Even_or_Odd_15 {
	 public static void main(String[] args) {
	        System.out.println("Enter the value to find Even or Odd");
	        Scanner sc = new Scanner(System.in);
	        int val1 = sc.nextInt();
	        if (val1%2==0){
	            System.out.println("Even");
	        }
	        else {
	            System.out.println("Odd");
	        }

	    }
}
