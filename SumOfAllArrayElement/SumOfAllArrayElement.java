import java.util.*;
import java.util.stream.*;

public class SumOfAllArrayElement{
    public static void main(String [] args){
    
    int arr [] =  {2,3,4,5,7};
    
    int sum = Arrays.stream(arr).sum();
    System.out.println(sum);
    

    int sumOne = IntStream.of(arr).sum();
    System.out.println(sumOne);

    int sumTwo = Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
    System.out.println(sumTwo);

    int sumThree = Arrays.stream(arr).reduce(Integer :: sum).getAsInt();
    System.out.println(sumThree);

    long sumFour = Arrays.stream(arr).summaryStatistics().getSum();
    System.out.println(sumFour);

    }
}