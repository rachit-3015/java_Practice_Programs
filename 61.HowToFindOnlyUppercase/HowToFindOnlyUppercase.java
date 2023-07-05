import java.util.*;
import java.util.stream.*;

public class HowToFindOnlyUppercase{
    public static void main(String [] args){
        String str = "Quallity Kiosk";
        char[] ch = str.toCharArray();
        for(Character c : ch){
            if(Character.isUpperCase(c)){
                System.out.println(c);
            }
        }
    }
}