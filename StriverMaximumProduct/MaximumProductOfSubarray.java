import java.util.*;
import java.util.stream.*;

public class MaximumProductOfSubarray{
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5,0};
        // int arr [] = {1,2,-3,0,-4,-5};
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int agglomerate = 1;
                for(int k = i ; k <= j ; k++){
                    agglomerate *= arr[k];
                }
                ans = Math.max(ans,agglomerate);
            }
        }
        System.out.println(ans);
    }
}