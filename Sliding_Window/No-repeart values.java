
package Sliding_Window;

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String str) {

        int window_start=0;
        int maxsize=0;
        Set<Character> set = new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            
            while(set.contains(c)){
                set.remove(str.charAt(window_start));
                window_start++;
            }

            set.add(c);
            maxsize= Math.max(maxsize, i-window_start+1);
        }
        return maxsize;

        // int starting_point = 0;
        // int ending_point=0;
        // int maxsum= 0;

        // HashSet<Character> hash_set = new HashSet();

        // while(ending_point < s.length()){

        //     // if the endpoint value is not present in the hasset we need to add that element which one is unique
            
        //     // if the end_point value is not in has_set 
        //     if(!hash_set.contains(s.charAt(ending_point))){
        //         //adding that end_point to the hasset
        //         hash_set.add(s.charAt(ending_point));
        //         ending_point++;
        //         maxsum = Math.max(hash_set.size(), maxsum);
        //     }
        //     else{
        //         hash_set.remove(s.charAt(starting_point));
        //         starting_point++;
        //     }
        // }
        // return maxsum;        
    }
}