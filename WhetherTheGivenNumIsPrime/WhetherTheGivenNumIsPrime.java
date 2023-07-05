import java.util.*;
import java.util.stream.*;

public class WhetherTheGivenNumIsPrime{
    public static void main(String [] args){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 2 ; i < num ; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("It's Prime");
        }else{
            System.out.println("It's not Prime");
        }

    }
}