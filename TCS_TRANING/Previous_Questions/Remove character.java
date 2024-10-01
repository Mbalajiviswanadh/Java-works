package TCS_TRANING.Previous_Questions;

import java.util.*;

class Solution{
    static String removeChars(String string1, String string2){
        // code here
        
        StringBuilder res = new StringBuilder();
        
        Set<Character> set = new HashSet<>();
        
        for(char c : string2.toCharArray()){
            set.add(c);
        }
        
        for(char c: string1.toCharArray()){
            if(!set.contains(c))
            res.append(c);
        }
        
        return res.toString();

    }
}