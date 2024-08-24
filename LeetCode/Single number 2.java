import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);


        for(int i=1;i<nums.length;i=i+3){
            int j=i-1;
            if(nums[i]!=nums[j]){
                return nums[j];
            }
        }
        return nums[nums.length-1];


        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i: nums){
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }

        // for(int i: nums){
        //     if(map.get(i)==1)
        //     return i;
        // }
        // return 0;
    }
}