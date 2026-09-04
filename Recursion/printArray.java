public class printArray {

    public static void pArray(int[] arr, int idx) {

        // Base condition:
        // When idx reaches the length of the array,
        // there are no more elements to print.
        if (idx == arr.length) {
            return;
        }

        // Print the element at the current index
        System.out.print(arr[idx] + " ");

        // Move to the next index
        pArray(arr, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 1, 9};

        // Start printing from index 0
        pArray(arr, 0);
    }
}

