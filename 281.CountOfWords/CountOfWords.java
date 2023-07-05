import java.util.*;
import java.util.stream.*;


public class CountOfWords{
    public static void main(String [] args){
        String str = "Hi Hello Hi Hi Welcome Hello";
        String strArr[] = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s : strArr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}