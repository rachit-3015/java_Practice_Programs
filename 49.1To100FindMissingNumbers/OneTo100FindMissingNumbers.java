import java.util.*;
import java.util.stream.*;

public class OneTo100FindMissingNumbers{
    public static void main(String [] args){
        Integer arr[] = {50,100};
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,arr);

        for(int i=0;i<=100;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}