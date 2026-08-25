import java.util.Scanner;
public class TransposeMatrix {
    public static void transpose(int arr[][]){
        int n=arr.length;
        int temp=0;
        
        /*
         * We need to swap:
         *
         * arr[i][j] with arr[j][i]
         *
         * This changes rows into columns.
         *
         * Example:
         *
         * 1 2 3
         * 4 5 6
         * 7 8 9
         *
         * becomes:
         *
         * 1 4 7
         * 2 5 8
         * 3 6 9
         */

        /*
         * i represents the row.
         *
         * j starts from i because we have to swap from that element(element=the one on the same position as the row number)
         * (as before that element,it is already been swapped before) 
         */
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
         // Print the transpose matrix
        System.out.println("Transpose Matrix:");

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            // Move to the next row
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the square matrix:");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);

    }
    
}
