class Solution {
    public int takeCharacters(String s, int k) {
        // counting all no of abc's

        int count[]= new int[3];

        for(char c : s.toCharArray()){
            // gives the index of the a, b, c and incrementing 
            count[c - 'a']++;
        }
        
        // base case

        if(Math.min(count[0], Math.min(count[1],count[2])) <k )
        return -1;


        int res = Integer.MAX_VALUE;
        int l=0;

        int n=s.length();

        for(int i=0;i<n;i++){

            count[s.charAt(i)-'a']--;

            while(l<n && Math.min(count[0],Math.min(count[1],count[2]))<k){
                count[s.charAt(l)-'a']++;
                l++;
            }
            res = Math.min(res, n-(i-l+1));
        }
        return res;
    }
}