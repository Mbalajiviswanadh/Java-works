package UNI_STS;

import java.util.*;
class Leader_O_n {

     void Leaderin_array(int arr[] , int size){

        int max_value =0;

        // itrating from end of the array to the start of the arry 
        for(int i=size-1; i>=0;i--){

            if(max_value < arr[i]){
                // if the i value is greater than the max_vales then we are storing that value in max_value

                max_value = arr[i];
                System.out.println("Max values :" +max_value);
                
            }
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();


        int arr[]  = new int[n];

        
        System.out.println("Enter the values : ");
        
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int size = arr.length;

        Leader_O_n solution = new Leader_O_n();
        solution.Leaderin_array(arr, size);
    }
    
}
