import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        
        int maxnext=0;

        for(int i=0;i<nums.length;i++){

            if(i>maxnext)
            return false;

            maxnext=Math.max(maxnext, i+nums[i]);

            if(maxnext== nums.length-1)
            return true;
        }
        return true;
    }
}