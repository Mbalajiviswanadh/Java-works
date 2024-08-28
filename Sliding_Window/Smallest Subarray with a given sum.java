package Sliding_Window;

import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        

        int nums[] ={3, 4, 1, 1, 6};
        int s=8;
        // int nums[] ={2, 1, 5, 2, 8};
        // int s=7;
        // int nums[] ={2, 1, 5, 2, 3, 2};
        // int s=7;
        
        int window_start=0;
        int sum=0;

        // 🔽 +infinity
        int minsize=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            // 🔽
            while(sum>=s){
                
                int size=i-window_start+1;
                
                minsize=Math.min(minsize, size);
                
                sum-=nums[window_start];
                window_start++;
            }
        }
        if(minsize==Integer.MAX_VALUE)
        System.out.println(0);
        else
        System.out.println(minsize);
    }
}
