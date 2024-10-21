package TCS_TRANING.Previous_Questions;


import java.util.*;

class main{
    
    public static void fib(int n){
        
        int dp[]= new int[n];
        
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        
        for(int i=3;i<n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        
        for(int i: dp){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        int n=sc.nextInt();
        
        fib(n);
        
    }
}