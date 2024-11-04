class Solution {
    public boolean isValid(int nums[], int k, int mid){
        int count=1;
        int curr=0;

        for(int i=0;i<nums.length;i++){

            int val = nums[i];
            if(val > mid)
                return false;

            if(curr + val <= mid){
                curr += val;
            }
            else{
                count++;
                curr = val;
            }
        }
        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        // Just like Books Allocation 
        // FIND THE RANGE OF THE NUMS which is sum(arr)
        // NOW USING BINARY SEARCH 
        // FIND MID
        // IF MID VALID - LEFT  (since we need maxvalue)
        // IF MID NOT-VALID - RIGHT

        int range = 0;
        int maxval = 0;
        for(int i: nums){
            range += i;
            maxval = Math.max(maxval, i);
        }

        int l = maxval;
        int r = range;

        int res = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(isValid(nums, k, mid)){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
        
        
    }
}
