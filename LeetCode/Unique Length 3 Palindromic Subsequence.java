class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int res=0;

        for(char i ='a'; i<='z'; i++){
            // getting the ranges from firs and last of char at i
            int first_idx =s.indexOf(i);
            int last_idx= s.lastIndexOf(i);
            
            // to find unique value, check that char appears ateast twice
            if(first_idx !=-1 && last_idx>first_idx+1){
                // stroing unique values
                Set<Character> set = new HashSet<>();
                
                for(int j = first_idx+1; j<last_idx;j++){
                    set.add(s.charAt(j));
                }
                res+=set.size();
            }

        }

        return res;
    }
}