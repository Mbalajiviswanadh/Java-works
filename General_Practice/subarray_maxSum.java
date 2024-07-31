import java.util.*;
class subarray_maxSum {
    
    public static int solve(int nums[]){
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxsum=Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n =sc.nextInt();

        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(solve(nums));

    }
}
