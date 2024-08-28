package Sliding_Window;


import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        
        int nums[]= {2, 3, 4, 1, 5};
        int k=2;
        // int nums[]= {2, 1, 5, 1, 3, 2};
        // int k=3;
        // Maximum sum Subarray of size k
        
        int window_start=0;
        int maxsum=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(i >= k-1){
                maxsum=Math.max(maxsum, sum);
                
                sum-=nums[window_start];
                window_start++;
            }
        }
        
        System.out.print(maxsum);
    }
}
