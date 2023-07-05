import java.util.*;
import java.util.stream.*;

public class FibonacciSeries{
    public static void main(String [] args){
        int one = 0;
        int two = 1;
        for(int i = 0 ; i < 15 ; i++ ){
            System.out.print(one+" ");
            int next = one + two;
            one = two;
            two = next;
        }
    }
}