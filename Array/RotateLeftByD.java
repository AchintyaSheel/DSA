import java.util.Scanner;
import java.util.Arrays;

public class RotateLeftByD {

    public void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public void reverse(int arr[], int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public void rotateArr(int arr[], int d) {

        int n = arr.length;

        // Avoid division by zero
        if (n == 0) {
            return;
        }

        // If d > arr.length
        d = d % n;

        // Handle negative d
        if (d < 0) {
            d += n;
        }

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first n-d elements
        reverse(arr, 0, n - d - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, n - d, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input rotation value
        System.out.print("Enter d: ");
        int d = sc.nextInt();

        // Create object of RotateLeftByD
        RotateLeftByD obj = new RotateLeftByD();

        // Rotate array
        obj.rotateArr(arr, d);

        // Print rotated array
        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}


