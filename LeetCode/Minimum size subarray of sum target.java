import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minsize=Integer.MAX_VALUE;

        int sum=0;
        int window_start=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            while(sum>=target){

                int currsize=i-window_start+1;

                minsize= Math.min(minsize, currsize);

                sum-=nums[window_start];
                window_start++;
            }
        }
        
        if(minsize==Integer.MAX_VALUE)
        return 0;
        else
        return minsize;
    }
}