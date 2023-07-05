import java.util.*;
import java.util.stream.*;

public class FindMissingNumbers{
    public static void main(String [] args){

    Integer arr [] = {2,4,1,5,7,8,0};

    Set<Integer> set = Stream.of(arr).collect(Collectors.toSet());

    for(int i = 0 ; i < 10; i++){
        if(!set.contains(i)){
            System.out.println(i);
        }
    }   
    }
}