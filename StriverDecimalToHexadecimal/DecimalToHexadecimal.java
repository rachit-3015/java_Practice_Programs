import java.util.*;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        StringBuilder sb = new StringBuilder();
        int input = sc.nextInt();
        int digit = input;

        while (digit > 0) {
            int remainder = digit % 16;
            sb.insert(0, convertRemainderToChar(remainder));
            digit = digit / 16;
        }
        System.out.println(sb);
    }

    private static char convertRemainderToChar(int a) {
        if (a == 1) {
            return '1';
        } else if (a == 2) {
            return '2';
        } else if (a == 3) {
            return '3';
        } else if (a == 4) {
            return '4';
        } else if (a == 5) {
            return '5';
        } else if (a == 6) {
            return '6';
        } else if (a == 7) {
            return '7';
        } else if (a == 8) {
            return '8';
        } else if (a == 9) {
            return '9';
        } else if (a == 10) {
            return 'a';
        } else if (a == 11) {
            return 'b';
        } else if (a == 12) {
            return 'c';
        } else if (a == 13) {
            return 'd';
        } else if (a == 14) {
            return 'e';
        } else {
            return 'f';
        }
    }
}
