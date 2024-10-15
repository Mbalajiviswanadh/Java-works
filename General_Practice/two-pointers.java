import java.util.*;

class twopointers{
    
    public static void main(String[] args){
        int nums[]={1,3,5,8,12,16};
        int k=7;
        int i=0;
        while(i<nums.length){
            int j=i+1;
            
            while(j<nums.length){
                
                int diff=nums[j]-nums[i];
                
                if(diff==k){
                System.out.println(i+" "+j);
                break;
                }
                else if(diff>k)
                break;
                else
                j++;
            }
            i++;
        }
    }
}