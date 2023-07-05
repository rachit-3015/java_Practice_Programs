import java.util.*;
import java.util.stream.*;


class A {
    public void m1() {
        System.out.println("This is the m1() method of class A");
    }
}

class B extends A {
    public void m1() {
        super.m1(); // Accessing m1() method of class A using super keyword
        System.out.println("This is the m1() method of class B");
    }
}

public class HowWillYouCallM1MethodOfClassA{
    public static void main(String [] args){
        B obj = new B();
        obj.m1(); 
    }
}