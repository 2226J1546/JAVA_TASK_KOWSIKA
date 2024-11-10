package task;
import java.util.Scanner;
public class Find_the_nth_Fibonacci_Number_9 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int number=sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	System.out.println(a);
	for(int i=0;i<=number;i++)
	{
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
	}
	
}
}
