import java.util.*;
import java.util.stream.*;

public class StringImmutability{
    public static void main(String [] args){
        String str = "Rachit";
        System.out.println(str.hashCode());
        String strOne = str + "Patel";
        System.out.println(strOne.hashCode());

        String strClass = new String("Rakshit");
        System.out.println(strClass);
        System.out.println(strClass.hashCode());
        String strClassOne = new String(strClass.concat("Bhalodiya"));
        System.out.println(strClassOne);
        System.out.println(strClassOne.hashCode());

        StringBuilder strbd = new StringBuilder("Ashish");
        System.out.println(strbd);
        System.out.println(strbd.hashCode());
        strbd.append("Kanani");
        System.out.println(strbd);
        System.out.println(strbd.hashCode());
    }
}