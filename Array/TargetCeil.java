import java.util.*;

public class TargetCeil {

    public static int FindCeil(int[] arr, int x) {

        // Get the size of the array
        int n = arr.length;

        // Store the index of ceil
        // Initially, ceil is not found
        // -1 means ceil does not exist
        int ceil = -1;

        // Store the index of floor
        int floor = Integer.MIN_VALUE;

        // left points to the first index
        int left = 0;

        // right points to the last index
        int right = n - 1;

        // Continue while there are elements to search
        while(left <= right) {

            // Find the middle index
            int mid = (left + right) / 2;

            // If arr[mid] is greater than or equal to x
            if(arr[mid] >= x) {

                // This can be our ceil
                ceil = mid;

                // Move to the left
                // to find a smaller possible ceil
                right = mid - 1;

            } else {

                // arr[mid] is smaller than x
                // So search on the right side
                left = mid + 1;

                // Store the possible floor index
                floor = mid;
            }
        }

        // Return the index of ceil
        return ceil;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Ask the user to enter array elements
        System.out.println("Enter " + n + " sorted elements:");

        // Take array elements from user
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask the user for x
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // Call FindCeil function
        int answer = FindCeil(arr, x);

        // Print the result
        System.out.println("Ceil index = " + answer);

        // If ceil exists, print its value
        if(answer != -1) {
            System.out.println("Ceil value = " + arr[answer]);
        } else {
            System.out.println("Ceil does not exist.");
        }

        sc.close();
    }
}

