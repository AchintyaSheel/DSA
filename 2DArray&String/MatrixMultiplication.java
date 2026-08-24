import java.util.*;

public class MatrixMultiplication {

    /*
     * This method multiplies two matrices.
     *
     * Matrix multiplication is possible only when:
     *
     * Column of Matrix 1 = Row of Matrix 2
     *
     * Example:
     *
     * Matrix 1 = 3 x 3
     * Matrix 2 = 3 x 2
     *
     * Since 3 = 3, multiplication is possible.
     *
     * The result will have:
     * Rows of Matrix 1 x Columns of Matrix 2
     *
     * Result = 3 x 2
     */
    public static int[][] matrixMultiplication(int arr1[][], int arr2[][]) {

        // Number of rows in first matrix
        int n1 = arr1.length;

        // Number of columns in first matrix
        int m1 = arr1[0].length;

        // Number of rows in second matrix
        int n2 = arr2.length;

        // Number of columns in second matrix
        int m2 = arr2[0].length;

        /*
         * Create the result matrix.
         *
         * Result size is:
         * rows of first matrix x columns of second matrix
         */
        int res[][] = new int[n1][m2];

        /*
         * Check whether matrix multiplication is possible.
         *
         * Columns of first matrix must be equal
         * to rows of second matrix.
         */
        if(m1 == n2) {

            /*
             * i represents the row of the result matrix.
             */
            for(int i = 0; i < res.length; i++) {

                /*
                 * j represents the column of the result matrix.
                 */
                for(int j = 0; j < res[0].length; j++) {

                    /*
                     * k is used to multiply:
                     *
                     * arr1[i][k]
                     * with
                     * arr2[k][j]
                     *
                     * and add all the products.
                     */
                    for(int k = 0; k < m1; k++) {

                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            /*
             * Return the complete result matrix.
             */
            return res;
        }

        else {

            /*
             * Matrix multiplication is not possible
             * because:
             *
             * Column of Matrix 1 != Row of Matrix 2
             */
            System.out.print(
                "Error!\nTry with another matrix" +
                "(with column of matrix1=row of matrix2)"
            );

            /*
             * Return an empty 2D array.
             *
             * This means there is no result matrix.
             */
            return new int[0][0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //First Matrix
        System.out.print("Enter the row size of the first matrix:");
        int n1=sc.nextInt();
        System.out.print("Enter the column size of the first matrix:");
        int m1=sc.nextInt();
        int[][]arr1=new int[n1][m1];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        //Second Matrix
        System.out.print("Enter the row size of the second matrix:");
        int n2=sc.nextInt();
        System.out.print("Enter the column size of the second matrix:");
        int m2=sc.nextInt();
        int[][]arr2=new int[n2][m2];
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        int result[][] = matrixMultiplication(arr1, arr2);

        for(int i=0; i<result.length; i++){

        for(int j=0; j<result[0].length; j++){

        System.out.print(result[i][j] + " ");
        }

        System.out.println();
        }

        sc.close();
    }
}

