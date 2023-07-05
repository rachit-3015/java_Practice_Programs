import java.util.*;
import java.util.stream.*;

public class FindMajorityElementInArray{
    public static void main(String [] args){
        int arr [] = {10,20,10,10,30};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Integer majorKey=0;
        Integer majorValue=0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorValue < entry.getValue()) {
                majorValue = entry.getValue();
                majorKey = entry.getKey();
            }
        }
        System.out.println(majorKey+" "+majorValue);

        
       
    }
}