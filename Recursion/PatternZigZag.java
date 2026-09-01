 import java.util.Scanner;
//1)Understanding the requirements from the function
//In this case on the basis of value of n,we have to return a pattern(n+sol(n-1)+n+sol(n-1)+n);
    public class PatternZigZag {
    public static void printZigZag(int n){
         //4)Solving for the smallest problem(Base case)
         //As 0!=1!=1
        if(n==0){
            return;
        }
        System.out.print(n);
        printZigZag(n-1);
        System.out.print(n);
        printZigZag(n-1);
        System.out.print(n);
   
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        printZigZag(n);

        sc.close();
    }
}

    

