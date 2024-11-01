class Solution {
    public int singleNonDuplicate(int[] nums) {
        // 1. get mid value
        // 2. base cases are : a) if nums length =1 then return 1st index value
        // 3. base cases b) if mid=0 and nums[0]!=nums[1] return 1st value
        // 3. base cases c) if mid=nums.length-1 and nums[n-1]!=nums[n-2] return last value
        // 4. now we have find wether mid is even or odd
        // 5. if mid is even : a) nums[mid-1]==nums[mid] right r beocmes = mid-1
        // 6. b) else ( nums[mid+1]==nums[mid] then left l becomes= mid+1)
        // 7. if the mid is odd the and l will moves to mid+1 if nums[mid-1]==nums[mid]  (i.e, reverse of above step)
        int l=0;
        int r=nums.length-0;

        if(nums.length==1)
        return nums[0];
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid==0 && nums[0]!=nums[1])
            return nums[mid];

            if(mid==nums.length-1 && nums[mid]!=nums[nums.length-2])
            return nums[mid];

            if(nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid])
            return nums[mid];

            if(mid%2==0){

                if(nums[mid-1]==nums[mid])
                r=mid-1;
                else 
                l=mid+1;
            }
            else{
                if(nums[mid-1]==nums[mid])
                l=mid+1;
                else
                r=mid-1;
            }
        }
        return 0;
        
        // if(nums.length==1)
        // return nums[0];

        // if(nums[0]!=nums[1])
        // return nums[0];
        // if(nums[nums.length-1]!=nums[nums.length-2])
        // return nums[nums.length-1];

        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i-1]!=nums[i] && nums[i+1]!=nums[i])
        //     return nums[i];
        // }
        // return 0;
    }
}