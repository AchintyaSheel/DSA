//https://leetcode.com/problems/maximum-subarray/description/
//Leetcode-53
import java.util.Scanner;

public class MaxSumSubArrayKadane {

    // Kadane's Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int kadane(int[] arr) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            // Update maximum sum
            /*  if (currSum > maxSum) {
                maxSum = currSum;
            }*/
           //Does same work as above
           maxSum=Math.max(currSum,maxSum);

            // If current sum becomes negative,
            // start a new subarray
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = kadane(arr);

        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}
//Code which prints the subarray also
/*
import java.util.Scanner;

public class MaxSumSubArrayKadane {

    // Kadane's Algorithm
    // Time Complexity: O(n) -> We visit every element once.
    // Space Complexity: O(1) -> We use only a few extra variables.

    public static void kadane(int[] arr) {

        // Stores the sum of the subarray we are currently checking.
        int currSum = 0;

        // Stores the largest sum found so far.
        // Integer.MIN_VALUE is used so that even an all-negative
        // array gives the correct maximum sum.
        int maxSum = Integer.MIN_VALUE;

        // Starting index of the current subarray.
        int currentStart = 0;

        // Starting index of the subarray having the maximum sum.
        int maxSumSi = -1;

        // Ending index of the subarray having the maximum sum.
        int maxSumEi = -1;


        for (int i = 0; i < arr.length; i++) {

            // Add the current element to the current subarray sum.
            currSum += arr[i];


            // If the current sum is greater than the maximum sum
            // found so far, save the sum and its start/end indexes.
            if (currSum > maxSum) {

                maxSum = currSum;

                // Save the starting index of the maximum-sum subarray.
                maxSumSi = currentStart;

                // Save the ending index of the maximum-sum subarray.
                maxSumEi = i;
            }


            // If the current sum becomes negative,
            // it is better to start a new subarray from the next index.
            if (currSum < 0) {

                // Reset the current sum for the new subarray.
                currSum = 0;

                // The new subarray will start from the next index.
                currentStart = i + 1;
            }
        }


        // Print the maximum sum.
        System.out.println("Maximum Subarray Sum = " + maxSum);


        // Print the actual maximum-sum subarray.
        System.out.print("Maximum Subarray = ");

        // Print elements from the starting index
        // to the ending index of the maximum subarray.
        for (int i = maxSumSi; i <= maxSumEi; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        // Print the starting and ending indexes.
        System.out.println("Start Index = " + maxSumSi);
        System.out.println("End Index = " + maxSumEi);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Kadane's Algorithm.
        kadane(arr);

        sc.close();
    }
} */
