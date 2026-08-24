import java.util.*;

public class WaveTraversal {

    public static void wTrav(int arr[][]) {

        // Get the number of rows in the matrix
        int n = arr.length;

        // Get the number of columns in the matrix
        int m = arr[0].length;

        // Traverse through each column
        //Doing so as in this question we had to traverse column wise,unlike the normal row wise traversal
        for (int col = 0; col < m; col++) {

            // If column number is even
            // Traverse from top to bottom
            if (col % 2 == 0) {

                // Start from first row (0)
                // and go until the last row
                for (int row = 0; row < n; row++) {

                    // Print the current element
                    System.out.print(arr[row][col] + " ");
                }
            }

            // If column number is odd
            // Traverse from bottom to top
            else {

                // Start from last row (n-1)
                // and move towards first row (0)
                for (int row = (n - 1); row >= 0; row--) {

                    // Print the current element
                    System.out.print(arr[row][col] + " ");
                }
            }

            // Move to the next line after each column
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows(n) in the matrix :");
        int n = sc.nextInt();

        System.out.print("Enter the number of column(m) in the matrix :");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements of the matrix :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Call wave traversal
        System.out.print("Wave Traversal: ");
        wTrav(arr);

        sc.close();
    }
}


  

        

