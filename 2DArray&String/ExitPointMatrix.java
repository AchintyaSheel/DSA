//https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1
//Exit Point in a Matrix
import java.util.*;

public class ExitPointMatrix {

    /*
     * This method finds the EXIT POINT of a matrix.
     *
     * The movement starts from the top-left corner (0,0).
     *
     * Direction values:
     *
     * 0 -> Right
     * 1 -> Down
     * 2 -> Left
     * 3 -> Up
     *
     * Whenever we encounter 1:
     *
     * 1. Change 1 to 0.
     * 2. Turn 90 degrees clockwise.
     * 3. Continue moving in the new direction.
     *
     * When the movement goes outside the matrix,
     * the last valid position is the exit point.
     */
    public static List<Integer> exitPoint(int[][] mat) {

        int row=0;
        int column=0;

        // Number of rows in the matrix.
        int n=mat.length;

        // Number of columns in the matrix.
        int m=mat[0].length;

        /*
         * Initially, direction is 0.
         *
         * direction = 0 -> Right
         */
        int direction=0;

        /*
         * Continue moving while the current position
         * is inside the matrix.
         */
        while(row>=0 && row<n && column>=0 && column<m ){

            /*
             * If the current cell contains 1,
             * change it to 0 and turn clockwise.
             */
            if(mat[row][column]==1){

                /*
                 * Change 1 to 0 so that if we visit this cell
                 * again, it will not cause another turn.
                 */
                mat[row][column]=0;

                /*
                 * Change direction clockwise.
                 *
                 * 0 -> 1
                 * 1 -> 2
                 * 2 -> 3
                 * 3 -> 0
                 *
                 * %4 is used because there are 4 directions.
                 */
                direction=(direction+1)%4;
            }

            /*
             * direction = 0 means move RIGHT.
             */
            if(direction==0){
                column++;
            }

            /*
             * direction = 1 means move DOWN.
             */
            else if(direction==1){
                row++;
            }

            /*
             * direction = 2 means move LEFT.
             */
            else if(direction==2){
                column--;
            }

            /*
             * direction = 3 means move UP.
             */
            else{
                row--;
            }
        }

        /*
         * The loop stops only after row or column has moved
         * outside the matrix.
         *
         * Therefore, we move one position back to get the
         * actual cell from which we exited.
         */

        // If we moved above the matrix.
        if(row<0)row++;

        // If we moved to the left of the matrix.
        if(column<0)column++;

        // If we moved below the matrix.
        if(row==n)row--;

        // If we moved to the right of the matrix.
        if(column==m)column--;

        /*
         * Store the final row and column in an ArrayList.
         */
        List<Integer>al=new ArrayList<>();
        al.add(row);
        al.add(column);

        return al;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Take number of rows and columns from the user.
         */
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        /*
         * Create the matrix.
         */
        int[][] mat = new int[n][m];

        /*
         * Take matrix elements as input.
         */
        System.out.println("Enter the matrix elements:");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        /*
         * Call exitPoint() and store the returned result.
         */
        List<Integer> result = exitPoint(mat);

        /*
         * Display the exit point.
         */
        System.out.println("Exit Point: " + result);

        sc.close();
    }
}
    

