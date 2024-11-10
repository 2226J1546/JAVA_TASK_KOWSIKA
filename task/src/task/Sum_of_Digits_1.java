package task;
import java.util.Scanner;
public class Sum_of_Digits_1 {
       public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter a number:");
          int number=sc.nextInt();
          int sumresult=0;
          String numberStr = Integer.toString(number);
          System.out.println(numberStr);
          for (int i = 0; i < numberStr.length(); i++) {
        	    char digitChar = numberStr.charAt(i);
        	    int digit = Character.getNumericValue(digitChar);
        	    sumresult+=digit;
        	}
          System.out.println(sumresult);
          }
       }