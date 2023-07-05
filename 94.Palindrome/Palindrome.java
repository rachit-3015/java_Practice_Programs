import java.util.*;
import java.util.stream.*;

public class Palindrome{
    public static void main(String [] args){
        String str = "aba";
        boolean bool = checkPalindrome(str);
        System.out.println(bool);
    }
    public static boolean checkPalindrome(String str){
        StringBuilder strbd = new StringBuilder(str).reverse();
        String compare = strbd.toString();
        if(compare.equals("aba")){
            return true;
        }else{
            return false;
        }
    }
}