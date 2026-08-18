import java.util.Scanner;

public class MaxSumSubArrayBF {

    // ============================================================
    // PART 1: BRUTE FORCE APPROACH
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    // ============================================================

    /*
    public static int subarrays(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        // First loop: Choose the starting index
        for (int si = 0; si < n; si++) {

            // Second loop: Choose the ending index
            for (int ei = si; ei < n; ei++) {

                int currSum = 0;

                // Third loop: Calculate the sum
                // of the current subarray
                for (int i = si; i <= ei; i++) {
                    currSum += arr[i];
                }

                // Update maximum sum
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
    */


    // ============================================================
    // PART 2: OPTIMIZED BRUTE FORCE APPROACH
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // ============================================================

    public static int subarrays(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        // First loop: Choose the starting index
        for (int si = 0; si < n; si++) {

            int currSum = 0;

            // Second loop: Choose the ending index
            for (int ei = si; ei < n; ei++) {

                // Instead of calculating the whole sum again,
                // add the new element to the previous sum
                currSum += arr[ei];

                // Update maximum sum
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the optimized method
        int maxSum = subarrays(arr);

        // Display the result
        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}

