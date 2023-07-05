import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class DifferentWaysOfRepresenting15 {
    public static List<List<Integer>> findConsecutiveSums(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        int start = 1;
        int sum = 0;

        while (start <= n) {
            if (sum < n) {
                current.add(start);
                sum += start;
                start++;
            } else if (sum > n) {
                sum -= current.get(0);
                current.remove(0);
            } else {
                result.add(new ArrayList<>(current));
                sum -= current.get(0);
                current.remove(0);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int input = 15;
        List<List<Integer>> combinations = findConsecutiveSums(input);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
