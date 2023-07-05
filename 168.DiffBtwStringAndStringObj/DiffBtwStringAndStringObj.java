import java.util.*;
import java.util.stream.*;

public class DiffBtwStringAndStringObj{
    public static void main(String [] args){
        String s1 = "Rachit Patel";
        String s2 = "Rachit Patel";
        String s3 = new String("Samar Pratap");
        String s4 = new String("Samar Pratap");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    // s3 and s4 both will be pointing to different memory location which is not the case with s1 and s2
    }
}