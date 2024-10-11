package TCS_TRANING.Previous_Questions;

import java.util.*;

class main{
    
    public static int solve(int nums[], int k){
        
       int maxlen=0;
       
       int window_start=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           
           while(sum>=k && window_start<=i){
               sum-=nums[window_start];
               window_start++;
           }
           maxlen=Math.max(maxlen,i-window_start+1);
       }
       
       return maxlen;
    }
    
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        
        int n=sc.nextInt();
        
        int nums[]= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        
        System.out.print(solve(nums,k));
        
    }
}