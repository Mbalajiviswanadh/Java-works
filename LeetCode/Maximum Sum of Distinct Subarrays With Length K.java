import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        
        Set<Integer> set = new HashSet<>();
        int window_start=0;

        long maxsum =0;
        long currsum=0;

        for(int i=0;i<nums.length;i++){

            while(set.contains(nums[i])){
                set.remove(nums[window_start]);
                currsum-=nums[window_start];
                window_start++;

            }

            set.add(nums[i]);
            currsum+=nums[i];

            if(i-window_start+1  == k){

                maxsum=Math.max(maxsum, currsum);
                set.remove(nums[window_start]);
                currsum-=nums[window_start];
                window_start++;
            }

        }

        return maxsum;

        // // int window_start=0;
        // long maxsum=0;
        // for(int i=0;i<=nums.length-k;i++){

        //     int sum=0;
        //     Set<Integer> set = new HashSet<>();
        //     boolean check = true;

        //     for(int j=i;j<i+k;j++){

        //         if(set.contains(nums[j])){
        //             check = false;
        //             break;
        //         }
        //         set.add(nums[j]);
        //         sum+=nums[j];

        //     }

        //     if(check)
        //     maxsum=Math.max(sum, maxsum);

        // }
        // return maxsum;
    }
}