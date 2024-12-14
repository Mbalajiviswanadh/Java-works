import java.util.*;
class Solution {
    public long continuousSubarrays(int[] nums) {
        
        long count =0;

        int window_start=0;
        Deque<Integer> minD = new LinkedList<>();
        Deque<Integer> maxD = new LinkedList<>();
        
        for(int i=0; i<nums.length;i++){


            while(!minD.isEmpty() && nums[minD.peekLast()] >=nums[i])
            minD.pollLast();

            while(!maxD.isEmpty() && nums[maxD.peekLast()] <=nums[i])
            maxD.pollLast();


            minD.offerLast(i);
            maxD.offerLast(i);


            while(nums[maxD.peekFirst()] - nums[minD.peekFirst()]>2){
                window_start++;
                if(minD.peekFirst()<window_start)
                minD.pollFirst();
                if(maxD.peekFirst()<window_start)
                maxD.pollFirst();
            }

            count+= i-window_start+1;
        }
        return count;



        /*
         long count =0;

        int window_start=0;

        int min =nums[0];
        int max  =nums[0];
        for(int i=0;i<nums.length;i++){

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            while(max-min > 2){

                window_start++;

                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;

                for(int j=window_start;j<i;j++){

                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);
                }
            }

            count+= (i-window_start+1);
        }
        return count;
        */
    }
}