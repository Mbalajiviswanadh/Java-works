package TCS_TRANING.Previous_Questions;

import java.util.*;

class main{
    
    public static List<Integer> maxnuminwindow(int nums[], int k){
        
        int maxnum=0;
        
        List<Integer> list = new ArrayList<>();
        //window size =k
        for(int i=0;i<=nums.length-k;i++){
            maxnum=nums[i];
            
            for(int j=i+1;j<i+k;j++){
                maxnum=Math.max(maxnum,nums[j]);
            }
            // adding the max num for that window
            list.add(maxnum);
        }
        return list;
    }
    
    public static void usingslidingwindow(int nums[], int k){
        
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int nums[]=new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        List<Integer> res = maxnuminwindow(nums,k);
        for(int i: res){
            System.out.print(i+" ");
        }
        
        
    }
}