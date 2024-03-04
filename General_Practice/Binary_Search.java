// package General_Practice;
import java.util.*;
class Binary_Search {

    public static int BinarySearch(int arr[],int n, int key){

        int left=0;
        int right =n-1;

        //conditions

        while(left <= right){

            int mid = left +(right-left)/2 ;

            if(key == arr[mid]){

                return mid;
            }
            else if( key > arr[mid]){

                //if the key value is greater than mid value then the left should starts from mid+1 which means after the mid
                left = mid+1;
            }
            else{
                
                // if key is less then mid value then right should reach to mid-1 
                right =mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the numbers in sorted :");

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the number{key} to search: ");
        int key = sc.nextInt();


        //calling the function 
        int result = BinarySearch(arr, n, key);

        System.out.print("The Index of the Key value is :" +result);

    }
}
