import java.util.*;
public class Minimum_values_after_roated {
    
    public static int minAfterRoated(int n, int nums[]){
        int low=0;
        int high=n-1;

        while(low<high){

            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter tha values inside :");
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = minAfterRoated(n, nums);
        System.out.println("The Mini value is : "+result);
    }
}
