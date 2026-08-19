import java.util.Scanner;

public class SubArrayMaxSum{

    // Optimized Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    public static int subarrays(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        int maxsumSi = -1;
        int maxsumEi = -1;

        // Choose starting index
        for (int si = 0; si < n; si++) {

            int currSum = 0;

            // Choose ending index
            for (int ei = si; ei < n; ei++) {

                // Add current element to current sum
                currSum += arr[ei];

                // Check if we found a new maximum
                if (currSum > maxSum) {
                    maxSum = currSum;

                    // Store starting and ending index
                    maxsumSi = si;
                    maxsumEi = ei;
                }
            }
        }

        // Print maximum subarray
        System.out.print("Maximum Subarray = ");

        for (int i = maxsumSi; i <= maxsumEi; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call method
        int maxSum = subarrays(arr);

        // Print maximum sum
        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}