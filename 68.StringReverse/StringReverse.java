import java.util.*;
import java.util.stream.*;

public class StringReverse{
    public static void main(String [] args){
        
        //first way 
        String str = "Hello World";

        StringBuilder strbd = new StringBuilder(str).reverse();
        System.out.println(strbd);

        //second way
        String [] arr = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(String s : arr){
            StringBuilder reversedWord = new StringBuilder(s).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        System.out.println(reversedSentence);

        // third way
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        
        String reversed = new String(charArray);
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);

    }
}