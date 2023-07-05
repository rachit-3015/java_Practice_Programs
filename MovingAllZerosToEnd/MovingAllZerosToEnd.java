import java.util.*;
import java.util.stream.*;

public class MovingAllZerosToEnd{
    public static void main(String [] args){
        int arr [] = {10,0,0,20,40,0,0,50,60};
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        
        while(count<arr.length){
            arr[count++]=0;
        }

        System.out.println(Arrays.toString(arr));

    }
}