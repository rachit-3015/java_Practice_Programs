import java.util.*;
import java.util.stream.*;

public class RemoveDuplicateFromString{
    public static void main(String [] args){
        String str = "java";
        char ch [] = str.toCharArray();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}