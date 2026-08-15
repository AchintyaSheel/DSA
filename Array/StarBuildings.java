import java.util.Scanner;
public class StarBuildings{
    public static void buildings(int[]arr){
        //For max height(i.e. which is the tallest building)
        int n=arr.length;
        int maxHeight=0;
        for(int i=0;i<n;i++){
            int currentFloor=arr[i];
            maxHeight=Math.max(maxHeight,currentFloor);
        }
        int totalLines=maxHeight;
        int currentFloor=maxHeight;
        
        while(currentFloor>0){
            //Go to every building and check if current floor of that building exists or not
        for(int i=0;i<n;i++){//Since n is the length of array(i.e number of buildings)
            int currentBuildingHeight=arr[i];
            if(currentFloor<=currentBuildingHeight){//Checking,if current floor exists or not
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            }
            //Preparing for next line
            System.out.println();
            currentFloor--;
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        buildings(arr);
        sc.close();
    }
}