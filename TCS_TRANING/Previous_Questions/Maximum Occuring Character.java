package TCS_TRANING.Previous_Questions;

import java.util.*;
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : line.toCharArray()){
            
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        int maxc=0;
        char maxchar=' ';
        
        for(char c : line.toCharArray()){
            
            int currc=map.get(c);
            
            if(currc> maxc || (currc==maxc && maxchar> c)){
                
                maxc=currc;
                maxchar=c;
            }
        }
        return maxchar;
        
        
    }
    
}