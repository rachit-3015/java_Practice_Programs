import java.util.*;
import java.util.stream.*;

public class PrintDescendingOrderOfCharacterFreq{
    public static void main(String [] args){
       
    String str = "Banana";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the entryList based on values in descending order
        Collections.sort(entryList, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print the characters based on frequency
        for (Map.Entry<Character, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}