import java.util.*;

class Remove_duplicates {
    public static int removeDuplicates(int[] arr, int n ) {

        int j =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j] =arr[i];
                j++;
            }
        }
        return j;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the nums: ");

        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        //calling the function 

        int result = removeDuplicates(arr, n);
        System.out.println("Number of Duplicates are :" +result);

        
    }
}