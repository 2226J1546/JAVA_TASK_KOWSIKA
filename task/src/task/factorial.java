package task;
import java.util.Scanner;
public class factorial {
	 public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
		    System.out.print("Enter a number:");
		    int number=sc.nextInt();
		    int factorial = 1;
		    for (int i = 1; i <= number; i++) {
	                factorial =factorial* i;
	                System.out.println(factorial);
	            }
	            System.out.println("Factorial of " + number + " is: " + factorial);
	            for(int j=1;j<=number;j++){
	            if (number%j==0){
	                System.out.println(j);
	            }
	            }
	    }
}
