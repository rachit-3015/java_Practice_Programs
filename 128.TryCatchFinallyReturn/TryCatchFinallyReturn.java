import java.util.*;
import java.util.stream.*;


public class TryCatchFinallyReturn {
    public static void main(String[] args) {
        System.out.println(divide(10, 5));   // Output: true
        System.out.println(divide(10, 0));   // Output: false
    }

    public static boolean divide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            return true;  // Return true if division is successful
        } catch (ArithmeticException e) {
            return false;  // Return false if an exception occurs (e.g., division by zero)
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
