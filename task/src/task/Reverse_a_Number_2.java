package task;
import java.util.Scanner;
public class Reverse_a_Number_2 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int number=sc.nextInt();
    int numberrev=0;
    int or=number;
    int reversedNumber =0;
    while(or!=0) {
    	int snumberrev=or%10;
    	 reversedNumber = reversedNumber + snumberrev;
    	or/=10;
   	 System.out.println(snumberrev);

    }
    
    }
}