import java.util.*;
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // let res integer = x
        // x should be in between of 1 ot n
        // and cant be in the banned array
        // and sum of those integers should not be more then maxsum

        // 1 to n arrray
        // add those with condition:
        // nums[i] not contains in banned & sum<=maxsum

        Set<Integer> set = new HashSet<>();

        for(int i: banned){
            set.add(i);
        }
        
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){         
                        
            if(!set.contains(i) && sum+i <=maxSum){
                sum+=i;
                count++;
            }
        }
        return count;


    }
}