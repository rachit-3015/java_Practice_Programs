import java.util.*;
import java.util.stream.*;

public class ReverseTheStringWithSpace{
    public static void main(String [] args){
        String str = "ThisisaString";
        char ch[] = str.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            System.out.print(ch[i]+" ");
        }
    }
}