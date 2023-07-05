import java.util.*;
import java.util.stream.*;

public class StriverPerfectNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= input/2 ; i++){
            if(input % i == 0){
                sum += i;
            }
        }
        if(input == sum){
            System.out.println(input + " is a perfect number");
        }else{
            System.out.println(input + " is not a perfect number");
        }
    }
}