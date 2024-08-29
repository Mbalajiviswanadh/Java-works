import java.util.*;
class Solution {
    public int[] replaceElements(int[] nums) {

        int rightmax=-1;
        int res[]= new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){

            res[i]=rightmax;
            rightmax=Math.max(rightmax, nums[i]);
        }
        return res;

        // int maxnum=0;
        // int idx=0;
        // int res[]=new int[nums.length];
        // res[nums.length-1]=-1;
        // for(int i=0;i<nums.length-1;i++){

        //     for(int j=i+1;j<nums.length;j++){

        //         maxnum=Math.max(maxnum, nums[j]);
        //     }
        //     res[idx++]=maxnum;
        //     maxnum=0;
        // }
        // return res;
    }
}