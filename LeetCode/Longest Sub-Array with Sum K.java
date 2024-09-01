import java.util.*;

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int nums[], int N, int K) {
        // Complete the function
        int maxsize=0;
        int currsum=0;
        int window_start=0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            currsum+=nums[i];

            if(currsum==K)
            maxsize=i+1;

            if(map.containsKey(currsum-K)){
                maxsize= Math.max(maxsize, i-map.get(currsum-K));
            }
            if(!map.containsKey(currsum))
            map.put(currsum,i);


        }
        return maxsize;
        
    }
}
