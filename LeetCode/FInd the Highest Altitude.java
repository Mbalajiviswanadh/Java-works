import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int presum=0;
        for(int i=0;i<gain.length;i++){
            presum+=gain[i];

            list.add(presum);
        }

        int maxnum=0;
        for(int i: list){
            maxnum=Math.max(maxnum,i);
        }
        return maxnum;
    }
}