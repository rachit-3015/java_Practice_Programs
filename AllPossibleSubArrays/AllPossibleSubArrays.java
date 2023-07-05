import java.util.*;
import java.util.stream.*;

public class AllPossibleSubArrays{
    public static void main(String [] args){
        int arr [] = {-1,4,7,2};
        
        // first way 
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j <= arr.length ; j++ ){
                System.out.println(list.subList(i,j));
            }
        }

        // second way
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j <= arr.length ; j++ ){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i,j)));
            }
        }
    }
}