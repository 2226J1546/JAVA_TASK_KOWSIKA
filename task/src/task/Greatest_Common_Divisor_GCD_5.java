package task;
import java.util.Scanner;
public class Greatest_Common_Divisor_GCD_5 {
	public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number:");
   int number1=sc.nextInt();
   Scanner sc1=new Scanner(System.in);
   System.out.print("Enter a number:");
   int number2=sc1.nextInt();
   int result=number1/number2;
   System.out.println(result);
   }
}