import java.util.*;
import java.util.stream.*;

public class WriteALogicToPrint{
    public static void main(String [] args){
        String str = "abcd";

        for(int i = 0 ; i < str.length()-1 ; i++){
            for(int j = i+1 ; j < str.length() ; j++){
                System.out.println(str.charAt(i)+""+str.charAt(j));
            }
        }
    }
}