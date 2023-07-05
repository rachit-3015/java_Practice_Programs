import java.util.*;
import java.util.stream.*;


interface MyInterface {
    static void myMethod() {
        System.out.println("Static method in interface");
    }
}

class MyClass implements MyInterface {
    static void myMethod() {
        System.out.println("Static method in child class");
    }
}


public class MethodCanBeDerivedInInterface{
    public static void main(String [] args){
        MyInterface.myMethod();  // Output: Static method in interface
        MyClass.myMethod();  // Output: Static method in child class
    }
}