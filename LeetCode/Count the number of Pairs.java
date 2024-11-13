import java.util.*;
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        long res=0;

        for(int i=0;i<nums.length;i++){
            int low= lowerBound(nums, i+1, nums.length, lower-nums[i]);
            int up = upperBound(nums, i+1, nums.length, upper-nums[i]);
            res+= up-low;
        }
        return res;
    }

    public int lowerBound(int nums[], int l, int r, int target){
        while(l<r){
            int mid = l+(r-l)/2;

            if(nums[mid]>=target)
            r =mid;
            else
            l=mid+1;
        }
        return l;
    }
    public int upperBound(int nums[], int l, int r, int target){
        while(l<r){
            int mid = l+(r-l)/2;

            if(nums[mid]>target)
            r =mid;
            else
            l=mid+1;
        }
        return l;
    }

}