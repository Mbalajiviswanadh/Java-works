class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        int res[]= new int[nums.length-k+1];

        for(int i=0;i<nums.length-k+1;i++){
            int max=nums[i];
            boolean check = true;
            for(int j=i;j<i+k-1;j++){

                if(nums[j+1]- nums[j]!=1 ){
                    check=false;
                    break;
                }
                max=Math.max(max,nums[j+1]);
            }
            res[i]=check? max :-1;
        }
        return res;
    }
}