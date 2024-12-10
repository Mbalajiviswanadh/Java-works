import java.util.*;
class Solution {
    public boolean helper(String s, int n, int x){
        int[] cnt = new int[26];
        int p = 0;

        for (int i = 0; i < n; i++) {
            while (s.charAt(p) != s.charAt(i)) p++;
            if (i - p + 1 >= x) cnt[s.charAt(i) - 'a']++;
            if (cnt[s.charAt(i) - 'a'] > 2) return true;
        }

        return false;
    }
    public int maximumLength(String s) {
        int n = s.length();
        int l = 1, r = n;

        if (!helper(s, n, l)) return -1;

        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (helper(s, n, mid)) l = mid;
            else r = mid;
        }

        return l;
        
        /*
        // using hashmap //brut force
        // taking min and max range 
        
        int minR =1;
        int maxR= s.length()-2;
        int length = -1;

        for(int i=minR;i<=maxR;i++){
            Map<String, Integer> checkMap = new HashMap<>();

            for(int j=0;j<=s.length()-i;j++){
                String subString = s.substring(j, j+i);

                checkMap.put(subString, checkMap.getOrDefault(subString,0)+1);
            }

            for(String subKey : checkMap.keySet()){

                if(checkMap.get(subKey)>=3)
                length=i;
            }
        }

        return length;
        */
    }
}