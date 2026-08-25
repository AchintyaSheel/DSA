import java.util.Scanner;

public class Search2DMatrix_SCApproach {

    public static boolean searchMatrix(int[][] matrix, int target) {

        // Number of rows
        int m = matrix.length;

        // Number of columns
        int n = matrix[0].length;

        /*
         * Start from the TOP-RIGHT corner.
         *
         * row = 0       -> first row
         * column = n-1  -> last column
         */
        int row = 0;
        int column = n - 1;

        /*
         * Continue while we are inside the matrix.
         */
        while(row >= 0 && row < m && column >= 0 && column < n) {

            // Target found
            if(matrix[row][column] == target) {
                return true;
            }

            /*
             * Current element is smaller than target.
             *
             * Everything to the left is also smaller,
             * so move DOWN.
             */
            else if(matrix[row][column] < target) {
                row++;
            }

            /*
             * Current element is greater than target.
             *
             * Everything below is also greater,
             * so move LEFT.
             */
            else {
                column--;
            }
        }

        // Target was not found
        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for number of rows
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        // Ask for number of columns
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Create matrix
        int[][] matrix = new int[m][n];

        // Take matrix elements
        System.out.println("Enter the elements of the matrix:");

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Ask for target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call method
        boolean result = searchMatrix(matrix, target);

        // Print result
        System.out.println("Target found: " + result);

        sc.close();
    }
}

    

