import java.util.*;
import java.util.stream.*;

public class StriverSumOfAP{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Point : ");
        int start = sc.nextInt();
        System.out.println("Difference of : ");
        int diff = sc.nextInt();
        System.out.println("Num of times : ");
        int limit = sc.nextInt();
        int previousSum = start;
        int sum = previousSum;
        for(int i = 0 ; i < limit-1; i++){
            previousSum = previousSum + diff;
            sum = sum + previousSum;
        }
        System.out.println(sum);
    }
}