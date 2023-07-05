import java.util.*;
import java.util.stream.*;

public class DecimalToOctal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal no : ");
        int input = sc.nextInt();
        int digit = input;
        StringBuilder sb = new StringBuilder();

        while(digit > 0){
            int lastDig = digit % 8;
            digit = digit/8;
            sb.insert(0,lastDig);
        }
        System.out.println(sb);
    }
}