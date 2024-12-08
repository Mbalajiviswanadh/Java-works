import java.util.*;
class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        int max=0;
        int res=0;

        for(int [] i: events){


            int start = i[0];
            int end = i[1];
            int value = i[2];

            while(!pq.isEmpty() && pq.peek()[0] < start){
                max= Math.max(max, pq.poll()[1]);
            }

            res = Math.max(res,max+value);
            pq.offer(new int[] {end,value});
        }
        return res;




        // // sorting by end time values
        // Arrays.sort(events, (a,b) -> a[1]-b[1])  ;

        // int prefSum[] = new int[events.length];

        // prefSum[0]=events[0][2];
        // // Fill prefixMax  with the maximum value encountered so far

        // for(int i=1;i<prefSum.length;i++){
        //     prefSum[i]= Math.max(prefSum[i-1], events[1][2]);
        // }
        // int max =0;
        // for(int i=0;i<prefSum.length;i++){
        //     int curr = events[i][2];

        //     int nonOverlapMax=0;

        //     int l=0;
        //     int r=i-1;

        //     while(l<=r){
        //         int mid = l+(r-l)/2;

        //         if(events[mid][1] < events[i][0]){
        //             nonOverlapMax= Math.max(nonOverlapMax, prefSum[mid]);
        //             l=mid+1;
        //         }
        //         else{
        //             r=mid-1;
        //         }
        //     }
        //     max = Math.max(max, curr+nonOverlapMax);
        // }
        // return max;
        

    }
}