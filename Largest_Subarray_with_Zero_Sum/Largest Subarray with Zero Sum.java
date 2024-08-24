package Largest_Subarray_with_Zero_Sum;

import java.util.*;
class GfG
{
    int maxLen(int nums[], int n)
    {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        //  prefixsum, index
        int maxsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(sum==0)
            maxsum=i+1;
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                maxsum=Math.max(maxsum, i-map.get(sum));
            }
        }
        
        return maxsum;
    }
}