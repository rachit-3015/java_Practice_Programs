import java.util.*;
import java.util.stream.*;


public class ReverseTheString{
    public static void main(String [] args){
        String str = "I am Suraj";
        StringBuilder strbd = new StringBuilder(str).reverse();
        String strOne = strbd.toString();
        System.out.println(strOne);
    }
}