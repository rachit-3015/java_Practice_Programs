import java.util.*;
import java.util.stream.*;

class One{
    public One(){
        System.out.println("One");
    }
}
class Two extends One{
    public Two(){
        System.out.println("Two");
    }
}
class Three extends Two{
    public Three(){
        System.out.println("Three");
    }
}

public class WhichConstructorIsCalled{
    public static void main(String [] args){
        Three three = new Three();

    }
}