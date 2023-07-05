import java.util.*;
import java.util.stream.*;

public class StriverFibonacci{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number : ");
        int input = sc.nextInt();

        int secondLast = 0;
        int last = 1;
        System.out.print(0+" "+1+" ");
        while(input-2>0){
            int result = last + secondLast;
            System.out.print(result+" ");
            secondLast = last;
            last = result;
            input--;
        }
    }
    private static void getFib(int input){
        if(input<0){
            return;
        }
        System.out.println(getFib(input-1)+getFib(input-2));
    }
    
}
