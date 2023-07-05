import java.util.*;
import java.util.stream.*;

public class CalculateSumOfIntegersFromString{
    public static void main(String [] args){
        String str = "Welcome to 123 to 13 new city 63";

        //first way 
        int sum = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum = sum + Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);

        // second approach
        sum=0;
        String [] strArr = str.split(" ");
        for(String s : strArr){
            if(s.matches("\\d+")){
                sum = sum + Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}