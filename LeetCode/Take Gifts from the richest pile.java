class Solution {
    public long pickGifts(int[] gifts, int k) {
        //1.  iterate through the array 
        //2.  when find max val do -> sqrt(nums[i]); -- which are left behind 
        //3.  decrease k--
        //4.  reperate the step 1 until the k become 0
        //5. add all nums in the array

        for(int i=0; i<k;i++){

            int max= -1;
            int max_i= -1;
            for(int j=0;j<gifts.length;j++){
                
                if(max < gifts[j]){
                    max = gifts[j];
                    max_i = j;
                }
            }

            gifts[max_i]=(int) Math.sqrt(max);
   
           
        }
        long res =0;
        for(int i: gifts){
            res+=i;
        }

        return res;
    }
}