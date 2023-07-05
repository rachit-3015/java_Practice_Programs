import java.util.*;
import java.util.stream.*;

public class ReverseStringUsingRecursion{
    public static void main(String [] args){
        String str = "Sandy";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        if(str.length()<=0){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}