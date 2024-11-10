package task;
import java.util.Scanner;
public class Sum_of_Squares_of_Digits_11 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number:");
	 int number=sc.nextInt();
	 int no=number;
	 int result=0;
	 while(no!=0) {
	 int num=no%10;
	 result+=num*num;
	 no/=10;
	 }
	 System.out.println(result);
 }
}
