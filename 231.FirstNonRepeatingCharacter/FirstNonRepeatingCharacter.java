import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingCharacter{
    public static void main(String [] args){
        String str = "akshay kumar";
        char ch = retunFirstNonRepeatingChar(str);
        System.out.println(ch);
    }
    private static char retunFirstNonRepeatingChar(String str){
        char [] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char s : arr){
            if(map.get(s)==1){
                return s;
            }
        }
        return '\0';
    }
}