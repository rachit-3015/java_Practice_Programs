import java.util.*;
import java.util.stream.*;

public class NextGreaterElementInArray{
    public static void main(String [] args){
        int arr [] = {10,11,5,4,7};

        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = i ; j < arr.length ; j++ ){
            
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" -> "+arr[j]);
                    break;
                }else{
                    while(j<arr.length){
                        if(arr[i]<arr[j]){
                            System.out.println(arr[i]+" -> "+arr[j]);
                            break;
                        }else if(j == arr.length-1){
                            System.out.println(arr[i]+" -> "+"-1");
                            break;
                        } 
                        j++;         
                    }
                }
                break;
            }
        }
    }
}