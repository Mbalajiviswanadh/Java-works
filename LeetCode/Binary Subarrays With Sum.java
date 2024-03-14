import java.util.*;

class Binary_Subarrays_With_Sum{

    public static int numSubarraysWithSum(int nums[],int n,int goal){
        int totalcount =0, sum =0;
        int preSum[]=new int[n+1];
        preSum[0]=1;

        for(int i : nums){
            sum+=i;
            if(sum>=goal)
            totalcount+=preSum[sum-goal];

            preSum[sum]++;
        }
        return totalcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array:");
        int n = sc.nextInt();

        System.out.println("Enter the values inside:");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value for goal ;");
        int goal=sc.nextInt();
        
        System.out.println("Result : "+numSubarraysWithSum(nums, n, goal));

    }
}