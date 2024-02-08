package UniSts;
import java.util.*;

class max_equilibrium {

    public static int finding_equilibrium(int arr[] , int n){

     



        for(int i=0; i<n;++i){
            int left_sum = 0;
            int right_sum=0;

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
        return -1;
        
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



        //calling the function 

        int result =  finding_equilibrium(arr,n);
        System.out.print("The Equilibrium values is: "+result);


    }
}
