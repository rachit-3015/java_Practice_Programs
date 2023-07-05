import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class LogiliteString{
    public static void main(String [] args){
        String str = "i am priyam bhimani";
        String concatenatedString = str.replaceAll("\\s","");
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();
        System.out.println(str);
        int count = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==' '){
                System.out.print(" ");
            }else{
                System.out.print(reversedString.charAt(count++));
            }
        }
    }
}