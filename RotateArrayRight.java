import java.util.Arrays;

public class RotateArrayRight {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);         // Reverse whole array
        reverse(arr, 0, k - 1);         // Reverse first K
        reverse(arr, k, n - 1);         // Reverse rest
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateRight(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
