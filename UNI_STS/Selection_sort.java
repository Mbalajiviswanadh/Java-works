package UNI_STS;
import java.util.*;
class Selection_sort {

    void sorting(int arr[] , int n){

        for(int i=0; i<n-1;i++){
            int min_idx= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]=temp;
        }
        
    }


    void printing(int arr[] , int n){
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values :");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        Selection_sort solution = new Selection_sort();
        solution.sorting(arr, n);
        System.out.println("The result :");
        solution.printing(arr, n);

    }
}
