import java.util.*;
import java.util.stream.*;

public class CheckGivenStringWellFormed{
    public static void main(String [] args){
        String str = "{tell ( me [rachit])something}";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++ ){
            char ch = str.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(str.charAt(i));
            }else if(ch=='}' || ch==')' || ch==']'){
                if(ch == '}'  &&  '{'==stack.peek()){
                     stack.pop();
                }
                if(ch == ']'  &&  '['==stack.peek()){
                     stack.pop();
                }
                if(ch == ')'  &&  '('==stack.peek()){
                     stack.pop();
                }
            }
        }
        if(stack.empty()){
            System.out.println("String was well-fromed");
        }else{
            System.out.println("String wasn't well-formed at all");
        }
    }
}

                