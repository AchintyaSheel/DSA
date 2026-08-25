import java.util.Scanner;
public class CompressStringCount {
    /*Expected input:Enter the String:abbbgghhhhi
      Expected output:ab3g2h4i */
    public static String comp(String str){
         //Empty string str
        String res="";
        int count=1;
        //First character will definitely be there
        res+=str.charAt(0);
        //i,starting from 1 as i=0 already present in res
        for(int i=1;i<str.length();i++){
            //If both (current & previous) are equal,increase count by 1
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            //If both (current & previous) are not equal
            //and previosly the char were same and because of that count increased 

            else{
                //If count is greater than 1,then only add it to the final res string
                if(count>1){
                    res+=count;
                }
                    res+=str.charAt(i);
                    count=1;
            }
        } 
        return res;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.next();
        System.out.print(comp(str));
        sc.close();
    }
    
}
