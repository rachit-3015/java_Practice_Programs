import java.util.*;
import java.util.stream.*;

public class WhetherGivenNumberIsPerfectSquare{
    public static void main(String [] args){
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean bool = false;
        for(int i = 0 ; i < num ; i++){
            if(i*i == num){
                System.out.println("Given number is square of : "+i);
                bool = true;
                break;
            }
        }
        if(bool==false){
            System.out.println("Given number is not perfect square of any number");
        }
    }
}