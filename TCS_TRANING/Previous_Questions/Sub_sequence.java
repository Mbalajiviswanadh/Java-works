package TCS_TRANING.Previous_Questions;


import java.util.*;

class main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int nums[]= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        
        int res[]= solve(nums,k);
        for(int i: res){
            System.out.print(i+1+" ");
        }
    }
    public static int[] solve(int nums[], int k){
        int start=0;
        int end=0;
        
        int sum=0;
        int res[]= {0, Integer.MAX_VALUE};
        
        while(end< nums.length){
            
            sum+=nums[end];
            
            while(sum>k){
                sum-=nums[start];
                start++;
            }
            
            if(sum==k && (end-start < res[1]-res[0])){
                res[0]=start;
                res[1]=end;
            }
            end++;
            
            
        }
            if(res[1]==Integer.MAX_VALUE){
                return new int[] {-1,-1};
            }
            return res;
    }
}
