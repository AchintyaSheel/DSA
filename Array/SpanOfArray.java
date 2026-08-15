import java.util.Scanner;
public class SpanOfArray {
     // span of array=(Greatest element of array-Smallest element of array)
    public static int findSpan(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;//Gives the least possible value of integer in JAVA
        int min=Integer.MAX_VALUE;//Here, the main issue was that we could not have initialized it with 0,
        // as if we would have done so and if the element of array would have been negative,then our logic would fail
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        return span;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements of array: ");
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // System.out.print("Enter the value of x: ");
        // int x = scn.nextInt();

        // int res = countElementsGreaterThanX(arr, x);

        // System.out.println("Number of elements greater than x: " + res);

        int span = findSpan(arr);
        System.out.println("Span of array is: " + span);

        sc.close();
    }
}
    

