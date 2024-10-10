package TCS_TRANING.OCT_3_paper_codes;


import java.util.*;

class maxjump{
    
    public static boolean solve(int nums[], int n){
        
        int maxnext=0;
        
        for(int i=0;i<n;i++){
            
            if(i>maxnext)
            return false;
            
            maxnext=Math.max(maxnext, i+nums[i]);
            
            if(maxnext==n-1)
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int nums[]= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        System.out.print(solve(nums,n));
        
    }
}