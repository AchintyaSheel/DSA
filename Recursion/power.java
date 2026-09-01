import java.util.Scanner;
//1)Understanding the requirements from the function
//In this case on the basis of value of n,we have to return x to the power y
//i.e x multiplied by x(y times)
/* 
Time Complexity:

Let's see how many recursive calls are made.

pow(x, y)
    ↓
pow(x, y-1)
    ↓
pow(x, y-2)
    ↓
pow(x, y-3)
    ↓
...
    ↓
pow(x, 1)
    ↓
pow(x, 0)

The value of y decreases by 1 in every recursive call.
Therefore, approximately y recursive calls are made.
Hence:
Time Complexity = O(y)

Space Complexity:
Each recursive call remains in the call stack until the
smaller problem is solved.
There are approximately y recursive calls.
Hence:
Space Complexity = O(y)
*/
/*Approach-1
    public class power {
    public static int pow(int x,int y){
         //4)Solving for the smallest problem(Base case)
         //As Anything to the power 0 is 1 
        if(y==0){
            return 1;
        }
      
        //2)Assuming that it works for smaller input/problem
        // (generally we take 1 less than the actual input i.e (y-1))
         int SmallerAns=pow(x,y-1);
        //3)Solving for the whole problem(Since the above will give answer till x to the power y-1)
        //Therefore to solve the whole problem(x also needs to be multiplied)
        int ans=x*SmallerAns;

        return ans;

    }
*/        

    //Approach-2
    public class power {
    public static int pow(int x,int y){
         //4)Solving for the smallest problem(Base case)
         //As Anything to the power 0 is 1 
        if(y==0){
            return 1;
        }
       
        //2)Assuming that it works for smaller input/problem
        // (here we take y/2)
         int SmallerAns=pow(x,y/2);
        // 3) Solving for the whole problem
        //
        // Since SmallerAns = x^(y/2),
        // we can multiply it with itself to get:
        //
        // x^(y/2) * x^(y/2) = x^y
        //
        // This works directly when y is even.
        int ans=SmallerAns*SmallerAns;
         // If y is odd, one x is still left.
        //
        // Example:
        // x^5 = x^2 * x^2 * x
        //
        // Therefore, multiply the answer by x
        // when y is odd. // If y is odd, one x is still left.
        //
        // Example:
        // x^5 = x^2 * x^2 * x
        //
        // Therefore, multiply the answer by x
        // when y is odd.
         if(y%2!=0)
            {
                ans*=x;
        }

        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.print("Enter the value of y:");
        int y=sc.nextInt();

        System.out.println(pow(x,y));

        sc.close();
    }
}
/*
Time Complexity:

Let's see how many recursive calls are made.

Suppose y = 16:

pow(x, 16)
       ↓
pow(x, 8)
       ↓
pow(x, 4)
       ↓
pow(x, 2)
       ↓
pow(x, 1)
       ↓
pow(x, 0)


Here, y is divided by 2 in every recursive call.

So:

y
y/2
y/4
y/8
y/16
...

We stop when y becomes 0 (or reaches the base case).

Let's say the number of calls is k.

Then:

y / 2^k = 1

Therefore:

y = 2^k

Taking log on both sides:

k = log₂(y)

Therefore, the number of recursive calls is approximately log₂(y).

Hence:

Time Complexity = O(log y)


Space Complexity:

Since there are approximately log(y) recursive calls
and each call occupies space in the call stack:

Space Complexity = O(log y)


Why is Approach-2 better?

Approach-1:

y → y-1 → y-2 → y-3 → ... → 0

The problem is reduced by 1 each time.

Therefore:

Time Complexity = O(y)


Approach-2:

y → y/2 → y/4 → y/8 → ... → 0

The problem is reduced by half each time.

Therefore:

Time Complexity = O(log y)


Hence, Approach-2 is better because it reduces the problem
size by half at every recursive call.

This technique is called:

"Exponentiation by Squaring"
*/
    


    

