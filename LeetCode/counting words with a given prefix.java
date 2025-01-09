class Solution {
    public int prefixCount(String[] words, String pref) {
        int check_len = pref.length();
        int count=0;
        for(String s : words){
            
            if(s.length()>=check_len && s.startsWith(pref))
            count++;
        }

        return count;
    }
}