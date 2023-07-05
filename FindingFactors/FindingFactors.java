import java.util.*;
import java.util.stream.*;

public class FindingFactors{
    public static void main(String [] args){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        for(int i = 1 ; i <= digit ; i++ ){
            if(digit%i==0){
                System.out.print(i+" ");
            }
        }
    }
}