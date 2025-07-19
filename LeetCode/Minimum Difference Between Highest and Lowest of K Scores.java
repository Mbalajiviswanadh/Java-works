import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        
        int res = Integer.MAX_VALUE;

        if(nums.length==1){
            return 0;
        }

        for(int i=0;i<=nums.length-k;i++){

            int curmin = nums[i];
            int curmax = nums[i+k-1];

            int curdiff= curmax - curmin;

            res =Math.min(res, curdiff);
        }
        return res;
    }
}