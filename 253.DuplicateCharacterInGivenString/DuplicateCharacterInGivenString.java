import java.util.*;
import java.util.stream.*;

public class DuplicateCharacterInGivenString{
    public static void main(String [] args){
        String str = "javaisthebestlanguage";
        char [] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}