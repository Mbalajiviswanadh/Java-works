package Sliding_Window;
import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxsize=0;
        int window_start=0;

        for(int i=0;i<fruits.length;i++){
            int x= fruits[i];
            map.put(x, map.getOrDefault(x,0)+1);

            if(map.size()>2){
                int s_val= fruits[window_start];

                map.put(s_val, map.get(s_val)-1);
                if(map.get(s_val) == 0)
                map.remove(s_val);

                window_start++;
            }
            if(map.size() <=2)
            maxsize= Math.max(maxsize, i-window_start+1);
        }
        return maxsize;
    }
}