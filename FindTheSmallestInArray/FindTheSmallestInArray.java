import java.util.*;
import java.util.stream.*;

public class FindTheSmallestInArray{
    public static void main(String [] args){
        int arr [] = {1,20,5,6,16,10,0};
        int smallest = arr[0];
        for(int  i = 0 ; i < arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}