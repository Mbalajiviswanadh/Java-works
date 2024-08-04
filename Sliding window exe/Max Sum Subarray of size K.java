// package Sliding window exe;

import java.util.ArrayList;
import java.util.Scanner;

class MaxSumSubarrayofsizeK {
    static long maximumSumSubarray(int K, ArrayList<Integer> nums,int N){
        // code here
        
        long sum=0;
        long maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<K;i++){
            sum+=nums.get(i);
        }
        
        maxsum=sum;
        
        for(int i=K;i<N;i++){
            sum+=nums.get(i)-nums.get(i-K);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.get(sc.nextInt());
        }

        int k=sc.nextInt();
        
    }
}
