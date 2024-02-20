package General_Practice;
import java.lang.reflect.Array;
import java.util.*;
public class Missing_num {

    public static int FindMissingNum(int nums[], int n){
        
        //sorting the given array
        Arrays.sort(nums);
        //creating new array 
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        int nums_sum=0;
        int arr_sum=0;

        //findng the summ of those arrays

        for(int i=0;i<n;i++){
            nums_sum+=nums[i];
            arr_sum+=arr[i];
        }
        //initailzing the missing value
        int missing_value=0;

        //finding the missing falue
        for(int i=0;i<n;i++){

            if(arr_sum ==nums_sum){
                return missing_value;
            }else{
                 missing_value=arr_sum -nums_sum;
            }
            return missing_value;
        }
        return missing_value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        // Missing_num sol= new Missing_num();
        System.out.println("Result : " +FindMissingNum(nums, n));
        // sol.FindMissingNum(nums,n);

    }
}
