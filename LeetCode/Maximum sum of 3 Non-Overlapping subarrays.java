class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        
        int sum1=0, sum2=0, sum3=0;
        int max1=0, max12=0, max123=0;

        int idx1=0, idx12_1=0, idx12_2=k;

        int res[]={0, k, 2*k};

        for(int i=0;i<k;i++){
            sum1+=nums[i];
            sum2+=nums[i+k];
            sum3+=nums[i+2*k];
        }

        max1=sum1;
        max12=sum1+sum2;
        max123=sum1+sum2+sum3;

        for(int i=0;i<=nums.length-3*k;i++){

            if(i>0){
                sum1=sum1-nums[i-1]+nums[i+k-1];
                sum2=sum2-nums[i+k-1]+nums[i+2*k-1];
                sum3=sum3-nums[i+2*k-1]+nums[i+3*k-1];
            }

            if(sum1>max1){
                max1=sum1;
                idx1=i;
            }

            if(max1+sum2 > max12){
                max12=sum2+max1;
                idx12_1=idx1;
                idx12_2=i+k;
            }

            if(max12+sum3 > max123){
                max123=max12+sum3;
                res = new int[]{idx12_1, idx12_2, i+2*k};
            }
        }
        return res;
    }
}