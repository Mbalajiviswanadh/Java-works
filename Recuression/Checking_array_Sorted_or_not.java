package Recuression;
import java.util.*;

class Checking_array_Sorted_or_not {

    public static boolean Checking(int arr[], int index){

        //base case
        System.out.println("Given String is a Sorted String");
        if(index==arr.length-1){
            return true;
        }


        
        if(arr[index]<arr[index+1]){

            //if it is sorted, now we have to increment the index {index++}
        


            return Checking(arr, index+1);
        }
        else{
            System.out.println("Given String is a NOT Sorted String");
            return false;
        }
        

    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Insert vales :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();

        // printing  the function
        System.out.println(Checking(arr, 0));
    }
}
