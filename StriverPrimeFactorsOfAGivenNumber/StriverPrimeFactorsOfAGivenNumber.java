import java.util.*;
import java.util.stream.*;

public class StriverPrimeFactorsOfAGivenNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        int i = 2;
        while(input>1){
            if (input % i == 0) {
                System.out.print(i + " ");
                input = input / i;
            } else {
                i++;
            }
        }
    }
}
