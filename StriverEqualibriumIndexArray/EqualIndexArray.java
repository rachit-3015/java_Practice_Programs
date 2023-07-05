import java.util.*;
import java.util.stream.*;


public class EqualIndexArray{
    public static void main(String [] args){
        // int arr [] = {2,3,-1,8,4};
        int arr [] = {1,-1,4};
        int sum [] = new int[arr.length];
        
        for(int i = 0 ; i < arr.length ; i++){
            int digits = 0;
            for(int j = 0 ; j <= i ; j++){
                digits = digits + arr[j];
            }
            sum[i] = digits;
        }

        for(int i = 0 ; i < arr.length ; i++){
            int left = sum[i] - arr[i];
            int right = sum[arr.length-1] - sum[i];
            if(left == right){
                System.out.println(i+" ");
            }
        }
        
        
    }
}