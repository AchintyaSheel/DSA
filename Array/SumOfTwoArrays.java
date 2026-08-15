import java.util.Scanner;
public class SumOfTwoArrays {
    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int resSize=(Math.max(n1,n2))+1;
        int[]res=new int[resSize];
        int i=n1-1;
        int j=n2-1;
        int k=resSize-1;


         int carry=0;
        while(k>=0){
            int cSum=0;

            if(i>=0){
                cSum+=arr1[i];
            }
            if(j>=0){
                cSum+=arr2[j];
            }
            cSum+=carry;

            if(cSum>9){
                res[k]=cSum%10;
                carry=cSum/10;
            }
            else{
                carry=0;
                res[k]=cSum;
            }
            i--;
            j--;
            k--;
        }

        return res;
    }


public static void printArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+", ");
    }

}
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array 1: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.print("Enter " + size1 + " elements of array 1: ");
        
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array 2: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.print("Enter " + size2 + " elements of array 1: ");
        
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int[] res = sumOfTwoArrays(arr1, arr2);

        System.out.print("Sum: ");
        printArray(res);

        sc.close();
    }
}

