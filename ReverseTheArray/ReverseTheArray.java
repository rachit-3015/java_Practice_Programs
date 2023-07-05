import java.util.*;
import java.util.stream.*;

public class ReverseTheArray{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        Integer [] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(boxedArray);
        Collections.reverse(list);
        list.stream().forEach(System.out::println);

        // converting list back to the array
        Integer [] backArr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(backArr));
    }
}