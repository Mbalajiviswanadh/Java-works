import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int ans=0;
        hm.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){

            count--;
            }
            else
            count++;

            if(hm.containsKey(count))
            ans=Math.max(ans,i-hm.get(count));
            else
            hm.put(count,i);
        }
        return ans;
    }
}