import java.util.*;
import java.util.stream.*;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int result = getValue();
        System.out.println("Result: " + result);
    }

    public static int getValue() {
        try {
            System.out.println("Inside try block");
            return 0;
        } catch (Exception e) {
            System.out.println("Caught Exception");
            return 1;
        } finally {
            System.out.println("Inside finally block");
            return 2;
        }
    }
}
