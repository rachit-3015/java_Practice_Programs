import java.util.*;
import java.util.stream.*;

public class ReplaceElementByItsRank{
    public static void main(String [] args){
    //    the most optimized way
        // int arr [] = {20,15,26,2,98,6};
        int arr [] = {1,5,8,15,8,25,9};
        int brr [] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);
        int temp = 1 ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.get(brr[i])==null){
                map.put(brr[i],temp++);
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(map.get(arr[i])+" ");
        }
    }
}