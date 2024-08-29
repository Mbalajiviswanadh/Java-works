import java.util.*;
class Solution {
    public int maximumDifference(int[] nums) {
        
        int maxdiff=-1;
        int leftmin=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            if(leftmin < curr){
                maxdiff= Math.max(maxdiff, curr-leftmin);
            }

            leftmin= Math.min(leftmin, curr);
        }
        return maxdiff;


        // int maxdiff=-1;

        // for(int i=0;i<nums.length-1;i++){

        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]>nums[i]){
        //             int diff= nums[j]-nums[i];
        //             maxdiff=Math.max(maxdiff, diff);
        //         }
        //     }
        // }
        // return maxdiff;
    }
}