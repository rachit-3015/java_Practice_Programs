import java.util.*;
import java.util.stream.*;

public class LargestAmongThreeNumbers{
    public static void main(String [] args){
        System.out.println("Enter three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest number is : "+a);
        }else if(b>c){
            System.out.println("Largest number is : "+b);
        }else{
            System.out.println("Largest number is : "+c);
        }
    }
}