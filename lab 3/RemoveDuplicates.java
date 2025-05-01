import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int value : arr) {
            set.add(value);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}
