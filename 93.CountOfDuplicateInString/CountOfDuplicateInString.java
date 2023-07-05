import java.util.*;
import java.util.HashMap;
import java.util.stream.*;

public class CountOfDuplicateInString{
    public static void main(String [] args){
        String str = "Rachit Patel";
        Map<Character,Integer> map = countDuplicates(str);
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
    public static Map<Character,Integer> countDuplicates(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}