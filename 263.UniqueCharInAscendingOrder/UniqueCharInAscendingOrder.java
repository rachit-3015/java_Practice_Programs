import java.util.*;
import java.util.stream.*;

public class UniqueCharInAscendingOrder{
    public static void main(String [] args){
        String str = "occasional";
        char [] ch = str.toCharArray();
        Set<Character> set = new TreeSet<>();
        for(char c : ch){
            set.add(c);
        }
        System.out.println(set);

    }
}