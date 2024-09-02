import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;

        for(int i:nums)
        totalsum+=i;

        int leftsum=0;
        for(int i=0;i<nums.length;i++){

            int rightsum= totalsum - leftsum -nums[i];

            if(rightsum == leftsum)
            return i;
            leftsum+=nums[i];

        }

        return -1;
    }
}