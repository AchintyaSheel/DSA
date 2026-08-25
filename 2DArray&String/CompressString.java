import java.util.Scanner;
public class CompressString {
    /*Input string=aaabbbccgggaabb
    Expected Output=abcgab */
    public static String Compress(String str){
        //Empty string str
        String res="";
        //First character will definitely be there
        res+=str.charAt(0);
    
        for(int i=1;i<str.length();i++){
            //Checking if the current element is not equal to the prevoious element,and then only adding it
            if(str.charAt(i)!=str.charAt(i-1)){
                res+=str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        System.out.print(Compress(str));

    }
    
}
