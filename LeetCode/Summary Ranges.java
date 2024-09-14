import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        if(nums.length==0)
        return new ArrayList<>();
        
        int start=nums[0];
        List<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            
            if(i==nums.length-1 || nums[i]+1!=nums[i+1]){
                if(start==nums[i])
                list.add(Integer.toString(nums[i]));
                else
                list.add(start+"->"+nums[i]);
                
                if(i!=nums.length-1)
                start=nums[i+1];
            }
        }
        return list;
    }
}