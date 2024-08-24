import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set  = new HashSet<>();

        for(int i: nums)
        set.add(i);

        int maxsize=0;
        for(int i: nums){


            if(set.contains(i-1)) 
            continue;
            else{

                int curr=i;
                int currsize=1;

                while(set.contains(curr+1)){
                    curr++;
                    currsize++;
                }

                maxsize=Math.max(maxsize,currsize);
            }
        }
        return maxsize;
    }
}