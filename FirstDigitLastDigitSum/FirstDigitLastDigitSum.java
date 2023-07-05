import java.util.*;
import java.util.stream.*;

public class FirstDigitLastDigitSum{
    public static void main(String [] args){

        // first approach
        int value = 134;
        String str = String.valueOf(value);
        char [] arr = str.toCharArray();
        int sum = Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[arr.length-1]);
        System.out.println("First Digit : "+str.charAt(0));
        System.out.println("Last Digit : "+str.charAt(str.length()-1));
        System.out.println("Sum would be "+sum);
    
        System.out.println("\n\n");

        // second approach
        int target = 134;
        int firstDigit = target%10;
        int lastDigit = target;
        while(lastDigit>10){
            lastDigit=lastDigit/10;
        }
        System.out.println("First Digit : "+lastDigit);
        System.out.println("Last Digit : "+firstDigit);
        System.out.println("Sum would be "+(firstDigit+lastDigit));
    
    }
}