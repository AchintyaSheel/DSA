import java.util.Scanner;
class SubArray {
    public static void printAllSubArrays(int[] arr){
        int n=arr.length;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int i=si;i<=ei;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        printAllSubArrays(arr);

        sc.close();
    }
}

