import java.util.*;
import java.util.stream.*;

public class SwapListElement{
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int left=0;
        int right=list.size()-1;
        while(left<right){
            Collections.swap(list,left,right);
            left++;
            right--;
        }
        System.out.println(list);

    }
}