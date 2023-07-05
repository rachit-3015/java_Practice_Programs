import java.util.*;
import java.util.stream.*;

public class SumOfDigitsOfNumber{
    public static void main(String [] args){
        System.out.println("Enter a number to get it's sum : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = 0;
        while(num>0){
            temp=num%10;
            sum = sum + temp;
            num = num/10;
        }
        System.out.println("The addition of given number of digits is : "+sum);
    }
}