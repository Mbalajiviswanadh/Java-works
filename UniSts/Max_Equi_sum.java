package UniSts;
import java.util.*;

class Max_Equi_sum {

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
