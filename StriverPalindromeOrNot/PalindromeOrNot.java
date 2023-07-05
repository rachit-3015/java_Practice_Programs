import java.util.*;
import java.util.stream.*;


public class PalindromeOrNot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();

        if(reverse(input)==input){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    private static int reverse(int input){
        int rev = 0;

        while(input>0){
            int lastDig = input % 10;
            rev = rev * 10 + lastDig;
            input = input / 10;
        }
        return rev;
    }
}