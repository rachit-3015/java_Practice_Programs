import java.util.*;
import java.util.stream.*;


public class WhatWillBeOutputOfBelowCode{
    public static void main(String [] args){

        String str1 = "Harsh";
        String str2 = "Harsh";

        if(str1==str2){
            return true;
        }else{
            return false;
        }
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}


// return statement can be used in method body not in the class body therefore it will result in error