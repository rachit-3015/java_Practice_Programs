import java.util.*;
import java.util.stream.*;

public class SortingCharInString{
    public static void main(String [] args){
        String str= "Rachit Patel";
        char ch [] = str.toCharArray();
        Arrays.sort(ch);
        String strNew = new String(ch);
        System.out.println(strNew);
    }
}