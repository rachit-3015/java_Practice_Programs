import java.util.*;
import java.util.stream.*;

public class PalindromeInGivenRange{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max : ");
        int max = sc.nextInt();
        System.out.println("Enter min : ");
        int min = sc.nextInt();
        for(int i = min ; i <= max ; i++){
            if(isPalindrome(i)){
                System.out.println(i+" ");
            }
        }


    }
    private static boolean isPalindrome(int num){
        int check = num;
        int value = 0;
        while(num>0){
            int lastDig = num % 10;
            value = value * 10 + lastDig;
            num = num / 10;
        }
        // System.out.println("This is the value is formed"+value);
        return value == check;
    }
}