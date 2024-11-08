class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        // CREATING A MAXIMUMXOR
        // FINDING THE XOR OF ALL VALUES IN NUMS
        // CREATING NEW ARRAY
        // UPDATE THE NEW ARRAY WITH XORING - > (XOR OF ALL VALUS IN NUMS) ^ (MAXIMUMXOR)
        // XORING THE LAST VALUE IN THE NUMS FROM THE XOR OF ALL VALUS IN NUMS - SO THAT WE ARE REMOVING THE LAST VALUE ACCORDING TO PROBLEM


        // creating maximumXOR

        int maxXOR= (1<< maximumBit)-1;
        
        int nums_xor=nums[0];
        int n=nums.length;
        // all xor values from nums
        for(int i=1;i<n;i++){
            nums_xor^=nums[i];
        }

        int res[]= new int[n];
        for(int i=0;i<n;i++){
            int k=nums_xor^maxXOR;
            res[i]=k;
            nums_xor^=nums[n-1-i];  //removing the last value of nums from nums_xor
        }

        return res;
    }
}