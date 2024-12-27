class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // 1. score of pair = v[i]+v[j]+(i-j)


        int maxLeft = values[0];
        int maxScore= Integer.MIN_VALUE;

        for(int j=1;j<values.length;j++){

            maxScore = Math.max(maxScore, maxLeft + values[j]-j);

            // updating the maxleft
            maxLeft = Math.max(maxLeft, values[j]+j);
        }
        return maxScore;

        // List<Integer> pairs = new ArrayList<>();

        // for(int i=0;i<values.length-1;i++){
            
        //     // j>i
        //     for(int j=i+1;j<values.length;j++){
        //         int score = values[i]+values[j] +(i-j);
        //         pairs.add(score);
        //     }
        // }
        // return Collections.max(pairs);
    }
}