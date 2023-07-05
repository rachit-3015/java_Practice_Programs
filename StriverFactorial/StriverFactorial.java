import java.util.*;
import java.util.stream.*;

public class StriverFactorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        System.out.println("The answer would be "+ factorial(input));
    }
    private static int factorial(int input){
        if(input == 0 || input == 1){
            return 1;
        }
        return input*factorial(input-1);
    }
}