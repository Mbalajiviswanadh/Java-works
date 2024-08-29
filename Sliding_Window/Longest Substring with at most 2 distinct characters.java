package Sliding_Window;

import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        String str="ccaabbb";//5
        // String str="eceba";//3
        
        Map<Character, Integer> map = new HashMap<>();
        int maxsize=0;
        int window_start=0;
        
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            // at most 2 distinct characters
            if(map.size() > 2){
                char s_val=str.charAt(window_start);
                map.put(s_val, map.get(s_val)-1);
                
                if(map.get(s_val) == 0)
                map.remove(s_val);
                
                window_start++;
            }
            if(map.size() <=2)
            maxsize=Math.max(maxsize, i-window_start+1);
        }
        System.out.print(maxsize);
        
    }
}