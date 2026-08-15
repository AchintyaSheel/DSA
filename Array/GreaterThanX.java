import java.util.Scanner;
public class GreaterThanX{
    public static int countElementGreaterThanX(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.print("Enter "+ size+" elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();

        int res=countElementGreaterThanX(arr,x);
        System.out.print("Number of elements greater than x: "+res);

        sc.close();

    }
}