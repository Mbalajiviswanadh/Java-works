import java.util.*;
class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        
        int maxsize=0;
        int currsize=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
            currsize++;
        }
        maxsize=currsize;

        for(int i=k;i<s.length();i++){

            if(isVowel(s.charAt(i)))
            currsize++;

            if(isVowel(s.charAt(i-k)))
            currsize--;

            maxsize= Math.max(maxsize, currsize);
        }
        return maxsize;
    }
}