package Longest_Subarray_Ksum;

import java.util.*;

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int nums[], int N, int k) {
        //Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxlength=0;
        // int currl=0;/
        int prsum=0;
        
        for(int i=0;i<nums.length;i++){
            
            prsum+=nums[i];
            if(prsum==k)
            maxlength=Math.max(maxlength, i+1);
            // maxlength=i+1;
            
            int diff=prsum-k;
            
            if(map.containsKey(diff)){
                int currl=i-map.get(diff);
                maxlength=Math.max(maxlength, currl);
                
            }
            
            if(!map.containsKey(prsum))
            map.put(prsum,i);
        }
        return maxlength;
    }
    
    
}
