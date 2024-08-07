import java.util.*;

class Main{
    
    
    public static void solve(int nums[]){
        int idx=1;
        
        while(idx<nums.length){
            nums[idx]=nums[idx]+nums[idx-1];
            idx++;
        }
        
        for(int i: nums){
            System.out.print(i+" ");
        }
        
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        solve(nums);
        // int left=sc.nextInt();
        // int right =sc.nextInt();
        
    }
}