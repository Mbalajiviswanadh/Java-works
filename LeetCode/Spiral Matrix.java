import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List<Integer> list =new ArrayList<>();

        if(nums.length==0)
        return list;

        int rBeg=0;
        int cBeg=0;

        int rEnd=nums.length-1;
        int cEnd=nums[0].length-1;

        while(rBeg<=rEnd && cBeg<=cEnd){
            // print right
            for(int j=cBeg;j<=cEnd;j++){
                list.add(nums[rBeg][j]);
            }
            // print down
            rBeg++;
            for(int j=rBeg;j<=rEnd;j++){
                list.add(nums[j][cEnd]);
            }
            // print left
            cEnd--;
            if(rBeg<=rEnd){
                for(int j=cEnd;j>=cBeg;j--){
                    list.add(nums[rEnd][j]);
                }
            }
            // print up
            rEnd--;
            if(cBeg<=cEnd){
                for(int j=rEnd;j>=rBeg;j--){
                    list.add(nums[j][cBeg]);
                }
            }
            cBeg++;

        }
        return list;
        
    }
}