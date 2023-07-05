import java.util.*;
import java.util.stream.*;

class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
public class WillGetCalledDefaultConstructor{
    public static void main(String [] args){
        A a = new B();
        
    }
}