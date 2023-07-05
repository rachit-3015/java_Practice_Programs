import java.util.*;
import java.util.stream.*;

public class LogiliteDecimalToBinary {
    public static void main(String [] args){
        System.out.println("Enter a Decimal Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int store = num;
        StringBuilder sb = new StringBuilder();

        while(num>0){
            int reminder = num%2;
            num = num/2;
            sb.insert(0,reminder);
        }
        System.out.println(sb);
    }
}