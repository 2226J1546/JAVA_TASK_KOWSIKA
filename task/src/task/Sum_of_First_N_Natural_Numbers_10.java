package task;
import java.util.Scanner;
public class Sum_of_First_N_Natural_Numbers_10 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
    int number=sc.nextInt();
    int result=0;
    for (int i=0;i<=number;i++) {
    	result+=i;
    }
    System.out.print("Sum of natural number:"+result);
}
}
