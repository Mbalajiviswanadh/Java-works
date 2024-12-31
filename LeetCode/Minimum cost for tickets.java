class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        // max day 
        int maxday = days[days.length-1];

        boolean[] travel_day= new boolean[maxday+1];

        //making true which are travled i.e present int days
        for(int i : days){
            travel_day[i]=true;
        }

        int dp[]= new int[maxday+1];
        dp[0]=0;

        for(int i=1;i<=maxday;i++){

            if(!travel_day[i]){
                dp[i]=dp[i-1];
                continue;
            }

            dp[i]= costs[0]+dp[i-1];
            dp[i]=Math.min(dp[Math.max(0, i-7)] + costs[1], dp[i]);
            dp[i]=Math.min(dp[Math.max(0, i-30)] + costs[2], dp[i]);
        }
        return dp[maxday];
    }
}