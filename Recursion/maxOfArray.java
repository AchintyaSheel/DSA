public class maxOfArray {

    public static int max(int[] arr, int idx) {

        // Base condition:
        // If we reach the end of the array,
        // return the smallest possible integer.
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }

        // Find maximum in the remaining part of the array
        int smallerAns = max(arr, idx + 1);

        // Compare the current element with the maximum
        // found in the remaining array
        int ans = Math.max(smallerAns, arr[idx]);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 1, 9};

        System.out.println(max(arr, 0));
    }
}

