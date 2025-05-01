
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = {3, 5, 3, 8, 2, 5};
        for (int num : nums) {
            list.add(num);
        }

        HashSet<Integer> uniqueSet = new HashSet<>(list);
        int sum = 0;
        for (int num : uniqueSet) {
            sum += num;
        }

        System.out.println("Unique values: " + uniqueSet);
        System.out.println("Sum of unique values: " + sum);
    }
}
