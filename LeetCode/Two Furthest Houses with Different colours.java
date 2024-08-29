import java.util.*;;
class Solution {
    public int maxDistance(int[] nums) {
        int maxdis=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[nums.length-1]){
                maxdis=Math.max(maxdis, nums.length-1-i);
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=nums[0]){
                maxdis=Math.max(maxdis,i);
                break;
            }
        }
        return maxdis;
        // int maxdis=0;

        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){

        //         if(nums[i]!=nums[j]){
        //             int dis=j-i;
        //             maxdis=Math.max(maxdis,dis);
        //         }
        //     }
        // }
        // return maxdis;
    }
}