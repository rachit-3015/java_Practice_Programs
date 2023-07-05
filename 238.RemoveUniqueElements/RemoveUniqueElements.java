import java.util.*;

public class RemoveUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] arrOne = new int[set.size()];
        int index = 0;
        for (int num : set) {
            arrOne[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(arrOne));
    }
}
