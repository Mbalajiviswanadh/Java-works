package UniSts;

import java.util.*;
class Leader_In_Array {

    void leaderin_array(int arr[] , int size){

        for(int i=0;i<size;i++){
            int j;

            for( j=i+1;j<size;j++){

                if( arr[i] <=arr[j]){
                    break;
                }
            }
			
			if( j ==size){
				System.out.print(arr[i]+ " ");
			}
        }
    }
	   

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();



        int arr[] = new int[n];
		
        System.out.println("Enter values :");
        for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
        }
		
		
		Leader_In_Array solution = new Leader_In_Array();
		System.out.print("Result :");
        solution.leaderin_array(arr, n);
    }
}

