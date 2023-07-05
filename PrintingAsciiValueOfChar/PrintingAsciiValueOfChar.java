import java.util.*;
import java.util.stream.*;

public class PrintingAsciiValueOfChar{
    public static void main(String [] args){
        String str = "Rachit Patel";
        char [] ch = str.toCharArray();
        for(char c : ch ){
            if( c != ' '){
                int i = c;
                System.out.print(i+" ");
            }
        }
    }
}