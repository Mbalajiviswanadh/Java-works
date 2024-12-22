import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(!set.contains(i))
            set.add(i);
        }
        int maxnum =0;
        for(int i: nums){
            maxnum=Math.max(maxnum,i);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}