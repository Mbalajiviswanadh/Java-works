package TCS_TRANING.Previous_Questions;

import java.util.*;
class Solution {
    public String leetcode_reverseWords(String s) {
        
        String str[]= s.trim().split("\\s+");

        StringBuilder res = new StringBuilder();

        for(int i=str.length-1;i>=0;i--){

            res.append(str[i]);
            if(i!=0)
            res.append(" ");

        }
        return res.toString();
    }

        // Function to reverse words in a given string.
        String gfg_reverseWords(String str) {
            // code here
            
            String s[]= str.split("\\.");
            
            StringBuilder res=new StringBuilder();
            int idx=0;
            for(int i=s.length-1; i>=0;i--){
                res.append(s[i]);
                if(i!=0)
                res.append(".");
            }
            return res.toString();
        }

    
}


