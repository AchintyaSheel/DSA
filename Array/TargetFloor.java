import java.util.*;

public class TargetFloor {

    static int findFloor(int[] arr, int x) {

        // Get the size of the array
        int n = arr.length;

        // Store the index of floor
        // Initially, floor is not found
        //It could also have been int floor=Integer.MIN_VALUE
        //But as it was given in the question that if the target element(x) does not exist, return -1.
        int floor = -1;

        // Store the index of ceil
        int ceil = Integer.MAX_VALUE;

        // left points to the first index
        int left = 0;

        // right points to the last index
        int right = n - 1;

        // Continue while there are elements to search
        while(left <= right) {

            // Find the middle index
            int mid = (left + right) / 2;

            // If arr[mid] is less than or equal to x
            if(arr[mid] <= x) {

                // This can be our floor
                floor = mid;

                // Move to the right
                // to find a bigger possible floor
                left = mid + 1;

            } else {

                // arr[mid] is greater than x
                // So search on the left side
                right = mid - 1;

                // Store the possible ceil index
                ceil = mid;
            }
        }

        // Return the index of floor
        return floor;
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

        // Call your findFloor function
        int answer = findFloor(arr, x);

        // Print the result
        System.out.println("Floor index = " + answer);

        // If floor exists, print its value
        if(answer != -1) {
            System.out.println("Floor value = " + arr[answer]);
        } else {
            System.out.println("Floor does not exist.");
        }

        sc.close();
    }
}
