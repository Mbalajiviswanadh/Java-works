
class Solution {
    public int maxScore(String s) {
        // we can find the score using : noof_zero + (total_ones - noof_ones);
        // and updating this value at each itration


        int total_ones=0;
        int zeros_count=0;
        int ones_count=0;

        int max_Score= Integer.MIN_VALUE;

        for(char i: s.toCharArray()){
            if(i=='1')
            total_ones++;
        }

        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)=='0')
            zeros_count++;
            else
            ones_count++;

            int currScore=zeros_count + (total_ones - ones_count);
            max_Score = Math.max(max_Score, currScore);
        }
        return max_Score;
    }
}