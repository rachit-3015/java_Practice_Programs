import java.util.*;
import java.util.stream.*;


public class MaxSubArraySum{
    public static void main(String [] args){
        int arr [] = {-1,4,7,2};
        int sum = arr[0];
        int agglomerate = 0;

        for(int i = 0 ; i < arr.length ; i++){
            agglomerate=0;
            for(int j = i ; j < arr.length ; j++){
                agglomerate += arr[j];
                if(sum<agglomerate){
                    sum = agglomerate;
                }
            }
        }
        System.out.println(sum);
    }
}