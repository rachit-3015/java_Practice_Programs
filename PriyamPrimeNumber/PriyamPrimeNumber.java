import java.util.*;
import java.util.stream.*;

public class PriyamPrimeNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input = sc.nextInt();

        int count = 0;

        int j = 2;
        int innerCount = 0;
        while(count<input){
            for(int i = 1; i <= j/2 ; i++){
                if(j % i == 0){
                    innerCount++;
                }
            }
            if(innerCount == 1){
                System.out.print(j+" ");
                count++;
            }
            j++;
            innerCount = 0;
            

        }
        
    }
}