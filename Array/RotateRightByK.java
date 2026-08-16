//https://leetcode.com/problems/rotate-array/
import java.util.*;

public class RotateRightByK{

    // Swaps two elements of the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverses the array from left index to right index
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Rotate array to the right by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;

        // Handles k greater than array length
        k = k % n;

        // Handles negative k
        if (k < 0) {
            k = k + n;
        }

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Rotated array: " + Arrays.toString(arr));

        sc.close();
    }
}

