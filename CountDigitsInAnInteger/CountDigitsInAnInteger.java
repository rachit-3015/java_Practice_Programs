import java.util.*;
import java.util.stream.*;

public class CountDigitsInAnInteger{
    public static void main(String [] args){
        
        // first approach
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  count = 0;
        while(num>0){
            num = num /10;
            count++;
        }
        System.out.println("Given Integer has "+ count + " no of digits");

        //second approach
        System.out.println("Enter a number : ");
        int digits = sc.nextInt();
        String str = String.valueOf(digits);
        char ch [] = str.toCharArray();
        System.out.println(ch.length);
    }
}