import java.util.Scanner;
public class BinarySearch {
    public static int bSearch(int[]arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<=right){
            int mid=(left+right)/2;
         
            if (arr[mid]==target){
                return mid;

            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element to find in the array:");
        int target=sc.nextInt();
        int targetidx=bSearch(arr,target);
        System.out.print("The target element of the array is at the index:"+targetidx);

        sc.close();

    }
    
}
