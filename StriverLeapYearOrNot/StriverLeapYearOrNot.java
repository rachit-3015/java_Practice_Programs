import java.util.*;
import java.util.stream.*;


public class StriverLeapYearOrNot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int input = sc.nextInt();

        if(input % 400 == 0){
            System.out.println("Year is a leap year divisible by 400");
        }else if(input % 4 == 0){
            System.out.println("Year is a leap year divisible by 4");
        }else{
            System.out.println("Year is not a leap year");
        }
    }
}