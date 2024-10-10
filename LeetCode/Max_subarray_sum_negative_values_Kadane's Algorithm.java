import java.util.*;
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i: arr){
            
            if(sum<0)
            sum=0;
            
            sum+=i;
            
            max=Math.max(max,sum);
        }
        return max;
    }
}