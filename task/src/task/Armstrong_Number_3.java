package task;
import java.util.Scanner;
public class Armstrong_Number_3 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int number=sc.nextInt();
    	if(isAmstrong(number)) {
    		System.out.println("The given number is amstrong number");
    	}
    	else {
    		System.out.println("The given number is not amstrong number");
    	}
    }
    public static boolean isAmstrong(int num) {
    	int originalNumber=num;
    	int newNumber=0;
    	while (num!=0) {
    		int resu=num%10;
    		 newNumber+=Math.pow(resu,3);
    		num/=10;
    		System.out.println( newNumber);
    	}
    	 return newNumber == originalNumber;
    }
}