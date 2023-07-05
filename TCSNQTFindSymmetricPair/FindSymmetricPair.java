import java.util.*;
import java.util.stream.*;

public class FindSymmetricPair{
    public static void main(String [] args){
        int arr [][] = {{1,2},{2,1},{3,4},{4,5},{5,4}};
        

        //first method
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.print("{"+arr[i+1][0]+","+arr[i+1][1]+"}");
                }
            }
        }

        System.out.println();

        int prr [][] = {{1,5},{2,3},{4,2},{5,1},{2,4}};
        for(int i = 0 ; i < prr.length-1 ; i++){
            for(int j = i+1 ; j < prr.length ; j++){
                if(prr[i][0]==prr[j][1] && prr[i][1]==prr[j][0]){
                    System.out.print("{"+prr[j][0]+","+prr[j][1]+"}");
                }
            }
        }

        System.out.println();

        // second approach-------------------------------------------------------------
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.containsKey(second) && map.get(second)==first){
                System.out.print("{"+first+","+second+"}");
            }else{
                map.put(first,second);
            }
        }

        System.out.println();

        Map<Integer,Integer> mapNew = new HashMap<>();
        for(int i = 0 ; i < prr.length ; i++){
            int third = prr[i][0];
            int forth = prr[i][1];
            if(mapNew.containsKey(forth) && mapNew.get(forth)==third){
                System.out.print("{"+third+","+forth+"}");
            }else{
                mapNew.put(third,forth);
            }
        }
       
     }
    
}