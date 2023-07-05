import java.util.*;
import java.util.stream.*;

public class MaximumDiffBtwElements{
    public static void main(String [] args){
        int [] arr = {10,20,2,9,40};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println("Maximum : "+list.get(list.size()-1));
        System.out.println("Minimum : "+list.get(0));
    }
}