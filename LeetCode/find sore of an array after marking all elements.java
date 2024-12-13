import java.util.*;
class Solution {
    public long findScore(int[] nums) {
    
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b)->{

            if(a[0]!=b[0])
            return Integer.compare(a[0],b[0]);
            else
            return Integer.compare(a[1],b[1]);
        }
    );

    for(int i=0;i<nums.length;i++){
        pq.offer(new int[]{nums[i], i});
    }

    long sum =0;

    boolean[] visited = new boolean[nums.length];

    while(!pq.isEmpty()){
        int[] curr = pq.poll();
        int val = curr[0];
        int idx = curr[1];

        if(visited[idx])
        continue;

        sum+=val;
        visited[idx]=true;

        if(idx>0)
        visited[idx-1]=true;

        if(idx<nums.length-1)
        visited[idx+1]=true;
    }
    return sum;


    //    Set<Integer> set = new HashSet<>();

    //    long sum =0;

    //    while(set.size() < nums.length){
    //     int minval= Integer.MAX_VALUE;
    //     int minIdx=-1;


    //         for(int i=0;i<nums.length;i++){

    //             if(!set.contains(i) && nums[i] < minval){
    //                 minval = nums[i];
    //                 minIdx=i;
    //             }
    //         }

    //         set.add(minIdx);

    //         if(minIdx>0)
    //         set.add(minIdx-1);

    //         if(minIdx<nums.length-1)
    //         set.add(minIdx+1);

    //         sum+=minval;
    
    //    }

    //    return sum;
    }
}