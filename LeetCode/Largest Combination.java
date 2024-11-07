class Solution {
    public int largestCombination(int[] candidates) {
        
        int res=0;

        for(int i=0;i<32;i++){

            int count=0;

            for(int c: candidates){
                if(( c & (1<<i)) !=0)
                count++;
            }

            res=Math.max(res,count);
        }
        return res;
    }
}