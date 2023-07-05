import java.util.*;
import java.util.stream.*;


public class SubArrayWithGivenSumK{
    public static void main(String [] args){
        int arr [] = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
        int target = 5;

        int ans = 0;
        int sum = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0 ; i < arr.length ; i++ ){
            sum = sum + arr[i];
            int present = sum - target;
            if(map.containsKey(present)){
                ans = ans + map.get(present);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}