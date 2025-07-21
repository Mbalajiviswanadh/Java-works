import java.util.*;
class Solution {
    public boolean wordBreak(String s, List<String> w) {
        
        boolean dp[]= new boolean[s.length()+1];

        dp[0]=true;

        for(int i=1;i<=s.length();i++){

            for(String a: w){
                int start = i - a.length();
                if(start>=0 && dp[start] && s.substring(start, i).equals(a)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}