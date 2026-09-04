public class ReverseArray {

    public static void reverse(int[] arr, int idx) {

        // Base condition:
        // When idx reaches the end of the array,
        // stop the recursion.
        if (idx == arr.length) {
            return;
        }

        // First go to the end of the array
        reverse(arr, idx + 1);

        // Print while returning from recursion
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 1, 9};

        // Start from index 0
        reverse(arr, 0);
    }
}
