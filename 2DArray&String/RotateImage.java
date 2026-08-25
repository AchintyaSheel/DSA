import java.util.Scanner;

public class RotateImage {
    
     public static void transpose(int[][] matrix) {
       int n=matrix.length;
       int temp=0;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            
        }
       } 
      
    
}
public static void reverseEveryRow(int[][] matrix) {
    int n=matrix.length;
    int temp=0;
    for(int i=0;i<n;i++){
        int arr[]=matrix[i];

        int start=0;
        int end=n-1;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    

}
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseEveryRow(matrix);
    }

      
    

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Ask the user for the size of the square matrix
    System.out.print("Enter the size of the matrix: ");
    int n = sc.nextInt();

    // Create an n x n matrix
    int[][] matrix = new int[n][n];

    // Take matrix elements from the user
    System.out.println("Enter the elements of the matrix:");

    for(int i = 0; i < n; i++) {

        for(int j = 0; j < n; j++) {

            matrix[i][j] = sc.nextInt();
        }
    }

    // Call rotate method
    rotate(matrix);

    // Print the rotated matrix
    System.out.println("Rotated Matrix:");

    for(int i = 0; i < n; i++) {

        for(int j = 0; j < n; j++) {

            System.out.print(matrix[i][j] + " ");
        }

        System.out.println();
    }

    sc.close();
}

    
}
