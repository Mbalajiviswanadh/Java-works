
class Solution {

    public static int maxVal(int nums[]){
        int max =0;

        for(int i: nums){
            max = Math.max(i,max);
        }
        return max;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=maxVal(nums);

        while(l<r){
            int mid = (l+r)/2;
            int ops=0;
            
            for(int i:nums){
                ops+= (i-1)/mid;
            }

            if(ops<=maxOperations)
                r=mid;
            else
                l=mid+1;
        }
        return r;
    }
}