import java.util.Scanner;
//1)Understanding the requirements from the function
//In this case on the basis of value of n,we have to return fctorial of n;
    public class Factorial{
    public static int fact(int n){
         //4)Solving for the smallest problem(Base case)
         //As 0!=1!=1
        if(n<=1){
            return 1;
        }
      
        //2)Assuming that it works for smaller input/problem
        // (generally we take 1 less than the actual input i.e (n-1))
         int forSmallerNum=fact(n-1);
        //3)Solving for the whole problem(Since the below will print till n-1)
        //Therefore to solve the whole problem(n also needs to be multiplied)
        int ans=n*forSmallerNum;

        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        System.out.println(fact(n));

        sc.close();
    }
}
    

