import java.util.*;
import java.util.stream.*;

class One{
    public static int a = 5;
    
    public void setValue(int a){
        this.a = a;
    }

    public int getValue(){
        return a;
    }
}
class Two{
    public static int b = 5;

    public void setValue(int b){
        this.b = b;
    }

    public int getValue(){
        return b;
    }
}

public class CanStaticBeMutated{
    public static void main(String [] args){
        One one = new One();
        one.setValue(10);
        System.out.println(one.getValue());

        Two two = new Two();
        two.setValue(10);
        System.out.println(two.getValue());

        System.out.println(one.getValue()==two.getValue());
        

    }
}