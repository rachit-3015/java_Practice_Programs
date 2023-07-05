import java.util.stream.*;
import java.util.*;

public class ConvertBinaryToDecimal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int input = sc.nextInt();
        int digit = input;
        int count = 0;
        int ans = 0;
        while(digit>0){
            int lastDig = digit % 10;
            digit = digit / 10;
            ans += lastDig *(int)Math.pow(2,count);
            count++;
        }
        System.out.println(ans);


    }
}