import java.util.*;
import java.util.stream.*;

public class ArmstrongNumber{
    public static void main(String [] args){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String str = String.valueOf(input);
        int size = str.length();
        int store = input;
        int sum = 0;
        for(int i = 0 ; i < size ; i++ ){
            int digit = input % 10;
            int multiply=1;
            for(int j = 0 ; j < size ; j++){
                multiply= multiply*digit;
            }
            sum = sum + multiply;
            input = input / 10;
        }
        if(store == sum){
            System.out.println("It's a ArmstrongNumber");
            System.out.println("Input : "+store);
            System.out.println("Output : "+sum);
        }else{
            System.out.println("It's not a ArmstrongNumber");
            System.out.println("Input : "+store);
            System.out.println("Output : "+sum);
        }

        System.out.println("\n\n\n");
        
    }
}