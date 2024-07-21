
import java.util.*;
class Solution {
    public int findPair(int n, int x, int[] nums) {
        Arrays.sort(nums);
        // code here
        int l = 0;
        int r = 1; // Start with the second element as the right pointer
        
        // Use two pointers to find the pair
        while (r < n) {
            // Check the difference between the two pointers
            int diff = nums[r] - nums[l];
            
            if (diff == x) {
                return 1; // Pair found
            } else if (diff < x) {
                r++; // Increase the difference by moving right pointer
            } else {
                l++; // Decrease the difference by moving left pointer
                // Ensure the right pointer is always ahead of the left pointer
                if (l == r) {
                    r++;
                }
            }
        }
        
        return -1; // No pair found
       
        // int l=0;
        // int r=nums.length-1;
        // //  2 3 5 5 20 80 

        // while(l<r){
        //     // int mid=l+(r-l)/2;
        //     if(nums[r]-nums[l]==x)
        //     return 1;
        //     else if(nums[r]-nums[l]>x)
        //     r--;
        //     else
        //     l++;
       
            
        // }
        // return -1;
    }
}
