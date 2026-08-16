//https://www.geeksforgeeks.org/problems/reverse-an-array/1
import java.util.*;
//Method-1(using for loop)
public class ReverseArray_Inplace{
    /*public static void reverse(int[]arr){
        int lastidx=(arr.length)-1;
        for(int i=0;i<lastidx;i++){
        int temp=arr[i];
        arr[i]=arr[lastidx];
        arr[lastidx]=temp;
        lastidx--;
        }
        System.out.print("Reversed array: "+ Arrays.toString(arr));
    }*/

   //Method-2(using for loop (method-2(1)))
   //using swap function
    // Swaps the elements at index left and right
    /*public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;

        // Swap first with last, second with second-last, etc.
        for (int left = 0; left < n / 2; left++) {
            swap(arr, left, n - 1 - left);
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }*/
    //Method-2(using for loop (method-2(2)))
   //without swap function
   public static void reverse(int[]arr){
        int n = arr.length;

        // Swap first element with last, second with second-last, etc.
        for (int left = 0; left < n / 2; left++) {

            int temp = arr[left];
            arr[left] = arr[n - 1 - left];
            arr[n - 1 - left] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }


    //Method-3(using while loop)
   /* public static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void reverse(int[]arr){
            int left=0;
            int right=(arr.length)-1;
            while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
        // Printing an array directly shows its object reference, so use Arrays.toString()
        // Arrays.toString(arr) prints the array elements in a readable format.
        // Example: arr = {10, 20, 30} → [10, 20, 30]
        // Without it, printing arr directly gives something like: [I@5acf9800
         System.out.print("Reversed array: "+ Arrays.toString(arr));
    }
         */

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter "+size+ " elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        sc.close();
        
    }
}
