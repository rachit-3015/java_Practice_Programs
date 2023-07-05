import java.util.*;
import java.util.stream.*;
import java.lang.*;

public class SpecialCharOrCharOrDigit{
    public static void main(String [] args){
        System.out.println("Enter a char : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isDigit(ch)){
            System.out.println("It's numeric value");
        }else if(Character.isLetter(ch)){
            System.out.println("It's char value");
        }else if(Character.isWhitespace(ch)){
            System.out.println("It's space");
        }else{
            System.out.println("It's special character");
        }
    }
}