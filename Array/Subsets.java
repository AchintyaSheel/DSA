import java.util.Scanner;
public class Subsets {
     public static void printSubsets(int[] nums){
        int n=nums.length;//Total length of array
        int totalSubsets=(int)Math.pow(2,n);// // An array with n elements has 2^n possible subsets
        for(int i=0;i<totalSubsets;i++){ // Loop through all possible subset numbers
                                         // Example: if n = 3, i goes from 0 to 7
            int current_num=i;//Making copy of i(as we are calculating the binary representation of i only)and if it changes further(because of i/=2)will effect our desired output
            String sub="";//creates an empty string that we will gradually build into the current subset.
            for(int idx=n-1;idx>=0;idx--){// Start from the last index and move towards index 0
                 // Check the last binary digit of current_num
                // % 2 gives either 0 or 1
                if(current_num %2==0){// 0 means: do not include this element
                sub="_,"+sub;         // So we put "_" in the subset
                }
              // 1 means: include this element
                else{
                    sub=nums[idx]+","+sub;
                }
// Example: current_num = 5 (binary 101)
// %2 checks the last binary digit: 5 % 2 = 1 → digit is 1
// /2 removes the last binary digit: 5 / 2 = 2 → binary becomes 10
// Again: 2 % 2 = 0 → digit is 0
// Then: 2 / 2 = 1 → binary becomes 1
// Again: 1 % 2 = 1 → digit is 1
// Finally: 1 / 2 = 0 → no more digits to check
                current_num/=2;// Divide by 2 to remove the last binary digit
                               // and move to the next binary digit

            }
             System.out.println(sub);

        }

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        printSubsets(nums);

        sc.close();
    }
    
}
