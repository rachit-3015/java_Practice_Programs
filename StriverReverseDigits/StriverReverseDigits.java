import java.util.*;
import java.util.stream.*;

public class StriverReverseDigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int input = sc.nextInt();
        int store = 0;

        while(input>0){
            int lastDig = input % 10;
            input = input / 10;
            store = store * 10 +lastDig;
        }
        System.out.println(store);
    }
}