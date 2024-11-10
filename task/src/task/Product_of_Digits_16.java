package task;
import java.util.Scanner;
public class Product_of_Digits_16 {
	 public static void main(String[] args) {
	        System.out.println("Enter the value to find  Product of Digits");
	        Scanner sc = new Scanner(System.in);
	        int val1 = sc.nextInt();
	        int product=1;
	        while (val1>0){
	            int last=val1%10;
	            product*=last;
	            val1/=10;
	        }
	        System.out.println("Product of Digits is "+product);
	    }
}
