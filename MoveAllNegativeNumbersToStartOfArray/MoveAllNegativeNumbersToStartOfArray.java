import java.util.*;
import java.util.stream.*;

public class MoveAllNegativeNumbersToStartOfArray{
    public static void main(String [] args){
        int arr [] = {-1,-20,30,40,50,-8};
        int newArr [] = new int[arr.length];
        Arrays.fill(newArr,0);
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]<0){
                newArr[j++]=arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]>0){
                newArr[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}