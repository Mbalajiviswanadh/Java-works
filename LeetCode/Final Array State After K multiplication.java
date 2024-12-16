class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // 1. we have to do this k times 
        // 2. find min value which comes first 
        // 3. do, opperation_val =  minvalue * multiplier
        // 4. replace that value with opperation_val

        while(k>0){
            k--;

            int minval=Integer.MAX_VALUE;
            int min_idx=-1;
            for(int i=0;i<nums.length;i++){
                
                if(nums[i] < minval){
                    minval = nums[i];
                    min_idx =i;
                }
                // else if(minval == nums[i] && i > min_idx){
                //     min_idx =i; 
                // } 
            }
            nums[min_idx] = minval*multiplier;
        }
        return nums;

    }
}