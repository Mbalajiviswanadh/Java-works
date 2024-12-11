
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        // finding max value in nums

        int maxval =0;

        for(int i: nums)
        maxval = Math.max(maxval, i);

        // to track ranges
        int range[] = new int[maxval+10];


        for(int i : nums){
            int left = Math.max(0, i-k);
            int right = Math.min(maxval, i+k) +1;
            range[left]++;
            range[right]--;
        }

        // find prefix sums and max val

        int res = range[0];

        for(int i=1 ; i<range.length;i++){

            range[i]+=range[i-1];

            if(range[i] > res)
            res = range[i];
        }
        return res;


    }
}