import java,util.*;
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] specialPrefix = new int[n]; 

        for (int i = 1; i < n; i++) {
            if ((nums[i - 1] % 2 != nums[i] % 2)) {
                specialPrefix[i] = specialPrefix[i - 1] + 1; 
            } else {
                specialPrefix[i] = specialPrefix[i - 1]; 
            }
        }

        boolean[] res = new boolean[queries.length];

        // Process each query
        for (int k = 0; k < queries.length; k++) {
            int from = queries[k][0];
            int to = queries[k][1];

            if (to == from) {
                res[k] = true; 
            } else {
                res[k] = (specialPrefix[to] - specialPrefix[from]) == (to - from);
            }
        }

        return res;



    }
}
// class Solution {
//     public boolean[] isArraySpecial(int[] nums, int[][] queries) {
//         // map
//         // 1.)
//         // 1 = true
//         // 2 = true
//         // 3 = true
//         // 4 = false
//         // q = [ 0 to 4] -> false

//         // 2.)
//         // 1 = true
//         // 2 = false
//         // 3 = true
//         // q = [0 to 2]-> {false}; [2 to 3]-> {true}

//         // 1. taking hashmap, key = index, values boolean
//         // then compare with 1st index of queries


//         Map<Integer, Boolean> map = new HashMap<>();
//         map.put(0,true);
//         for(int i=1;i<nums.length;i++){

//             if((nums[i-1]%2 == 0 && nums[i]%2!=0) || (nums[i-1]%2!=0 && nums[i]%2==0) ){

//                 map.put(i, true);
//             }
//             else{
//                 map.put(i, false);
//             }
//         }

//         boolean[] res = new boolean[queries.length];
        
//         for(int k=0;k<queries.length;k++){
//             int from = queries[k][0];
//             int to = queries[k][1];

//             if (from == to) {
//             res[k] = true;
//             } else {
//                 boolean isToSpecial = map.get(to); // Check if subarray [0..to] is special
//                 boolean isPrefixSpecial = (from == 0) || map.get(from - 1); // Check if prefix [0..from-1] is special (if from > 0)

//                 res[k] = isToSpecial && isPrefixSpecial;
//             }

//         }
//         return res;



//     }
// }