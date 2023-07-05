import java.util.*;
import java.util.stream.*;

public class PrintReverseForward{
    public static void main(String [] args){
        String str = "This is a computer";
        String strArr[] = str.split(" ");
        
        //first way to print it
        for(int i = strArr.length - 1 ; i >= 0 ; i-- ){
            System.out.print(strArr[i]+ " ");
        }

        System.out.print("\n");

        //second way to print it
        List<String> list = Arrays.asList(strArr);
        Collections.reverse(list);
        list.forEach(e-> System.out.print(e+" "));
    }
}