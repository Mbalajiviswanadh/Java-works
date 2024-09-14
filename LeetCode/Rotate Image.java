import java.util.*;;
class Solution {
    public void rotate(int[][] nums) {
        // transpose
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums[0].length;j++){
                int temp=nums[i][j];
                nums[i][j]= nums[j][i];
                nums[j][i]=temp;
            }
        }
        // reverse row
        for(int i=0;i<nums.length;i++){
            // nums.length/2 for j
            for(int j=0;j<nums.length/2;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[i][nums.length-j-1];
                nums[i][nums.length-j-1]=temp;
            }
        }


        
        
        // List<List<Integer>> list  = new ArrayList<>();

        // for(int j=0;j<nums[0].length ;j++){
            
        //     List<Integer> newlist = new ArrayList<>();

        //     for(int i=nums.length-1;i>=0;i--){
        //         newlist.add(nums[i][j]);
        //     }
        //     list.add(newlist);
        // }

        // for(int i=0;i<list.size();i++){
        //     List<Integer> row= list.get(i);

        //     for(int j=0;j<row.size();j++){
        //         nums[i][j]=row.get(j);
        //     }
        // }
    }
}