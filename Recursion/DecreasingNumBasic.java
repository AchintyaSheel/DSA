import java.util.Scanner;
//1)Understanding the requirements from the function
//In this case on the basis of value of n,we have to print from n to 1
public class DecreasingNumBasic{
    public static void printDecreasing(int n){
        //4)Solving for the smallest problem(Base case)
        if(n==0){
            return;
        }
        //3)Solving for the whole problem(Since the below bill print from n-1)
        //Therefore to solve the whole problem(n also needs to be printed)
        System.out.println(n);

        //2)Assuming that it works for smaller input/problem
        // (generally we take 1 less than the actual input i.e (n-1))
         printDecreasing(n-1);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        printDecreasing(n);

        sc.close();
    }
}