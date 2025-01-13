class Solution {
    public int minimumLength(String s) {
        
        // thought: we have to track the near left and near right value which should = to s[i]
        if(s.length()<3)
        return s.length();

        // find the frequency of character
        // if the frequency is even, do: +2
        // if the frequency is odd, do: +1

        int charFreq[] = new int[26];

        for(char c:s.toCharArray()){
            charFreq[c-'a']++; 
        }

        int res_len=0;
        for(int i: charFreq){

            if(i==0)
            continue;

            if(i%2==0) 
            res_len+=2;

            if(i%2==1)
            res_len+=1;
        }
        return res_len;

        


        

    }
}