package task;
import java.util.Scanner;
public class Sum_of_Digits_Until_Single_Digit_14 {
	public static void main(String[] args) {
        System.out.println("Enter the value to find  Sum of Digits Until Single Digit");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        System.out.println(unitdigit(val1));

    }

    public  static  int unitdigit(int val1){
       int sum=0;
        while (val1>0){
            int last=val1%10;
            sum+=last;

            val1/=10;
        }

        return  sum>9? unitdigit(sum) : sum;
    }
}
