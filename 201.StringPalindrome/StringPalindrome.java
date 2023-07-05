import java.util.*;
import java.util.stream.*;

public class StringPalindrome{
    public static void main(String [] args){
        String str = "aba";
        boolean bool = checkPalindrome(str);
        System.out.println(bool);
    }
    public static boolean checkPalindrome(String str){
        StringBuilder strbd = new StringBuilder(str).reverse();
        String strOne = strbd.toString();
        if(str.equals(strOne)){
            return true;
        }else{
            return false;
        }
    }
}