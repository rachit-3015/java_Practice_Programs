import java.util.*;
import java.util.stream.*;


public class OctalToDecimal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number : ");
        int input = sc.nextInt();
        int digit = input;
        int ans = 0;
        int count = 0;

        while(digit>0){
            int lastDig = digit % 10;
            digit = digit /10 ;
            ans += lastDig * Math.pow(8,count);
            count++;
        }
        System.out.println(ans);
    }
}