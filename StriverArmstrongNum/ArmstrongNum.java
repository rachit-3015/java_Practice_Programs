import java.util.*;
import java.util.stream.*;

public class ArmstrongNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int input = sc.nextInt();
        int store = input;
        int length = String.valueOf(input).length();
        int sum = 0;
        while(input>0){
            int lastDig = input % 10;
            sum += (int)Math.pow(lastDig,length);
            input = input / 10;
        }
        if(sum == store){
            System.out.println("Yes,it is an armstrong num "+sum);
        }else{
            System.out.println("No,it is not an armstrong num "+sum);
        }
    }
}

