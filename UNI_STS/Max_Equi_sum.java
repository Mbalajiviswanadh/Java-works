package UNI_STS;
import java.util.*;
import java.util.stream.*;


class Max_Equi_sum {
/*<---------------------------- Time complexity is O(n) -----------------------> */

//   public static int findMaxsum_tc_n(int arr[] , int n){

//         int sum = IntStream.of(arr).sum();

//         int prefix_sum =0;

//         int res = Integer.MIN_VALUE;

//         for(int i =0; i<n;i++){

//             prefix_sum +=arr[i];

//             if(prefix_sum ==sum ){
//                 res = Math.max(res, prefix_sum);
//                 sum -=arr[i];
//             }
            
//         }
//         return res;
//   }
 

/*<---------------------------- Time complexity is O(n^2) -----------------------> */

    public static int findmaxsum(int arr[] , int n ){

        int res = -1;

        for(int i=0;i<n;i++){

            int left_sum=arr[i];

            for(int j =0;j<i;j++){
                 left_sum +=arr[j];
            }


            int right_sum =arr[i];
            for(int j=n-1;j>i;j--){
                right_sum +=arr[j];
            }

            if(left_sum == right_sum){
                res = Math.max(res, left_sum);
            }

        }
        return res;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the size of an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values :");

        for(int i=0; i<n;i++){
            arr[i] =sc.nextInt();
        }

        // System.out.println(findmaxsum(arr, n));

        
        int result = findmaxsum(arr, n);
        System.out.println("The Max_Sum result :" +result);

    }
}




