import java.util.*;
import java.util.stream.*;

public class SortingElementByFrequency{
    public static void main(String [] args){
       int[] array = {1, 2, 3, 2, 4, 3, 1, 2};
        frequencySort(array);
    }

    private static void frequencySort(int arr []){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<Integer,Integer>> comparator= (one,two)->{
            return two.getValue().compareTo(one.getValue());
        };

        Collections.sort(list,comparator);

        list.forEach((e)->{
            int key = e.getKey();
            int value = e.getValue();
            for(int i = 0 ; i < value ; i++){
                System.out.print(key+" ");
            }
        });

    }
}