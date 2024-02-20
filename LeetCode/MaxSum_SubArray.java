import java.util.*;

public class MaxSum_SubArray{

    public static int FindingMaxSum(int nums[],int n){

        int maxSub=nums[0];
        int curSum=0;

        for(int i=0;i<n;i++){
            // if the current sum is less than 0 then reset the current sum to 0
            if(curSum<0){
                curSum=0;
            }
            curSum+=nums[i];
            maxSub=Math.max(maxSub,curSum);
        }
        return maxSub;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("The Max Subarray Sum is : " +FindingMaxSum(nums, n));

    }
}