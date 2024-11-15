class Solution {
    public int findLengthOfShortestSubarray(int[] nums) {
        int n=nums.length;



        // FINDING THE LONGEST NON-DECENDING PREFIX
        int left =0;
        while(left+1<n && nums[left]<=nums[left+1])
        left++;

        if(left==n-1)
        return 0;

        // FINDING THE LONGEST NON-DECENDING SUFFIX
        int right=n-1;
        while(right>0 && nums[right-1]<=nums[right])
        right--;

        int result =Math.min( n-left-1, right);

        int i=0;
        int j=right;
        while(i<=left & j<n){
            if(nums[i]<=nums[j]){
                result= Math.min(result, j-i-1);
                i++;
            }
            else
            j++;
        }
        return result;

    }
}