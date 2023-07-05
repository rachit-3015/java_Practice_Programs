import java.util.*;
import java.util.stream.*;

public class NoOfWordsAlongWithCharacter{
    public static void main(String [] args){
        String str = "Hello World";
        String strArr[] = str.split(" ");

        System.out.println("No of words : "+strArr.length);
        
        for(int i = 0 ; i< strArr.length ; i++){
                char ch[] = strArr[i].toCharArray();
                System.out.println(strArr[i]+"->"+ch.length);
        }
    }
}