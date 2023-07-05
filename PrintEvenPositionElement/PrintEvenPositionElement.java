import java.util.*;
import java.util.stream.*;

public class PrintEvenPositionElement{
    public static void main(String [] args){
        int [] arr = {1,10,2,20,30,40};

        for(int i = 1 ; i < arr.length+1 ; i++ ){
            if(i%2==0){
                System.out.print(arr[i-1]+" ");
            }
        }
    }
}