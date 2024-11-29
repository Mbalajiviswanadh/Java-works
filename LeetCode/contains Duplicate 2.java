import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 1. travering all values 
        // 2. take hashmap
        // keep track of key as number and values are current index
        // 3. check the opperation when we find next same number
        // 4. if it donest satisfy just update the value to curr idx 
        // 5. just add if we dont find the value before 


        Map<Integer, Integer> map = new HashMap<>();

        // for(int i =0;i<nums.length;i++){

        //     if(!map.containsKey(nums[i]))
        //     map.put(nums[i], i);
        //     else{
        //         int j = map.get(nums[i]);

        //         if(Math.abs(i-j)<=k)
        //         return true;
        //         else
        //         map.put(nums[i],i);
        //     }
        // }
        // return false;

        for(int i=0;i<nums.length;i++){

            int curr = nums[i];

            if(map.containsKey(curr) && i-map.get(curr)<=k)
            return true;

            map.put(curr, i);
        }
        return false;

    }
}