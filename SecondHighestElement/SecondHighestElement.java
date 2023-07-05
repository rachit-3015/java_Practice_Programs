import java.util.*;
import java.util.stream.*;

public class SecondHighestElement{
    public static void main(String [] args){
        int arr [] = {1,20,5,6,16,10};

        // first approach
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        

        // second approach
        int highest=0;
        int secondHighest=0;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]>highest){
                highest = arr[i];
            }
        }
        
        
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] > secondHighest && arr[i] < highest){
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }
}