package UniSts;

// import java.util.*;

// public class Leader_In_Array {

//     void leaderin_array(int arr[] , int size){

//         for(int i=0;i<size;i++){
//             int j;
//             for( j=i+1;j<size;j++){
//                 if( arr[i] <=arr[j]){
//                     break;
//                 }
//                 if( j ==size){
//                     System.out.println(arr[i]+ " ");
//                 }
//             }
//         }
//     }
    

//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array :");
//         int y = sc.nextInt();



//         Leader_In_Array solution = new Leader_In_Array();
//         int arr[] = new int[y];

//         System.out.println("Enter values :");
//         for(int i=0;i<y;i++){
//             arr[i]= sc.nextInt();
//         }
//         int n = arr.length;


//         solution.leaderin_array(arr, n);
//     }
// }

import java.io.*;
import java.util.Scanner;
 class LeadersInArray 
{
	/*Java Function to print leaders in an array */
	void printLeaders(int arr[], int size) 
	{
		for (int i = 0; i < size; i++) 
		{
			int j;
			for (j = i + 1; j < size; j++) 
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == size) // the loop didn't break
				System.out.print(arr[i] + " ");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[y];
        for(int i=0;i<y;i++){
            arr[i]=sc.nextInt();
        }
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
