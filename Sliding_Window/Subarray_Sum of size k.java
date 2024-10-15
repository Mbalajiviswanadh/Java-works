package Sliding_Window;

import java.util.*;

class Sub_Array_Sum_sizeOf_k{


    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 4, 3};
        
        int k=11;

        List<List<Integer>> res= new ArrayList<>();


        List<Integer> list =  new ArrayList<>();

        int window_start=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            while(sum>k && window_start<=i ){
                sum-=nums[window_start];
                window_start++;
            }

            if(sum==k){
                for(int x=window_start;x<=i;x++){
                    list.add(nums[x]);
                }
                res.add(list);
            }
        }

        System.err.println(res);
    }
}   