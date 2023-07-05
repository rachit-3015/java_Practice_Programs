import java.util.*;
import java.util.stream.*;

public class WriteCodeToPutAndGetValueOfHashmap{
    public static void main(String [] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Rachit");
        map.put(2,"Naisargi");
        
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

        Set<Integer> set = map.keySet();
        for(Integer i : set){
            System.out.println(i+" "+map.get(i));
        }        

    }
}