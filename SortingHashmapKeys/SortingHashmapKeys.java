import java.util.*;
import java.util.stream.*;

public class SortingHashmapKeys{
    public static void main(String [] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Rachit",24);
        map.put("Naisargi",19);
        map.put("Dharmi",16);
        map.put("Priyam",21);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("\n");

        Map<String,Integer> tMap = new TreeMap<>(map);
        tMap.forEach((key,value)->{
            System.out.println(key+" "+value);
        });


    }
}