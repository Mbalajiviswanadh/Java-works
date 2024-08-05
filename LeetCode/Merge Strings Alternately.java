import java.util.*;
class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res = new StringBuilder();

        int l=0;
        while(l<w1.length() || l<w2.length()){
            if(l<w1.length())
            res.append(w1.charAt(l));

            if(l<w2.length())
            res.append(w2.charAt(l));

            l++;
        }

        return res.toString();
    }
}