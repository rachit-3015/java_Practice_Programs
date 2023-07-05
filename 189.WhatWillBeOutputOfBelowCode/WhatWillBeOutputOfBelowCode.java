import java.util.*;
import java.util.stream.*;
import java.io.*;

class A{
    void m1() throws IOException{
        System.out.println("In m1 A");
    }
}
class B extends A{
    void m1() throws IOException{
        System.out.println("In m1 B");
    }
}

public class WhatWillBeOutputOfBelowCode{
    public static void main(String [] args){
        A a = new B();
        try{
            a.m1();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}