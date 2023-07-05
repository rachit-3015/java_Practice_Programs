import java.util.*;
import java.util.stream.*;

public class StriverSubsetArray{
    public static void main(String [] args){

        // firstset
        int arrOne [] = {1,3,4,5,2};
        int arrTwo [] = {2,4,3,1,7,5,15};
        // secondset
        // int arrOne [] = {1,3,4,5,2};
        // int arrTwo [] = {4,5,2};
        // thirdset
        // int arrOne [] = {1,3,4,5,2};
        // int arrTwo [] = {11,12,13,15,16};
        

        // first method
        // Arrays.sort(arrOne);
        // Arrays.sort(arrTwo);
        // boolean isSubset = true;
        // if(arrOne.length > arrTwo.length){
        //     System.out.println("Arr1 is not subset of Arr2");
        //     return;
        // }else{
        //     for(int i = 0 ; i < arrOne.length ; i++){
        //         int index = Arrays.binarySearch(arrTwo,arrOne[i]);
        //         if(index < 0 || index >= arrTwo.length){
        //             isSubset = false;
        //             break;
        //         }
        //     }
        // }
        // if(isSubset){
        //     System.out.println("Arr1 is subset of Arr2");
        // }else{
        //     System.out.println("Arr1 is not subset of Arr2");
        // }


        // second method

        List<Integer> list = Arrays.stream(arrTwo).boxed().collect(Collectors.toList());
        int count = 0;
        for(int i = 0 ; i < arrOne.length ; i++){
            if(list.contains(arrOne[i])){
                continue;
            }else{
                count = 1;
                break;
            }
        }
        if(count == 1){
            System.out.println("Arr1 is not subset of Arr2");
        }else{
            System.out.println("Arr1 is subset of Arr2");
        }

    }
}