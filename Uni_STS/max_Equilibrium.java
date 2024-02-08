package Uni_STS;
import java.util.*;

class max_equilibrium {

    public static int finding_equilibrium(int arr[] , int n){

        int left_sum = 0;
        int right_sum=0;



        for(int i=1; i<n;i++){


            //below for loops will find the sum from 0 --- (<i) values
            for(int j =0; j<i;j++){
                left_sum +=arr[j];
            }

            //below for loop wll find the sum after the i to the end of array

            for(int j=i=1; j<n;j++){
                right_sum=arr[j];
            }

            if(left_sum == right_sum){
                return i;
            }
        }
        return 0;
        
    }
    

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("ENter the values inside the array :");

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
}
