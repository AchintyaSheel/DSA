import java.util.Scanner;
public class SpiralTravelBasic {
    /*
     * This method prints all the elements of the matrix
     * in SPIRAL ORDER.
     *
     * Spiral traversal means:
     *
     * 1. Traverse the left wall from top to bottom.
     * 2. Traverse the bottom wall from left to right.
     * 3. Traverse the right wall from bottom to top.
     * 4. Traverse the top wall from right to left.
     *
     * After completing one complete layer, the boundaries
     * are updated and we move toward the inner layer.
     *
     * Example:
     *
     * 1  2  3  4
     * 5  6  7  8
     * 9 10 11 12
     *13 14 15 16
     *
     * Spiral order:
     * 1 5 9 13 14 15 16 12 8 4 3 2 6 7 11 10
     */
    public static void spiralTraversal(int[][] arr) {

        /*
         * n stores the number of rows in the matrix.
         *
         * arr.length gives the number of rows because
         * a 2D array is an array of rows.
         */
        int n=arr.length;

        /*
         * m stores the number of columns in the matrix.
         *
         * arr[0].length gives the number of elements in
         * the first row, which represents the number of columns.
         */
        int m=arr[0].length;

        /*
         * sr = starting row
         *
         * Initially, we start from the first row,
         * whose index is 0.
         */
        int sr=0;

        /*
         * er = ending row
         *
         * The last row index is n-1 because array indexing
         * starts from 0.
         */
        int er=n-1;

        /*
         * sc = starting column
         *
         * Initially, we start from the first column,
         * whose index is 0.
         */
        int sc=0;

        /*
         * ec = ending column
         *
         * The last column index is m-1 because array indexing
         * starts from 0.
         */
        int ec=m-1;

        /*
         * Continue the traversal while a valid layer of the
         * matrix is still remaining.
         *
         * sr <= er means the starting row has not crossed
         * the ending row.
         *
         * sc <= ec means the starting column has not crossed
         * the ending column.
         *
         * Once either condition becomes false, all elements
         * have been traversed.
         */
        while(sr<=er && sc<=ec){

            /*
             * ---------------- LEFT WALL ----------------
             *
             * Traverse the LEFT wall from TOP to BOTTOM.
             *
             * column=sc -> column remains fixed because we are
             *                 moving vertically in one column.
             *
             * row=sr -> traversal starts from the top.
             *
             * row<=er -> continue until the ending row.
             *
             * row++ -> move downward one row at a time.
             *
             * Here, two int variables are declared together:
             *
             * int column=sc, row=sr;
             *
             * This is allowed because both variables are of type int.
             */
            for(int column=sc,row=sr;row<=er;row++){

                /*
                 * Print the element at the current row and
                 * current column.
                 */
                System.out.print(arr[row][column]+" ");
            }

            /*
             * The complete left wall has now been traversed.
             *
             * Therefore, increase sc by 1.
             *
             * This moves the starting column one step to the right
             * so that the already traversed left wall is not
             * processed again.
             */
            sc++;


            /*
             * ---------------- BOTTOM WALL ----------------
             *
             * Traverse the BOTTOM wall from LEFT to RIGHT.
             *
             * row=er -> row remains fixed because we are moving
             *              horizontally in one row.
             *
             * column=sc -> start from the current starting column.
             *
             * column<=ec -> continue until the ending column.
             *
             * column++ -> move one column toward the right.
             */
            for(int row=er,column=sc;column<=ec;column++){

                /*
                 * Print the element at the current row and
                 * current column.
                 */
                System.out.print(arr[row][column]+" ");
            }

            /*
             * The complete bottom wall has been traversed.
             *
             * Therefore, decrease er by 1.
             *
             * This moves the ending row one position upward
             * so that the already traversed bottom row is not
             * processed again.
             */
            er--;


            /*
             * ---------------- RIGHT WALL ----------------
             *
             * Traverse the RIGHT wall from BOTTOM to TOP.
             *
             * column=ec -> column remains fixed because we are
             *                 moving vertically.
             *
             * row=er -> start from the current bottom position.
             *
             * row>=sr -> continue until the starting row.
             *
             * row-- -> move upward one row at a time.
             */
            for(int column=ec,row=er;row>=sr;row--){

                /*
                 * Print the element at the current row and
                 * current column.
                 */
                System.out.print(arr[row][column]+" ");
            }

            /*
             * The complete right wall has been traversed.
             *
             * Therefore, decrease ec by 1.
             *
             * This moves the ending column one position to the left
             * so that the already traversed right wall is not
             * processed again.
             */
            ec--;


            /*
             * ---------------- TOP WALL ----------------
             *
             * Traverse the TOP wall from RIGHT to LEFT.
             *
             * row=sr -> row remains fixed because we are moving
             *              horizontally in one row.
             *
             * column=ec -> start from the current rightmost column.
             *
             * column>=sc -> continue until the starting column.
             *
             * column-- -> move one column toward the left.
             */
            for(int row=sr,column=ec;column>=sc;column--){

                /*
                 * Print the element at the current row and
                 * current column.
                 */
                System.out.print(arr[row][column]+" ");
            }

            /*
             * The complete top wall has been traversed.
             *
             * Therefore, increase sr by 1.
             *
             * This moves the starting row one position downward
             * so that the already traversed top row is not
             * processed again.
             */
            sr++;
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Traversal:");
        spiralTraversal(arr);

        sc.close();
    }
}

