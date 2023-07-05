import java.util.*;
import java.util.stream.*;

public class SaurabhSirRecursion{
    public static void main(String [] args){
       long l = 50;
       printNNaturalNumbers(l);     
       System.out.println("\n");
       printNNaturalNumbersInReverse(l);
       System.out.println("\n");
       firstNevenNaturalNumbers(l);
       System.out.println("\n");
       firstNevenNaturalNumbersInReverse(l);
       System.out.println("\n");
       firstNoddNaturalNumbers(l);
       System.out.println("\n");
       firstNoddNaturalNumbersInReverse(l);

    }
    private static void printNNaturalNumbers(long l){
        if(l==0){
            return;
        }
        printNNaturalNumbers(l-1);
        System.out.print(l+" ");
    }
    private static void printNNaturalNumbersInReverse(long l){
        if(l==0){
            return;
        }
        System.out.print(l+" ");
        printNNaturalNumbersInReverse(l-1);
    }
    private static void firstNevenNaturalNumbers(long l){
        if(l == 0){
            return;
        }
        firstNevenNaturalNumbers(l-1);
        if(l%2==0){
            System.out.print(l+" ");
        }
    }
    private static void firstNevenNaturalNumbersInReverse(long l){
        if(l == 0){
            return;
        }
        if(l%2==0){
            System.out.print(l+" ");
        }
        firstNevenNaturalNumbersInReverse(l-1);
    }
    private static void firstNoddNaturalNumbers(long l){
        if(l == 0){
            return;
        }
        firstNoddNaturalNumbers(l-1);
        if(l%2!=0){
            System.out.print(l+" ");
        }
    }
    private static void firstNoddNaturalNumbersInReverse(long l){
        if(l == 0){
            return;
        }
        if(l%2!=0){
            System.out.print(l+" ");
        }
        firstNoddNaturalNumbersInReverse(l-1);
    }
}