import java.util.*;
import java.util.stream.*;

public class StringAnagram{
    public static void main(String [] args){
        String strOne = "Rachit";
        String strTwo = "achRit";
        char chOne [] = strOne.toCharArray();
        char chTwo [] = strTwo.toCharArray();
        Arrays.sort(chOne);
        Arrays.sort(chTwo);
        System.out.println(Arrays.equals(chOne,chTwo));
    }
}