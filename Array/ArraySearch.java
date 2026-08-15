//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
import java.util.Scanner;

public class ArraySearch {
    public static int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.print("Enter "+ size+" elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        int res=search(arr,x);
        System.out.print("The target index is found at the index: "+res);

        sc.close();
    }
}


