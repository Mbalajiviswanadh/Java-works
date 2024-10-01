package TCS_TRANING.Previous_Questions;

import java.util.*;

class Solution 
{ 
    String sort(String s) 
    {
        // code here
        
        StringBuilder res = new StringBuilder();
        
        int charcount[]= new int[26];
        
        for(char c : s.toCharArray()){
            charcount[c-'a']++;
        }
        
        for(int i=0;i<charcount.length;i++){
            
            while(charcount[i] > 0){
                res.append((char) (i+'a'));
                charcount[i]--;
            }
        }
        return res.toString();
        
    }
} 