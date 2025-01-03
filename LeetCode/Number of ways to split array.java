class Solution {
    public int waysToSplitArray(int[] nums) {
        long total_sum = 0;

        for(int i: nums){
            total_sum+=i;
        }

        int count=0;
        long curr_sum=0;
        for(int i=0;i<nums.length-1;i++){
            curr_sum+=nums[i];

            if(curr_sum >= total_sum-curr_sum)
            count++;
        }
        return count;
    }
}