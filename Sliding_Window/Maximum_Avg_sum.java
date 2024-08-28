package Sliding_Window;
import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=Double.NEGATIVE_INFINITY;
        int prefsum=0;
        int window_start=0;

        for(int i=0;i<nums.length;i++){

            prefsum+=nums[i];

            if(i >=k-1){

                double avg= (double) prefsum/k;
                maxavg=Math.max(maxavg, avg);

                prefsum-=nums[window_start];
                window_start++;
            }
        }
        return maxavg;
    }
}