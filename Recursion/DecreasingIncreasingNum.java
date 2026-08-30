import java.util.Scanner;
//1)Understanding the requirements from the function
//In this case on the basis of value of n,we have to print from n to 1 to n
//(1 should only be printed single time(not twice),taken care of it using base case )
public class DecreasingIncreasingNum {
    public static void printDecreasingIncreasing(int n){
        //4)Solving for the smallest problem(Base case)
        if(n==1){
            System.out.println(n);
            return;
        }
        //3)Solving for the whole problem(Since the below will print from n-1)
        //Therefore to solve the whole problem(n also needs to be printed)
        System.out.println(n);

        //2)Assuming that it works for smaller input/problem
        // (generally we take 1 less than the actual input i.e (n-1))
         printDecreasingIncreasing(n-1);

         //3)Solving for the whole problem(Since the below will print to n-1)
        //Therefore to solve the whole problem(n also needs to be printed)
          System.out.println(n);


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        printDecreasingIncreasing(n);

        sc.close();
    }
}
    

