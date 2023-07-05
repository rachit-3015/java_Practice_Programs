// problem no 169 in javasheet harshbhai

import java.util.*;
import java.util.stream.*;

public class WillThisCodeCompileOrNot{
    public static void main(String [] args){
        if(true){
            System.out.println("abc");
            break;
        }
    }
}

// this code will not compiler since break should be either with switch or with loop