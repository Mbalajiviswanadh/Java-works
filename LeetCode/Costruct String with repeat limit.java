class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        
        StringBuilder res = new StringBuilder();

        int freq[]= new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=25 ;i>=0;i--){

            if(freq[i]==0)
            continue;

            int curr=Math.min(repeatLimit, freq[i]);
            freq[i] -=curr;
            while(curr>0){
                res.append((char)('a'+i));
                curr--;
            }

            if(freq[i]!=0){

                for(int j=i-1;j>=0;j--){
                    if(freq[j]==0)
                    continue;
                    res.append((char) ('a'+j));
                    freq[j]--;
                    i++;
                    break;
                }
            }
        }
        return res.toString();
    }
}