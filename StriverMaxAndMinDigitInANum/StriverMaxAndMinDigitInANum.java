import java.util.*;
import java.util.stream.*;

public class StriverMaxAndMinDigitInANum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(input>0){
            int lastDig = input % 10;
            input = input / 10;
            max = max < lastDig ? lastDig : max ;
            min = min > lastDig ? lastDig : min ;
        }
        System.out.println(max+" "+min);
    }
}