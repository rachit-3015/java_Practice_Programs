import java.util.*;
import java.util.stream.*;

public class ReverseANumber{
    public static void main(String [] args){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int origin=0;
        int temp=0;
        while(num>0){
            temp=num%10;
            origin=(origin*10)+temp;
            num = num /10;
        }
        System.out.println("The reversed number would be "+origin);
    }
}