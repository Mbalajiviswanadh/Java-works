import java.util.*;
class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        
        int[] res = new int[queries.length];
        Arrays.fill(res,-1);

        List<List<int[]>> tempQ= new ArrayList<>();

        for(int i=0;i<heights.length;i++){
            tempQ.add(new ArrayList<>());
        }


        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            if(a>b){
                int temp = a;
                a=b;
                b=temp;
            }
            if(a==b || heights[a]<heights[b])
            res[i]=b;
            else{
                tempQ.get(b).add(new int[] {heights[a], i});
            }
        }


        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));

        for(int i=0;i<heights.length;i++){
            for(int[] q : tempQ.get(i))
            pq.add(q);

            while(!pq.isEmpty() && pq.peek()[0]<heights[i]){
                res[pq.poll()[1]]=i;
            }
        }
        return res;
    }
}