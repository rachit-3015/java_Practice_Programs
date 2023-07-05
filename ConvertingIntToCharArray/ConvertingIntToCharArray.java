import java.util.*;
import java.util.stream.*;

public class ConvertingIntToCharArray{
    public static void main(String [] args){
        int a = 52145;
        int nums = String.valueOf(a).length();
        int digits = String.valueOf(a).toCharArray().length;
        int len = Integer.toString(a).length();
        System.out.println(nums+" "+digits+" "+len);
    }
}