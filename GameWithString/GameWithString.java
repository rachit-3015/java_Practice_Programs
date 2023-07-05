import java.util.*;
import java.util.stream.*;

public class GameWithString{
    public static void main(String [] args){
        
        // array got converted to string
        int[] numbers = {1,2,3,4,5};
        String arrStr = Arrays.toString(numbers);
        System.out.println(arrStr);

        // string got converted to int array back
        String str[] = arrStr.substring(1,arrStr.length()-1).split(", ");
        int [] arrInt = new int[str.length];
        for(int i = 0; i < arrInt.length; i++){
            arrInt[i] = Integer.parseInt(str[i]);
        }

        Arrays.stream(arrInt).forEach(System.out::println);
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.asList(arrInt));


    }
}