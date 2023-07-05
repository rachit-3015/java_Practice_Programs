import java.util.*;
import java.util.stream.*;

public class ReverseWordsInString{
    public static void main(String [] args){
           String str = "Hello World";
        String [] strArr = str.split(" ");
        for(int i = 0 ; i < strArr.length ; i++ ){
            char [] ch = strArr[i].toCharArray();
            for(int j = ch.length-1; j>=0 ; j--){
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }
}
