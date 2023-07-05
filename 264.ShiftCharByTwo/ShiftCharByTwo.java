import java.util.*;
import java.util.stream.*;

public class ShiftCharByTwo{
    public static void main(String [] args){
        String str = "harsh";
        char [] ch = str.toCharArray();
        for(int i = 0 ; i < 2 ; i++){
            char temp = ch[0];
            for(int j=0;j<ch.length-1;j++){
                ch[j]=ch[j+1];
            }
            ch[ch.length-1]=temp;
        }
        System.out.println(Arrays.toString(ch));
    }
}