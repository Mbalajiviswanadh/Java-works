import java.util.*;
class Solution {
    // public List<List<Integer>> fourSum(int[] nums, int target) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     if (nums == null || nums.length < 4) return res;
        
    //     Arrays.sort(nums);
    //     // for(int i=0;i<nums.length-2;i++){
    //     //     int l=i+1;
    //     //     int mid=nums.length-2;
    //     //     int r=nums.length-1;

    //     //     while(l<r){
    //     //         int sum =nums[i]+nums[l]+nums[r]+nums[mid];

    //     //         if(sum==target){
    //     //             res.add(Arrays.asList(nums[i], nums[l],nums[mid], nums[r]));
    //     //             l++;
    //     //             r--;
    //     //             mid--;
    //     //         }
    //     //         else if(sum<target)
    //     //         l++;
    //     //         else{
    //     //             r--;
    //     //             mid--;
    //     //         }
    //     //     }
    //     // }
    //     // return new ArrayList<>(res);


    //     for(int i=0;i<nums.length-3;i++){
    //         for(int j=i+1;j<nums.length-3;j++){

    //             int left=j+1;
    //             int right=nums.length-1;

    //             while (left < right) {
    //                 int sum = nums[i] + nums[j] + nums[left] + nums[right];
    //                 if (sum == target) {
    //                     res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
    //                     while (left < right && nums[left] == nums[left + 1]) left++; // avoid duplicates for left
    //                     while (left < right && nums[right] == nums[right - 1]) right--; // avoid duplicates for right
    //                     left++;
    //                     right--;
    //                 } else if (sum < target) {
    //                     left++;
    //                 } else {
    //                     right--;
    //                 }
    //             }
    //         }
    //     }
    //     return res;
    // }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i]==nums[i-1])
            continue;

            for(int j=i+1;j<nums.length;j++){

                if(j > i + 1 && nums[j] == nums[j - 1])
                continue;

                int a=j+1;
                int b=nums.length-1;

                while(a<b){
                    long sum = (long) nums[i]+nums[j]+nums[a]+nums[b];

                    if(sum==target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));

                        a++;
                        b--;
                        while(a<b && nums[a]==nums[a-1])
                        a++;
                        while(a<b && nums[b]==nums[b+1])
                        b--;
                    }
                    else if(sum<target)
                    a++;
                    else
                    b--;
                }
            }
        }
        return ans;
        
        // List<List<Integer>> res = new ArrayList<>();
        // if (nums == null || nums.length < 4) return res;
        
        // Arrays.sort(nums);
        
        // for (int i = 0; i < nums.length - 3; i++) {
        //     if (i > 0 && nums[i] == nums[i - 1]) continue; // avoid duplicates for i
        //     for (int j = i + 1; j < nums.length - 2; j++) {
        //         if (j > i + 1 && nums[j] == nums[j - 1]) continue; // avoid duplicates for j
                
        //         int left = j + 1;
        //         int right = nums.length - 1;
                
        //         while (left < right) {
        //             long sum = nums[i] + nums[j] + nums[left] + nums[right];
        //             if (sum == target) {
        //                 res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
        //                 while (left < right && nums[left] == nums[left + 1]) left++; // avoid duplicates for left
        //                 while (left < right && nums[right] == nums[right - 1]) right--; // avoid duplicates for right
        //                 left++;
        //                 right--;
        //             } else if (sum < target) {
        //                 left++;
        //             } else {
        //                 right--;
        //             }
        //         }
        //     }
        // }
        
        // return res;
    }
}